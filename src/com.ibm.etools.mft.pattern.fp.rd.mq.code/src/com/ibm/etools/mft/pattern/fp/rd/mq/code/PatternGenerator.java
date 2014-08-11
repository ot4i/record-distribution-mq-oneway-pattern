/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and other Contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - initial implementation
 *******************************************************************************/
package com.ibm.etools.mft.pattern.fp.rd.mq.code;

import java.util.Vector;

import com.ibm.broker.config.appdev.ESQLModule;
import com.ibm.broker.config.appdev.FlowProperty;
import com.ibm.broker.config.appdev.MessageFlow;
import com.ibm.broker.config.appdev.NamespacePrefixMap;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.OutputTerminal;
import com.ibm.broker.config.appdev.Point;
import com.ibm.broker.config.appdev.SubFlowNode;
import com.ibm.broker.config.appdev.UserDefinedProperty;
import com.ibm.broker.config.appdev.nodes.ComputeNode;
import com.ibm.broker.config.appdev.nodes.ComputeNode.ENUM_COMPUTE_COMPUTEMODE;
import com.ibm.broker.config.appdev.nodes.FileInputNode.ENUM_FILEINPUT_DELIMITERTYPE;
import com.ibm.broker.config.appdev.nodes.FileInputNode.ENUM_FILEINPUT_RECORDDELIMITER;
import com.ibm.broker.config.appdev.nodes.FileInputNode.ENUM_FILEINPUT_RECORDDETECTION;
import com.ibm.broker.config.appdev.nodes.DatabaseNode;
import com.ibm.broker.config.appdev.nodes.FileInputNode;
import com.ibm.broker.config.appdev.nodes.FilterNode;
import com.ibm.broker.config.appdev.nodes.FlowOrderNode;
import com.ibm.broker.config.appdev.nodes.InputNode;
import com.ibm.broker.config.appdev.nodes.MQInputNode;
import com.ibm.broker.config.appdev.nodes.MQOutputNode;
import com.ibm.broker.config.appdev.nodes.MQOutputNode.ENUM_MQOUTPUT_DESTINATIONMODE;
import com.ibm.broker.config.appdev.nodes.MQOutputNode.ENUM_MQOUTPUT_PERSISTENCEMODE;
import com.ibm.broker.config.appdev.nodes.MQOutputNode.ENUM_MQOUTPUT_TRANSACTIONMODE;
import com.ibm.broker.config.appdev.nodes.OutputNode;
import com.ibm.broker.config.appdev.nodes.PassthroughNode;
import com.ibm.broker.config.appdev.nodes.RouteNode;
import com.ibm.broker.config.appdev.nodes.RouteNode.ENUM_ROUTE_DISTRIBUTIONMODE;
import com.ibm.broker.config.appdev.nodes.RouteNode.FilterTable;
import com.ibm.broker.config.appdev.nodes.RouteNode.FilterTableRow;
import com.ibm.broker.config.appdev.patterns.GeneratePatternInstanceTransform;
import com.ibm.broker.config.appdev.patterns.PatternInstanceManager;
import com.ibm.broker.config.appdev.patterns.PatternParameterRow;
import com.ibm.broker.config.appdev.patterns.PatternParameterTable;

public class PatternGenerator implements GeneratePatternInstanceTransform {
	
	private enum ROUTING_TYPE {
		no_routing, 
		specify_routes, 
		lookup_routes;
	}; 
	
	//
	private static final String PROJECT_TITLE = "RDMQOneWayProject";
	
	//Flows
	private static final String RECORD_DISTRIBUTOR_FLOW = "mqsi/RecordDistributor.msgflow";
	private static final String ROUTE_FLOW = "mqsi/Route.subflow";
	private static final String RECORD_PROCESSOR_FLOW = "mqsi/RecordProcessor.subflow";
	private static final String ERROR_SUBFLOW = "mqsi/Error.subflow";
	private static final String LOG_SUBFLOW = "mqsi/Log.subflow";
	
	//Nodes
	private static final String ROUTE_SUBFLOW_NODE  = "Route";
	private static final String RECORD_PROCESSOR_SUBFLOW_NODE = "Record Processing";
	private static final String FILE_INPUT_NODE = "File Input";
	private static final String ROUTE_FLOW_INPUT_NODE  = "Input";
	private static final String RECORD_PROCESSOR_FLOW_INPUT_NODE = "Input";
	private static final String RECORD_PROCESSOR_FLOW_OUTPUT_NODE = "Output";
	private static final String ERROR_SUBFLOW_INPUT_NODE = "Input";
	private static final String LOG_SUBFLOW_INPUT_NODE = "Input";
	private static final String LOG_SUBFLOW_MQOUT_NODE = "MQOutput";
	
