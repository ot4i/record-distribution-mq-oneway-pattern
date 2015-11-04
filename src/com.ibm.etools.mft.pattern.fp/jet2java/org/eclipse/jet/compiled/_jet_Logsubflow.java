package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_11_13 = new TagInfo("c:get", //$NON-NLS-1$
            11, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_15 = new TagInfo("c:get", //$NON-NLS-1$
            12, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_10 = new TagInfo("c:get", //$NON-NLS-1$
            16, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_17 = new TagInfo("c:get", //$NON-NLS-1$
            17, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_36 = new TagInfo("c:get", //$NON-NLS-1$
            20, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_90 = new TagInfo("c:get", //$NON-NLS-1$
            20, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_36 = new TagInfo("c:get", //$NON-NLS-1$
            22, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_90 = new TagInfo("c:get", //$NON-NLS-1$
            22, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_62 = new TagInfo("c:get", //$NON-NLS-1$
            23, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_26 = new TagInfo("c:get", //$NON-NLS-1$
            25, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_71 = new TagInfo("c:get", //$NON-NLS-1$
            25, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_15 = new TagInfo("c:get", //$NON-NLS-1$
            26, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_33 = new TagInfo("c:get", //$NON-NLS-1$
            27, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_36 = new TagInfo("c:get", //$NON-NLS-1$
            28, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_41 = new TagInfo("c:get", //$NON-NLS-1$
            33, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_25 = new TagInfo("c:get", //$NON-NLS-1$
            40, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_18 = new TagInfo("c:get", //$NON-NLS-1$
            41, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_55 = new TagInfo("c:get", //$NON-NLS-1$
            41, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_87 = new TagInfo("c:get", //$NON-NLS-1$
            41, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_40 = new TagInfo("c:get", //$NON-NLS-1$
            46, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_41 = new TagInfo("c:get", //$NON-NLS-1$
            56, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTryCatch.msgnode=\"ComIbmTryCatch.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_13.setRuntimeParent(null);
        _jettag_c_get_11_13.setTagInfo(_td_c_get_11_13);
        _jettag_c_get_11_13.doStart(context, out);
        _jettag_c_get_11_13.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_15.setRuntimeParent(null);
        _jettag_c_get_12_15.setTagInfo(_td_c_get_12_15);
        _jettag_c_get_12_15.doStart(context, out);
        _jettag_c_get_12_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_10.setRuntimeParent(null);
        _jettag_c_get_16_10.setTagInfo(_td_c_get_16_10);
        _jettag_c_get_16_10.doStart(context, out);
        _jettag_c_get_16_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_17.setRuntimeParent(null);
        _jettag_c_get_17_17.setTagInfo(_td_c_get_17_17);
        _jettag_c_get_17_17.doStart(context, out);
        _jettag_c_get_17_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_15.setRuntimeParent(null);
        _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
        _jettag_c_get_18_15.doStart(context, out);
        _jettag_c_get_18_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_36.setRuntimeParent(null);
        _jettag_c_get_20_36.setTagInfo(_td_c_get_20_36);
        _jettag_c_get_20_36.doStart(context, out);
        _jettag_c_get_20_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_90.setRuntimeParent(null);
        _jettag_c_get_20_90.setTagInfo(_td_c_get_20_90);
        _jettag_c_get_20_90.doStart(context, out);
        _jettag_c_get_20_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_36.setRuntimeParent(null);
        _jettag_c_get_22_36.setTagInfo(_td_c_get_22_36);
        _jettag_c_get_22_36.doStart(context, out);
        _jettag_c_get_22_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_90.setRuntimeParent(null);
        _jettag_c_get_22_90.setTagInfo(_td_c_get_22_90);
        _jettag_c_get_22_90.doStart(context, out);
        _jettag_c_get_22_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_62.setRuntimeParent(null);
        _jettag_c_get_23_62.setTagInfo(_td_c_get_23_62);
        _jettag_c_get_23_62.doStart(context, out);
        _jettag_c_get_23_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_26.setRuntimeParent(null);
        _jettag_c_get_25_26.setTagInfo(_td_c_get_25_26);
        _jettag_c_get_25_26.doStart(context, out);
        _jettag_c_get_25_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_71.setRuntimeParent(null);
        _jettag_c_get_25_71.setTagInfo(_td_c_get_25_71);
        _jettag_c_get_25_71.doStart(context, out);
        _jettag_c_get_25_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_15.setRuntimeParent(null);
        _jettag_c_get_26_15.setTagInfo(_td_c_get_26_15);
        _jettag_c_get_26_15.doStart(context, out);
        _jettag_c_get_26_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_33.setRuntimeParent(null);
        _jettag_c_get_27_33.setTagInfo(_td_c_get_27_33);
        _jettag_c_get_27_33.doStart(context, out);
        _jettag_c_get_27_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_36.setRuntimeParent(null);
        _jettag_c_get_28_36.setTagInfo(_td_c_get_28_36);
        _jettag_c_get_28_36.doStart(context, out);
        _jettag_c_get_28_36.doEnd();
        out.write(" MQSI$\"/>    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"398,200\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_41.setRuntimeParent(null);
        _jettag_c_get_33_41.setTagInfo(_td_c_get_33_41);
        _jettag_c_get_33_41.doStart(context, out);
        _jettag_c_get_33_41.doEnd();
        out.write("CreateLogMessage.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"destinationAndMessage\" throwExceptionOnDatabaseError=\"false\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Log Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"545,201\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_25.setRuntimeParent(null);
        _jettag_c_get_40_25.setTagInfo(_td_c_get_40_25);
        _jettag_c_get_40_25.doStart(context, out);
        _jettag_c_get_40_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_18.setRuntimeParent(null);
        _jettag_c_get_41_18.setTagInfo(_td_c_get_41_18);
        _jettag_c_get_41_18.doStart(context, out);
        _jettag_c_get_41_18.doEnd();
        RuntimeTagElement _jettag_c_get_41_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_55.setRuntimeParent(null);
        _jettag_c_get_41_55.setTagInfo(_td_c_get_41_55);
        _jettag_c_get_41_55.doStart(context, out);
        _jettag_c_get_41_55.doEnd();
        RuntimeTagElement _jettag_c_get_41_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_87.setRuntimeParent(null);
        _jettag_c_get_41_87.setTagInfo(_td_c_get_41_87);
        _jettag_c_get_41_87.doStart(context, out);
        _jettag_c_get_41_87.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"MQOutput\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"287,186\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_40.setRuntimeParent(null);
        _jettag_c_get_46_40.setTagInfo(_td_c_get_46_40);
        _jettag_c_get_46_40.doStart(context, out);
        _jettag_c_get_46_40.doEnd();
        out.write("CheckLogging.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Filter\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"214,119\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"TryCatch\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTrace.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" location=\"563,115\" pattern=\"&#xD;&#xA;Logging Failure&#xD;&#xA;=========&#xD;&#xA;&#xD;&#xA;${Environment.PatternVariables}&#xD;&#xA;==========\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_17\" location=\"402,115\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_41.setRuntimeParent(null);
        _jettag_c_get_56_41.setTagInfo(_td_c_get_56_41);
        _jettag_c_get_56_41.doStart(context, out);
        _jettag_c_get_56_41.doEnd();
        out.write("CreateTraceData.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"CreateTraceData\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"53,119\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" bundleName=\"Log\" pluginId=\"FP_RD_MQ_Exemplar\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_16\" targetNode=\"FCMComposite_1_16\" sourceNode=\"FCMComposite_1_17\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_15\" targetNode=\"FCMComposite_1_17\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_11\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.try\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_11\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_15\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
