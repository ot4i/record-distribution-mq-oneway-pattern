package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_destination_cache_2kesql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_destination_cache_2kesql() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_15 = new TagInfo("c:get", //$NON-NLS-1$
            5, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_18 = new TagInfo("c:get", //$NON-NLS-1$
            8, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_63 = new TagInfo("c:get", //$NON-NLS-1$
            8, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_23 = new TagInfo("c:get", //$NON-NLS-1$
            9, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_26 = new TagInfo("c:get", //$NON-NLS-1$
            10, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_28 = new TagInfo("c:get", //$NON-NLS-1$
            22, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/routingContext", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_14 = new TagInfo("c:get", //$NON-NLS-1$
            53, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/key1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_14 = new TagInfo("c:get", //$NON-NLS-1$
            54, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/key2", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_3_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
            _jettag_c_if_3_1.doStart(context, out);
            while (_jettag_c_if_3_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_15.setRuntimeParent(_jettag_c_if_3_1);
                _jettag_c_get_5_15.setTagInfo(_td_c_get_5_15);
                _jettag_c_get_5_15.doStart(context, out);
                _jettag_c_get_5_15.doEnd();
                out.write(NL);         
                _jettag_c_if_3_1.handleBodyContent(out);
            }
            _jettag_c_if_3_1.doEnd();
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_18.setRuntimeParent(null);
        _jettag_c_get_8_18.setTagInfo(_td_c_get_8_18);
        _jettag_c_get_8_18.doStart(context, out);
        _jettag_c_get_8_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_63.setRuntimeParent(null);
        _jettag_c_get_8_63.setTagInfo(_td_c_get_8_63);
        _jettag_c_get_8_63.doStart(context, out);
        _jettag_c_get_8_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_23.setRuntimeParent(null);
        _jettag_c_get_9_23.setTagInfo(_td_c_get_9_23);
        _jettag_c_get_9_23.doStart(context, out);
        _jettag_c_get_9_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_26.setRuntimeParent(null);
        _jettag_c_get_10_26.setTagInfo(_td_c_get_10_26);
        _jettag_c_get_10_26.doStart(context, out);
        _jettag_c_get_10_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE RoutetoDest");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t/****************************************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   Extract destination data based on message   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*\tThis version assumes MQ destination");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   Any compute node using this ESQL most have the following set:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   - The database source set to the database containing the routing table");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*   - The compute mode set to environment.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t*****************************************************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE CONTEXT CHARACTER '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_28.setRuntimeParent(null);
        _jettag_c_get_22_28.setTagInfo(_td_c_get_22_28);
        _jettag_c_get_22_28.doStart(context, out);
        _jettag_c_get_22_28.doEnd();
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Copy LocalEnvironment so content not lost");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputLocalEnvironment = InputLocalEnvironment;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("-- Read the database table into memory when CacheQueues.valid field is set to null.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Do this atomically to protect against problems when threads > 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tROUTING : BEGIN ATOMIC");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF CacheQueueTable.valid IS NULL THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET  CacheQueueTable.DestinationData[] =  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t\tSELECT S.QUEUE_MANAGER, S.QUEUE_NAME ,S.VARIABLE1, S.VARIABLE2");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t\tFROM Database.ROUTING_TABLE as S ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t\tWHERE ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t\t\tS.ROUTING_CONTEXT = CONTEXT     \t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       \t ); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t         \t ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET CacheQueueTable.valid = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND ROUTING;\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("-- \tAt this point the CacheQueues should be full of the data with possible destinations");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Extract the key from the incoming message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tDECLARE KEY1 CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE KEY2 CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/******************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("* This is a pattern parameter substitution*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*******************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET KEY1 = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_53_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_14.setRuntimeParent(null);
        _jettag_c_get_53_14.setTagInfo(_td_c_get_53_14);
        _jettag_c_get_53_14.doStart(context, out);
        _jettag_c_get_53_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET KEY2 = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_54_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_54_14.setRuntimeParent(null);
        _jettag_c_get_54_14.setTagInfo(_td_c_get_54_14);
        _jettag_c_get_54_14.doStart(context, out);
        _jettag_c_get_54_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIF KEY1 = NULL OR KEY2 = NULL THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t \tSET Environment.PatternVariables.RoutingError = 'No key found in message';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tIF \tEnvironment.PatternVariables.DefaultRouting IS NULL");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tTHEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.DefaultRouting = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.DefaultRouting = Environment.PatternVariables.DefaultRouting +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tPROPAGATE TO TERMINAL 'Failure';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Select queue manager and queue based on key from message\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET  OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[] = ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t      (");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       SELECT S.QUEUE_MANAGER as queueManagerName, S.QUEUE_NAME as queueName ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       FROM CacheQueueTable.DestinationData[] as S ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t       WHERE ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        S.VARIABLE1 = KEY1 and");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        S.VARIABLE2 = KEY2 \t\t        \t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t        );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Was a route selected\t\t        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("IF EXISTS(OutputLocalEnvironment.Destination.MQDestinationList.DestinationData[])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- YES - Propagate to out");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tTHEN RETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- NO - Propagate to failure and set environment");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("ELSE ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.RoutingError = 'Key not found in database';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.ErrorState = 'Failed';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tIF \tEnvironment.PatternVariables.DefaultRouting IS NULL");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tTHEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.DefaultRouting = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET Environment.PatternVariables.DefaultRouting = Environment.PatternVariables.DefaultRouting +1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tPROPAGATE TO TERMINAL 'Failure';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