	//Properties 
	private static final String PROPERTY_RECORD_DETECTION = "pp6";
	private static final String PROPERTY_RECORD_LENGTH = "pp7";
	private static final String PROPERTY_DELIMITER_TYPE = "pp9";
	private static final String PROPERTY_CUSTOM_DELIMITER = "pp8";
	private static final String PROPERTY_MESSAGE_SET = "pp14";
	private static final String PROPERTY_MESSAGE_TYPE = "pp12";
	private static final String PROPERTY_MESSAGE_FORMAT = "pp11";
	private static final String PROPERTY_CCSID = "pp10";
	private static final String PROPERTY_FILE_ENCODING = "pp2";
	
	private static final String PROPERTY_ROUTING_TYPE = "routingtype";
	
	private static final String PROPERTY_NO_ROUTING_OUTPUT_QUEUE = "pp15";
	private static final String PROPERTY_NO_ROUTING_OUTPUT_QUEUE_MANAGER = "pp16";
	
	private static final String PROPERTY_SPECIFY_ROUTES_QUEUE = "pp18";
	private static final String PROPERTY_SPECIFY_ROUTES_QUEUE_MANAGER = "pp17";
	private static final String PROPERTY_SPECIFY_ROUTES_NAMESPACE_TABLE = "pp19";
	private static final String PROPERTY_SPECIFY_ROUTES_ROUTING_TABLE = "pp20";
	
	private static final String PROPERTY_LOOKUP_ROUTES_DATASOURCE = "pp21";
	private static final String PROPERTY_LOOKUP_ROUTES_DATACONTEXT = "pp22";
	private static final String PROPERTY_LOOKUP_ROUTES_KEYLOCATION1 = "pp23";
	private static final String PROPERTY_LOOKUP_ROUTES_KEYLOCATION2 = "pp24";
	private static final String PROPERTY_LOOKUP_ROUTES_QUEUE_MANAGER = "pp25";
	private static final String PROPERTY_LOOKUP_ROUTES_QUEUE = "pp26";
	private static final String PROPERTY_LOOKUP_ROUTES_CACHE_REFRESH = "pp27";
	private static final String PROPERTY_LOOKUP_ROUTES_REFRESH_QUEUE= "pp28";

	private static final String PROPERTY_ERROR_HANDLING_REQUIRED = "pp13";
	private static final String PROPERTY_ERROR_HANDLING_QM = "pp29";
	private static final String PROPERTY_ERROR_HANDLING_Q = "pp30";

	private static final String PROPERTY_LOGGING_REQUIRED = "pp31";
	private static final String PROPERTY_LOGGING_QM = "pp32";
	private static final String PROPERTY_LOGGING_Q = "pp33";

	

	
	
	
	private PatternInstanceManager patternInstanceManager;
	private ROUTING_TYPE routingType;
	
	@Override
	public void onGeneratePatternInstance(PatternInstanceManager patternInstanceManager) {
		
		// The location for the generated projects 
		String location = patternInstanceManager.getWorkspaceLocation();
		
		// The pattern instance name for this generation
		String patternInstanceName = patternInstanceManager.getPatternInstanceName();
		
		this.patternInstanceManager = patternInstanceManager;
		
		//Configure File input node
		this.configureFileInput();
		
		//Routing type 
		this.routingType = ROUTING_TYPE.valueOf(patternInstanceManager.getParameterValue(PROPERTY_ROUTING_TYPE));
		
		switch (this.routingType) {
			case no_routing:
				this.createNoRouting();
			break;
			case specify_routes:
				this.createSpecifyRoutes();
			break;
			case lookup_routes:
				this.createLookupRoutes();
			break;
		}
		
		MessageFlow recordDistributionFlow = this.getRecordDistributorFlow();
		
		//Error Handling
		boolean errorHandling = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_HANDLING_REQUIRED).equals("true");
		this.createErrorSubflow(errorHandling);
		this.addErrorNodes(errorHandling);
		
		if (errorHandling) {
			UserDefinedProperty errorLoggingUDP = new UserDefinedProperty("Basic", "ErrorLoggingOn", 
					FlowProperty.Usage.MANDATORY, FlowProperty.Type.BOOLEAN, true);
			recordDistributionFlow.addFlowProperty(errorLoggingUDP);
		}
		
		this.patternInstanceManager.setUserDefinedValue("Basic/ErrorLoggingOn", errorHandling);
		
