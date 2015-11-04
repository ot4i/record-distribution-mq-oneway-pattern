package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Erroresql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Erroresql() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_5_1 = new TagInfo("c:if", //$NON-NLS-1$
            5, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_18 = new TagInfo("c:get", //$NON-NLS-1$
            12, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_63 = new TagInfo("c:get", //$NON-NLS-1$
            12, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_23 = new TagInfo("c:get", //$NON-NLS-1$
            13, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_26 = new TagInfo("c:get", //$NON-NLS-1$
            14, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_44_1 = new TagInfo("c:choose", //$NON-NLS-1$
            44, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_45_1 = new TagInfo("c:when", //$NON-NLS-1$
            45, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'noRouting'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_52_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            52, 1,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages messages = new com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages();

        RuntimeTagElement _jettag_c_if_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_1.setRuntimeParent(null);
        _jettag_c_if_5_1.setTagInfo(_td_c_if_5_1);
        _jettag_c_if_5_1.doStart(context, out);
        while (_jettag_c_if_5_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_1.setRuntimeParent(_jettag_c_if_5_1);
            _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
            _jettag_c_if_7_1.doStart(context, out);
            while (_jettag_c_if_7_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_15.setRuntimeParent(_jettag_c_if_7_1);
                _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
                _jettag_c_get_9_15.doStart(context, out);
                _jettag_c_get_9_15.doEnd();
                out.write(NL);         
                _jettag_c_if_7_1.handleBodyContent(out);
            }
            _jettag_c_if_7_1.doEnd();
            _jettag_c_if_5_1.handleBodyContent(out);
        }
        _jettag_c_if_5_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_18.setRuntimeParent(null);
        _jettag_c_get_12_18.setTagInfo(_td_c_get_12_18);
        _jettag_c_get_12_18.doStart(context, out);
        _jettag_c_get_12_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_63.setRuntimeParent(null);
        _jettag_c_get_12_63.setTagInfo(_td_c_get_12_63);
        _jettag_c_get_12_63.doStart(context, out);
        _jettag_c_get_12_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_23.setRuntimeParent(null);
        _jettag_c_get_13_23.setTagInfo(_td_c_get_13_23);
        _jettag_c_get_13_23.doStart(context, out);
        _jettag_c_get_13_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_26.setRuntimeParent(null);
        _jettag_c_get_14_26.setTagInfo(_td_c_get_14_26);
        _jettag_c_get_14_26.doStart(context, out);
        _jettag_c_get_14_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE FILTER MODULE CheckErrorLogging");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN Environment.PatternVariables.ErrorLoggingOn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE Build_Error_Message");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputRoot.Properties = NULL;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Create MQMD");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE MQMDRef REFERENCE TO OutputRoot.MQMD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tCREATE FIRSTCHILD OF OutputRoot AS MQMDRef DOMAIN ('MQMD') NAME 'MQMD';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET MQMDRef.Version = MQMD_CURRENT_VERSION;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET MQMDRef.ApplIdentityData = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET MQMDRef.CodedCharSetId = InputRoot.Properties.CodedCharSetId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET MQMDRef.Encoding = InputRoot.Properties.Encoding;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE OutRef REFERENCE TO OutputRoot.XMLNSC;\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tCREATE NEXTSIBLING OF MQMDRef AS OutRef DOMAIN('XMLNSC') NAME 'XMLNSC';  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- Define the standard error fields");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutRef.Error.BrokerName = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tMOVE OutRef TO OutputRoot.XMLNSC.Error;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t    SET OutRef.MessageFlowLabel = SQL.MessageFlowLabel; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    SET OutRef.DTSTAMP =   CURRENT_TIMESTAMP; ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_44_1.setRuntimeParent(null);
        _jettag_c_choose_44_1.setTagInfo(_td_c_choose_44_1);
        _jettag_c_choose_44_1.doStart(context, out);
        JET2Writer _jettag_c_choose_44_1_saved_out = out;
        while (_jettag_c_choose_44_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_45_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_45_1.setRuntimeParent(_jettag_c_choose_44_1);
            _jettag_c_when_45_1.setTagInfo(_td_c_when_45_1);
            _jettag_c_when_45_1.doStart(context, out);
            JET2Writer _jettag_c_when_45_1_saved_out = out;
            while (_jettag_c_when_45_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("-- and some file info");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tSET OutRef.File.Directory = InputLocalEnvironment.File.Directory;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tSET OutRef.File.FileName = InputLocalEnvironment.File.Name;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tSET OutRef.File.RecordNumber = InputLocalEnvironment.File.Record;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tDECLARE I Integer 0;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_45_1.handleBodyContent(out);
            }
            out = _jettag_c_when_45_1_saved_out;
            _jettag_c_when_45_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_52_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_52_1.setRuntimeParent(_jettag_c_choose_44_1);
            _jettag_c_otherwise_52_1.setTagInfo(_td_c_otherwise_52_1);
            _jettag_c_otherwise_52_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_52_1_saved_out = out;
            while (_jettag_c_otherwise_52_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("-- Set default routing from shared variable Defaults and clear entry for this file ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tDECLARE I Integer 0;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tDECLARE J Integer 1;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tDECLARE FileKey CHARACTER;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET FileKey = InputLocalEnvironment.File.Directory||");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\tInputLocalEnvironment.File.Name||");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\tInputLocalEnvironment.File.TimeStamp;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tACCUMULATE: BEGIN ATOMIC");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t-- search for a match");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tSET I = 1;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tSEARCH: LOOP");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tIF I > Files THEN");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t-- No match ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tSET Environment.PatternVariables.DefaultRouting = 0; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tLEAVE SEARCH; ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tEND IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tIF Defaults.Files[I].Key = FileKey");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tTHEN SET Environment.PatternVariables.DefaultRouting = Defaults.Files[I].Total;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t-- NOw remove the total for this file");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tIF I < Files");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tTHEN");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tSET FileKey = \tDefaults.Files[Files].Key;\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tSET Defaults.Files[I].Key = FileKey ;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tSET J = Defaults.Files[Files].Total;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tSET Defaults.Files[I].Total = J;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tEND IF;\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\tSET Files = Files - 1;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tLEAVE SEARCH;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tEND IF;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tSET I = I + 1;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tEND LOOP SEARCH;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tEND ACCUMULATE;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("-- and some file info");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET OutRef.File.Directory = InputLocalEnvironment.File.Directory;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET OutRef.File.FileName = InputLocalEnvironment.File.Name;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET OutRef.File.RecordNumber = InputLocalEnvironment.File.Record;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tSET OutRef.File.RecordsToDefault = Environment.PatternVariables.DefaultRouting;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_52_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_52_1_saved_out;
            _jettag_c_otherwise_52_1.doEnd();
            _jettag_c_choose_44_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_44_1_saved_out;
        _jettag_c_choose_44_1.doEnd();
        out.write("-- Add  exception data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tCall AddExceptionData();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE PROCEDURE AddExceptionData() BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE ERef REFERENCE TO OutputRoot.XMLNSC.Error; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    -- Add some exception data for error and fault");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Error INTEGER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Text CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE Label CHARACTER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDeclare FaultText CHARACTER '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.esql.1") );
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE I INTEGER 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE K INTEGER;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE start REFERENCE TO InputExceptionList.*[1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tWHILE start.Number IS NOT NULL DO ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Label = start.Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSET Error = start.Number;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF Error = 3001 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Text = start.Insert.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tELSE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Text = start.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Don't include the \"Caught exception and rethrowing message\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIF Error <> 2230 THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t-- Process inserts");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDECLARE Inserts Character;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDECLARE INS Integer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET Inserts = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t-- Are there any inserts for this exception");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tIF EXISTS (start.Insert[]) THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t-- If YES add them to inserts string");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tSET Inserts = Inserts || COALESCE(start.Insert[1].Text,'NULL')|| ' / ';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tSET K = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t \tINSERTS: LOOP");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tIF CARDINALITY(start.Insert[])> K ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tTHEN ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tSET Inserts = Inserts || COALESCE(start.Insert[K+1].Text,'NULL')|| ' / ';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t-- No more inserts to process");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tELSE LEAVE INSERTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tSET K = K+1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tEND LOOP INSERTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Label = Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Error = Error;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET ERef.Exception[I].Text = Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSet ERef.Exception[I].Inserts = COALESCE(Inserts, '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET FaultText = FaultText || ' ");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.esql.2") );
        out.write(" ' || COALESCE(Label, ''); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET FaultText = FaultText || ' ");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.esql.3") );
        out.write(" ' || COALESCE(CAST(Error AS CHARACTER), '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET FaultText = FaultText || ' ");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.esql.4") );
        out.write(" ' || COALESCE(Text, '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSET FaultText = FaultText || ' ");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.esql.6") );
        out.write(" ' || COALESCE(Inserts, '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\tSET I = I+1; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t-- Move start to the last child of the field to which it currently points");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tMOVE start LASTCHILD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND WHILE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.FaultText = FaultText;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE COMPUTE MODULE Throw");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tBEGIN ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tTHROW USER EXCEPTION SEVERITY 3 MESSAGE 2372 VALUES(Environment.PatternVariables.FaultText);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRETURN FALSE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
    }
}
