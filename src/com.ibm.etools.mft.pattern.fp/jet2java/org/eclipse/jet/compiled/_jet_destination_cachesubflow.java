package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_destination_cachesubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_destination_cachesubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_9_12 = new TagInfo("c:get", //$NON-NLS-1$
            9, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_15 = new TagInfo("c:get", //$NON-NLS-1$
            10, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_61 = new TagInfo("c:get", //$NON-NLS-1$
            13, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
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
                "$root/@route", //$NON-NLS-1$
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
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_66 = new TagInfo("c:get", //$NON-NLS-1$
            20, 66,
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
    private static final TagInfo _td_c_get_31_17 = new TagInfo("c:get", //$NON-NLS-1$
            31, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_19 = new TagInfo("c:get", //$NON-NLS-1$
            32, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_19 = new TagInfo("c:get", //$NON-NLS-1$
            35, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/routingDataSource", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_41 = new TagInfo("c:get", //$NON-NLS-1$
            36, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_17 = new TagInfo("c:get", //$NON-NLS-1$
            42, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_19 = new TagInfo("c:get", //$NON-NLS-1$
            43, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_17 = new TagInfo("c:get", //$NON-NLS-1$
            47, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_19 = new TagInfo("c:get", //$NON-NLS-1$
            48, 19,
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
        out.write("<ecore:EPackage xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_12.setRuntimeParent(null);
        _jettag_c_get_9_12.setTagInfo(_td_c_get_9_12);
        _jettag_c_get_9_12.doStart(context, out);
        _jettag_c_get_9_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_15.setRuntimeParent(null);
        _jettag_c_get_10_15.setTagInfo(_td_c_get_10_15);
        _jettag_c_get_10_15.doStart(context, out);
        _jettag_c_get_10_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xsi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_61.setRuntimeParent(null);
        _jettag_c_get_13_61.setTagInfo(_td_c_get_13_61);
        _jettag_c_get_13_61.doStart(context, out);
        _jettag_c_get_13_61.doEnd();
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
        out.write("    <colorGraphic16 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_36.setRuntimeParent(null);
        _jettag_c_get_17_36.setTagInfo(_td_c_get_17_36);
        _jettag_c_get_17_36.doStart(context, out);
        _jettag_c_get_17_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_90.setRuntimeParent(null);
        _jettag_c_get_17_90.setTagInfo(_td_c_get_17_90);
        _jettag_c_get_17_90.doStart(context, out);
        _jettag_c_get_17_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
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
        out.write("     <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_66); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_66.setRuntimeParent(null);
        _jettag_c_get_20_66.setTagInfo(_td_c_get_20_66);
        _jettag_c_get_20_66.doStart(context, out);
        _jettag_c_get_20_66.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
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
        out.write("      <nodes xsi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"122,248\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xsi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_17.setRuntimeParent(null);
        _jettag_c_get_31_17.setTagInfo(_td_c_get_31_17);
        _jettag_c_get_31_17.doStart(context, out);
        _jettag_c_get_31_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_19.setRuntimeParent(null);
        _jettag_c_get_32_19.setTagInfo(_td_c_get_32_19);
        _jettag_c_get_32_19.doStart(context, out);
        _jettag_c_get_32_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xsi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"290,248\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      dataSource=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_19.setRuntimeParent(null);
        _jettag_c_get_35_19.setTagInfo(_td_c_get_35_19);
        _jettag_c_get_35_19.doStart(context, out);
        _jettag_c_get_35_19.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_41.setRuntimeParent(null);
        _jettag_c_get_36_41.setTagInfo(_td_c_get_36_41);
        _jettag_c_get_36_41.doStart(context, out);
        _jettag_c_get_36_41.doEnd();
        out.write("RoutetoDest.Main\" computeMode=\"destination\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xsi:type=\"utility:ConstantString\" string=\"Compute\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xsi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output200\" location=\"514,131\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xsi:type=\"utility:TranslatableString\" key=\"OutTerminal.failure\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_17.setRuntimeParent(null);
        _jettag_c_get_42_17.setTagInfo(_td_c_get_42_17);
        _jettag_c_get_42_17.doStart(context, out);
        _jettag_c_get_42_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_19.setRuntimeParent(null);
        _jettag_c_get_43_19.setTagInfo(_td_c_get_43_19);
        _jettag_c_get_43_19.doStart(context, out);
        _jettag_c_get_43_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xsi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output1\" location=\"513,249\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xsi:type=\"utility:TranslatableString\" key=\"OutTerminal.route1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_17.setRuntimeParent(null);
        _jettag_c_get_47_17.setTagInfo(_td_c_get_47_17);
        _jettag_c_get_47_17.doStart(context, out);
        _jettag_c_get_47_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_19.setRuntimeParent(null);
        _jettag_c_get_48_19.setTagInfo(_td_c_get_48_19);
        _jettag_c_get_48_19.doStart(context, out);
        _jettag_c_get_48_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"OutTerminal.Output1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"OutTerminal.Output200\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
