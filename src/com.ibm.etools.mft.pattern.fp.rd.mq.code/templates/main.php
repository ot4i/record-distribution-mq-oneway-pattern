<?php
	if ($_MB['PP']['routingtype'] == 'specify_routes' || $_MB['PP']['routingtype'] == 'lookup_routes') {
		mb_pattern_run_template("RDMQOneWayProject", "mqsi/Route.esql.php", "mqsi/Route.esql");
	}
	
	if ($_MB['PP']['pp31'] == 'true') {
		mb_pattern_run_template("RDMQOneWayProject", "mqsi/Log.esql.php", "mqsi/Log.esql");
	}
	
	if ($_MB['PP']['pp27'] == 'true') {
		mb_pattern_run_template("RDMQOneWayProject", "mqsi/DeclareCache.esql.php", "mqsi/DeclareCache.esql");
	}
?>
