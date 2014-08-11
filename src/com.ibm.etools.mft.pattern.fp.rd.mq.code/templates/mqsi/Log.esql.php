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

CREATE Compute MODULE CreateLogMessage

CREATE FUNCTION main() RETURNS BOOLEAN
			BEGIN
			SET OutputRoot.Properties = NULL;
-- Create Headers
			CREATE FIRSTCHILD OF OutputRoot DOMAIN ('MQMD') NAME 'MQMD';
			DECLARE MQMDRef REFERENCE TO OutputRoot.MQMD;
			SET MQMDRef.Version = MQMD_CURRENT_VERSION;
			SET MQMDRef.CodedCharSetId = InputRoot.Properties.CodedCharSetId;
			SET MQMDRef.Encoding = InputRoot.Properties.Encoding;
			SET MQMDRef.Format = MQFMT_RF_HEADER_2;
			DECLARE OutRef REFERENCE TO OutputRoot;
			CREATE NEXTSIBLING OF MQMDRef AS OutRef DOMAIN('MQRFH2') NAME 'MQRFH2';
			SET OutputRoot.MQRFH2.(MQRFH2.Field)Version = 2;
-- Define basic logging data
			SET OutRef.CodedCharSetId = InputRoot.Properties.CodedCharSetId;
			SET OutRef.Encoding = InputRoot.Properties.Encoding;
			SET OutRef.usr.BrokerName = SQL.BrokerName;
			SET OutRef.usr.MessageFlowLabel = SQL.MessageFlowLabel;
			SET OutRef.usr.DTSTAMP = CURRENT_TIMESTAMP;
			CREATE NEXTSIBLING OF OutRef AS OutRef DOMAIN('XMLNSC') NAME 'XMLNSC';			
-- Add file and record information
-- Do not log file contents as these are available in the archive directory
			-- Log data on file and records in XMLNSC body
			SET OutputRoot.XMLNSC.Log.Directory = InputLocalEnvironment.File.Directory;
			SET OutputRoot.XMLNSC.Log.FileName = InputLocalEnvironment.File.Name;
			SET OutputRoot.XMLNSC.Log.RecordTotal = InputLocalEnvironment.File.Record;

END;
END MODULE;

CREATE Compute MODULE CreateTraceData
CREATE FUNCTION main() RETURNS BOOLEAN BEGIN
	DECLARE EnvVarRef REFERENCE TO Environment.PatternVariables;
	SET EnvVarRef.DTSTAMP = CURRENT_TIMESTAMP; 
	SET EnvVarRef.BrokerName = SQL.BrokerName ;
    SET EnvVarRef.MessageFlowlabel = SQL.MessageFlowLabel;
-- Add file and record information
	SET EnvVarRef.File.Directory = InputLocalEnvironment.File.Directory;
	SET EnvVarRef.File.FileName = InputLocalEnvironment.File.Name;
	SET EnvVarRef.File.RecordTotal = InputLocalEnvironment.File.Record;
	SET EnvVarRef.File.RecordsToDefault = Environment.PatternVariables.DefaultRouting;


RETURN TRUE;
END;
END MODULE;

CREATE FILTER MODULE CheckLogging
CREATE FUNCTION main() RETURNS BOOLEAN BEGIN
	
	RETURN Environment.PatternVariables.LoggingOn;
	END;

END MODULE;