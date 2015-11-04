package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_routesubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_routesubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_11_12 = new TagInfo("c:get", //$NON-NLS-1$
            11, 12,
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
    private static final TagInfo _td_c_get_17_10 = new TagInfo("c:get", //$NON-NLS-1$
            17, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_17 = new TagInfo("c:get", //$NON-NLS-1$
            18, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_15 = new TagInfo("c:get", //$NON-NLS-1$
            19, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_36 = new TagInfo("c:get", //$NON-NLS-1$
            21, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_90 = new TagInfo("c:get", //$NON-NLS-1$
            21, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_36 = new TagInfo("c:get", //$NON-NLS-1$
            23, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_90 = new TagInfo("c:get", //$NON-NLS-1$
            23, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_65 = new TagInfo("c:get", //$NON-NLS-1$
            24, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_26 = new TagInfo("c:get", //$NON-NLS-1$
            26, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_71 = new TagInfo("c:get", //$NON-NLS-1$
            26, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_15 = new TagInfo("c:get", //$NON-NLS-1$
            27, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_33 = new TagInfo("c:get", //$NON-NLS-1$
            28, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_36 = new TagInfo("c:get", //$NON-NLS-1$
            29, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_17 = new TagInfo("c:get", //$NON-NLS-1$
            37, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_19 = new TagInfo("c:get", //$NON-NLS-1$
            38, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_28 = new TagInfo("c:get", //$NON-NLS-1$
            42, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_26 = new TagInfo("c:get", //$NON-NLS-1$
            43, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_41 = new TagInfo("c:get", //$NON-NLS-1$
            46, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "250", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_56_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            56, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "$yCoord+50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_33 = new TagInfo("c:get", //$NON-NLS-1$
            60, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_21 = new TagInfo("c:get", //$NON-NLS-1$
            61, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$yCoord", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_31 = new TagInfo("c:get", //$NON-NLS-1$
            63, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_17 = new TagInfo("c:get", //$NON-NLS-1$
            64, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_17 = new TagInfo("c:get", //$NON-NLS-1$
            65, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_73_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            73, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_74_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            74, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_75_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            75, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_44 = new TagInfo("c:get", //$NON-NLS-1$
            76, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_35 = new TagInfo("c:get", //$NON-NLS-1$
            77, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_80_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            80, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_81_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            81, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_82_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            82, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_37 = new TagInfo("c:get", //$NON-NLS-1$
            83, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/keyLocation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_85 = new TagInfo("c:get", //$NON-NLS-1$
            83, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/keyValue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_37 = new TagInfo("c:get", //$NON-NLS-1$
            84, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_86_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            86, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/namespaceTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_88_1 = new TagInfo("c:if", //$NON-NLS-1$
            88, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($curOutput/nsPrefix) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_30 = new TagInfo("c:get", //$NON-NLS-1$
            89, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/nsPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_15 = new TagInfo("c:get", //$NON-NLS-1$
            90, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/nsURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_103_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            103, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_104_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            104, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_105_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            105, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_37 = new TagInfo("c:get", //$NON-NLS-1$
            108, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_32 = new TagInfo("c:get", //$NON-NLS-1$
            110, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmRoute.msgnode=\"ComIbmRoute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_12.setRuntimeParent(null);
        _jettag_c_get_11_12.setTagInfo(_td_c_get_11_12);
        _jettag_c_get_11_12.doStart(context, out);
        _jettag_c_get_11_12.doEnd();
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
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xsi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_10.setRuntimeParent(null);
        _jettag_c_get_17_10.setTagInfo(_td_c_get_17_10);
        _jettag_c_get_17_10.doStart(context, out);
        _jettag_c_get_17_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_17.setRuntimeParent(null);
        _jettag_c_get_18_17.setTagInfo(_td_c_get_18_17);
        _jettag_c_get_18_17.doStart(context, out);
        _jettag_c_get_18_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_15.setRuntimeParent(null);
        _jettag_c_get_19_15.setTagInfo(_td_c_get_19_15);
        _jettag_c_get_19_15.doStart(context, out);
        _jettag_c_get_19_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_36.setRuntimeParent(null);
        _jettag_c_get_21_36.setTagInfo(_td_c_get_21_36);
        _jettag_c_get_21_36.doStart(context, out);
        _jettag_c_get_21_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_90.setRuntimeParent(null);
        _jettag_c_get_21_90.setTagInfo(_td_c_get_21_90);
        _jettag_c_get_21_90.doStart(context, out);
        _jettag_c_get_21_90.doEnd();
        out.write(".subflow.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xsi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_36.setRuntimeParent(null);
        _jettag_c_get_23_36.setTagInfo(_td_c_get_23_36);
        _jettag_c_get_23_36.doStart(context, out);
        _jettag_c_get_23_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_90.setRuntimeParent(null);
        _jettag_c_get_23_90.setTagInfo(_td_c_get_23_90);
        _jettag_c_get_23_90.doStart(context, out);
        _jettag_c_get_23_90.doEnd();
        out.write(".subflow.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_65.setRuntimeParent(null);
        _jettag_c_get_24_65.setTagInfo(_td_c_get_24_65);
        _jettag_c_get_24_65.doStart(context, out);
        _jettag_c_get_24_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_26.setRuntimeParent(null);
        _jettag_c_get_26_26.setTagInfo(_td_c_get_26_26);
        _jettag_c_get_26_26.doStart(context, out);
        _jettag_c_get_26_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_71.setRuntimeParent(null);
        _jettag_c_get_26_71.setTagInfo(_td_c_get_26_71);
        _jettag_c_get_26_71.doStart(context, out);
        _jettag_c_get_26_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_15.setRuntimeParent(null);
        _jettag_c_get_27_15.setTagInfo(_td_c_get_27_15);
        _jettag_c_get_27_15.doStart(context, out);
        _jettag_c_get_27_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_33.setRuntimeParent(null);
        _jettag_c_get_28_33.setTagInfo(_td_c_get_28_33);
        _jettag_c_get_28_33.doStart(context, out);
        _jettag_c_get_28_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_36.setRuntimeParent(null);
        _jettag_c_get_29_36.setTagInfo(_td_c_get_29_36);
        _jettag_c_get_29_36.doStart(context, out);
        _jettag_c_get_29_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        // Input node,output node for default and compute to set routing error are standard 
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"100,201\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_17.setRuntimeParent(null);
        _jettag_c_get_37_17.setTagInfo(_td_c_get_37_17);
        _jettag_c_get_37_17.doStart(context, out);
        _jettag_c_get_37_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_19.setRuntimeParent(null);
        _jettag_c_get_38_19.setTagInfo(_td_c_get_38_19);
        _jettag_c_get_38_19.doStart(context, out);
        _jettag_c_get_38_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output200\" location=\"550,89\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"OutTerminal.default\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_28.setRuntimeParent(null);
        _jettag_c_get_42_28.setTagInfo(_td_c_get_42_28);
        _jettag_c_get_42_28.doStart(context, out);
        _jettag_c_get_42_28.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_26.setRuntimeParent(null);
        _jettag_c_get_43_26.setTagInfo(_td_c_get_43_26);
        _jettag_c_get_43_26.doStart(context, out);
        _jettag_c_get_43_26.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"476,184\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_41.setRuntimeParent(null);
        _jettag_c_get_46_41.setTagInfo(_td_c_get_46_41);
        _jettag_c_get_46_41.doStart(context, out);
        _jettag_c_get_46_41.doEnd();
        out.write("RecordDefault.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Record Default\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        // Now add dynamic output nodes one for each route 
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_53_1.setRuntimeParent(null);
        _jettag_c_setVariable_53_1.setTagInfo(_td_c_setVariable_53_1);
        _jettag_c_setVariable_53_1.doStart(context, out);
        _jettag_c_setVariable_53_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_54_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_54_1.setRuntimeParent(null);
        _jettag_c_setVariable_54_1.setTagInfo(_td_c_setVariable_54_1);
        _jettag_c_setVariable_54_1.doStart(context, out);
        _jettag_c_setVariable_54_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_55_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_55_1.setRuntimeParent(null);
        _jettag_c_iterate_55_1.setTagInfo(_td_c_iterate_55_1);
        _jettag_c_iterate_55_1.doStart(context, out);
        while (_jettag_c_iterate_55_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_56_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_56_1.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_setVariable_56_1.setTagInfo(_td_c_setVariable_56_1);
            _jettag_c_setVariable_56_1.doStart(context, out);
            _jettag_c_setVariable_56_1.doEnd();
            RuntimeTagElement _jettag_c_setVariable_57_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_57_1.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_setVariable_57_1.setTagInfo(_td_c_setVariable_57_1);
            _jettag_c_setVariable_57_1.doStart(context, out);
            _jettag_c_setVariable_57_1.doEnd();
            out.write(NL);         
            out.write("      <nodes xmi:type=\"eflow:FCMSink\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"OutTerminal.Output");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_60_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_33.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_get_60_33.setTagInfo(_td_c_get_60_33);
            _jettag_c_get_60_33.doStart(context, out);
            _jettag_c_get_60_33.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      location=\"425,");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_61_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_61_21.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_get_61_21.setTagInfo(_td_c_get_61_21);
            _jettag_c_get_61_21.doStart(context, out);
            _jettag_c_get_61_21.doEnd();
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        key=\"OutTerminal.route");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_63_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_31.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_get_63_31.setTagInfo(_td_c_get_63_31);
            _jettag_c_get_63_31.doStart(context, out);
            _jettag_c_get_63_31.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_17.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_get_64_17.setTagInfo(_td_c_get_64_17);
            _jettag_c_get_64_17.doStart(context, out);
            _jettag_c_get_64_17.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_65_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_65_17.setRuntimeParent(_jettag_c_iterate_55_1);
            _jettag_c_get_65_17.setTagInfo(_td_c_get_65_17);
            _jettag_c_get_65_17.doStart(context, out);
            _jettag_c_get_65_17.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_55_1.handleBodyContent(out);
        }
        _jettag_c_iterate_55_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmRoute.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_6\" location=\"184,201\" distributionMode=\"first\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_73_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_73_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_73_1.setRuntimeParent(null);
        _jettag_c_setVariable_73_1.setTagInfo(_td_c_setVariable_73_1);
        _jettag_c_setVariable_73_1.doStart(context, out);
        _jettag_c_setVariable_73_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_74_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_74_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_74_1.setRuntimeParent(null);
        _jettag_c_iterate_74_1.setTagInfo(_td_c_iterate_74_1);
        _jettag_c_iterate_74_1.doStart(context, out);
        while (_jettag_c_iterate_74_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_75_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_75_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_75_1.setRuntimeParent(_jettag_c_iterate_74_1);
            _jettag_c_setVariable_75_1.setTagInfo(_td_c_setVariable_75_1);
            _jettag_c_setVariable_75_1.doStart(context, out);
            _jettag_c_setVariable_75_1.doEnd();
            out.write("       <outTerminals  terminalNodeID=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_76_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_76_44.setRuntimeParent(_jettag_c_iterate_74_1);
            _jettag_c_get_76_44.setTagInfo(_td_c_get_76_44);
            _jettag_c_get_76_44.doStart(context, out);
            _jettag_c_get_76_44.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       dynamic=\"true\" label=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_77_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_77_35.setRuntimeParent(_jettag_c_iterate_74_1);
            _jettag_c_get_77_35.setTagInfo(_td_c_get_77_35);
            _jettag_c_get_77_35.doStart(context, out);
            _jettag_c_get_77_35.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_74_1.handleBodyContent(out);
        }
        _jettag_c_iterate_74_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_80_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_80_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_80_1.setRuntimeParent(null);
        _jettag_c_setVariable_80_1.setTagInfo(_td_c_setVariable_80_1);
        _jettag_c_setVariable_80_1.doStart(context, out);
        _jettag_c_setVariable_80_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_81_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_81_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_81_1.setRuntimeParent(null);
        _jettag_c_iterate_81_1.setTagInfo(_td_c_iterate_81_1);
        _jettag_c_iterate_81_1.doStart(context, out);
        while (_jettag_c_iterate_81_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_82_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_82_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_82_1.setRuntimeParent(_jettag_c_iterate_81_1);
            _jettag_c_setVariable_82_1.setTagInfo(_td_c_setVariable_82_1);
            _jettag_c_setVariable_82_1.doStart(context, out);
            _jettag_c_setVariable_82_1.doEnd();
            out.write("        <filterTable filterPattern=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_37.setRuntimeParent(_jettag_c_iterate_81_1);
            _jettag_c_get_83_37.setTagInfo(_td_c_get_83_37);
            _jettag_c_get_83_37.doStart(context, out);
            _jettag_c_get_83_37.doEnd();
            out.write("=&quot;");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_85.setRuntimeParent(_jettag_c_iterate_81_1);
            _jettag_c_get_83_85.setTagInfo(_td_c_get_83_85);
            _jettag_c_get_83_85.doStart(context, out);
            _jettag_c_get_83_85.doEnd();
            out.write("&quot;\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        routingOutputTerminal=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_84_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_84_37.setRuntimeParent(_jettag_c_iterate_81_1);
            _jettag_c_get_84_37.setTagInfo(_td_c_get_84_37);
            _jettag_c_get_84_37.doStart(context, out);
            _jettag_c_get_84_37.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_81_1.handleBodyContent(out);
        }
        _jettag_c_iterate_81_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_86_1.setRuntimeParent(null);
        _jettag_c_iterate_86_1.setTagInfo(_td_c_iterate_86_1);
        _jettag_c_iterate_86_1.doStart(context, out);
        while (_jettag_c_iterate_86_1.okToProcessBody()) {
            // check that namespaces are defined 
            RuntimeTagElement _jettag_c_if_88_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_88_1.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_if_88_1.setTagInfo(_td_c_if_88_1);
            _jettag_c_if_88_1.doStart(context, out);
            while (_jettag_c_if_88_1.okToProcessBody()) {
                out.write("\t<nsMappingTable nsPrefix = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_89_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_30); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_30.setRuntimeParent(_jettag_c_if_88_1);
                _jettag_c_get_89_30.setTagInfo(_td_c_get_89_30);
                _jettag_c_get_89_30.doStart(context, out);
                _jettag_c_get_89_30.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tnamespace = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_90_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_15.setRuntimeParent(_jettag_c_if_88_1);
                _jettag_c_get_90_15.setTagInfo(_td_c_get_90_15);
                _jettag_c_get_90_15.doStart(context, out);
                _jettag_c_get_90_15.doEnd();
                out.write("\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_88_1.handleBodyContent(out);
            }
            _jettag_c_if_88_1.doEnd();
            _jettag_c_iterate_86_1.handleBodyContent(out);
        }
        _jettag_c_iterate_86_1.doEnd();
        out.write("\t        <translation xmi:type=\"utility:ConstantString\" string=\"Route\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        // fixed connections - assume maximum of 200 links 
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_201\" targetNode=\"FCMComposite_1_6\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\t  <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_203\" targetNode=\"OutTerminal.Output200\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_204\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_202\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.default\" targetTerminalName=\"InTerminal.in\"/>      ");  //$NON-NLS-1$        
        out.write(NL);         
        // Now the dynamic connections 
        RuntimeTagElement _jettag_c_setVariable_103_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_103_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_103_1.setRuntimeParent(null);
        _jettag_c_setVariable_103_1.setTagInfo(_td_c_setVariable_103_1);
        _jettag_c_setVariable_103_1.doStart(context, out);
        _jettag_c_setVariable_103_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_104_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_104_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_104_1.setRuntimeParent(null);
        _jettag_c_iterate_104_1.setTagInfo(_td_c_iterate_104_1);
        _jettag_c_iterate_104_1.doStart(context, out);
        while (_jettag_c_iterate_104_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_105_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_105_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_105_1.setRuntimeParent(_jettag_c_iterate_104_1);
            _jettag_c_setVariable_105_1.setTagInfo(_td_c_setVariable_105_1);
            _jettag_c_setVariable_105_1.doStart(context, out);
            _jettag_c_setVariable_105_1.doEnd();
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMConnection_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNode=\"OutTerminal.Output");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_108_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_108_37.setRuntimeParent(_jettag_c_iterate_104_1);
            _jettag_c_get_108_37.setTagInfo(_td_c_get_108_37);
            _jettag_c_get_108_37.doStart(context, out);
            _jettag_c_get_108_37.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceNode=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceTerminalName=\"match");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_110_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_32); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_110_32.setRuntimeParent(_jettag_c_iterate_104_1);
            _jettag_c_get_110_32.setTagInfo(_td_c_get_110_32);
            _jettag_c_get_110_32.doStart(context, out);
            _jettag_c_get_110_32.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_104_1.handleBodyContent(out);
        }
        _jettag_c_iterate_104_1.doEnd();
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
