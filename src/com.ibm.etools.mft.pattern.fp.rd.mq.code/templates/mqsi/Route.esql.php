BROKER SCHEMA mqsi

/**
 * Copyright (c) 2014 IBM Corporation and other Contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - initial implementation
**/

<?php

if ($_MB['PP']['routingtype'] == 'specify_routes') {

echo <<< ESQL
/*******************************************************
* Declare shared variables to record records sent to default
********************************************************/
DECLARE Defaults SHARED ROW;
DECLARE Files SHARED INTEGER 0;

	CREATE COMPUTE MODULE RecordDefault
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
	
/*******************************************************
* Increment default count for this file for log message
********************************************************/

DECLARE I Integer 0;
DECLARE J Integer 1;
DECLARE ThisFileKey CHARACTER;
		SET ThisFileKey = InputLocalEnvironment.File.Directory||
									InputLocalEnvironment.File.Name||
									InputLocalEnvironment.File.TimeStamp;
		ACCUMULATE: BEGIN ATOMIC
			SET J = 0;
			-- search for a match
			SET I = 1;
				SEARCH: LOOP
				IF I > Files THEN
					-- No match 
					SET J = Files + 1;
					SET Defaults.Files[J].Key = ThisFileKey;
					SET Defaults.Files[J].Total = 1;
					SET Files = J;
					LEAVE SEARCH; 
				END IF;
				IF Defaults.Files[I].Key = ThisFileKey
					THEN SET Defaults.Files[I].Total = Defaults.Files[I].Total + 1;
					LEAVE SEARCH;
				END IF;
				SET I = I + 1;
				END LOOP SEARCH;
	END ACCUMULATE;

-- This is required so that message can be written to bad messages queue
SET OutputRoot = InputRoot;
END;
END MODULE;
ESQL;

} elseif ($_MB['PP']['routingtype'] == 'lookup_routes') {

$dataContext = $_MB['PP']['pp22'];
$keyLocation1 = $_MB['PP']['pp23'];
$keyLocation2 = $_MB['PP']['pp24'];

echo <<< ESQL
CREATE COMPUTE MODULE RoutetoDest
	CREATE FUNCTION Main() RETURNS BOOLEAN
	BEGIN
		/****************************************************************************
		*   Extract destination data based on message   
		*	This version assumes MQ destination
		*   Any compute node using this ESQL most have the following set:
		*
		*   - The database source set to the database containing the routing table
		*   - The compute mode set to environment.
		*****************************************************************************/
DECLARE CONTEXT CHARACTER '$dataContext';
-- Copy LocalEnvironment so content not lost
		SET OutputLocalEnvironment = InputLocalEnvironment;


-- Read the database table into memory when CacheQueues.valid field is set to null.
-- Do this atomically to protect against problems when threads > 1

		ROUTING : BEGIN ATOMIC
			IF CacheQueueTable.valid IS NULL THEN
		SET  CacheQueueTable.DestinationData[] =  
		       	(
		       		SELECT S.QUEUE_MANAGER, S.QUEUE_NAME ,S.VARIABLE1, S.VARIABLE2
		       		FROM Database.ROUTING_TABLE as S 
		       		WHERE 
		       			S.ROUTING_CONTEXT = CONTEXT     			
		       	 ); 
		         	 
			SET CacheQueueTable.valid = true;
			END IF;
		END ROUTING;		

-- 	At this point the CacheQueues should be full of the data with possible destinations
-- Extract the key from the incoming message

		DECLARE KEY1 CHARACTER;
		DECLARE KEY2 CHARACTER;

/******************************************
* This is a pattern parameter substitution*
*******************************************/
		SET KEY1 = $keyLocation1;
		SET KEY2 = $keyLocation2;
		IF KEY1 = NULL OR KEY2 = NULL THEN
		 	SET Environment.PatternVariables.RoutingError = 'No key found in message';
			SET Environment.PatternVariables.ErrorState = 'Failed';
	IF 	Environment.PatternVariables.DefaultRouting IS NULL
		THEN
		SET Environment.PatternVariables.DefaultRouting = 0;
	END IF;
	SET Environment.PatternVariables.DefaultRouting = Environment.PatternVariables.DefaultRouting +1;
			PROPAGATE TO TERMINAL 'Failure';
			RETURN FALSE;
		END IF;
		
		
-- Select queue manager and queue based on key from message		
		SET  OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[] = 
		      (
		       SELECT S.QUEUE_MANAGER as queueManagerName, S.QUEUE_NAME as queueName 
		       FROM CacheQueueTable.DestinationData[] as S 
		       WHERE 
		        S.VARIABLE1 = KEY1 and
		        S.VARIABLE2 = KEY2 		        			
		        );
-- Was a route selected		        
IF EXISTS(OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[])
-- YES - Propagate to out
	THEN RETURN TRUE;
-- NO - Propagate to failure and set environment
ELSE 
	SET Environment.PatternVariables.RoutingError = 'Key not found in database';
	SET Environment.PatternVariables.ErrorState = 'Failed';

	IF 	Environment.PatternVariables.DefaultRouting IS NULL
		THEN
		SET Environment.PatternVariables.DefaultRouting = 0;
	END IF;
	SET Environment.PatternVariables.DefaultRouting = Environment.PatternVariables.DefaultRouting +1;
	PROPAGATE TO TERMINAL 'Failure';
	RETURN FALSE;
END IF;
	END;
	END MODULE;
ESQL;
}