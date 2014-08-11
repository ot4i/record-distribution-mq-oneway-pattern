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

/*******************************************************
* Declare shared variables to record records sent to default
********************************************************/
DECLARE Defaults SHARED ROW;
DECLARE Files SHARED INTEGER 0;

/*******************************************************
* Declare shared variable to cache database lookup data
********************************************************/
DECLARE CacheQueueTable SHARED ROW;
CREATE COMPUTE MODULE Invalidatecache

CREATE FUNCTION Main() RETURNS BOOLEAN
BEGIN
SET CacheQueueTable.valid value = NULL;
END;
END MODULE;