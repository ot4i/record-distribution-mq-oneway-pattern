package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_RecordProcessorsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_RecordProcessorsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_6_12 = new TagInfo("c:get", //$NON-NLS-1$
            6, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_15 = new TagInfo("c:get", //$NON-NLS-1$
            7, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_10 = new TagInfo("c:get", //$NON-NLS-1$
            11, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_17 = new TagInfo("c:get", //$NON-NLS-1$
            12, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_15 = new TagInfo("c:get", //$NON-NLS-1$
            13, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_36 = new TagInfo("c:get", //$NON-NLS-1$
            15, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_90 = new TagInfo("c:get", //$NON-NLS-1$
            15, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_18_62 = new TagInfo("c:get", //$NON-NLS-1$
            18, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_26 = new TagInfo("c:get", //$NON-NLS-1$
            20, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_71 = new TagInfo("c:get", //$NON-NLS-1$
            20, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_15 = new TagInfo("c:get", //$NON-NLS-1$
            21, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_33 = new TagInfo("c:get", //$NON-NLS-1$
            22, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_36 = new TagInfo("c:get", //$NON-NLS-1$
            23, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_17 = new TagInfo("c:get", //$NON-NLS-1$
            30, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_15 = new TagInfo("c:get", //$NON-NLS-1$
            31, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_17 = new TagInfo("c:get", //$NON-NLS-1$
            35, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_15 = new TagInfo("c:get", //$NON-NLS-1$
            36, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmPassthru.msgnode=\"ComIbmPassthru.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_12.setRuntimeParent(null);
        _jettag_c_get_6_12.setTagInfo(_td_c_get_6_12);
        _jettag_c_get_6_12.doStart(context, out);
        _jettag_c_get_6_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_15.setRuntimeParent(null);
        _jettag_c_get_7_15.setTagInfo(_td_c_get_7_15);
        _jettag_c_get_7_15.doStart(context, out);
        _jettag_c_get_7_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_10.setRuntimeParent(null);
        _jettag_c_get_11_10.setTagInfo(_td_c_get_11_10);
        _jettag_c_get_11_10.doStart(context, out);
        _jettag_c_get_11_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_17.setRuntimeParent(null);
        _jettag_c_get_12_17.setTagInfo(_td_c_get_12_17);
        _jettag_c_get_12_17.doStart(context, out);
        _jettag_c_get_12_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_15.setRuntimeParent(null);
        _jettag_c_get_13_15.setTagInfo(_td_c_get_13_15);
        _jettag_c_get_13_15.doStart(context, out);
        _jettag_c_get_13_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_36.setRuntimeParent(null);
        _jettag_c_get_15_36.setTagInfo(_td_c_get_15_36);
        _jettag_c_get_15_36.doStart(context, out);
        _jettag_c_get_15_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_90.setRuntimeParent(null);
        _jettag_c_get_15_90.setTagInfo(_td_c_get_15_90);
        _jettag_c_get_15_90.doStart(context, out);
        _jettag_c_get_15_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
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
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_62.setRuntimeParent(null);
        _jettag_c_get_18_62.setTagInfo(_td_c_get_18_62);
        _jettag_c_get_18_62.doStart(context, out);
        _jettag_c_get_18_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_26.setRuntimeParent(null);
        _jettag_c_get_20_26.setTagInfo(_td_c_get_20_26);
        _jettag_c_get_20_26.doStart(context, out);
        _jettag_c_get_20_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_71.setRuntimeParent(null);
        _jettag_c_get_20_71.setTagInfo(_td_c_get_20_71);
        _jettag_c_get_20_71.doStart(context, out);
        _jettag_c_get_20_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_15.setRuntimeParent(null);
        _jettag_c_get_21_15.setTagInfo(_td_c_get_21_15);
        _jettag_c_get_21_15.doStart(context, out);
        _jettag_c_get_21_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_33.setRuntimeParent(null);
        _jettag_c_get_22_33.setTagInfo(_td_c_get_22_33);
        _jettag_c_get_22_33.doStart(context, out);
        _jettag_c_get_22_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_36.setRuntimeParent(null);
        _jettag_c_get_23_36.setTagInfo(_td_c_get_23_36);
        _jettag_c_get_23_36.doStart(context, out);
        _jettag_c_get_23_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"30,70\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_17.setRuntimeParent(null);
        _jettag_c_get_30_17.setTagInfo(_td_c_get_30_17);
        _jettag_c_get_30_17.doStart(context, out);
        _jettag_c_get_30_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_15.setRuntimeParent(null);
        _jettag_c_get_31_15.setTagInfo(_td_c_get_31_15);
        _jettag_c_get_31_15.doStart(context, out);
        _jettag_c_get_31_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output\" location=\"345,70\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"OutTerminal.Output\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_17.setRuntimeParent(null);
        _jettag_c_get_35_17.setTagInfo(_td_c_get_35_17);
        _jettag_c_get_35_17.doStart(context, out);
        _jettag_c_get_35_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_15.setRuntimeParent(null);
        _jettag_c_get_36_15.setTagInfo(_td_c_get_36_15);
        _jettag_c_get_36_15.doStart(context, out);
        _jettag_c_get_36_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmPassthru.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"190,70\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Pass Through\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_1\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"OutTerminal.Output\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
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
