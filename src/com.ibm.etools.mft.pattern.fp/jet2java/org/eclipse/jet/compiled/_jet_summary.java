package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summary implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summary() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_46 = new TagInfo("c:get", //$NON-NLS-1$
            39, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_89 = new TagInfo("c:get", //$NON-NLS-1$
            39, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_129 = new TagInfo("c:get", //$NON-NLS-1$
            39, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_7 = new TagInfo("c:get", //$NON-NLS-1$
            40, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_46 = new TagInfo("c:get", //$NON-NLS-1$
            44, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_89 = new TagInfo("c:get", //$NON-NLS-1$
            44, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_129 = new TagInfo("c:get", //$NON-NLS-1$
            44, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_7 = new TagInfo("c:get", //$NON-NLS-1$
            45, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_46 = new TagInfo("c:get", //$NON-NLS-1$
            56, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_89 = new TagInfo("c:get", //$NON-NLS-1$
            56, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_129 = new TagInfo("c:get", //$NON-NLS-1$
            56, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_7 = new TagInfo("c:get", //$NON-NLS-1$
            57, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_5 = new TagInfo("c:if", //$NON-NLS-1$
            60, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_47 = new TagInfo("c:get", //$NON-NLS-1$
            62, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_90 = new TagInfo("c:get", //$NON-NLS-1$
            62, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_130 = new TagInfo("c:get", //$NON-NLS-1$
            62, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_8 = new TagInfo("c:get", //$NON-NLS-1$
            63, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_47 = new TagInfo("c:get", //$NON-NLS-1$
            67, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_90 = new TagInfo("c:get", //$NON-NLS-1$
            67, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_130 = new TagInfo("c:get", //$NON-NLS-1$
            67, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_8 = new TagInfo("c:get", //$NON-NLS-1$
            68, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_4 = new TagInfo("c:if", //$NON-NLS-1$
            87, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_89_6 = new TagInfo("c:choose", //$NON-NLS-1$
            89, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_90_7 = new TagInfo("c:when", //$NON-NLS-1$
            90, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_93_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            93, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_99_4 = new TagInfo("c:if", //$NON-NLS-1$
            99, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_101_6 = new TagInfo("c:choose", //$NON-NLS-1$
            101, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_102_7 = new TagInfo("c:when", //$NON-NLS-1$
            102, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_105_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            105, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_111_4 = new TagInfo("c:if", //$NON-NLS-1$
            111, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'specifyRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_113_6 = new TagInfo("c:choose", //$NON-NLS-1$
            113, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_114_7 = new TagInfo("c:when", //$NON-NLS-1$
            114, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/defaultQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_117_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            117, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_123_4 = new TagInfo("c:if", //$NON-NLS-1$
            123, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_125_6 = new TagInfo("c:choose", //$NON-NLS-1$
            125, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_126_7 = new TagInfo("c:when", //$NON-NLS-1$
            126, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/defaultQueueManagerLookupRoutes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_129_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            129, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_136_4 = new TagInfo("c:choose", //$NON-NLS-1$
            136, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_137_5 = new TagInfo("c:when", //$NON-NLS-1$
            137, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'specifyRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_138_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            138, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_146_5 = new TagInfo("c:when", //$NON-NLS-1$
            146, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_147_6 = new TagInfo("c:if", //$NON-NLS-1$
            147, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/cacheRefresh = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_162_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            162, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_176_3 = new TagInfo("c:if", //$NON-NLS-1$
            176, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetection = 'parsed'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_182_3 = new TagInfo("c:if", //$NON-NLS-1$
            182, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/useftp = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_188_3 = new TagInfo("c:if", //$NON-NLS-1$
            188, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_201_3 = new TagInfo("c:choose", //$NON-NLS-1$
            201, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_202_4 = new TagInfo("c:when", //$NON-NLS-1$
            202, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_211_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            211, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_218_3 = new TagInfo("c:choose", //$NON-NLS-1$
            218, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_219_4 = new TagInfo("c:when", //$NON-NLS-1$
            219, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_228_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            228, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages messages = new com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages();

        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<title>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write("_summary.html</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<link rel=\"stylesheet\" href=\"summary.css\" media=\"screen\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction setStatus(txt){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = txt;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a name=\"NoPlace\"></a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div id=\"banner\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.39", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.1", new Object[] { "$root/instanceName" }) );
        out.write("</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.3") );
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.4", new Object[] { "$root/instanceName" }) );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_46.setRuntimeParent(null);
        _jettag_c_get_39_46.setTagInfo(_td_c_get_39_46);
        _jettag_c_get_39_46.doStart(context, out);
        _jettag_c_get_39_46.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_89.setRuntimeParent(null);
        _jettag_c_get_39_89.setTagInfo(_td_c_get_39_89);
        _jettag_c_get_39_89.doStart(context, out);
        _jettag_c_get_39_89.doEnd();
        RuntimeTagElement _jettag_c_get_39_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_129); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_129.setRuntimeParent(null);
        _jettag_c_get_39_129.setTagInfo(_td_c_get_39_129);
        _jettag_c_get_39_129.doStart(context, out);
        _jettag_c_get_39_129.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_7.setRuntimeParent(null);
        _jettag_c_get_40_7.setTagInfo(_td_c_get_40_7);
        _jettag_c_get_40_7.doStart(context, out);
        _jettag_c_get_40_7.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_46.setRuntimeParent(null);
        _jettag_c_get_44_46.setTagInfo(_td_c_get_44_46);
        _jettag_c_get_44_46.doStart(context, out);
        _jettag_c_get_44_46.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_89.setRuntimeParent(null);
        _jettag_c_get_44_89.setTagInfo(_td_c_get_44_89);
        _jettag_c_get_44_89.doStart(context, out);
        _jettag_c_get_44_89.doEnd();
        RuntimeTagElement _jettag_c_get_44_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_129); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_129.setRuntimeParent(null);
        _jettag_c_get_44_129.setTagInfo(_td_c_get_44_129);
        _jettag_c_get_44_129.doStart(context, out);
        _jettag_c_get_44_129.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_7.setRuntimeParent(null);
        _jettag_c_get_45_7.setTagInfo(_td_c_get_45_7);
        _jettag_c_get_45_7.doStart(context, out);
        _jettag_c_get_45_7.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.5") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_46.setRuntimeParent(null);
        _jettag_c_get_56_46.setTagInfo(_td_c_get_56_46);
        _jettag_c_get_56_46.doStart(context, out);
        _jettag_c_get_56_46.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_89.setRuntimeParent(null);
        _jettag_c_get_56_89.setTagInfo(_td_c_get_56_89);
        _jettag_c_get_56_89.doStart(context, out);
        _jettag_c_get_56_89.doEnd();
        RuntimeTagElement _jettag_c_get_56_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_129); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_129.setRuntimeParent(null);
        _jettag_c_get_56_129.setTagInfo(_td_c_get_56_129);
        _jettag_c_get_56_129.doStart(context, out);
        _jettag_c_get_56_129.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_7.setRuntimeParent(null);
        _jettag_c_get_57_7.setTagInfo(_td_c_get_57_7);
        _jettag_c_get_57_7.doStart(context, out);
        _jettag_c_get_57_7.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_60_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_60_5.setRuntimeParent(null);
        _jettag_c_if_60_5.setTagInfo(_td_c_if_60_5);
        _jettag_c_if_60_5.doStart(context, out);
        while (_jettag_c_if_60_5.okToProcessBody()) {
            out.write("\t\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_47.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_62_47.setTagInfo(_td_c_get_62_47);
            _jettag_c_get_62_47.doStart(context, out);
            _jettag_c_get_62_47.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_90.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_62_90.setTagInfo(_td_c_get_62_90);
            _jettag_c_get_62_90.doStart(context, out);
            _jettag_c_get_62_90.doEnd();
            RuntimeTagElement _jettag_c_get_62_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_130); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_130.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_62_130.setTagInfo(_td_c_get_62_130);
            _jettag_c_get_62_130.doStart(context, out);
            _jettag_c_get_62_130.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_63_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_8.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_63_8.setTagInfo(_td_c_get_63_8);
            _jettag_c_get_63_8.doStart(context, out);
            _jettag_c_get_63_8.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_47.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_67_47.setTagInfo(_td_c_get_67_47);
            _jettag_c_get_67_47.doStart(context, out);
            _jettag_c_get_67_47.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_90.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_67_90.setTagInfo(_td_c_get_67_90);
            _jettag_c_get_67_90.doStart(context, out);
            _jettag_c_get_67_90.doEnd();
            RuntimeTagElement _jettag_c_get_67_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_130); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_130.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_67_130.setTagInfo(_td_c_get_67_130);
            _jettag_c_get_67_130.doStart(context, out);
            _jettag_c_get_67_130.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_68_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_68_8.setRuntimeParent(_jettag_c_if_60_5);
            _jettag_c_get_68_8.setTagInfo(_td_c_get_68_8);
            _jettag_c_get_68_8.doStart(context, out);
            _jettag_c_get_68_8.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_60_5.handleBodyContent(out);
        }
        _jettag_c_if_60_5.doEnd();
        out.write("\t\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.7") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.8") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.9") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_87_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_87_4.setRuntimeParent(null);
        _jettag_c_if_87_4.setTagInfo(_td_c_if_87_4);
        _jettag_c_if_87_4.doStart(context, out);
        while (_jettag_c_if_87_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_89_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_89_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_89_6.setRuntimeParent(_jettag_c_if_87_4);
            _jettag_c_choose_89_6.setTagInfo(_td_c_choose_89_6);
            _jettag_c_choose_89_6.doStart(context, out);
            JET2Writer _jettag_c_choose_89_6_saved_out = out;
            while (_jettag_c_choose_89_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_90_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_90_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_90_7.setRuntimeParent(_jettag_c_choose_89_6);
                _jettag_c_when_90_7.setTagInfo(_td_c_when_90_7);
                _jettag_c_when_90_7.doStart(context, out);
                JET2Writer _jettag_c_when_90_7_saved_out = out;
                while (_jettag_c_when_90_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.13.queueManager", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix", "$root/logQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_90_7.handleBodyContent(out);
                }
                out = _jettag_c_when_90_7_saved_out;
                _jettag_c_when_90_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_93_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_93_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_93_7.setRuntimeParent(_jettag_c_choose_89_6);
                _jettag_c_otherwise_93_7.setTagInfo(_td_c_otherwise_93_7);
                _jettag_c_otherwise_93_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_93_7_saved_out = out;
                while (_jettag_c_otherwise_93_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.13", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_93_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_93_7_saved_out;
                _jettag_c_otherwise_93_7.doEnd();
                _jettag_c_choose_89_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_89_6_saved_out;
            _jettag_c_choose_89_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_87_4.handleBodyContent(out);
        }
        _jettag_c_if_87_4.doEnd();
        RuntimeTagElement _jettag_c_if_99_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_99_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_99_4.setRuntimeParent(null);
        _jettag_c_if_99_4.setTagInfo(_td_c_if_99_4);
        _jettag_c_if_99_4.doStart(context, out);
        while (_jettag_c_if_99_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_101_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_101_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_101_6.setRuntimeParent(_jettag_c_if_99_4);
            _jettag_c_choose_101_6.setTagInfo(_td_c_choose_101_6);
            _jettag_c_choose_101_6.doStart(context, out);
            JET2Writer _jettag_c_choose_101_6_saved_out = out;
            while (_jettag_c_choose_101_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_102_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_102_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_102_7.setRuntimeParent(_jettag_c_choose_101_6);
                _jettag_c_when_102_7.setTagInfo(_td_c_when_102_7);
                _jettag_c_when_102_7.doStart(context, out);
                JET2Writer _jettag_c_when_102_7_saved_out = out;
                while (_jettag_c_when_102_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.14.queueManager", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_102_7.handleBodyContent(out);
                }
                out = _jettag_c_when_102_7_saved_out;
                _jettag_c_when_102_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_105_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_105_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_105_7.setRuntimeParent(_jettag_c_choose_101_6);
                _jettag_c_otherwise_105_7.setTagInfo(_td_c_otherwise_105_7);
                _jettag_c_otherwise_105_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_105_7_saved_out = out;
                while (_jettag_c_otherwise_105_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.14", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_105_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_105_7_saved_out;
                _jettag_c_otherwise_105_7.doEnd();
                _jettag_c_choose_101_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_101_6_saved_out;
            _jettag_c_choose_101_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_99_4.handleBodyContent(out);
        }
        _jettag_c_if_99_4.doEnd();
        RuntimeTagElement _jettag_c_if_111_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_111_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_111_4.setRuntimeParent(null);
        _jettag_c_if_111_4.setTagInfo(_td_c_if_111_4);
        _jettag_c_if_111_4.doStart(context, out);
        while (_jettag_c_if_111_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_113_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_113_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_113_6.setRuntimeParent(_jettag_c_if_111_4);
            _jettag_c_choose_113_6.setTagInfo(_td_c_choose_113_6);
            _jettag_c_choose_113_6.doStart(context, out);
            JET2Writer _jettag_c_choose_113_6_saved_out = out;
            while (_jettag_c_choose_113_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_114_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_114_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_114_7.setRuntimeParent(_jettag_c_choose_113_6);
                _jettag_c_when_114_7.setTagInfo(_td_c_when_114_7);
                _jettag_c_when_114_7.doStart(context, out);
                JET2Writer _jettag_c_when_114_7_saved_out = out;
                while (_jettag_c_when_114_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.15.queueManager", new Object[] { "$root/queuePrefix", "$root/defaultQueue", "$root/queueSuffix", "$root/defaultQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_114_7.handleBodyContent(out);
                }
                out = _jettag_c_when_114_7_saved_out;
                _jettag_c_when_114_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_117_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_117_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_117_7.setRuntimeParent(_jettag_c_choose_113_6);
                _jettag_c_otherwise_117_7.setTagInfo(_td_c_otherwise_117_7);
                _jettag_c_otherwise_117_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_117_7_saved_out = out;
                while (_jettag_c_otherwise_117_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.15", new Object[] { "$root/queuePrefix", "$root/defaultQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_117_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_117_7_saved_out;
                _jettag_c_otherwise_117_7.doEnd();
                _jettag_c_choose_113_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_113_6_saved_out;
            _jettag_c_choose_113_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_111_4.handleBodyContent(out);
        }
        _jettag_c_if_111_4.doEnd();
        RuntimeTagElement _jettag_c_if_123_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_123_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_123_4.setRuntimeParent(null);
        _jettag_c_if_123_4.setTagInfo(_td_c_if_123_4);
        _jettag_c_if_123_4.doStart(context, out);
        while (_jettag_c_if_123_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_125_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_125_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_125_6.setRuntimeParent(_jettag_c_if_123_4);
            _jettag_c_choose_125_6.setTagInfo(_td_c_choose_125_6);
            _jettag_c_choose_125_6.doStart(context, out);
            JET2Writer _jettag_c_choose_125_6_saved_out = out;
            while (_jettag_c_choose_125_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_126_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_126_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_126_7.setRuntimeParent(_jettag_c_choose_125_6);
                _jettag_c_when_126_7.setTagInfo(_td_c_when_126_7);
                _jettag_c_when_126_7.doStart(context, out);
                JET2Writer _jettag_c_when_126_7_saved_out = out;
                while (_jettag_c_when_126_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.15.queueManager", new Object[] { "$root/queuePrefix", "$root/defaultQueueLookupRoutes", "$root/queueSuffix", "$root/defaultQueueManagerLookupRoutes" }) );
                    out.write(NL);         
                    _jettag_c_when_126_7.handleBodyContent(out);
                }
                out = _jettag_c_when_126_7_saved_out;
                _jettag_c_when_126_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_129_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_129_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_129_7.setRuntimeParent(_jettag_c_choose_125_6);
                _jettag_c_otherwise_129_7.setTagInfo(_td_c_otherwise_129_7);
                _jettag_c_otherwise_129_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_129_7_saved_out = out;
                while (_jettag_c_otherwise_129_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.15", new Object[] { "$root/queuePrefix", "$root/defaultQueueLookupRoutes", "$root/queueSuffix", "$root/defaultQueueManagerLookupRoutes" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_129_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_129_7_saved_out;
                _jettag_c_otherwise_129_7.doEnd();
                _jettag_c_choose_125_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_125_6_saved_out;
            _jettag_c_choose_125_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_123_4.handleBodyContent(out);
        }
        _jettag_c_if_123_4.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_136_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_136_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_136_4.setRuntimeParent(null);
        _jettag_c_choose_136_4.setTagInfo(_td_c_choose_136_4);
        _jettag_c_choose_136_4.doStart(context, out);
        JET2Writer _jettag_c_choose_136_4_saved_out = out;
        while (_jettag_c_choose_136_4.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_137_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_137_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_137_5.setRuntimeParent(_jettag_c_choose_136_4);
            _jettag_c_when_137_5.setTagInfo(_td_c_when_137_5);
            _jettag_c_when_137_5.doStart(context, out);
            JET2Writer _jettag_c_when_137_5_saved_out = out;
            while (_jettag_c_when_137_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_138_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_138_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_138_6.setRuntimeParent(_jettag_c_when_137_5);
                _jettag_c_iterate_138_6.setTagInfo(_td_c_iterate_138_6);
                _jettag_c_iterate_138_6.doStart(context, out);
                while (_jettag_c_iterate_138_6.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t<li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.16",
                                          new Object[] {"$root/queuePrefix", "$curOutput/queue", "$root/queueSuffix", "$curOutput/queueManager" }) );
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t</li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_138_6.handleBodyContent(out);
                }
                _jettag_c_iterate_138_6.doEnd();
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_137_5.handleBodyContent(out);
            }
            out = _jettag_c_when_137_5_saved_out;
            _jettag_c_when_137_5.doEnd();
            RuntimeTagElement _jettag_c_when_146_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_146_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_146_5.setRuntimeParent(_jettag_c_choose_136_4);
            _jettag_c_when_146_5.setTagInfo(_td_c_when_146_5);
            _jettag_c_when_146_5.doStart(context, out);
            JET2Writer _jettag_c_when_146_5_saved_out = out;
            while (_jettag_c_when_146_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_147_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_147_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_147_6.setRuntimeParent(_jettag_c_when_146_5);
                _jettag_c_if_147_6.setTagInfo(_td_c_if_147_6);
                _jettag_c_if_147_6.doStart(context, out);
                while (_jettag_c_if_147_6.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t<li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.19",
                                          new Object[] {"$root/queuePrefix", "$root/refreshQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t</li>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_147_6.handleBodyContent(out);
                }
                _jettag_c_if_147_6.doEnd();
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.18") );
                out.write(NL);         
                out.write("\t\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<h3>");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.20") );
                out.write("</h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.21", new Object[] { "$root/routingDataSource" }) );
                out.write(NL);         
                out.write("\t\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_146_5.handleBodyContent(out);
            }
            out = _jettag_c_when_146_5_saved_out;
            _jettag_c_when_146_5.doEnd();
            RuntimeTagElement _jettag_c_otherwise_162_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_162_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_162_5.setRuntimeParent(_jettag_c_choose_136_4);
            _jettag_c_otherwise_162_5.setTagInfo(_td_c_otherwise_162_5);
            _jettag_c_otherwise_162_5.doStart(context, out);
            JET2Writer _jettag_c_otherwise_162_5_saved_out = out;
            while (_jettag_c_otherwise_162_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t<li>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.fp.rd.mq.summary.16",
                                   new Object[] {"$root/queuePrefix", "root/outputQueue", "$root/queueSuffix", "$root/outputQueueManager" }) );
                out.write(NL);         
                out.write("\t\t\t\t\t</li>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</ul>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_162_5.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_162_5_saved_out;
            _jettag_c_otherwise_162_5.doEnd();
            _jettag_c_choose_136_4.handleBodyContent(out);
        }
        out = _jettag_c_choose_136_4_saved_out;
        _jettag_c_choose_136_4.doEnd();
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.22") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.32") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_176_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_176_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_176_3.setRuntimeParent(null);
        _jettag_c_if_176_3.setTagInfo(_td_c_if_176_3);
        _jettag_c_if_176_3.doStart(context, out);
        while (_jettag_c_if_176_3.okToProcessBody()) {
            out.write("\t\t\t<p>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.33") );
            out.write(NL);         
            out.write("\t\t\t</p>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_176_3.handleBodyContent(out);
        }
        _jettag_c_if_176_3.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_182_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_182_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_182_3.setRuntimeParent(null);
        _jettag_c_if_182_3.setTagInfo(_td_c_if_182_3);
        _jettag_c_if_182_3.doStart(context, out);
        while (_jettag_c_if_182_3.okToProcessBody()) {
            out.write("\t\t\t<p>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.34"));
            out.write(NL);         
            out.write("\t\t\t</p>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_182_3.handleBodyContent(out);
        }
        _jettag_c_if_182_3.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_188_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_188_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_188_3.setRuntimeParent(null);
        _jettag_c_if_188_3.setTagInfo(_td_c_if_188_3);
        _jettag_c_if_188_3.doStart(context, out);
        while (_jettag_c_if_188_3.okToProcessBody()) {
            out.write("\t\t\t<p>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.35") );
            out.write(NL);         
            out.write("\t\t\t</p>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_188_3.handleBodyContent(out);
        }
        _jettag_c_if_188_3.doEnd();
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.25") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_201_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_201_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_201_3.setRuntimeParent(null);
        _jettag_c_choose_201_3.setTagInfo(_td_c_choose_201_3);
        _jettag_c_choose_201_3.doStart(context, out);
        JET2Writer _jettag_c_choose_201_3_saved_out = out;
        while (_jettag_c_choose_201_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_202_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_202_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_202_4.setRuntimeParent(_jettag_c_choose_201_3);
            _jettag_c_when_202_4.setTagInfo(_td_c_when_202_4);
            _jettag_c_when_202_4.doStart(context, out);
            JET2Writer _jettag_c_when_202_4_saved_out = out;
            while (_jettag_c_when_202_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.26") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.27") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_202_4.handleBodyContent(out);
            }
            out = _jettag_c_when_202_4_saved_out;
            _jettag_c_when_202_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_211_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_211_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_211_4.setRuntimeParent(_jettag_c_choose_201_3);
            _jettag_c_otherwise_211_4.setTagInfo(_td_c_otherwise_211_4);
            _jettag_c_otherwise_211_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_211_4_saved_out = out;
            while (_jettag_c_otherwise_211_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.28") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_211_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_211_4_saved_out;
            _jettag_c_otherwise_211_4.doEnd();
            _jettag_c_choose_201_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_201_3_saved_out;
        _jettag_c_choose_201_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_218_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_218_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_218_3.setRuntimeParent(null);
        _jettag_c_choose_218_3.setTagInfo(_td_c_choose_218_3);
        _jettag_c_choose_218_3.doStart(context, out);
        JET2Writer _jettag_c_choose_218_3_saved_out = out;
        while (_jettag_c_choose_218_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_219_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_219_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_219_4.setRuntimeParent(_jettag_c_choose_218_3);
            _jettag_c_when_219_4.setTagInfo(_td_c_when_219_4);
            _jettag_c_when_219_4.doStart(context, out);
            JET2Writer _jettag_c_when_219_4_saved_out = out;
            while (_jettag_c_when_219_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.29") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.30") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_219_4.handleBodyContent(out);
            }
            out = _jettag_c_when_219_4_saved_out;
            _jettag_c_when_219_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_228_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_228_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_228_4.setRuntimeParent(_jettag_c_choose_218_3);
            _jettag_c_otherwise_228_4.setTagInfo(_td_c_otherwise_228_4);
            _jettag_c_otherwise_228_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_228_4_saved_out = out;
            while (_jettag_c_otherwise_228_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.summary.31") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_228_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_228_4_saved_out;
            _jettag_c_otherwise_228_4.doEnd();
            _jettag_c_choose_218_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_218_3_saved_out;
        _jettag_c_choose_218_3.doEnd();
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
