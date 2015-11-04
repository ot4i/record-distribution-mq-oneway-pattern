package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_1 = new TagInfo("c:if", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($isMessageSetValid) = false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_12_2 = new TagInfo("c:log", //$NON-NLS-1$
            12, 2,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_1 = new TagInfo("c:set", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_42 = new TagInfo("c:get", //$NON-NLS-1$
            18, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_1 = new TagInfo("c:set", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_20_1 = new TagInfo("c:set", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_23_1 = new TagInfo("c:set", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_48 = new TagInfo("c:get", //$NON-NLS-1$
            23, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_99 = new TagInfo("c:get", //$NON-NLS-1$
            23, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_24_1 = new TagInfo("c:set", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_46 = new TagInfo("c:get", //$NON-NLS-1$
            24, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_95 = new TagInfo("c:get", //$NON-NLS-1$
            24, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_25_1 = new TagInfo("c:set", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_36 = new TagInfo("c:get", //$NON-NLS-1$
            25, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_75 = new TagInfo("c:get", //$NON-NLS-1$
            25, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_26_1 = new TagInfo("c:set", //$NON-NLS-1$
            26, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_34 = new TagInfo("c:get", //$NON-NLS-1$
            26, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_71 = new TagInfo("c:get", //$NON-NLS-1$
            26, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_27_1 = new TagInfo("c:set", //$NON-NLS-1$
            27, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_36 = new TagInfo("c:get", //$NON-NLS-1$
            27, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_75 = new TagInfo("c:get", //$NON-NLS-1$
            27, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_32_1 = new TagInfo("ws:project", //$NON-NLS-1$
            32, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/instanceName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_33_2 = new TagInfo("ws:file", //$NON-NLS-1$
            33, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "fp/rd/mq/templates/root/summary.jet", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/{$root/instanceName}_summary.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_35_2 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            35, 2,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "css/summary.css", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/summary.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_38_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            38, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$patternConfigurationFolderName}/icons", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_39_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            39, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/header-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "header-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_41_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            41, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/section.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "section.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_43_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            43, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/summary-title.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "summary-title.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_45_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            45, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/title-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "title-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_51_1 = new TagInfo("ws:project", //$NON-NLS-1$
            51, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/@projectname}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_52_2 = new TagInfo("ws:file", //$NON-NLS-1$
            52, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                ".project", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_55_2 = new TagInfo("c:set", //$NON-NLS-1$
            55, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_40 = new TagInfo("c:get", //$NON-NLS-1$
            55, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_56_2 = new TagInfo("c:set", //$NON-NLS-1$
            56, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_43 = new TagInfo("c:get", //$NON-NLS-1$
            56, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_81 = new TagInfo("c:get", //$NON-NLS-1$
            56, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_57_2 = new TagInfo("c:set", //$NON-NLS-1$
            57, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_46 = new TagInfo("c:get", //$NON-NLS-1$
            57, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_84 = new TagInfo("c:get", //$NON-NLS-1$
            57, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_58_2 = new TagInfo("c:set", //$NON-NLS-1$
            58, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_50 = new TagInfo("c:get", //$NON-NLS-1$
            58, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_88 = new TagInfo("c:get", //$NON-NLS-1$
            58, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_59_2 = new TagInfo("ws:file", //$NON-NLS-1$
            59, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Error.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/Error.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_60_2 = new TagInfo("ws:file", //$NON-NLS-1$
            60, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@error}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/Error.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_2 = new TagInfo("c:if", //$NON-NLS-1$
            63, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_64_3 = new TagInfo("c:set", //$NON-NLS-1$
            64, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_41 = new TagInfo("c:get", //$NON-NLS-1$
            64, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_65_3 = new TagInfo("c:set", //$NON-NLS-1$
            65, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_44 = new TagInfo("c:get", //$NON-NLS-1$
            65, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_82 = new TagInfo("c:get", //$NON-NLS-1$
            65, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_66_3 = new TagInfo("c:set", //$NON-NLS-1$
            66, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_47 = new TagInfo("c:get", //$NON-NLS-1$
            66, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_85 = new TagInfo("c:get", //$NON-NLS-1$
            66, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_67_3 = new TagInfo("c:set", //$NON-NLS-1$
            67, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_51 = new TagInfo("c:get", //$NON-NLS-1$
            67, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_89 = new TagInfo("c:get", //$NON-NLS-1$
            67, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_68_3 = new TagInfo("ws:file", //$NON-NLS-1$
            68, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Log.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/Log.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_69_3 = new TagInfo("ws:file", //$NON-NLS-1$
            69, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@log}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/Log.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_73_2 = new TagInfo("c:set", //$NON-NLS-1$
            73, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_40 = new TagInfo("c:get", //$NON-NLS-1$
            73, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_74_2 = new TagInfo("c:set", //$NON-NLS-1$
            74, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_43 = new TagInfo("c:get", //$NON-NLS-1$
            74, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_81 = new TagInfo("c:get", //$NON-NLS-1$
            74, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_75_2 = new TagInfo("c:set", //$NON-NLS-1$
            75, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_46 = new TagInfo("c:get", //$NON-NLS-1$
            75, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_84 = new TagInfo("c:get", //$NON-NLS-1$
            75, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_76_2 = new TagInfo("c:set", //$NON-NLS-1$
            76, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_50 = new TagInfo("c:get", //$NON-NLS-1$
            76, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_88 = new TagInfo("c:get", //$NON-NLS-1$
            76, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_77_2 = new TagInfo("ws:file", //$NON-NLS-1$
            77, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@recordDistributor}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/RecordDistributor.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_78_2 = new TagInfo("ws:file", //$NON-NLS-1$
            78, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}RecordDistributor.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/RecordDistributor.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_81_2 = new TagInfo("c:set", //$NON-NLS-1$
            81, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_40 = new TagInfo("c:get", //$NON-NLS-1$
            81, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_82_2 = new TagInfo("c:set", //$NON-NLS-1$
            82, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_43 = new TagInfo("c:get", //$NON-NLS-1$
            82, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_81 = new TagInfo("c:get", //$NON-NLS-1$
            82, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_83_2 = new TagInfo("c:set", //$NON-NLS-1$
            83, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_46 = new TagInfo("c:get", //$NON-NLS-1$
            83, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_84 = new TagInfo("c:get", //$NON-NLS-1$
            83, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_84_2 = new TagInfo("c:set", //$NON-NLS-1$
            84, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_50 = new TagInfo("c:get", //$NON-NLS-1$
            84, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_88 = new TagInfo("c:get", //$NON-NLS-1$
            84, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_85_2 = new TagInfo("ws:file", //$NON-NLS-1$
            85, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@recordProcessor}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/RecordProcessor.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_88_2 = new TagInfo("c:set", //$NON-NLS-1$
            88, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_40 = new TagInfo("c:get", //$NON-NLS-1$
            88, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_89_2 = new TagInfo("c:set", //$NON-NLS-1$
            89, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_43 = new TagInfo("c:get", //$NON-NLS-1$
            89, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_81 = new TagInfo("c:get", //$NON-NLS-1$
            89, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_90_2 = new TagInfo("c:set", //$NON-NLS-1$
            90, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_46 = new TagInfo("c:get", //$NON-NLS-1$
            90, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_84 = new TagInfo("c:get", //$NON-NLS-1$
            90, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_91_2 = new TagInfo("c:set", //$NON-NLS-1$
            91, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_50 = new TagInfo("c:get", //$NON-NLS-1$
            91, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_88 = new TagInfo("c:get", //$NON-NLS-1$
            91, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_93_2 = new TagInfo("c:choose", //$NON-NLS-1$
            93, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_94_3 = new TagInfo("c:when", //$NON-NLS-1$
            94, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'specifyRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_95_6 = new TagInfo("ws:file", //$NON-NLS-1$
            95, 6,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Route.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/routeRoute/route.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_96_6 = new TagInfo("ws:file", //$NON-NLS-1$
            96, 6,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@route}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/routeRoute/route.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_99_3 = new TagInfo("c:when", //$NON-NLS-1$
            99, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_100_7 = new TagInfo("ws:file", //$NON-NLS-1$
            100, 7,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}DeclareCache.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/destinationCache/declarecache.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_102_7 = new TagInfo("ws:file", //$NON-NLS-1$
            102, 7,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@route}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/destinationCache/destination_cache.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_105_4 = new TagInfo("c:choose", //$NON-NLS-1$
            105, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_106_5 = new TagInfo("c:when", //$NON-NLS-1$
            106, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/key2 = ''", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_107_6 = new TagInfo("ws:file", //$NON-NLS-1$
            107, 6,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Route.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/destinationCache/destination_cache_1k.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_110_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            110, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_ws_file_111_9 = new TagInfo("ws:file", //$NON-NLS-1$
            111, 9,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Route.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/destinationCache/destination_cache_2k.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_116_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            116, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_ws_file_117_4 = new TagInfo("ws:file", //$NON-NLS-1$
            117, 4,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@route}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "fp/rd/mq/templates/root/routeDefault/route_default.subflow.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.fp.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages messages = new com.ibm.etools.mft.pattern.fp.rd.mq.PatternMessages();

        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
 com.ibm.etools.mft.pattern.fp.plugin.PatternUtility.checkMessageSetIsValidOrEmpty(context, "$root/messageSet", "isMessageSetValid"); 
        RuntimeTagElement _jettag_c_if_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_11_1.setRuntimeParent(null);
        _jettag_c_if_11_1.setTagInfo(_td_c_if_11_1);
        _jettag_c_if_11_1.doStart(context, out);
        while (_jettag_c_if_11_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_log_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_12_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_12_2.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_log_12_2.setTagInfo(_td_c_log_12_2);
            _jettag_c_log_12_2.doStart(context, out);
            JET2Writer _jettag_c_log_12_2_saved_out = out;
            while (_jettag_c_log_12_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t    ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.fp.rd.mq.jet.1") );
                out.write(NL);         
                _jettag_c_log_12_2.handleBodyContent(out);
            }
            out = _jettag_c_log_12_2_saved_out;
            _jettag_c_log_12_2.doEnd();
     if (true) return; 
            _jettag_c_if_11_1.handleBodyContent(out);
        }
        _jettag_c_if_11_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_18_1.setRuntimeParent(null);
        _jettag_c_set_18_1.setTagInfo(_td_c_set_18_1);
        _jettag_c_set_18_1.doStart(context, out);
        JET2Writer _jettag_c_set_18_1_saved_out = out;
        while (_jettag_c_set_18_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_18_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_42.setRuntimeParent(_jettag_c_set_18_1);
            _jettag_c_get_18_42.setTagInfo(_td_c_get_18_42);
            _jettag_c_get_18_42.doStart(context, out);
            _jettag_c_get_18_42.doEnd();
            out.write("_Flows");  //$NON-NLS-1$        
            _jettag_c_set_18_1.handleBodyContent(out);
        }
        out = _jettag_c_set_18_1_saved_out;
        _jettag_c_set_18_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_19_1.setRuntimeParent(null);
        _jettag_c_set_19_1.setTagInfo(_td_c_set_19_1);
        _jettag_c_set_19_1.doStart(context, out);
        JET2Writer _jettag_c_set_19_1_saved_out = out;
        while (_jettag_c_set_19_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("com.ibm.etools.mft.pattern.fp.rd.mq");  //$NON-NLS-1$        
            _jettag_c_set_19_1.handleBodyContent(out);
        }
        out = _jettag_c_set_19_1_saved_out;
        _jettag_c_set_19_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_20_1.setRuntimeParent(null);
        _jettag_c_set_20_1.setTagInfo(_td_c_set_20_1);
        _jettag_c_set_20_1.doStart(context, out);
        JET2Writer _jettag_c_set_20_1_saved_out = out;
        while (_jettag_c_set_20_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("1.0");  //$NON-NLS-1$        
            _jettag_c_set_20_1.handleBodyContent(out);
        }
        out = _jettag_c_set_20_1_saved_out;
        _jettag_c_set_20_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Make a name for each message flow 
        RuntimeTagElement _jettag_c_set_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_23_1.setRuntimeParent(null);
        _jettag_c_set_23_1.setTagInfo(_td_c_set_23_1);
        _jettag_c_set_23_1.doStart(context, out);
        JET2Writer _jettag_c_set_23_1_saved_out = out;
        while (_jettag_c_set_23_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_23_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_48.setRuntimeParent(_jettag_c_set_23_1);
            _jettag_c_get_23_48.setTagInfo(_td_c_get_23_48);
            _jettag_c_get_23_48.doStart(context, out);
            _jettag_c_get_23_48.doEnd();
            out.write("RecordDistributor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_23_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_99.setRuntimeParent(_jettag_c_set_23_1);
            _jettag_c_get_23_99.setTagInfo(_td_c_get_23_99);
            _jettag_c_get_23_99.doStart(context, out);
            _jettag_c_get_23_99.doEnd();
            _jettag_c_set_23_1.handleBodyContent(out);
        }
        out = _jettag_c_set_23_1_saved_out;
        _jettag_c_set_23_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_24_1.setRuntimeParent(null);
        _jettag_c_set_24_1.setTagInfo(_td_c_set_24_1);
        _jettag_c_set_24_1.doStart(context, out);
        JET2Writer _jettag_c_set_24_1_saved_out = out;
        while (_jettag_c_set_24_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_24_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_46.setRuntimeParent(_jettag_c_set_24_1);
            _jettag_c_get_24_46.setTagInfo(_td_c_get_24_46);
            _jettag_c_get_24_46.doStart(context, out);
            _jettag_c_get_24_46.doEnd();
            out.write("RecordProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_24_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_95.setRuntimeParent(_jettag_c_set_24_1);
            _jettag_c_get_24_95.setTagInfo(_td_c_get_24_95);
            _jettag_c_get_24_95.doStart(context, out);
            _jettag_c_get_24_95.doEnd();
            _jettag_c_set_24_1.handleBodyContent(out);
        }
        out = _jettag_c_set_24_1_saved_out;
        _jettag_c_set_24_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_25_1.setRuntimeParent(null);
        _jettag_c_set_25_1.setTagInfo(_td_c_set_25_1);
        _jettag_c_set_25_1.doStart(context, out);
        JET2Writer _jettag_c_set_25_1_saved_out = out;
        while (_jettag_c_set_25_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_25_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_36.setRuntimeParent(_jettag_c_set_25_1);
            _jettag_c_get_25_36.setTagInfo(_td_c_get_25_36);
            _jettag_c_get_25_36.doStart(context, out);
            _jettag_c_get_25_36.doEnd();
            out.write("Error");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_25_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_75.setRuntimeParent(_jettag_c_set_25_1);
            _jettag_c_get_25_75.setTagInfo(_td_c_get_25_75);
            _jettag_c_get_25_75.doStart(context, out);
            _jettag_c_get_25_75.doEnd();
            _jettag_c_set_25_1.handleBodyContent(out);
        }
        out = _jettag_c_set_25_1_saved_out;
        _jettag_c_set_25_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_26_1.setRuntimeParent(null);
        _jettag_c_set_26_1.setTagInfo(_td_c_set_26_1);
        _jettag_c_set_26_1.doStart(context, out);
        JET2Writer _jettag_c_set_26_1_saved_out = out;
        while (_jettag_c_set_26_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_26_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_34.setRuntimeParent(_jettag_c_set_26_1);
            _jettag_c_get_26_34.setTagInfo(_td_c_get_26_34);
            _jettag_c_get_26_34.doStart(context, out);
            _jettag_c_get_26_34.doEnd();
            out.write("Log");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_26_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_71.setRuntimeParent(_jettag_c_set_26_1);
            _jettag_c_get_26_71.setTagInfo(_td_c_get_26_71);
            _jettag_c_get_26_71.doStart(context, out);
            _jettag_c_get_26_71.doEnd();
            _jettag_c_set_26_1.handleBodyContent(out);
        }
        out = _jettag_c_set_26_1_saved_out;
        _jettag_c_set_26_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_27_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_27_1.setRuntimeParent(null);
        _jettag_c_set_27_1.setTagInfo(_td_c_set_27_1);
        _jettag_c_set_27_1.doStart(context, out);
        JET2Writer _jettag_c_set_27_1_saved_out = out;
        while (_jettag_c_set_27_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_27_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_36.setRuntimeParent(_jettag_c_set_27_1);
            _jettag_c_get_27_36.setTagInfo(_td_c_get_27_36);
            _jettag_c_get_27_36.doStart(context, out);
            _jettag_c_get_27_36.doEnd();
            out.write("Route");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_75.setRuntimeParent(_jettag_c_set_27_1);
            _jettag_c_get_27_75.setTagInfo(_td_c_get_27_75);
            _jettag_c_get_27_75.doStart(context, out);
            _jettag_c_get_27_75.doEnd();
            _jettag_c_set_27_1.handleBodyContent(out);
        }
        out = _jettag_c_set_27_1_saved_out;
        _jettag_c_set_27_1.doEnd();
        out.write(NL);         
        out.write(NL);         
 com.ibm.etools.mft.pattern.fp.plugin.PatternUtility.getPatternConfigurationFolderName(context, "patternConfigurationFolderName"); 
        out.write(NL);         
        // Pattern reference project 
        RuntimeTagElement _jettag_ws_project_32_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_32_1.setRuntimeParent(null);
        _jettag_ws_project_32_1.setTagInfo(_td_ws_project_32_1);
        _jettag_ws_project_32_1.doStart(context, out);
        while (_jettag_ws_project_32_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_33_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_33_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_33_2.setRuntimeParent(_jettag_ws_project_32_1);
            _jettag_ws_file_33_2.setTagInfo(_td_ws_file_33_2);
            _jettag_ws_file_33_2.doStart(context, out);
            _jettag_ws_file_33_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_35_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_35_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_35_2.setRuntimeParent(_jettag_ws_project_32_1);
            _jettag_ws_copyFile_35_2.setTagInfo(_td_ws_copyFile_35_2);
            _jettag_ws_copyFile_35_2.doStart(context, out);
            _jettag_ws_copyFile_35_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_38_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_38_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_38_2.setRuntimeParent(_jettag_ws_project_32_1);
            _jettag_ws_folder_38_2.setTagInfo(_td_ws_folder_38_2);
            _jettag_ws_folder_38_2.doStart(context, out);
            while (_jettag_ws_folder_38_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_39_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_39_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_39_3.setRuntimeParent(_jettag_ws_folder_38_2);
                _jettag_ws_copyFile_39_3.setTagInfo(_td_ws_copyFile_39_3);
                _jettag_ws_copyFile_39_3.doStart(context, out);
                _jettag_ws_copyFile_39_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_41_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_41_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_41_3.setRuntimeParent(_jettag_ws_folder_38_2);
                _jettag_ws_copyFile_41_3.setTagInfo(_td_ws_copyFile_41_3);
                _jettag_ws_copyFile_41_3.doStart(context, out);
                _jettag_ws_copyFile_41_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_43_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_43_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_43_3.setRuntimeParent(_jettag_ws_folder_38_2);
                _jettag_ws_copyFile_43_3.setTagInfo(_td_ws_copyFile_43_3);
                _jettag_ws_copyFile_43_3.doStart(context, out);
                _jettag_ws_copyFile_43_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_45_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_45_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_45_3.setRuntimeParent(_jettag_ws_folder_38_2);
                _jettag_ws_copyFile_45_3.setTagInfo(_td_ws_copyFile_45_3);
                _jettag_ws_copyFile_45_3.doStart(context, out);
                _jettag_ws_copyFile_45_3.doEnd();
                out.write(NL);         
                _jettag_ws_folder_38_2.handleBodyContent(out);
            }
            _jettag_ws_folder_38_2.doEnd();
            _jettag_ws_project_32_1.handleBodyContent(out);
        }
        _jettag_ws_project_32_1.doEnd();
        out.write(NL);         
        // Message flow project 
        RuntimeTagElement _jettag_ws_project_51_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_51_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_51_1.setRuntimeParent(null);
        _jettag_ws_project_51_1.setTagInfo(_td_ws_project_51_1);
        _jettag_ws_project_51_1.doStart(context, out);
        while (_jettag_ws_project_51_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_52_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_52_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_52_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_52_2.setTagInfo(_td_ws_file_52_2);
            _jettag_ws_file_52_2.doStart(context, out);
            _jettag_ws_file_52_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Error 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_55_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_55_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_55_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_55_2.setTagInfo(_td_c_set_55_2);
            _jettag_c_set_55_2.doStart(context, out);
            JET2Writer _jettag_c_set_55_2_saved_out = out;
            while (_jettag_c_set_55_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_55_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_40.setRuntimeParent(_jettag_c_set_55_2);
                _jettag_c_get_55_40.setTagInfo(_td_c_get_55_40);
                _jettag_c_get_55_40.doStart(context, out);
                _jettag_c_get_55_40.doEnd();
                _jettag_c_set_55_2.handleBodyContent(out);
            }
            out = _jettag_c_set_55_2_saved_out;
            _jettag_c_set_55_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_56_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_56_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_56_2.setTagInfo(_td_c_set_56_2);
            _jettag_c_set_56_2.doStart(context, out);
            JET2Writer _jettag_c_set_56_2_saved_out = out;
            while (_jettag_c_set_56_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_56_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_43.setRuntimeParent(_jettag_c_set_56_2);
                _jettag_c_get_56_43.setTagInfo(_td_c_get_56_43);
                _jettag_c_get_56_43.doStart(context, out);
                _jettag_c_get_56_43.doEnd();
                RuntimeTagElement _jettag_c_get_56_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_81.setRuntimeParent(_jettag_c_set_56_2);
                _jettag_c_get_56_81.setTagInfo(_td_c_get_56_81);
                _jettag_c_get_56_81.doStart(context, out);
                _jettag_c_get_56_81.doEnd();
                _jettag_c_set_56_2.handleBodyContent(out);
            }
            out = _jettag_c_set_56_2_saved_out;
            _jettag_c_set_56_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_57_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_57_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_57_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_57_2.setTagInfo(_td_c_set_57_2);
            _jettag_c_set_57_2.doStart(context, out);
            JET2Writer _jettag_c_set_57_2_saved_out = out;
            while (_jettag_c_set_57_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_57_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_46.setRuntimeParent(_jettag_c_set_57_2);
                _jettag_c_get_57_46.setTagInfo(_td_c_get_57_46);
                _jettag_c_get_57_46.doStart(context, out);
                _jettag_c_get_57_46.doEnd();
                RuntimeTagElement _jettag_c_get_57_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_84.setRuntimeParent(_jettag_c_set_57_2);
                _jettag_c_get_57_84.setTagInfo(_td_c_get_57_84);
                _jettag_c_get_57_84.doStart(context, out);
                _jettag_c_get_57_84.doEnd();
                _jettag_c_set_57_2.handleBodyContent(out);
            }
            out = _jettag_c_set_57_2_saved_out;
            _jettag_c_set_57_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_58_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_58_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_58_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_58_2.setTagInfo(_td_c_set_58_2);
            _jettag_c_set_58_2.doStart(context, out);
            JET2Writer _jettag_c_set_58_2_saved_out = out;
            while (_jettag_c_set_58_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_58_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_50.setRuntimeParent(_jettag_c_set_58_2);
                _jettag_c_get_58_50.setTagInfo(_td_c_get_58_50);
                _jettag_c_get_58_50.doStart(context, out);
                _jettag_c_get_58_50.doEnd();
                RuntimeTagElement _jettag_c_get_58_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_88.setRuntimeParent(_jettag_c_set_58_2);
                _jettag_c_get_58_88.setTagInfo(_td_c_get_58_88);
                _jettag_c_get_58_88.doStart(context, out);
                _jettag_c_get_58_88.doEnd();
                _jettag_c_set_58_2.handleBodyContent(out);
            }
            out = _jettag_c_set_58_2_saved_out;
            _jettag_c_set_58_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_59_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_59_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_59_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_59_2.setTagInfo(_td_ws_file_59_2);
            _jettag_ws_file_59_2.doStart(context, out);
            _jettag_ws_file_59_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_60_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_60_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_60_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_60_2.setTagInfo(_td_ws_file_60_2);
            _jettag_ws_file_60_2.doStart(context, out);
            _jettag_ws_file_60_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Logging 
            RuntimeTagElement _jettag_c_if_63_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_63_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_if_63_2.setTagInfo(_td_c_if_63_2);
            _jettag_c_if_63_2.doStart(context, out);
            while (_jettag_c_if_63_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_64_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_64_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_c_set_64_3.setTagInfo(_td_c_set_64_3);
                _jettag_c_set_64_3.doStart(context, out);
                JET2Writer _jettag_c_set_64_3_saved_out = out;
                while (_jettag_c_set_64_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_64_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_41); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_41.setRuntimeParent(_jettag_c_set_64_3);
                    _jettag_c_get_64_41.setTagInfo(_td_c_get_64_41);
                    _jettag_c_get_64_41.doStart(context, out);
                    _jettag_c_get_64_41.doEnd();
                    _jettag_c_set_64_3.handleBodyContent(out);
                }
                out = _jettag_c_set_64_3_saved_out;
                _jettag_c_set_64_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_65_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_65_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_65_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_c_set_65_3.setTagInfo(_td_c_set_65_3);
                _jettag_c_set_65_3.doStart(context, out);
                JET2Writer _jettag_c_set_65_3_saved_out = out;
                while (_jettag_c_set_65_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_65_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_44.setRuntimeParent(_jettag_c_set_65_3);
                    _jettag_c_get_65_44.setTagInfo(_td_c_get_65_44);
                    _jettag_c_get_65_44.doStart(context, out);
                    _jettag_c_get_65_44.doEnd();
                    RuntimeTagElement _jettag_c_get_65_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_82.setRuntimeParent(_jettag_c_set_65_3);
                    _jettag_c_get_65_82.setTagInfo(_td_c_get_65_82);
                    _jettag_c_get_65_82.doStart(context, out);
                    _jettag_c_get_65_82.doEnd();
                    _jettag_c_set_65_3.handleBodyContent(out);
                }
                out = _jettag_c_set_65_3_saved_out;
                _jettag_c_set_65_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_66_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_66_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_66_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_c_set_66_3.setTagInfo(_td_c_set_66_3);
                _jettag_c_set_66_3.doStart(context, out);
                JET2Writer _jettag_c_set_66_3_saved_out = out;
                while (_jettag_c_set_66_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_66_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_47.setRuntimeParent(_jettag_c_set_66_3);
                    _jettag_c_get_66_47.setTagInfo(_td_c_get_66_47);
                    _jettag_c_get_66_47.doStart(context, out);
                    _jettag_c_get_66_47.doEnd();
                    RuntimeTagElement _jettag_c_get_66_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_85.setRuntimeParent(_jettag_c_set_66_3);
                    _jettag_c_get_66_85.setTagInfo(_td_c_get_66_85);
                    _jettag_c_get_66_85.doStart(context, out);
                    _jettag_c_get_66_85.doEnd();
                    _jettag_c_set_66_3.handleBodyContent(out);
                }
                out = _jettag_c_set_66_3_saved_out;
                _jettag_c_set_66_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_67_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_67_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_67_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_c_set_67_3.setTagInfo(_td_c_set_67_3);
                _jettag_c_set_67_3.doStart(context, out);
                JET2Writer _jettag_c_set_67_3_saved_out = out;
                while (_jettag_c_set_67_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_67_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_67_51.setRuntimeParent(_jettag_c_set_67_3);
                    _jettag_c_get_67_51.setTagInfo(_td_c_get_67_51);
                    _jettag_c_get_67_51.doStart(context, out);
                    _jettag_c_get_67_51.doEnd();
                    RuntimeTagElement _jettag_c_get_67_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_67_89.setRuntimeParent(_jettag_c_set_67_3);
                    _jettag_c_get_67_89.setTagInfo(_td_c_get_67_89);
                    _jettag_c_get_67_89.doStart(context, out);
                    _jettag_c_get_67_89.doEnd();
                    _jettag_c_set_67_3.handleBodyContent(out);
                }
                out = _jettag_c_set_67_3_saved_out;
                _jettag_c_set_67_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_68_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_68_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_ws_file_68_3.setTagInfo(_td_ws_file_68_3);
                _jettag_ws_file_68_3.doStart(context, out);
                _jettag_ws_file_68_3.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_69_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_69_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_69_3.setRuntimeParent(_jettag_c_if_63_2);
                _jettag_ws_file_69_3.setTagInfo(_td_ws_file_69_3);
                _jettag_ws_file_69_3.doStart(context, out);
                _jettag_ws_file_69_3.doEnd();
                out.write(NL);         
                _jettag_c_if_63_2.handleBodyContent(out);
            }
            _jettag_c_if_63_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Record distributor 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_73_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_73_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_73_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_73_2.setTagInfo(_td_c_set_73_2);
            _jettag_c_set_73_2.doStart(context, out);
            JET2Writer _jettag_c_set_73_2_saved_out = out;
            while (_jettag_c_set_73_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_73_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_40.setRuntimeParent(_jettag_c_set_73_2);
                _jettag_c_get_73_40.setTagInfo(_td_c_get_73_40);
                _jettag_c_get_73_40.doStart(context, out);
                _jettag_c_get_73_40.doEnd();
                _jettag_c_set_73_2.handleBodyContent(out);
            }
            out = _jettag_c_set_73_2_saved_out;
            _jettag_c_set_73_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_74_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_74_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_74_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_74_2.setTagInfo(_td_c_set_74_2);
            _jettag_c_set_74_2.doStart(context, out);
            JET2Writer _jettag_c_set_74_2_saved_out = out;
            while (_jettag_c_set_74_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_74_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_74_43.setRuntimeParent(_jettag_c_set_74_2);
                _jettag_c_get_74_43.setTagInfo(_td_c_get_74_43);
                _jettag_c_get_74_43.doStart(context, out);
                _jettag_c_get_74_43.doEnd();
                RuntimeTagElement _jettag_c_get_74_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_74_81.setRuntimeParent(_jettag_c_set_74_2);
                _jettag_c_get_74_81.setTagInfo(_td_c_get_74_81);
                _jettag_c_get_74_81.doStart(context, out);
                _jettag_c_get_74_81.doEnd();
                _jettag_c_set_74_2.handleBodyContent(out);
            }
            out = _jettag_c_set_74_2_saved_out;
            _jettag_c_set_74_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_75_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_75_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_75_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_75_2.setTagInfo(_td_c_set_75_2);
            _jettag_c_set_75_2.doStart(context, out);
            JET2Writer _jettag_c_set_75_2_saved_out = out;
            while (_jettag_c_set_75_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_75_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_46.setRuntimeParent(_jettag_c_set_75_2);
                _jettag_c_get_75_46.setTagInfo(_td_c_get_75_46);
                _jettag_c_get_75_46.doStart(context, out);
                _jettag_c_get_75_46.doEnd();
                RuntimeTagElement _jettag_c_get_75_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_84.setRuntimeParent(_jettag_c_set_75_2);
                _jettag_c_get_75_84.setTagInfo(_td_c_get_75_84);
                _jettag_c_get_75_84.doStart(context, out);
                _jettag_c_get_75_84.doEnd();
                _jettag_c_set_75_2.handleBodyContent(out);
            }
            out = _jettag_c_set_75_2_saved_out;
            _jettag_c_set_75_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_76_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_76_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_76_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_76_2.setTagInfo(_td_c_set_76_2);
            _jettag_c_set_76_2.doStart(context, out);
            JET2Writer _jettag_c_set_76_2_saved_out = out;
            while (_jettag_c_set_76_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_76_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_50.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_50.setTagInfo(_td_c_get_76_50);
                _jettag_c_get_76_50.doStart(context, out);
                _jettag_c_get_76_50.doEnd();
                RuntimeTagElement _jettag_c_get_76_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_88.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_88.setTagInfo(_td_c_get_76_88);
                _jettag_c_get_76_88.doStart(context, out);
                _jettag_c_get_76_88.doEnd();
                _jettag_c_set_76_2.handleBodyContent(out);
            }
            out = _jettag_c_set_76_2_saved_out;
            _jettag_c_set_76_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_77_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_77_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_77_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_77_2.setTagInfo(_td_ws_file_77_2);
            _jettag_ws_file_77_2.doStart(context, out);
            _jettag_ws_file_77_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_78_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_78_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_78_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_78_2.setTagInfo(_td_ws_file_78_2);
            _jettag_ws_file_78_2.doStart(context, out);
            _jettag_ws_file_78_2.doEnd();
            out.write("   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Record processor 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_81_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_81_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_81_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_81_2.setTagInfo(_td_c_set_81_2);
            _jettag_c_set_81_2.doStart(context, out);
            JET2Writer _jettag_c_set_81_2_saved_out = out;
            while (_jettag_c_set_81_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_81_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_40.setRuntimeParent(_jettag_c_set_81_2);
                _jettag_c_get_81_40.setTagInfo(_td_c_get_81_40);
                _jettag_c_get_81_40.doStart(context, out);
                _jettag_c_get_81_40.doEnd();
                _jettag_c_set_81_2.handleBodyContent(out);
            }
            out = _jettag_c_set_81_2_saved_out;
            _jettag_c_set_81_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_82_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_82_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_82_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_82_2.setTagInfo(_td_c_set_82_2);
            _jettag_c_set_82_2.doStart(context, out);
            JET2Writer _jettag_c_set_82_2_saved_out = out;
            while (_jettag_c_set_82_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_82_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_43.setRuntimeParent(_jettag_c_set_82_2);
                _jettag_c_get_82_43.setTagInfo(_td_c_get_82_43);
                _jettag_c_get_82_43.doStart(context, out);
                _jettag_c_get_82_43.doEnd();
                RuntimeTagElement _jettag_c_get_82_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_81.setRuntimeParent(_jettag_c_set_82_2);
                _jettag_c_get_82_81.setTagInfo(_td_c_get_82_81);
                _jettag_c_get_82_81.doStart(context, out);
                _jettag_c_get_82_81.doEnd();
                _jettag_c_set_82_2.handleBodyContent(out);
            }
            out = _jettag_c_set_82_2_saved_out;
            _jettag_c_set_82_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_83_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_83_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_83_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_83_2.setTagInfo(_td_c_set_83_2);
            _jettag_c_set_83_2.doStart(context, out);
            JET2Writer _jettag_c_set_83_2_saved_out = out;
            while (_jettag_c_set_83_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_83_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_46.setRuntimeParent(_jettag_c_set_83_2);
                _jettag_c_get_83_46.setTagInfo(_td_c_get_83_46);
                _jettag_c_get_83_46.doStart(context, out);
                _jettag_c_get_83_46.doEnd();
                RuntimeTagElement _jettag_c_get_83_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_84.setRuntimeParent(_jettag_c_set_83_2);
                _jettag_c_get_83_84.setTagInfo(_td_c_get_83_84);
                _jettag_c_get_83_84.doStart(context, out);
                _jettag_c_get_83_84.doEnd();
                _jettag_c_set_83_2.handleBodyContent(out);
            }
            out = _jettag_c_set_83_2_saved_out;
            _jettag_c_set_83_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_84_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_84_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_84_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_84_2.setTagInfo(_td_c_set_84_2);
            _jettag_c_set_84_2.doStart(context, out);
            JET2Writer _jettag_c_set_84_2_saved_out = out;
            while (_jettag_c_set_84_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_84_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_50.setRuntimeParent(_jettag_c_set_84_2);
                _jettag_c_get_84_50.setTagInfo(_td_c_get_84_50);
                _jettag_c_get_84_50.doStart(context, out);
                _jettag_c_get_84_50.doEnd();
                RuntimeTagElement _jettag_c_get_84_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_88.setRuntimeParent(_jettag_c_set_84_2);
                _jettag_c_get_84_88.setTagInfo(_td_c_get_84_88);
                _jettag_c_get_84_88.doStart(context, out);
                _jettag_c_get_84_88.doEnd();
                _jettag_c_set_84_2.handleBodyContent(out);
            }
            out = _jettag_c_set_84_2_saved_out;
            _jettag_c_set_84_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_85_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_85_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_85_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_ws_file_85_2.setTagInfo(_td_ws_file_85_2);
            _jettag_ws_file_85_2.doStart(context, out);
            _jettag_ws_file_85_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Routing 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_88_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_88_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_88_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_88_2.setTagInfo(_td_c_set_88_2);
            _jettag_c_set_88_2.doStart(context, out);
            JET2Writer _jettag_c_set_88_2_saved_out = out;
            while (_jettag_c_set_88_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_88_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_40.setRuntimeParent(_jettag_c_set_88_2);
                _jettag_c_get_88_40.setTagInfo(_td_c_get_88_40);
                _jettag_c_get_88_40.doStart(context, out);
                _jettag_c_get_88_40.doEnd();
                _jettag_c_set_88_2.handleBodyContent(out);
            }
            out = _jettag_c_set_88_2_saved_out;
            _jettag_c_set_88_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_89_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_89_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_89_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_89_2.setTagInfo(_td_c_set_89_2);
            _jettag_c_set_89_2.doStart(context, out);
            JET2Writer _jettag_c_set_89_2_saved_out = out;
            while (_jettag_c_set_89_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_89_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_43.setRuntimeParent(_jettag_c_set_89_2);
                _jettag_c_get_89_43.setTagInfo(_td_c_get_89_43);
                _jettag_c_get_89_43.doStart(context, out);
                _jettag_c_get_89_43.doEnd();
                RuntimeTagElement _jettag_c_get_89_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_81.setRuntimeParent(_jettag_c_set_89_2);
                _jettag_c_get_89_81.setTagInfo(_td_c_get_89_81);
                _jettag_c_get_89_81.doStart(context, out);
                _jettag_c_get_89_81.doEnd();
                _jettag_c_set_89_2.handleBodyContent(out);
            }
            out = _jettag_c_set_89_2_saved_out;
            _jettag_c_set_89_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_90_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_90_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_90_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_90_2.setTagInfo(_td_c_set_90_2);
            _jettag_c_set_90_2.doStart(context, out);
            JET2Writer _jettag_c_set_90_2_saved_out = out;
            while (_jettag_c_set_90_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_90_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_46.setRuntimeParent(_jettag_c_set_90_2);
                _jettag_c_get_90_46.setTagInfo(_td_c_get_90_46);
                _jettag_c_get_90_46.doStart(context, out);
                _jettag_c_get_90_46.doEnd();
                RuntimeTagElement _jettag_c_get_90_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_84.setRuntimeParent(_jettag_c_set_90_2);
                _jettag_c_get_90_84.setTagInfo(_td_c_get_90_84);
                _jettag_c_get_90_84.doStart(context, out);
                _jettag_c_get_90_84.doEnd();
                _jettag_c_set_90_2.handleBodyContent(out);
            }
            out = _jettag_c_set_90_2_saved_out;
            _jettag_c_set_90_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_91_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_91_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_91_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_set_91_2.setTagInfo(_td_c_set_91_2);
            _jettag_c_set_91_2.doStart(context, out);
            JET2Writer _jettag_c_set_91_2_saved_out = out;
            while (_jettag_c_set_91_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_91_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_91_50.setRuntimeParent(_jettag_c_set_91_2);
                _jettag_c_get_91_50.setTagInfo(_td_c_get_91_50);
                _jettag_c_get_91_50.doStart(context, out);
                _jettag_c_get_91_50.doEnd();
                RuntimeTagElement _jettag_c_get_91_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_91_88.setRuntimeParent(_jettag_c_set_91_2);
                _jettag_c_get_91_88.setTagInfo(_td_c_get_91_88);
                _jettag_c_get_91_88.doStart(context, out);
                _jettag_c_get_91_88.doEnd();
                _jettag_c_set_91_2.handleBodyContent(out);
            }
            out = _jettag_c_set_91_2_saved_out;
            _jettag_c_set_91_2.doEnd();
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_93_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_93_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_93_2.setRuntimeParent(_jettag_ws_project_51_1);
            _jettag_c_choose_93_2.setTagInfo(_td_c_choose_93_2);
            _jettag_c_choose_93_2.doStart(context, out);
            JET2Writer _jettag_c_choose_93_2_saved_out = out;
            while (_jettag_c_choose_93_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_94_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_94_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_94_3.setRuntimeParent(_jettag_c_choose_93_2);
                _jettag_c_when_94_3.setTagInfo(_td_c_when_94_3);
                _jettag_c_when_94_3.doStart(context, out);
                JET2Writer _jettag_c_when_94_3_saved_out = out;
                while (_jettag_c_when_94_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t  \t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_95_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_95_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_95_6.setRuntimeParent(_jettag_c_when_94_3);
                    _jettag_ws_file_95_6.setTagInfo(_td_ws_file_95_6);
                    _jettag_ws_file_95_6.doStart(context, out);
                    _jettag_ws_file_95_6.doEnd();
                    out.write(NL);         
                    out.write("\t  \t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_96_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_96_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_96_6.setRuntimeParent(_jettag_c_when_94_3);
                    _jettag_ws_file_96_6.setTagInfo(_td_ws_file_96_6);
                    _jettag_ws_file_96_6.doStart(context, out);
                    _jettag_ws_file_96_6.doEnd();
                    out.write(NL);         
                    _jettag_c_when_94_3.handleBodyContent(out);
                }
                out = _jettag_c_when_94_3_saved_out;
                _jettag_c_when_94_3.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_when_99_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_99_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_99_3.setRuntimeParent(_jettag_c_choose_93_2);
                _jettag_c_when_99_3.setTagInfo(_td_c_when_99_3);
                _jettag_c_when_99_3.doStart(context, out);
                JET2Writer _jettag_c_when_99_3_saved_out = out;
                while (_jettag_c_when_99_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t    \t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_100_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_100_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_100_7.setRuntimeParent(_jettag_c_when_99_3);
                    _jettag_ws_file_100_7.setTagInfo(_td_ws_file_100_7);
                    _jettag_ws_file_100_7.doStart(context, out);
                    _jettag_ws_file_100_7.doEnd();
                    out.write(NL);         
                    out.write("\t    \t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_102_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_102_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_102_7.setRuntimeParent(_jettag_c_when_99_3);
                    _jettag_ws_file_102_7.setTagInfo(_td_ws_file_102_7);
                    _jettag_ws_file_102_7.doStart(context, out);
                    _jettag_ws_file_102_7.doEnd();
                    out.write(NL);         
                    out.write("\t   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_choose_105_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_105_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_105_4.setRuntimeParent(_jettag_c_when_99_3);
                    _jettag_c_choose_105_4.setTagInfo(_td_c_choose_105_4);
                    _jettag_c_choose_105_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_105_4_saved_out = out;
                    while (_jettag_c_choose_105_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_106_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_106_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_106_5.setRuntimeParent(_jettag_c_choose_105_4);
                        _jettag_c_when_106_5.setTagInfo(_td_c_when_106_5);
                        _jettag_c_when_106_5.doStart(context, out);
                        JET2Writer _jettag_c_when_106_5_saved_out = out;
                        while (_jettag_c_when_106_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_ws_file_107_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_107_6); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_ws_file_107_6.setRuntimeParent(_jettag_c_when_106_5);
                            _jettag_ws_file_107_6.setTagInfo(_td_ws_file_107_6);
                            _jettag_ws_file_107_6.doStart(context, out);
                            _jettag_ws_file_107_6.doEnd();
                            out.write(NL);         
                            _jettag_c_when_106_5.handleBodyContent(out);
                        }
                        out = _jettag_c_when_106_5_saved_out;
                        _jettag_c_when_106_5.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_110_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_110_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_110_5.setRuntimeParent(_jettag_c_choose_105_4);
                        _jettag_c_otherwise_110_5.setTagInfo(_td_c_otherwise_110_5);
                        _jettag_c_otherwise_110_5.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_110_5_saved_out = out;
                        while (_jettag_c_otherwise_110_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t   \t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_ws_file_111_9 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_111_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_ws_file_111_9.setRuntimeParent(_jettag_c_otherwise_110_5);
                            _jettag_ws_file_111_9.setTagInfo(_td_ws_file_111_9);
                            _jettag_ws_file_111_9.doStart(context, out);
                            _jettag_ws_file_111_9.doEnd();
                            out.write(NL);         
                            _jettag_c_otherwise_110_5.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_110_5_saved_out;
                        _jettag_c_otherwise_110_5.doEnd();
                        _jettag_c_choose_105_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_105_4_saved_out;
                    _jettag_c_choose_105_4.doEnd();
                    _jettag_c_when_99_3.handleBodyContent(out);
                }
                out = _jettag_c_when_99_3_saved_out;
                _jettag_c_when_99_3.doEnd();
                RuntimeTagElement _jettag_c_otherwise_116_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_116_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_116_3.setRuntimeParent(_jettag_c_choose_93_2);
                _jettag_c_otherwise_116_3.setTagInfo(_td_c_otherwise_116_3);
                _jettag_c_otherwise_116_3.doStart(context, out);
                JET2Writer _jettag_c_otherwise_116_3_saved_out = out;
                while (_jettag_c_otherwise_116_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_117_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_117_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_117_4.setRuntimeParent(_jettag_c_otherwise_116_3);
                    _jettag_ws_file_117_4.setTagInfo(_td_ws_file_117_4);
                    _jettag_ws_file_117_4.doStart(context, out);
                    _jettag_ws_file_117_4.doEnd();
                    out.write(NL);         
                    _jettag_c_otherwise_116_3.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_116_3_saved_out;
                _jettag_c_otherwise_116_3.doEnd();
                _jettag_c_choose_93_2.handleBodyContent(out);
            }
            out = _jettag_c_choose_93_2_saved_out;
            _jettag_c_choose_93_2.doEnd();
            _jettag_ws_project_51_1.handleBodyContent(out);
        }
        _jettag_ws_project_51_1.doEnd();
    }
}
