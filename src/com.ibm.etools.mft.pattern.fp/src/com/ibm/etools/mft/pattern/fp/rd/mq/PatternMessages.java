/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.fp.rd.mq;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.fp.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.fp.rd.mq.messages"; //$NON-NLS-1$
	private static final Map<String, String> map;	
	private static final String[] enumerations = {
	};

	public static String getStringStatic(String key) {
		return map.get(key);
	}
	
	public String getString(String key) {
		return map.get(key);
	}
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_instanceName;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_instanceName_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_fileInput;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_fileInput_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_recordDetection;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_recordDetection_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_routing;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_routing_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_noRouting;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_noRouting_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_specifyRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_specifyRoutes_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_lookupRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_lookupRoutes_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_log;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_log_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_errorHandling;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_errorHandling_description;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_general;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_group_general_description;		

	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_instanceName;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_instanceName_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_instanceName_default;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_directory;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_directory_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_filePattern;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_filePattern_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_useftp;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_useftp_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_ftpConfigurableSvc;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_ftpConfigurableSvc_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_ftpConfigurableSvc_default;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordDetect;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordDetect_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordLength;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordLength_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordDelimiter;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_recordDelimiter_watermark;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_delimiterType;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_delimiterType_watermark;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageSet;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageSet_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageType;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageType_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageFormat;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_messageFormat_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_CCSID;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_CCSID_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_encoding;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_encoding_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routing;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routing_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_outputQueueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_outputQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_outputQueue;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_outputQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueue;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_namespaceTable;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_namespaceTable_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routingDataSource;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routingDataSource_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routingContext;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routingContext_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_key1;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_key1_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_key2;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_key2_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueManagerLookupRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueManagerLookupRoutes_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueLookupRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_defaultQueueLookupRoutes_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_cacheRefresh;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_cacheRefresh_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_refreshQueue;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_refreshQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_loggingRequired;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_loggingRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_logQueueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_logQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_logQueue;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_logQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorMessageRequired;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorMessageRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorQueueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorQueue;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_errorQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_brokerSchema;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_brokerSchema_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_flowPrefix;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_flowPrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_flowSuffix;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_flowSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_queuePrefix;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_queuePrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_queueSuffix;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_queueSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_shortDescription;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_shortDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_shortDescription_default;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_longDescription;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_longDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_longDescription_default;		

	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_namespaceTable_nsPrefix;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_namespaceTable_nsURI;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable_keyLocation;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable_keyValue;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable_queueManager;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_root_routeTable_queue;

	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_recordDetectionEnum_fixedLength;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_recordDetectionEnum_delimited;			
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_recordDetectionEnum_xmlDelimited;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_recordDetectionEnum_xmlParsed;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_recordDetectionEnum_parsed;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_routingEnum_noRouting;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_routingEnum_specifyRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_routingEnum_lookupRoutes;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_encodingEnum_0;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_encodingEnum_546;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_encodingEnum_273;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_encodingEnum_785;		
		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_ccsidEnum_0;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_delimiterTypeEnum_custom;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_pov_delimiterTypeEnum_EOL;

	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_1;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_2;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_3;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_4;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_5;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_esql_6;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_jet_1;
	
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_1;
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_2;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_3;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_4;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_5;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_7;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_8;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_9;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_13;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_13_queueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_14;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_14_queueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_15;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_15_queueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_16;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_16_queueManager;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_18;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_19;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_20;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_21;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_22;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_23;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_24;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_25;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_26;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_27;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_28;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_29;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_30;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_31;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_32;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_33;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_34;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_35;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_36;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_37;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_38;		
	public static String com_ibm_etools_mft_pattern_fp_rd_mq_summary_39;		
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}
