package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_6_1 = new TagInfo("c:set", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_7_1 = new TagInfo("c:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_1 = new TagInfo("c:set", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_2 = new TagInfo("c:if", //$NON-NLS-1$
            14, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_16_3 = new TagInfo("c:set", //$NON-NLS-1$
            16, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_45 = new TagInfo("c:get", //$NON-NLS-1$
            16, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_17_3 = new TagInfo("c:set", //$NON-NLS-1$
            17, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_46 = new TagInfo("c:get", //$NON-NLS-1$
            17, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_3 = new TagInfo("c:set", //$NON-NLS-1$
            18, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_46 = new TagInfo("c:get", //$NON-NLS-1$
            18, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$brokerSchemaFolderName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_3 = new TagInfo("c:set", //$NON-NLS-1$
            19, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_46 = new TagInfo("c:get", //$NON-NLS-1$
            19, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_23_1 = new TagInfo("c:choose", //$NON-NLS-1$
            23, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_24_2 = new TagInfo("c:when", //$NON-NLS-1$
            24, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root) = 'com.ibm.etools.mft.pattern.fp.rd.mq'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_6 = new TagInfo("c:include", //$NON-NLS-1$
            25, 6,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "fp/rd/mq/templates/main.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_27_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            27, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_log_28_3 = new TagInfo("c:log", //$NON-NLS-1$
            28, 3,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_51 = new TagInfo("c:get", //$NON-NLS-1$
            28, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_1.setRuntimeParent(null);
        _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
        _jettag_c_setVariable_3_1.doStart(context, out);
        _jettag_c_setVariable_3_1.doEnd();
        out.write(NL);         
        // Use the default broker schema unless value set 
        RuntimeTagElement _jettag_c_set_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_6_1.setRuntimeParent(null);
        _jettag_c_set_6_1.setTagInfo(_td_c_set_6_1);
        _jettag_c_set_6_1.doStart(context, out);
        JET2Writer _jettag_c_set_6_1_saved_out = out;
        while (_jettag_c_set_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c_set_6_1.handleBodyContent(out);
        }
        out = _jettag_c_set_6_1_saved_out;
        _jettag_c_set_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c_set_7_1.handleBodyContent(out);
        }
        out = _jettag_c_set_7_1_saved_out;
        _jettag_c_set_7_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_8_1.setRuntimeParent(null);
        _jettag_c_set_8_1.setTagInfo(_td_c_set_8_1);
        _jettag_c_set_8_1.doStart(context, out);
        JET2Writer _jettag_c_set_8_1_saved_out = out;
        while (_jettag_c_set_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c_set_8_1.handleBodyContent(out);
        }
        out = _jettag_c_set_8_1_saved_out;
        _jettag_c_set_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_9_1.setRuntimeParent(null);
        _jettag_c_set_9_1.setTagInfo(_td_c_set_9_1);
        _jettag_c_set_9_1.doStart(context, out);
        JET2Writer _jettag_c_set_9_1_saved_out = out;
        while (_jettag_c_set_9_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("#");  //$NON-NLS-1$        
            _jettag_c_set_9_1.handleBodyContent(out);
        }
        out = _jettag_c_set_9_1_saved_out;
        _jettag_c_set_9_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // set the broker schema values if it is not null 
        RuntimeTagElement _jettag_c_if_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_12_1.setRuntimeParent(null);
        _jettag_c_if_12_1.setTagInfo(_td_c_if_12_1);
        _jettag_c_if_12_1.doStart(context, out);
        while (_jettag_c_if_12_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_14_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_14_2.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_if_14_2.setTagInfo(_td_c_if_14_2);
            _jettag_c_if_14_2.doStart(context, out);
            while (_jettag_c_if_14_2.okToProcessBody()) {
         com.ibm.etools.mft.pattern.fp.plugin.PatternUtility.getBrokerSchemaFolderName(context, "$root/brokerSchema", "brokerSchemaFolderName"); 
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_16_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_16_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_16_3.setRuntimeParent(_jettag_c_if_14_2);
                _jettag_c_set_16_3.setTagInfo(_td_c_set_16_3);
                _jettag_c_set_16_3.doStart(context, out);
                JET2Writer _jettag_c_set_16_3_saved_out = out;
                while (_jettag_c_set_16_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_16_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_45.setRuntimeParent(_jettag_c_set_16_3);
                    _jettag_c_get_16_45.setTagInfo(_td_c_get_16_45);
                    _jettag_c_get_16_45.doStart(context, out);
                    _jettag_c_get_16_45.doEnd();
                    _jettag_c_set_16_3.handleBodyContent(out);
                }
                out = _jettag_c_set_16_3_saved_out;
                _jettag_c_set_16_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_17_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_17_3.setRuntimeParent(_jettag_c_if_14_2);
                _jettag_c_set_17_3.setTagInfo(_td_c_set_17_3);
                _jettag_c_set_17_3.doStart(context, out);
                JET2Writer _jettag_c_set_17_3_saved_out = out;
                while (_jettag_c_set_17_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_17_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_46); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_46.setRuntimeParent(_jettag_c_set_17_3);
                    _jettag_c_get_17_46.setTagInfo(_td_c_get_17_46);
                    _jettag_c_get_17_46.doStart(context, out);
                    _jettag_c_get_17_46.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    _jettag_c_set_17_3.handleBodyContent(out);
                }
                out = _jettag_c_set_17_3_saved_out;
                _jettag_c_set_17_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_18_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_18_3.setRuntimeParent(_jettag_c_if_14_2);
                _jettag_c_set_18_3.setTagInfo(_td_c_set_18_3);
                _jettag_c_set_18_3.doStart(context, out);
                JET2Writer _jettag_c_set_18_3_saved_out = out;
                while (_jettag_c_set_18_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_18_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_46); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_46.setRuntimeParent(_jettag_c_set_18_3);
                    _jettag_c_get_18_46.setTagInfo(_td_c_get_18_46);
                    _jettag_c_get_18_46.doStart(context, out);
                    _jettag_c_get_18_46.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    _jettag_c_set_18_3.handleBodyContent(out);
                }
                out = _jettag_c_set_18_3_saved_out;
                _jettag_c_set_18_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_19_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_19_3.setRuntimeParent(_jettag_c_if_14_2);
                _jettag_c_set_19_3.setTagInfo(_td_c_set_19_3);
                _jettag_c_set_19_3.doStart(context, out);
                JET2Writer _jettag_c_set_19_3_saved_out = out;
                while (_jettag_c_set_19_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_19_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_46); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_46.setRuntimeParent(_jettag_c_set_19_3);
                    _jettag_c_get_19_46.setTagInfo(_td_c_get_19_46);
                    _jettag_c_get_19_46.doStart(context, out);
                    _jettag_c_get_19_46.doEnd();
                    out.write("#");  //$NON-NLS-1$        
                    _jettag_c_set_19_3.handleBodyContent(out);
                }
                out = _jettag_c_set_19_3_saved_out;
                _jettag_c_set_19_3.doEnd();
                out.write(NL);         
                _jettag_c_if_14_2.handleBodyContent(out);
            }
            _jettag_c_if_14_2.doEnd();
            _jettag_c_if_12_1.handleBodyContent(out);
        }
        _jettag_c_if_12_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_23_1.setRuntimeParent(null);
        _jettag_c_choose_23_1.setTagInfo(_td_c_choose_23_1);
        _jettag_c_choose_23_1.doStart(context, out);
        JET2Writer _jettag_c_choose_23_1_saved_out = out;
        while (_jettag_c_choose_23_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_24_2.setRuntimeParent(_jettag_c_choose_23_1);
            _jettag_c_when_24_2.setTagInfo(_td_c_when_24_2);
            _jettag_c_when_24_2.doStart(context, out);
            JET2Writer _jettag_c_when_24_2_saved_out = out;
            while (_jettag_c_when_24_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_25_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_25_6.setRuntimeParent(_jettag_c_when_24_2);
                _jettag_c_include_25_6.setTagInfo(_td_c_include_25_6);
                _jettag_c_include_25_6.doStart(context, out);
                _jettag_c_include_25_6.doEnd();
                _jettag_c_when_24_2.handleBodyContent(out);
            }
            out = _jettag_c_when_24_2_saved_out;
            _jettag_c_when_24_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_27_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_27_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_27_2.setRuntimeParent(_jettag_c_choose_23_1);
            _jettag_c_otherwise_27_2.setTagInfo(_td_c_otherwise_27_2);
            _jettag_c_otherwise_27_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_27_2_saved_out = out;
            while (_jettag_c_otherwise_27_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_log_28_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_28_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_28_3.setRuntimeParent(_jettag_c_otherwise_27_2);
                _jettag_c_log_28_3.setTagInfo(_td_c_log_28_3);
                _jettag_c_log_28_3.doStart(context, out);
                JET2Writer _jettag_c_log_28_3_saved_out = out;
                while (_jettag_c_log_28_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("Unrecognized transform [");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_51.setRuntimeParent(_jettag_c_log_28_3);
                    _jettag_c_get_28_51.setTagInfo(_td_c_get_28_51);
                    _jettag_c_get_28_51.doStart(context, out);
                    _jettag_c_get_28_51.doEnd();
                    out.write("]");  //$NON-NLS-1$        
                    _jettag_c_log_28_3.handleBodyContent(out);
                }
                out = _jettag_c_log_28_3_saved_out;
                _jettag_c_log_28_3.doEnd();
                out.write(NL);         
                _jettag_c_otherwise_27_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_27_2_saved_out;
            _jettag_c_otherwise_27_2.doEnd();
            _jettag_c_choose_23_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_23_1_saved_out;
        _jettag_c_choose_23_1.doEnd();
    }
}