		//Logging
		boolean logginRequired = this.patternInstanceManager.getParameterValue(PROPERTY_LOGGING_REQUIRED).equals("true");
		if (!logginRequired) {
			MessageFlow logSubFlow = this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, LOG_SUBFLOW);
			this.patternInstanceManager.removeMessageFlow(logSubFlow);
		} else {
			this.setupLogging();
			
			UserDefinedProperty loggingUDP = new UserDefinedProperty("Basic", "LoggingOn", 
					FlowProperty.Usage.MANDATORY, FlowProperty.Type.BOOLEAN, true);

			
			recordDistributionFlow.addFlowProperty(loggingUDP);
		}
		
	}
	
	private void configureFileInput() {
		String recordDetection = patternInstanceManager.getParameterValue(PROPERTY_RECORD_DETECTION);
		String recordLength = patternInstanceManager.getParameterValue(PROPERTY_RECORD_LENGTH);
		String delimiterType = patternInstanceManager.getParameterValue(PROPERTY_DELIMITER_TYPE);
		String customDelimiter = patternInstanceManager.getParameterValue(PROPERTY_CUSTOM_DELIMITER);
		String messageSet = patternInstanceManager.getParameterValue(PROPERTY_MESSAGE_SET);
		String messageType = patternInstanceManager.getParameterValue(PROPERTY_MESSAGE_TYPE);
		String messageFormat = patternInstanceManager.getParameterValue(PROPERTY_MESSAGE_FORMAT);
		String ccsid = patternInstanceManager.getParameterValue(PROPERTY_CCSID);
		String fileEncoding = patternInstanceManager.getParameterValue(PROPERTY_FILE_ENCODING);
		
		MessageFlow recordDistributionFlow = this.getRecordDistributorFlow();
		FileInputNode fileInput = (FileInputNode) recordDistributionFlow.getNodeByName(FILE_INPUT_NODE);
		fileInput.setMessageCodedCharSetIdProperty(ccsid);
		fileInput.setMessageEncodingProperty(fileEncoding);
		if (recordDetection.equals("fixed_length")) {
			
			fileInput.setMessageDomainProperty("BLOB");
			fileInput.setRecordDetection(ENUM_FILEINPUT_RECORDDETECTION.fixedLength);
			fileInput.setRecordLength(Integer.parseInt(recordLength));
			
		} else if (recordDetection.equals("delimited_bin") || recordDetection.equals("delimited_xml")) {
			
			fileInput.setMessageDomainProperty(recordDetection.equals("delimited_bin") ? "BLOB" : "XMLNSC");
			fileInput.setRecordDetection(ENUM_FILEINPUT_RECORDDETECTION.delimited);
			
			if (delimiterType.equals("eitherLineend")) {
				fileInput.setRecordDelimiter(ENUM_FILEINPUT_RECORDDELIMITER.eitherLineend);
			} else if (delimiterType.equals("customDelimiter")) {
				fileInput.setRecordDelimiter(ENUM_FILEINPUT_RECORDDELIMITER.customDelimiter);
				fileInput.setCustomDelimiter(customDelimiter);
			}
			
		} else if (recordDetection.equals("parsed_bin")) {
			
			fileInput.setMessageDomainProperty("MRM");
			fileInput.setMessageSetProperty(messageSet);
			fileInput.setMessageTypeProperty(messageType);
			fileInput.setMessageFormatProperty(messageFormat);
			fileInput.setRecordDetection(ENUM_FILEINPUT_RECORDDETECTION.parsedRecordSequence);
			
		} else if (recordDetection.equals("parsed_xml")) {
			
			fileInput.setMessageDomainProperty("XMLNSC");
			fileInput.setRecordDetection(ENUM_FILEINPUT_RECORDDETECTION.parsedRecordSequence);
		}
	}

	private void setupLogging() {
		
		MessageFlow mainFlow = this.getRecordDistributorFlow();
		MessageFlow logSubFlow = this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, LOG_SUBFLOW);
		
		FileInputNode fileNode = (FileInputNode) mainFlow.getNodeByName(FILE_INPUT_NODE);
		
		//Create UDP node
		DatabaseNode saveUdpDbNode = new DatabaseNode();
		ESQLModule errorEsql = new ESQLModule();
		errorEsql.setBrokerSchema("mqsi");
		errorEsql.setEsqlMain("SaveUDPs");
		
		saveUdpDbNode.setStatement(errorEsql);
		saveUdpDbNode.setNodeName("Save UDP");
		saveUdpDbNode.setThrowExceptionOnDatabaseError(true);
		mainFlow.addNode(saveUdpDbNode);
		
		mainFlow.connect(fileNode.OUTPUT_TERMINAL_EOD, saveUdpDbNode.INPUT_TERMINAL_IN);
		
		SubFlowNode logSubFlowNode = new SubFlowNode();
		logSubFlowNode.setNodeName("Log");
		logSubFlowNode.setSubFlow(logSubFlow);
		
		mainFlow.addNode(logSubFlowNode);
		mainFlow.connect(saveUdpDbNode.OUTPUT_TERMINAL_OUT, logSubFlowNode.getInputTerminal(LOG_SUBFLOW_INPUT_NODE));
		
		//Update Log subflow
		String logQueueManager = this.patternInstanceManager.getParameterValue(PROPERTY_LOGGING_QM);
		String logQueue = this.patternInstanceManager.getParameterValue(PROPERTY_LOGGING_Q);
		MQOutputNode mqOut = (MQOutputNode) logSubFlow.getNodeByName(LOG_SUBFLOW_MQOUT_NODE);
		mqOut.setQueueManagerName(logQueueManager);
		mqOut.setQueueName(logQueue);
	}

	private void createLookupRoutes() {
		MessageFlow recordDistributorFlow = this.getRecordDistributorFlow();
		MessageFlow routeFlow = this.getRouteFlow();
		
		
		
		//Populate Route flow
		InputNode inputNode = (InputNode) routeFlow.getNodeByName(ROUTE_FLOW_INPUT_NODE);
		//Create Compute Node
		ComputeNode computeNode = new ComputeNode();
		computeNode.setNodeName("Compute");
		computeNode.setComputeMode(ENUM_COMPUTE_COMPUTEMODE.destinationAndMessage);
		computeNode.setDataSource(this.patternInstanceManager.getParameterValue(PROPERTY_LOOKUP_ROUTES_DATASOURCE));
		ESQLModule routeToDestEsql = new ESQLModule();
		routeToDestEsql.setBrokerSchema("mqsi");
		routeToDestEsql.setEsqlMain("RoutetoDest");
		computeNode.setComputeExpression(routeToDestEsql);
		routeFlow.addNode(computeNode);
		routeFlow.connect(inputNode.OUTPUT_TERMINAL_OUT, computeNode.INPUT_TERMINAL_IN);
		
		//Create OutputNodes
		OutputNode failureOutputNode = new OutputNode();
		failureOutputNode.setNodeName("failure");
		routeFlow.addNode(failureOutputNode);
		routeFlow.connect(computeNode.OUTPUT_TERMINAL_FAILURE, failureOutputNode.INPUT_TERMINAL_IN);
		OutputNode route1OutputNode = new OutputNode();
		route1OutputNode.setNodeName("route1");
		routeFlow.addNode(route1OutputNode);
		routeFlow.connect(computeNode.OUTPUT_TERMINAL_FAILURE, route1OutputNode.INPUT_TERMINAL_IN);
		
		//Create RecordDistributorSubflowNode
		SubFlowNode recordProcessorSubflowNode = this.createRecordProcessorNode();
		
		//Create RouteSubflowNode
		SubFlowNode routeSubflowNode = this.createRoutingSubflowNode(recordProcessorSubflowNode, 
				recordProcessorSubflowNode.getOutputTerminal(RECORD_PROCESSOR_FLOW_OUTPUT_NODE));
		
		//Add MQOutputs
		String defaultQueueManager = this.patternInstanceManager.getParameterValue(PROPERTY_LOOKUP_ROUTES_QUEUE_MANAGER);
		String defaultQueueName = this.patternInstanceManager.getParameterValue(PROPERTY_LOOKUP_ROUTES_QUEUE);
		
		MQOutputNode defaultDestinationMQOut = new MQOutputNode();
		defaultDestinationMQOut.setNodeName("Default Destination");
		defaultDestinationMQOut.setQueueManagerName(defaultQueueManager);
		defaultDestinationMQOut.setQueueName(defaultQueueName);
		recordDistributorFlow.addNode(defaultDestinationMQOut);
		recordDistributorFlow.connect(routeSubflowNode.getOutputTerminal("failure"), defaultDestinationMQOut.INPUT_TERMINAL_IN);
		
		MQOutputNode outputMessageMQOut = new MQOutputNode();
		outputMessageMQOut.setNodeName("Output Message");
		outputMessageMQOut.setDestinationMode(ENUM_MQOUTPUT_DESTINATIONMODE.list);
		outputMessageMQOut.setTransactionMode(ENUM_MQOUTPUT_TRANSACTIONMODE.yes);
		outputMessageMQOut.setPersistenceMode(ENUM_MQOUTPUT_PERSISTENCEMODE.yes);
		recordDistributorFlow.addNode(outputMessageMQOut);
		recordDistributorFlow.connect(routeSubflowNode.getOutputTerminal("route1"), outputMessageMQOut.INPUT_TERMINAL_IN);
		
		//Cache enabled?
		boolean cacheEnabled = this.patternInstanceManager.getParameterValue(PROPERTY_LOOKUP_ROUTES_CACHE_REFRESH).equals("true");
		if (cacheEnabled) {
			
			//Add MQInput Node
			String cacheRefreshQueueName = this.patternInstanceManager.getParameterValue(PROPERTY_LOOKUP_ROUTES_REFRESH_QUEUE);
			MQInputNode cacheRefreshMQIn = new MQInputNode();
			cacheRefreshMQIn.setNodeName("Trigger Cache Refresh");
			cacheRefreshMQIn.setQueueName(cacheRefreshQueueName);
			recordDistributorFlow.addNode(cacheRefreshMQIn);
			
			
			//Add Compute Node
			ComputeNode invalidateCache = new ComputeNode();
			invalidateCache.setNodeName("Invalidate Cache");
			ESQLModule invalidateCacheEsql = new ESQLModule();
			invalidateCacheEsql.setBrokerSchema("mqsi");
			invalidateCacheEsql.setEsqlMain("Invalidatecache");
			invalidateCache.setComputeExpression(invalidateCacheEsql);
			recordDistributorFlow.addNode(invalidateCache);
			
			recordDistributorFlow.connect(cacheRefreshMQIn.OUTPUT_TERMINAL_FAILURE, invalidateCache.INPUT_TERMINAL_IN);
			recordDistributorFlow.connect(cacheRefreshMQIn.OUTPUT_TERMINAL_OUT, invalidateCache.INPUT_TERMINAL_IN);
		}
	}

	private void createSpecifyRoutes() {
		
		PatternParameterTable routingValues = this.patternInstanceManager.getParameterTable(PROPERTY_SPECIFY_ROUTES_ROUTING_TABLE);
		PatternParameterTable namespaceValues = this.patternInstanceManager.getParameterTable(PROPERTY_SPECIFY_ROUTES_NAMESPACE_TABLE);
		
		MessageFlow recordDistributor = this.getRecordDistributorFlow();
		
		
		
		//Create Route flow
		MessageFlow routeFlow = this.getRouteFlow();
		InputNode inputNode = (InputNode) routeFlow.getNodeByName(ROUTE_FLOW_INPUT_NODE);
		RouteNode routeNode = new RouteNode();
		routeNode.setLocation(inputNode.getLocation().x + 150,
				inputNode.getLocation().y);
		routeNode.setDistributionMode(ENUM_ROUTE_DISTRIBUTIONMODE.first);
		//Add routeNode to Route subflow
		routeFlow.addNode(routeNode);
		routeFlow.connect(inputNode.OUTPUT_TERMINAL_OUT, routeNode.INPUT_TERMINAL_IN);
		
		//Create RecordDistributorSubflowNode
		SubFlowNode recordProcessorSubflowNode = this.createRecordProcessorNode();
		
		//Create RouteSubflowNode
		SubFlowNode routeSubflowNode = this.createRoutingSubflowNode(recordProcessorSubflowNode, 
				recordProcessorSubflowNode.getOutputTerminal(RECORD_PROCESSOR_FLOW_OUTPUT_NODE));
		
		//Add namespaces
		if (namespaceValues.getRowCount() > 0) {

			Vector<NamespacePrefixMap> NsMaps = new Vector<NamespacePrefixMap>();

			for (int i = 0; i < namespaceValues.getRowCount(); i++) {
				PatternParameterRow row = namespaceValues.getRow(i);
				String prefix = row.getValue("namespaceprefix");
				String uri = row.getValue("namespaceuri");
				NamespacePrefixMap NsMap = new NamespacePrefixMap();
				NsMap.setNsPrefix(prefix);
				NsMap.setNamespace(uri);
				NsMaps.add(NsMap);
			}

			routeNode.setNsmappingtables(NsMaps);
		}
		
		//Add filters
		if (routingValues.getRowCount() > 0) {
			
			FilterTable filterTable = routeNode.getFilterTable();
			
			for (int i =0; i < routingValues.getRowCount(); i++) {
				
				String outputTerminalName = "match"+(i+1);
				
				PatternParameterRow filterRow = routingValues.getRow(i);
				
				String keyLocation = filterRow.getValue("keylocation");
				String keyValue = filterRow.getValue("keyvalue");
				String queueManager = filterRow.getValue("queuemanager");
				String queueName = filterRow.getValue("queue");
				
				FilterTableRow tableRow = filterTable.createRow();
				tableRow.setFilterPattern(keyLocation + "=\"" + keyValue + "\"");
				tableRow.setRoutingOutputTerminal(outputTerminalName);
				
				filterTable.addRow(tableRow);
				
				OutputNode outputNode = new OutputNode();
				outputNode.setNodeName(outputTerminalName);
				outputNode.setLocation(routeNode.getLocation().x + 150,
						routeNode.getLocation().y + (150 * i));
				
				routeFlow.addNode(outputNode);
				routeFlow.connect(routeNode.getOutputTerminal(outputTerminalName), outputNode.INPUT_TERMINAL_IN);
				
				//Connect to MQOutput in RecordDistributor
				MQOutputNode mqOut = new MQOutputNode();
				mqOut.setNodeName("Output"+(i+1));
				mqOut.setQueueManagerName(queueManager);
				mqOut.setQueueName(queueName);
				mqOut.setTransactionMode(ENUM_MQOUTPUT_TRANSACTIONMODE.yes);
				recordDistributor.addNode(mqOut);
				recordDistributor.connect(routeSubflowNode.getOutputTerminal(outputTerminalName), mqOut.INPUT_TERMINAL_IN);
			}
		}
		
		//Add default route
		ComputeNode recordDefault = new ComputeNode();
		recordDefault.setNodeName("Record Default");
		ESQLModule recordDefaultEsql = new ESQLModule();
		recordDefaultEsql.setBrokerSchema("mqsi");
		recordDefaultEsql.setEsqlMain("RecordDefault");
		recordDefault.setComputeExpression(recordDefaultEsql);
		routeFlow.addNode(recordDefault);
		routeFlow.connect(routeNode.OUTPUT_TERMINAL_FAILURE, recordDefault.INPUT_TERMINAL_IN);
		routeFlow.connect(routeNode.OUTPUT_TERMINAL_DEFAULT, recordDefault.INPUT_TERMINAL_IN);
		
		//Add default output Node
		OutputNode defaultOutputNode = new OutputNode();
		defaultOutputNode.setNodeName("default");
		routeFlow.addNode(defaultOutputNode);
		routeFlow.connect(recordDefault.OUTPUT_TERMINAL_OUT, defaultOutputNode.INPUT_TERMINAL_IN);
		
		//Add default destination mqoutput
		String defaultQueueManager = this.patternInstanceManager.getParameterValue(PROPERTY_SPECIFY_ROUTES_QUEUE_MANAGER);
		String defaultQueueName = this.patternInstanceManager.getParameterValue(PROPERTY_SPECIFY_ROUTES_QUEUE);
		MQOutputNode mqOut = new MQOutputNode();
		mqOut.setNodeName("Default Destination");
		mqOut.setQueueManagerName(defaultQueueManager);
		mqOut.setQueueName(defaultQueueName);
		recordDistributor.addNode(mqOut);
		recordDistributor.connect(routeSubflowNode.getOutputTerminal("default"), mqOut.INPUT_TERMINAL_IN);
	
	}

	private SubFlowNode createRoutingSubflowNode(Node sourceNode, OutputTerminal outTerminal) {
		MessageFlow mainFlow = this.getRecordDistributorFlow();
		MessageFlow routeFlow = this.getRouteFlow();

		// Create Route Node
		SubFlowNode routeSubflowNode = new SubFlowNode();
		routeSubflowNode.setNodeName(ROUTE_SUBFLOW_NODE);
		routeSubflowNode.setSubFlow(routeFlow);
		
		// Position
		Point recordProcessorNodePoint = sourceNode.getLocation();
		Point point = new Point(recordProcessorNodePoint.x + 150,
				recordProcessorNodePoint.y);
		routeSubflowNode.setLocation(point);

		mainFlow.addNode(routeSubflowNode);

		// Connect Node
		mainFlow.connect(outTerminal,
				routeSubflowNode.getInputTerminal(ROUTE_FLOW_INPUT_NODE));

		return routeSubflowNode;
	}

	private void createNoRouting() {
		MessageFlow routeFlow = this.getRouteFlow();
		MessageFlow recordDistributorFlow = this.getRecordDistributorFlow();

		InputNode routeFlowInputNode = (InputNode) routeFlow.getNodeByName(ROUTE_FLOW_INPUT_NODE);
		
		//Add Passthrough node
		PassthroughNode passThruNode = new PassthroughNode();
		routeFlow.addNode(passThruNode);
		routeFlow.connect(routeFlowInputNode.OUTPUT_TERMINAL_OUT, passThruNode.INPUT_TERMINAL_IN);
		
		//Add output node
		OutputNode routeFlowOutputNode = new OutputNode();
		routeFlow.addNode(routeFlowOutputNode);
		routeFlow.connect(passThruNode.OUTPUT_TERMINAL_OUT, routeFlowOutputNode.INPUT_TERMINAL_IN);
		
		//Add Route Subflow to RecordDistributor
		Node recordProcessorSubflowNode = this.createRecordProcessorNode();
		Node routeSubflowNode = this.createRouteNode(recordProcessorSubflowNode
				.getOutputTerminal(RECORD_PROCESSOR_FLOW_OUTPUT_NODE));
	
		
		//Add MQOut
		MQOutputNode mqOutNode = new MQOutputNode();
		mqOutNode.setQueueName(this.patternInstanceManager.getParameterValue(PROPERTY_NO_ROUTING_OUTPUT_QUEUE));
		mqOutNode.setQueueManagerName(this.patternInstanceManager.getParameterValue(PROPERTY_NO_ROUTING_OUTPUT_QUEUE_MANAGER));
		recordDistributorFlow.addNode(mqOutNode);
		recordDistributorFlow.connect(routeSubflowNode.getOutputTerminal("Output"), mqOutNode.INPUT_TERMINAL_IN);
	}
	
	/**
	 * Creates the RecordProcessor subflow node
	 * 
	 * @return Node
	 */
	private SubFlowNode createRecordProcessorNode() {
		MessageFlow mainFlow = this.getRecordDistributorFlow();
		MessageFlow recordProcessorFlow = this.patternInstanceManager
				.getMessageFlow(PROJECT_TITLE, RECORD_PROCESSOR_FLOW);

		SubFlowNode recordProcessorNode = new SubFlowNode();
		recordProcessorNode.setNodeName(RECORD_PROCESSOR_SUBFLOW_NODE);
		recordProcessorNode.setSubFlow(recordProcessorFlow);

		// Position
		Point fileInputNodePoint = mainFlow.getNodeByName(FILE_INPUT_NODE)
				.getLocation();
		Point point = new Point(fileInputNodePoint.x + 150,
				fileInputNodePoint.y);
		recordProcessorNode.setLocation(point);

		mainFlow.addNode(recordProcessorNode);

		// Connect node
		FileInputNode fileInputNode = (FileInputNode) mainFlow
				.getNodeByName(FILE_INPUT_NODE);
		mainFlow.connect(fileInputNode.OUTPUT_TERMINAL_OUT, recordProcessorNode
				.getInputTerminal(RECORD_PROCESSOR_FLOW_INPUT_NODE));

		return recordProcessorNode;
	}

	/**
	 * Creates the Route subflow node
	 * 
	 * @param input
	 * @return
	 */
	private Node createRouteNode(OutputTerminal input) {
		MessageFlow mainFlow = this.getRecordDistributorFlow();
		MessageFlow routeFlow = this.getRouteFlow();

		// Create Route Node
		SubFlowNode routeSubflowNode = new SubFlowNode();
		routeSubflowNode.setNodeName(ROUTE_SUBFLOW_NODE);
		routeSubflowNode.setSubFlow(routeFlow);

		// Position
		Point recordProcessorNodePoint = mainFlow.getNodeByName(
				RECORD_PROCESSOR_SUBFLOW_NODE).getLocation();
		Point point = new Point(recordProcessorNodePoint.x + 150,
				recordProcessorNodePoint.y);
		routeSubflowNode.setLocation(point);

		mainFlow.addNode(routeSubflowNode);

		// Connect Node
		mainFlow.connect(input,
				routeSubflowNode.getInputTerminal(ROUTE_FLOW_INPUT_NODE));

		return routeSubflowNode;
	}
	
	private void addErrorNodes(boolean enableErrorHandling) {
		MessageFlow mainFlow = this.getRecordDistributorFlow();
		
		FileInputNode fileNode = (FileInputNode) mainFlow.getNodeByName(FILE_INPUT_NODE);
		
		//Add Error Subflow node
		SubFlowNode errorSubflowNode = new SubFlowNode();
		errorSubflowNode.setNodeName("Error");
		errorSubflowNode.setSubFlow(this.getErrorSubFlow());
		mainFlow.addNode(errorSubflowNode);
		

		//enable Error handling
		if (enableErrorHandling) {
			DatabaseNode saveUdpDbNode = new DatabaseNode();
			ESQLModule errorEsql = new ESQLModule();
			errorEsql.setBrokerSchema("mqsi");
			errorEsql.setEsqlMain("SaveUDPs");
			
			saveUdpDbNode.setStatement(errorEsql);
			saveUdpDbNode.setNodeName("Save UDPs");
			saveUdpDbNode.setThrowExceptionOnDatabaseError(true);
			mainFlow.addNode(saveUdpDbNode);
			
			mainFlow.connect(fileNode.OUTPUT_TERMINAL_CATCH, saveUdpDbNode.INPUT_TERMINAL_IN);
			
			mainFlow.connect(saveUdpDbNode.OUTPUT_TERMINAL_OUT, errorSubflowNode.getInputTerminals()[0]);
		} else {
			mainFlow.connect(fileNode.OUTPUT_TERMINAL_CATCH, errorSubflowNode.getInputTerminals()[0]);
		}
		
		
	

	}
	
	private void createErrorSubflow(boolean enableErrorHandling) {
		MessageFlow errorSubFlow = this.getErrorSubFlow();
		InputNode inputNode = (InputNode) errorSubFlow.getNodeByName(ERROR_SUBFLOW_INPUT_NODE);
		
		//Build Message Compute Node
		ComputeNode computeNode = new ComputeNode();
		computeNode.setNodeName("Build Message");
		computeNode.setComputeMode(ENUM_COMPUTE_COMPUTEMODE.message);
		
		ESQLModule esqlModule = new ESQLModule();
		esqlModule.setBrokerSchema("mqsi");
		esqlModule.setEsqlMain("Build_Error_Message");
		
		computeNode.setComputeExpression(esqlModule);
		
		errorSubFlow.addNode(computeNode);
		errorSubFlow.connect(inputNode.OUTPUT_TERMINAL_OUT, computeNode.INPUT_TERMINAL_IN);
		
		//Throw Compute Node
		ComputeNode throwNode = new ComputeNode();
		throwNode.setNodeName("Throw");
		throwNode.setComputeMode(ENUM_COMPUTE_COMPUTEMODE.exceptionAndMessage);
		
		ESQLModule throwEsql = new ESQLModule();
		throwEsql.setBrokerSchema("mqsi");
		throwEsql.setEsqlMain("Throw");
		
		throwNode.setComputeExpression(throwEsql);
		
		errorSubFlow.addNode(throwNode);
		
		if (enableErrorHandling) {
			
			FilterNode filterNode = new FilterNode();
			filterNode.setNodeName("Log Errors?");
			filterNode.setThrowExceptionOnDatabaseError(false);
			ESQLModule filterEsql = new ESQLModule();
			filterEsql.setBrokerSchema("mqsi");
			filterEsql.setEsqlMain("CheckErrorLogging");
			filterNode.setFilterExpression(filterEsql);
			errorSubFlow.addNode(filterNode);

			errorSubFlow.connect(computeNode.OUTPUT_TERMINAL_OUT, filterNode.INPUT_TERMINAL_IN);
			
			FlowOrderNode flowOrderNode = new FlowOrderNode();
			flowOrderNode.setNodeName("FlowOrder");
			errorSubFlow.addNode(flowOrderNode);
			
			
			errorSubFlow.connect(filterNode.OUTPUT_TERMINAL_FAILURE, throwNode.INPUT_TERMINAL_IN);
			errorSubFlow.connect(filterNode.OUTPUT_TERMINAL_UNKNOWN, throwNode.INPUT_TERMINAL_IN);
			errorSubFlow.connect(filterNode.OUTPUT_TERMINAL_FALSE, throwNode.INPUT_TERMINAL_IN);
			errorSubFlow.connect(filterNode.OUTPUT_TERMINAL_TRUE, flowOrderNode.INPUT_TERMINAL_IN);
			
			//Add MQOut Node
			String errorQueueManager = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_HANDLING_QM);
			String errorQueue = this.patternInstanceManager.getParameterValue(PROPERTY_ERROR_HANDLING_Q);
			MQOutputNode mqOut = new MQOutputNode();
			mqOut.setNodeName("Error Output");
			mqOut.setQueueManagerName(errorQueueManager);
			mqOut.setQueueName(errorQueue);
			mqOut.setTransactionMode(ENUM_MQOUTPUT_TRANSACTIONMODE.no);
			mqOut.setPersistenceMode(ENUM_MQOUTPUT_PERSISTENCEMODE.yes);
	
			errorSubFlow.connect(flowOrderNode.OUTPUT_TERMINAL_FIRST, mqOut.INPUT_TERMINAL_IN);
			errorSubFlow.connect(flowOrderNode.OUTPUT_TERMINAL_SECOND, throwNode.INPUT_TERMINAL_IN);
			
		} else {
			errorSubFlow.connect(computeNode.OUTPUT_TERMINAL_OUT, throwNode.INPUT_TERMINAL_IN);
		}
	}
	
	private MessageFlow getRecordDistributorFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, RECORD_DISTRIBUTOR_FLOW);
	}
	
	private MessageFlow getRouteFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, ROUTE_FLOW);
	}
	
	private MessageFlow getErrorSubFlow() {
		return this.patternInstanceManager.getMessageFlow(PROJECT_TITLE, ERROR_SUBFLOW);
	}
}
