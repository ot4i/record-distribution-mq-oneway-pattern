package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Errorsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Errorsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_13 = new TagInfo("c:get", //$NON-NLS-1$
            8, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_10 = new TagInfo("c:get", //$NON-NLS-1$
            13, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_17 = new TagInfo("c:get", //$NON-NLS-1$
            14, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_15 = new TagInfo("c:get", //$NON-NLS-1$
            15, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_36 = new TagInfo("c:get", //$NON-NLS-1$
            17, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_90 = new TagInfo("c:get", //$NON-NLS-1$
            17, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_36 = new TagInfo("c:get", //$NON-NLS-1$
            19, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_90 = new TagInfo("c:get", //$NON-NLS-1$
            19, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_62 = new TagInfo("c:get", //$NON-NLS-1$
            20, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_26 = new TagInfo("c:get", //$NON-NLS-1$
            22, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_71 = new TagInfo("c:get", //$NON-NLS-1$
            22, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_15 = new TagInfo("c:get", //$NON-NLS-1$
            23, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_33 = new TagInfo("c:get", //$NON-NLS-1$
            24, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_36 = new TagInfo("c:get", //$NON-NLS-1$
            25, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_16 = new TagInfo("c:get", //$NON-NLS-1$
            31, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_15 = new TagInfo("c:get", //$NON-NLS-1$
            32, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_1 = new TagInfo("c:if", //$NON-NLS-1$
            35, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_40 = new TagInfo("c:get", //$NON-NLS-1$
            37, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_24 = new TagInfo("c:get", //$NON-NLS-1$
            41, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_18 = new TagInfo("c:get", //$NON-NLS-1$
            42, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_55 = new TagInfo("c:get", //$NON-NLS-1$
            42, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_91 = new TagInfo("c:get", //$NON-NLS-1$
            42, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_41 = new TagInfo("c:get", //$NON-NLS-1$
            52, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_42 = new TagInfo("c:get", //$NON-NLS-1$
            57, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_62_1 = new TagInfo("c:choose", //$NON-NLS-1$
            62, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_63_1 = new TagInfo("c:when", //$NON-NLS-1$
            63, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_72_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            72, 1,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" xmlns:ComIbmThrow.msgnode=\"ComIbmThrow.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_13.setRuntimeParent(null);
        _jettag_c_get_8_13.setTagInfo(_td_c_get_8_13);
        _jettag_c_get_8_13.doStart(context, out);
        _jettag_c_get_8_13.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_15.setRuntimeParent(null);
        _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
        _jettag_c_get_9_15.doStart(context, out);
        _jettag_c_get_9_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_10.setRuntimeParent(null);
        _jettag_c_get_13_10.setTagInfo(_td_c_get_13_10);
        _jettag_c_get_13_10.doStart(context, out);
        _jettag_c_get_13_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_17.setRuntimeParent(null);
        _jettag_c_get_14_17.setTagInfo(_td_c_get_14_17);
        _jettag_c_get_14_17.doStart(context, out);
        _jettag_c_get_14_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_15.setRuntimeParent(null);
        _jettag_c_get_15_15.setTagInfo(_td_c_get_15_15);
        _jettag_c_get_15_15.doStart(context, out);
        _jettag_c_get_15_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_36.setRuntimeParent(null);
        _jettag_c_get_17_36.setTagInfo(_td_c_get_17_36);
        _jettag_c_get_17_36.doStart(context, out);
        _jettag_c_get_17_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_90.setRuntimeParent(null);
        _jettag_c_get_17_90.setTagInfo(_td_c_get_17_90);
        _jettag_c_get_17_90.doStart(context, out);
        _jettag_c_get_17_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_36.setRuntimeParent(null);
        _jettag_c_get_19_36.setTagInfo(_td_c_get_19_36);
        _jettag_c_get_19_36.doStart(context, out);
        _jettag_c_get_19_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_90.setRuntimeParent(null);
        _jettag_c_get_19_90.setTagInfo(_td_c_get_19_90);
        _jettag_c_get_19_90.doStart(context, out);
        _jettag_c_get_19_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_62.setRuntimeParent(null);
        _jettag_c_get_20_62.setTagInfo(_td_c_get_20_62);
        _jettag_c_get_20_62.doStart(context, out);
        _jettag_c_get_20_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_26.setRuntimeParent(null);
        _jettag_c_get_22_26.setTagInfo(_td_c_get_22_26);
        _jettag_c_get_22_26.doStart(context, out);
        _jettag_c_get_22_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_71.setRuntimeParent(null);
        _jettag_c_get_22_71.setTagInfo(_td_c_get_22_71);
        _jettag_c_get_22_71.doStart(context, out);
        _jettag_c_get_22_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_15.setRuntimeParent(null);
        _jettag_c_get_23_15.setTagInfo(_td_c_get_23_15);
        _jettag_c_get_23_15.doStart(context, out);
        _jettag_c_get_23_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_33.setRuntimeParent(null);
        _jettag_c_get_24_33.setTagInfo(_td_c_get_24_33);
        _jettag_c_get_24_33.doStart(context, out);
        _jettag_c_get_24_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_36.setRuntimeParent(null);
        _jettag_c_get_25_36.setTagInfo(_td_c_get_25_36);
        _jettag_c_get_25_36.doStart(context, out);
        _jettag_c_get_25_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"13,35\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_16.setRuntimeParent(null);
        _jettag_c_get_31_16.setTagInfo(_td_c_get_31_16);
        _jettag_c_get_31_16.doStart(context, out);
        _jettag_c_get_31_16.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_15.setRuntimeParent(null);
        _jettag_c_get_32_15.setTagInfo(_td_c_get_32_15);
        _jettag_c_get_32_15.doStart(context, out);
        _jettag_c_get_32_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_1.setRuntimeParent(null);
        _jettag_c_if_35_1.setTagInfo(_td_c_if_35_1);
        _jettag_c_if_35_1.doStart(context, out);
        while (_jettag_c_if_35_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"206,36\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_40.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_get_37_40.setTagInfo(_td_c_get_37_40);
            _jettag_c_get_37_40.doStart(context, out);
            _jettag_c_get_37_40.doEnd();
            out.write("CheckErrorLogging.Main\" throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log Errors?\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"282,195\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("     queueManagerName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_41_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_24.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_get_41_24.setTagInfo(_td_c_get_41_24);
            _jettag_c_get_41_24.doStart(context, out);
            _jettag_c_get_41_24.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_18.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_get_42_18.setTagInfo(_td_c_get_42_18);
            _jettag_c_get_42_18.doStart(context, out);
            _jettag_c_get_42_18.doEnd();
            RuntimeTagElement _jettag_c_get_42_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_55.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_get_42_55.setTagInfo(_td_c_get_42_55);
            _jettag_c_get_42_55.doStart(context, out);
            _jettag_c_get_42_55.doEnd();
            RuntimeTagElement _jettag_c_get_42_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_91.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_get_42_91.setTagInfo(_td_c_get_42_91);
            _jettag_c_get_42_91.doStart(context, out);
            _jettag_c_get_42_91.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      transactionMode=\"no\" persistenceMode=\"yes\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      validateMaster=\"none\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Output\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"173,269\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"FlowOrder\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_35_1.handleBodyContent(out);
        }
        _jettag_c_if_35_1.doEnd();
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"84,35\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_41.setRuntimeParent(null);
        _jettag_c_get_52_41.setTagInfo(_td_c_get_52_41);
        _jettag_c_get_52_41.doStart(context, out);
        _jettag_c_get_52_41.doEnd();
        out.write("Build_Error_Message.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build  Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"576,36\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_42.setRuntimeParent(null);
        _jettag_c_get_57_42.setTagInfo(_td_c_get_57_42);
        _jettag_c_get_57_42.doStart(context, out);
        _jettag_c_get_57_42.doEnd();
        out.write("Throw.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"exceptionAndMessage\" throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_7\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_62_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_62_1.setRuntimeParent(null);
        _jettag_c_choose_62_1.setTagInfo(_td_c_choose_62_1);
        _jettag_c_choose_62_1.doStart(context, out);
        JET2Writer _jettag_c_choose_62_1_saved_out = out;
        while (_jettag_c_choose_62_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_63_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_63_1.setRuntimeParent(_jettag_c_choose_62_1);
            _jettag_c_when_63_1.setTagInfo(_td_c_when_63_1);
            _jettag_c_when_63_1.doStart(context, out);
            JET2Writer _jettag_c_when_63_1_saved_out = out;
            while (_jettag_c_when_63_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_20\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.unknown\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_12\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_63_1.handleBodyContent(out);
            }
            out = _jettag_c_when_63_1_saved_out;
            _jettag_c_when_63_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_72_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_72_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_72_1.setRuntimeParent(_jettag_c_choose_62_1);
            _jettag_c_otherwise_72_1.setTagInfo(_td_c_otherwise_72_1);
            _jettag_c_otherwise_72_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_72_1_saved_out = out;
            while (_jettag_c_otherwise_72_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                _jettag_c_otherwise_72_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_72_1_saved_out;
            _jettag_c_otherwise_72_1.doEnd();
            _jettag_c_choose_62_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_62_1_saved_out;
        _jettag_c_choose_62_1.doEnd();
        out.write("     </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
