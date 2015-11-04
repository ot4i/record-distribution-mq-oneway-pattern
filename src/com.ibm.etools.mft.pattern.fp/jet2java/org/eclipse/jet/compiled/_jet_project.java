package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_project implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_project() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_8 = new TagInfo("c:get", //$NON-NLS-1$
            3, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'parsed'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_12 = new TagInfo("c:get", //$NON-NLS-1$
            7, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-before(substring-after($root/messageSet,'/'),'/')", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<projectDescription>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_8.setRuntimeParent(null);
        _jettag_c_get_3_8.setTagInfo(_td_c_get_3_8);
        _jettag_c_get_3_8.doStart(context, out);
        _jettag_c_get_3_8.doEnd();
        out.write("</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<comment></comment>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<projects>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_1.setRuntimeParent(null);
        _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
        _jettag_c_if_6_1.doStart(context, out);
        while (_jettag_c_if_6_1.okToProcessBody()) {
            out.write("\t\t<project>");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_7_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_12.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_get_7_12.setTagInfo(_td_c_get_7_12);
            _jettag_c_get_7_12.doStart(context, out);
            _jettag_c_get_7_12.doEnd();
            out.write("</project>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_6_1.handleBodyContent(out);
        }
        _jettag_c_if_6_1.doEnd();
        out.write("\t</projects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.bar.barbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.applib.mbprojectbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.msg.validation.dfdl.mlibdfdlbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.flow.adapters.adapterbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.flow.sca.scabuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.esql.lang.esqllangbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.mapping.builder.mappingbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.map.builder.mslmappingbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.flow.msgflowxsltbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.flow.msgflowbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.msg.validation.dfdl.dfdlqnamevalidator</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.bar.ext.barbuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>com.ibm.etools.mft.applib.applibresourcevalidator</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>com.ibm.etools.mft.bar.barnature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>com.ibm.etools.mft.bar.ext.barnature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>com.ibm.etools.msgbroker.tooling.applicationNature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>com.ibm.etools.msgbroker.tooling.messageBrokerProjectNature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</projectDescription>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
