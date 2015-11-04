package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_RecordDistributormsgflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_RecordDistributormsgflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_9_11 = new TagInfo("c:get", //$NON-NLS-1$
            9, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_49 = new TagInfo("c:get", //$NON-NLS-1$
            9, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_6 = new TagInfo("c:get", //$NON-NLS-1$
            10, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_44 = new TagInfo("c:get", //$NON-NLS-1$
            10, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_1 = new TagInfo("c:if", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_11 = new TagInfo("c:get", //$NON-NLS-1$
            12, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_49 = new TagInfo("c:get", //$NON-NLS-1$
            12, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_6 = new TagInfo("c:get", //$NON-NLS-1$
            13, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_44 = new TagInfo("c:get", //$NON-NLS-1$
            13, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_11 = new TagInfo("c:get", //$NON-NLS-1$
            15, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_49 = new TagInfo("c:get", //$NON-NLS-1$
            15, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_6 = new TagInfo("c:get", //$NON-NLS-1$
            16, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_44 = new TagInfo("c:get", //$NON-NLS-1$
            16, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_11 = new TagInfo("c:get", //$NON-NLS-1$
            17, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_49 = new TagInfo("c:get", //$NON-NLS-1$
            17, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_6 = new TagInfo("c:get", //$NON-NLS-1$
            18, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_44 = new TagInfo("c:get", //$NON-NLS-1$
            18, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_12 = new TagInfo("c:get", //$NON-NLS-1$
            22, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_15 = new TagInfo("c:get", //$NON-NLS-1$
            23, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_5 = new TagInfo("c:if", //$NON-NLS-1$
            26, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_1 = new TagInfo("c:if", //$NON-NLS-1$
            32, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_10 = new TagInfo("c:get", //$NON-NLS-1$
            40, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_17 = new TagInfo("c:get", //$NON-NLS-1$
            41, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_15 = new TagInfo("c:get", //$NON-NLS-1$
            42, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_36 = new TagInfo("c:get", //$NON-NLS-1$
            44, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_90 = new TagInfo("c:get", //$NON-NLS-1$
            44, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_36 = new TagInfo("c:get", //$NON-NLS-1$
            46, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_90 = new TagInfo("c:get", //$NON-NLS-1$
            46, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordDistributor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_62 = new TagInfo("c:get", //$NON-NLS-1$
            47, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_26 = new TagInfo("c:get", //$NON-NLS-1$
            49, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_71 = new TagInfo("c:get", //$NON-NLS-1$
            49, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_15 = new TagInfo("c:get", //$NON-NLS-1$
            50, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_33 = new TagInfo("c:get", //$NON-NLS-1$
            51, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_36 = new TagInfo("c:get", //$NON-NLS-1$
            52, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_24 = new TagInfo("c:get", //$NON-NLS-1$
            56, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_62 = new TagInfo("c:get", //$NON-NLS-1$
            56, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@recordProcessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_33 = new TagInfo("c:get", //$NON-NLS-1$
            62, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_24 = new TagInfo("c:get", //$NON-NLS-1$
            66, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_62 = new TagInfo("c:get", //$NON-NLS-1$
            66, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_24 = new TagInfo("c:get", //$NON-NLS-1$
            70, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_62 = new TagInfo("c:get", //$NON-NLS-1$
            70, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@route", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_74_1 = new TagInfo("c:choose", //$NON-NLS-1$
            74, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_76_1 = new TagInfo("c:when", //$NON-NLS-1$
            76, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'specifyRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_25 = new TagInfo("c:get", //$NON-NLS-1$
            79, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/defaultQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_18 = new TagInfo("c:get", //$NON-NLS-1$
            80, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_55 = new TagInfo("c:get", //$NON-NLS-1$
            80, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/defaultQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_92 = new TagInfo("c:get", //$NON-NLS-1$
            80, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_86_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            86, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_87_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            87, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "108", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_88_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            88, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_89_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            89, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_90_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            90, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "yCoord", //$NON-NLS-1$
                "$yCoord+50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_82 = new TagInfo("c:get", //$NON-NLS-1$
            93, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_15 = new TagInfo("c:get", //$NON-NLS-1$
            94, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$yCoord", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_19 = new TagInfo("c:get", //$NON-NLS-1$
            95, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/queueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_12 = new TagInfo("c:get", //$NON-NLS-1$
            96, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_49 = new TagInfo("c:get", //$NON-NLS-1$
            96, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$curOutput/queue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_85 = new TagInfo("c:get", //$NON-NLS-1$
            96, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_15 = new TagInfo("c:get", //$NON-NLS-1$
            99, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_109_1 = new TagInfo("c:when", //$NON-NLS-1$
            109, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_25 = new TagInfo("c:get", //$NON-NLS-1$
            111, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/defaultQueueManagerLookupRoutes", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_18 = new TagInfo("c:get", //$NON-NLS-1$
            112, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_55 = new TagInfo("c:get", //$NON-NLS-1$
            112, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/defaultQueueLookupRoutes", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_104 = new TagInfo("c:get", //$NON-NLS-1$
            112, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_124_1 = new TagInfo("c:if", //$NON-NLS-1$
            124, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/cacheRefresh = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_126_60 = new TagInfo("c:get", //$NON-NLS-1$
            126, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_12 = new TagInfo("c:get", //$NON-NLS-1$
            131, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_49 = new TagInfo("c:get", //$NON-NLS-1$
            131, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/refreshQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_87 = new TagInfo("c:get", //$NON-NLS-1$
            131, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_136_1 = new TagInfo("c:when", //$NON-NLS-1$
            136, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'noRouting'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_20 = new TagInfo("c:get", //$NON-NLS-1$
            141, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/outputQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_13 = new TagInfo("c:get", //$NON-NLS-1$
            142, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_50 = new TagInfo("c:get", //$NON-NLS-1$
            142, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/outputQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_87 = new TagInfo("c:get", //$NON-NLS-1$
            142, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_23 = new TagInfo("c:get", //$NON-NLS-1$
            152, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/directory", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_153_24 = new TagInfo("c:get", //$NON-NLS-1$
            153, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/filePattern", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_156_1 = new TagInfo("c:if", //$NON-NLS-1$
            156, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/useftp = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_22 = new TagInfo("c:get", //$NON-NLS-1$
            158, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/ftpConfigurableSvc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_162_1 = new TagInfo("c:if", //$NON-NLS-1$
            162, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/CCSID > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_32 = new TagInfo("c:get", //$NON-NLS-1$
            163, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/CCSID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_165_1 = new TagInfo("c:if", //$NON-NLS-1$
            165, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/encoding> 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_33 = new TagInfo("c:get", //$NON-NLS-1$
            166, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/encoding", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_169_1 = new TagInfo("c:choose", //$NON-NLS-1$
            169, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_171_1 = new TagInfo("c:when", //$NON-NLS-1$
            171, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'fixedLength'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_22 = new TagInfo("c:get", //$NON-NLS-1$
            174, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordLength", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_179_1 = new TagInfo("c:when", //$NON-NLS-1$
            179, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'delimited'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_182_1 = new TagInfo("c:if", //$NON-NLS-1$
            182, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/recordDelimiter)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_183_1 = new TagInfo("c:if", //$NON-NLS-1$
            183, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/recordDelimiter) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_184_58 = new TagInfo("c:get", //$NON-NLS-1$
            184, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDelimiter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_189_1 = new TagInfo("c:when", //$NON-NLS-1$
            189, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'xmlDelimited'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_193_1 = new TagInfo("c:if", //$NON-NLS-1$
            193, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/recordDelimiter)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_1 = new TagInfo("c:if", //$NON-NLS-1$
            194, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/recordDelimiter) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_58 = new TagInfo("c:get", //$NON-NLS-1$
            195, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDelimiter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_199_1 = new TagInfo("c:when", //$NON-NLS-1$
            199, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'xmlParsed'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_203_25 = new TagInfo("c:get", //$NON-NLS-1$
            203, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/messageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_205_1 = new TagInfo("c:when", //$NON-NLS-1$
            205, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/recordDetect = 'parsed'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_209_27 = new TagInfo("c:get", //$NON-NLS-1$
            209, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "substring-after(substring-after($root/messageSet,'/'),'/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_210_25 = new TagInfo("c:get", //$NON-NLS-1$
            210, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/messageFormat", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_211_23 = new TagInfo("c:get", //$NON-NLS-1$
            211, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/messageType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_217_1 = new TagInfo("c:if", //$NON-NLS-1$
            217, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_24 = new TagInfo("c:get", //$NON-NLS-1$
            218, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_62 = new TagInfo("c:get", //$NON-NLS-1$
            218, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_223_34 = new TagInfo("c:get", //$NON-NLS-1$
            223, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_232_1 = new TagInfo("c:choose", //$NON-NLS-1$
            232, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_233_1 = new TagInfo("c:when", //$NON-NLS-1$
            233, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_239_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            239, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_246_1 = new TagInfo("c:if", //$NON-NLS-1$
            246, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_251_1 = new TagInfo("c:choose", //$NON-NLS-1$
            251, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_253_1 = new TagInfo("c:when", //$NON-NLS-1$
            253, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'specifyRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_256_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            256, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_257_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            257, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/routeTable/row", //$NON-NLS-1$
                "curOutput", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_258_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            258, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "outputCount", //$NON-NLS-1$
                "$outputCount+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_259_69 = new TagInfo("c:get", //$NON-NLS-1$
            259, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_36 = new TagInfo("c:get", //$NON-NLS-1$
            260, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_261_45 = new TagInfo("c:get", //$NON-NLS-1$
            261, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$outputCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_267_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            267, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_273_1 = new TagInfo("c:if", //$NON-NLS-1$
            273, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/routing = 'lookupRoutes'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_277_4 = new TagInfo("c:if", //$NON-NLS-1$
            277, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/cacheRefresh = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_290_1 = new TagInfo("c:if", //$NON-NLS-1$
            290, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_293_23 = new TagInfo("c:get", //$NON-NLS-1$
            293, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_294_21 = new TagInfo("c:get", //$NON-NLS-1$
            294, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_296_1 = new TagInfo("c:if", //$NON-NLS-1$
            296, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_299_19 = new TagInfo("c:get", //$NON-NLS-1$
            299, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_300_19 = new TagInfo("c:get", //$NON-NLS-1$
            300, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_303_1 = new TagInfo("c:if", //$NON-NLS-1$
            303, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmDatabase.msgnode=\"ComIbmDatabase.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFileInput.msgnode=\"ComIbmFileInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQInput.msgnode=\"ComIbmMQInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_11.setRuntimeParent(null);
        _jettag_c_get_9_11.setTagInfo(_td_c_get_9_11);
        _jettag_c_get_9_11.doStart(context, out);
        _jettag_c_get_9_11.doEnd();
        RuntimeTagElement _jettag_c_get_9_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_49.setRuntimeParent(null);
        _jettag_c_get_9_49.setTagInfo(_td_c_get_9_49);
        _jettag_c_get_9_49.doStart(context, out);
        _jettag_c_get_9_49.doEnd();
        out.write(".subflow =");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_6.setRuntimeParent(null);
        _jettag_c_get_10_6.setTagInfo(_td_c_get_10_6);
        _jettag_c_get_10_6.doStart(context, out);
        _jettag_c_get_10_6.doEnd();
        RuntimeTagElement _jettag_c_get_10_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_44.setRuntimeParent(null);
        _jettag_c_get_10_44.setTagInfo(_td_c_get_10_44);
        _jettag_c_get_10_44.doStart(context, out);
        _jettag_c_get_10_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_11_1.setRuntimeParent(null);
        _jettag_c_if_11_1.setTagInfo(_td_c_if_11_1);
        _jettag_c_if_11_1.doStart(context, out);
        while (_jettag_c_if_11_1.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_11.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_get_12_11.setTagInfo(_td_c_get_12_11);
            _jettag_c_get_12_11.doStart(context, out);
            _jettag_c_get_12_11.doEnd();
            RuntimeTagElement _jettag_c_get_12_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_49.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_get_12_49.setTagInfo(_td_c_get_12_49);
            _jettag_c_get_12_49.doStart(context, out);
            _jettag_c_get_12_49.doEnd();
            out.write(".subflow =");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_6.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_get_13_6.setTagInfo(_td_c_get_13_6);
            _jettag_c_get_13_6.doStart(context, out);
            _jettag_c_get_13_6.doEnd();
            RuntimeTagElement _jettag_c_get_13_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_44.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_get_13_44.setTagInfo(_td_c_get_13_44);
            _jettag_c_get_13_44.doStart(context, out);
            _jettag_c_get_13_44.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_11_1.handleBodyContent(out);
        }
        _jettag_c_if_11_1.doEnd();
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_11.setRuntimeParent(null);
        _jettag_c_get_15_11.setTagInfo(_td_c_get_15_11);
        _jettag_c_get_15_11.doStart(context, out);
        _jettag_c_get_15_11.doEnd();
        RuntimeTagElement _jettag_c_get_15_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_49.setRuntimeParent(null);
        _jettag_c_get_15_49.setTagInfo(_td_c_get_15_49);
        _jettag_c_get_15_49.doStart(context, out);
        _jettag_c_get_15_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_6.setRuntimeParent(null);
        _jettag_c_get_16_6.setTagInfo(_td_c_get_16_6);
        _jettag_c_get_16_6.doStart(context, out);
        _jettag_c_get_16_6.doEnd();
        RuntimeTagElement _jettag_c_get_16_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_44.setRuntimeParent(null);
        _jettag_c_get_16_44.setTagInfo(_td_c_get_16_44);
        _jettag_c_get_16_44.doStart(context, out);
        _jettag_c_get_16_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_11.setRuntimeParent(null);
        _jettag_c_get_17_11.setTagInfo(_td_c_get_17_11);
        _jettag_c_get_17_11.doStart(context, out);
        _jettag_c_get_17_11.doEnd();
        RuntimeTagElement _jettag_c_get_17_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_49.setRuntimeParent(null);
        _jettag_c_get_17_49.setTagInfo(_td_c_get_17_49);
        _jettag_c_get_17_49.doStart(context, out);
        _jettag_c_get_17_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_6.setRuntimeParent(null);
        _jettag_c_get_18_6.setTagInfo(_td_c_get_18_6);
        _jettag_c_get_18_6.doStart(context, out);
        _jettag_c_get_18_6.doEnd();
        RuntimeTagElement _jettag_c_get_18_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_44.setRuntimeParent(null);
        _jettag_c_get_18_44.setTagInfo(_td_c_get_18_44);
        _jettag_c_get_18_44.doStart(context, out);
        _jettag_c_get_18_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_12.setRuntimeParent(null);
        _jettag_c_get_22_12.setTagInfo(_td_c_get_22_12);
        _jettag_c_get_22_12.doStart(context, out);
        _jettag_c_get_22_12.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_15.setRuntimeParent(null);
        _jettag_c_get_23_15.setTagInfo(_td_c_get_23_15);
        _jettag_c_get_23_15.doStart(context, out);
        _jettag_c_get_23_15.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_26_5.setRuntimeParent(null);
        _jettag_c_if_26_5.setTagInfo(_td_c_if_26_5);
        _jettag_c_if_26_5.doStart(context, out);
        while (_jettag_c_if_26_5.okToProcessBody()) {
            out.write("\t<eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tname=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_26_5.handleBodyContent(out);
        }
        _jettag_c_if_26_5.doEnd();
        RuntimeTagElement _jettag_c_if_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_32_1.setRuntimeParent(null);
        _jettag_c_if_32_1.setTagInfo(_td_c_if_32_1);
        _jettag_c_if_32_1.doStart(context, out);
        while (_jettag_c_if_32_1.okToProcessBody()) {
            out.write("\t<eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.LoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tname=\"LoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_32_1.handleBodyContent(out);
        }
        _jettag_c_if_32_1.doEnd();
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_10.setRuntimeParent(null);
        _jettag_c_get_40_10.setTagInfo(_td_c_get_40_10);
        _jettag_c_get_40_10.doStart(context, out);
        _jettag_c_get_40_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_17.setRuntimeParent(null);
        _jettag_c_get_41_17.setTagInfo(_td_c_get_41_17);
        _jettag_c_get_41_17.doStart(context, out);
        _jettag_c_get_41_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_15.setRuntimeParent(null);
        _jettag_c_get_42_15.setTagInfo(_td_c_get_42_15);
        _jettag_c_get_42_15.doStart(context, out);
        _jettag_c_get_42_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_36.setRuntimeParent(null);
        _jettag_c_get_44_36.setTagInfo(_td_c_get_44_36);
        _jettag_c_get_44_36.doStart(context, out);
        _jettag_c_get_44_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_90.setRuntimeParent(null);
        _jettag_c_get_44_90.setTagInfo(_td_c_get_44_90);
        _jettag_c_get_44_90.doStart(context, out);
        _jettag_c_get_44_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_36.setRuntimeParent(null);
        _jettag_c_get_46_36.setTagInfo(_td_c_get_46_36);
        _jettag_c_get_46_36.doStart(context, out);
        _jettag_c_get_46_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_90.setRuntimeParent(null);
        _jettag_c_get_46_90.setTagInfo(_td_c_get_46_90);
        _jettag_c_get_46_90.doStart(context, out);
        _jettag_c_get_46_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_62.setRuntimeParent(null);
        _jettag_c_get_47_62.setTagInfo(_td_c_get_47_62);
        _jettag_c_get_47_62.doStart(context, out);
        _jettag_c_get_47_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_26.setRuntimeParent(null);
        _jettag_c_get_49_26.setTagInfo(_td_c_get_49_26);
        _jettag_c_get_49_26.doStart(context, out);
        _jettag_c_get_49_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_71.setRuntimeParent(null);
        _jettag_c_get_49_71.setTagInfo(_td_c_get_49_71);
        _jettag_c_get_49_71.doStart(context, out);
        _jettag_c_get_49_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_15.setRuntimeParent(null);
        _jettag_c_get_50_15.setTagInfo(_td_c_get_50_15);
        _jettag_c_get_50_15.doStart(context, out);
        _jettag_c_get_50_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_33.setRuntimeParent(null);
        _jettag_c_get_51_33.setTagInfo(_td_c_get_51_33);
        _jettag_c_get_51_33.doStart(context, out);
        _jettag_c_get_51_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_36.setRuntimeParent(null);
        _jettag_c_get_52_36.setTagInfo(_td_c_get_52_36);
        _jettag_c_get_52_36.doStart(context, out);
        _jettag_c_get_52_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_24.setRuntimeParent(null);
        _jettag_c_get_56_24.setTagInfo(_td_c_get_56_24);
        _jettag_c_get_56_24.doStart(context, out);
        _jettag_c_get_56_24.doEnd();
        RuntimeTagElement _jettag_c_get_56_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_62.setRuntimeParent(null);
        _jettag_c_get_56_62.setTagInfo(_td_c_get_56_62);
        _jettag_c_get_56_62.doStart(context, out);
        _jettag_c_get_56_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"198,46\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Record Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_60_1.setRuntimeParent(null);
        _jettag_c_if_60_1.setTagInfo(_td_c_if_60_1);
        _jettag_c_if_60_1.doStart(context, out);
        while (_jettag_c_if_60_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_5\" location=\"233,231\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      statement=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_33.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_62_33.setTagInfo(_td_c_get_62_33);
            _jettag_c_get_62_33.doStart(context, out);
            _jettag_c_get_62_33.doEnd();
            out.write("SaveUDPs.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Save UDPs\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_60_1.handleBodyContent(out);
        }
        _jettag_c_if_60_1.doEnd();
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_24.setRuntimeParent(null);
        _jettag_c_get_66_24.setTagInfo(_td_c_get_66_24);
        _jettag_c_get_66_24.doStart(context, out);
        _jettag_c_get_66_24.doEnd();
        RuntimeTagElement _jettag_c_get_66_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_62.setRuntimeParent(null);
        _jettag_c_get_66_62.setTagInfo(_td_c_get_66_62);
        _jettag_c_get_66_62.doStart(context, out);
        _jettag_c_get_66_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"365,231\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\" Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_70_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_70_24.setRuntimeParent(null);
        _jettag_c_get_70_24.setTagInfo(_td_c_get_70_24);
        _jettag_c_get_70_24.doStart(context, out);
        _jettag_c_get_70_24.doEnd();
        RuntimeTagElement _jettag_c_get_70_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_70_62.setRuntimeParent(null);
        _jettag_c_get_70_62.setTagInfo(_td_c_get_70_62);
        _jettag_c_get_70_62.doStart(context, out);
        _jettag_c_get_70_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_100\" location=\"385,46\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Routing\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_74_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_74_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_74_1.setRuntimeParent(null);
        _jettag_c_choose_74_1.setTagInfo(_td_c_choose_74_1);
        _jettag_c_choose_74_1.doStart(context, out);
        JET2Writer _jettag_c_choose_74_1_saved_out = out;
        while (_jettag_c_choose_74_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            // specify routes 
            RuntimeTagElement _jettag_c_when_76_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_76_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_76_1.setRuntimeParent(_jettag_c_choose_74_1);
            _jettag_c_when_76_1.setTagInfo(_td_c_when_76_1);
            _jettag_c_when_76_1.doStart(context, out);
            JET2Writer _jettag_c_when_76_1_saved_out = out;
            while (_jettag_c_when_76_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Add the default output node 
                out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"664,47\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueManagerName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_79_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_25.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_get_79_25.setTagInfo(_td_c_get_79_25);
                _jettag_c_get_79_25.doStart(context, out);
                _jettag_c_get_79_25.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_80_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_18.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_get_80_18.setTagInfo(_td_c_get_80_18);
                _jettag_c_get_80_18.doStart(context, out);
                _jettag_c_get_80_18.doEnd();
                RuntimeTagElement _jettag_c_get_80_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_55.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_get_80_55.setTagInfo(_td_c_get_80_55);
                _jettag_c_get_80_55.doStart(context, out);
                _jettag_c_get_80_55.doEnd();
                RuntimeTagElement _jettag_c_get_80_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_92); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_92.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_get_80_92.setTagInfo(_td_c_get_80_92);
                _jettag_c_get_80_92.doStart(context, out);
                _jettag_c_get_80_92.doEnd();
                out.write("\" >");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Default Destination\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                // Add the variable number of output for subflow routeRoute 
                out.write("      ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_86_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_86_1.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_setVariable_86_1.setTagInfo(_td_c_setVariable_86_1);
                _jettag_c_setVariable_86_1.doStart(context, out);
                _jettag_c_setVariable_86_1.doEnd();
                RuntimeTagElement _jettag_c_setVariable_87_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_87_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_87_1.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_setVariable_87_1.setTagInfo(_td_c_setVariable_87_1);
                _jettag_c_setVariable_87_1.doStart(context, out);
                _jettag_c_setVariable_87_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_88_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_88_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_88_1.setRuntimeParent(_jettag_c_when_76_1);
                _jettag_c_iterate_88_1.setTagInfo(_td_c_iterate_88_1);
                _jettag_c_iterate_88_1.doStart(context, out);
                while (_jettag_c_iterate_88_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_89_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_89_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_89_1.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_setVariable_89_1.setTagInfo(_td_c_setVariable_89_1);
                    _jettag_c_setVariable_89_1.doStart(context, out);
                    _jettag_c_setVariable_89_1.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_90_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_90_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_90_1.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_setVariable_90_1.setTagInfo(_td_c_setVariable_90_1);
                    _jettag_c_setVariable_90_1.doStart(context, out);
                    _jettag_c_setVariable_90_1.doEnd();
                    out.write(NL);         
                    out.write(NL);         
                    out.write("<nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_10");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_93_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_93_82.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_93_82.setTagInfo(_td_c_get_93_82);
                    _jettag_c_get_93_82.doStart(context, out);
                    _jettag_c_get_93_82.doEnd();
                    out.write("\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("location=\"670,");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_94_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_94_15.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_94_15.setTagInfo(_td_c_get_94_15);
                    _jettag_c_get_94_15.doStart(context, out);
                    _jettag_c_get_94_15.doEnd();
                    out.write("\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("queueManagerName=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_95_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_95_19.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_95_19.setTagInfo(_td_c_get_95_19);
                    _jettag_c_get_95_19.doStart(context, out);
                    _jettag_c_get_95_19.doEnd();
                    out.write("\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("queueName=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_96_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_12.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_96_12.setTagInfo(_td_c_get_96_12);
                    _jettag_c_get_96_12.doStart(context, out);
                    _jettag_c_get_96_12.doEnd();
                    RuntimeTagElement _jettag_c_get_96_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_49.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_96_49.setTagInfo(_td_c_get_96_49);
                    _jettag_c_get_96_49.doStart(context, out);
                    _jettag_c_get_96_49.doEnd();
                    RuntimeTagElement _jettag_c_get_96_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_85.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_96_85.setTagInfo(_td_c_get_96_85);
                    _jettag_c_get_96_85.doStart(context, out);
                    _jettag_c_get_96_85.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("transactionMode=\"yes\" persistenceMode=\"yes\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("<translation xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("string=\"Output");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_99_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_99_15.setRuntimeParent(_jettag_c_iterate_88_1);
                    _jettag_c_get_99_15.setTagInfo(_td_c_get_99_15);
                    _jettag_c_get_99_15.doStart(context, out);
                    _jettag_c_get_99_15.doEnd();
                    out.write("\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("</nodes> ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_iterate_88_1.handleBodyContent(out);
                }
                _jettag_c_iterate_88_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                _jettag_c_when_76_1.handleBodyContent(out);
            }
            out = _jettag_c_when_76_1_saved_out;
            _jettag_c_when_76_1.doEnd();
            // lookup routes 
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_109_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_109_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_109_1.setRuntimeParent(_jettag_c_choose_74_1);
            _jettag_c_when_109_1.setTagInfo(_td_c_when_109_1);
            _jettag_c_when_109_1.doStart(context, out);
            JET2Writer _jettag_c_when_109_1_saved_out = out;
            while (_jettag_c_when_109_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"664,47\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueManagerName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_111_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_25.setRuntimeParent(_jettag_c_when_109_1);
                _jettag_c_get_111_25.setTagInfo(_td_c_get_111_25);
                _jettag_c_get_111_25.doStart(context, out);
                _jettag_c_get_111_25.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      queueName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_112_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_18.setRuntimeParent(_jettag_c_when_109_1);
                _jettag_c_get_112_18.setTagInfo(_td_c_get_112_18);
                _jettag_c_get_112_18.doStart(context, out);
                _jettag_c_get_112_18.doEnd();
                RuntimeTagElement _jettag_c_get_112_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_55.setRuntimeParent(_jettag_c_when_109_1);
                _jettag_c_get_112_55.setTagInfo(_td_c_get_112_55);
                _jettag_c_get_112_55.doStart(context, out);
                _jettag_c_get_112_55.doEnd();
                RuntimeTagElement _jettag_c_get_112_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_104); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_104.setRuntimeParent(_jettag_c_when_109_1);
                _jettag_c_get_112_104.setTagInfo(_td_c_get_112_104);
                _jettag_c_get_112_104.doStart(context, out);
                _jettag_c_get_112_104.doEnd();
                out.write("\" >");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Default Destination\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_101\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("location=\"680,208\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("queueManagerName=\"\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("queueName=\"\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("destinationMode=\"list\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("transactionMode=\"yes\" persistenceMode=\"yes\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        string=\"Output Message\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</nodes> ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_124_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_124_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_124_1.setRuntimeParent(_jettag_c_when_109_1);
                _jettag_c_if_124_1.setTagInfo(_td_c_if_124_1);
                _jettag_c_if_124_1.doStart(context, out);
                while (_jettag_c_if_124_1.okToProcessBody()) {
                    out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_53\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("      location=\"329,356\" computeExpression=\"esql://routine/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_126_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_126_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_126_60.setRuntimeParent(_jettag_c_if_124_1);
                    _jettag_c_get_126_60.setTagInfo(_td_c_get_126_60);
                    _jettag_c_get_126_60.doStart(context, out);
                    _jettag_c_get_126_60.doEnd();
                    out.write("Invalidatecache.Main\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Invalidate Cache\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("</nodes>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("<nodes xmi:type=\"ComIbmMQInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_54\" location=\"30,357\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("queueName=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_131_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_12.setRuntimeParent(_jettag_c_if_124_1);
                    _jettag_c_get_131_12.setTagInfo(_td_c_get_131_12);
                    _jettag_c_get_131_12.doStart(context, out);
                    _jettag_c_get_131_12.doEnd();
                    RuntimeTagElement _jettag_c_get_131_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_49.setRuntimeParent(_jettag_c_if_124_1);
                    _jettag_c_get_131_49.setTagInfo(_td_c_get_131_49);
                    _jettag_c_get_131_49.doStart(context, out);
                    _jettag_c_get_131_49.doEnd();
                    RuntimeTagElement _jettag_c_get_131_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_87); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_87.setRuntimeParent(_jettag_c_if_124_1);
                    _jettag_c_get_131_87.setTagInfo(_td_c_get_131_87);
                    _jettag_c_get_131_87.doStart(context, out);
                    _jettag_c_get_131_87.doEnd();
                    out.write("\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trigger Cache Refresh\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("</nodes>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_124_1.handleBodyContent(out);
                }
                _jettag_c_if_124_1.doEnd();
                _jettag_c_when_109_1.handleBodyContent(out);
            }
            out = _jettag_c_when_109_1_saved_out;
            _jettag_c_when_109_1.doEnd();
            RuntimeTagElement _jettag_c_when_136_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_136_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_136_1.setRuntimeParent(_jettag_c_choose_74_1);
            _jettag_c_when_136_1.setTagInfo(_td_c_when_136_1);
            _jettag_c_when_136_1.doStart(context, out);
            JET2Writer _jettag_c_when_136_1_saved_out = out;
            while (_jettag_c_when_136_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write(NL);         
                out.write("\t<nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_101\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tlocation=\"728,210\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tqueueManagerName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_141_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_20.setRuntimeParent(_jettag_c_when_136_1);
                _jettag_c_get_141_20.setTagInfo(_td_c_get_141_20);
                _jettag_c_get_141_20.doStart(context, out);
                _jettag_c_get_141_20.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tqueueName=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_142_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_142_13.setRuntimeParent(_jettag_c_when_136_1);
                _jettag_c_get_142_13.setTagInfo(_td_c_get_142_13);
                _jettag_c_get_142_13.doStart(context, out);
                _jettag_c_get_142_13.doEnd();
                RuntimeTagElement _jettag_c_get_142_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_142_50.setRuntimeParent(_jettag_c_when_136_1);
                _jettag_c_get_142_50.setTagInfo(_td_c_get_142_50);
                _jettag_c_get_142_50.doStart(context, out);
                _jettag_c_get_142_50.doEnd();
                RuntimeTagElement _jettag_c_get_142_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_142_87.setRuntimeParent(_jettag_c_when_136_1);
                _jettag_c_get_142_87.setTagInfo(_td_c_get_142_87);
                _jettag_c_get_142_87.doStart(context, out);
                _jettag_c_get_142_87.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\ttransactionMode=\"yes\" persistenceMode=\"yes\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <translation xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        string=\"Output Message\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    </nodes>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_136_1.handleBodyContent(out);
            }
            out = _jettag_c_when_136_1_saved_out;
            _jettag_c_when_136_1.doEnd();
            _jettag_c_choose_74_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_74_1_saved_out;
        _jettag_c_choose_74_1.doEnd();
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFileInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"18,120\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      inputDirectory=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_152_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_152_23.setRuntimeParent(null);
        _jettag_c_get_152_23.setTagInfo(_td_c_get_152_23);
        _jettag_c_get_152_23.doStart(context, out);
        _jettag_c_get_152_23.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filenamePattern=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_153_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_153_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_153_24.setRuntimeParent(null);
        _jettag_c_get_153_24.setTagInfo(_td_c_get_153_24);
        _jettag_c_get_153_24.doStart(context, out);
        _jettag_c_get_153_24.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      processedFileAction=\"moveToArchive\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      replaceDuplicateArchives=\"true\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_156_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_156_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_156_1.setRuntimeParent(null);
        _jettag_c_if_156_1.setTagInfo(_td_c_if_156_1);
        _jettag_c_if_156_1.doStart(context, out);
        while (_jettag_c_if_156_1.okToProcessBody()) {
            out.write("\t  fileFtp=\"true\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      fileFtpServer=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_158_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_158_22.setRuntimeParent(_jettag_c_if_156_1);
            _jettag_c_get_158_22.setTagInfo(_td_c_get_158_22);
            _jettag_c_get_158_22.doStart(context, out);
            _jettag_c_get_158_22.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_156_1.handleBodyContent(out);
        }
        _jettag_c_if_156_1.doEnd();
        out.write(NL);         
        // set ccsid and encoding if values differ from default 
        RuntimeTagElement _jettag_c_if_162_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_162_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_162_1.setRuntimeParent(null);
        _jettag_c_if_162_1.setTagInfo(_td_c_if_162_1);
        _jettag_c_if_162_1.doStart(context, out);
        while (_jettag_c_if_162_1.okToProcessBody()) {
            out.write("messageCodedCharSetIdProperty=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_163_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_32); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_32.setRuntimeParent(_jettag_c_if_162_1);
            _jettag_c_get_163_32.setTagInfo(_td_c_get_163_32);
            _jettag_c_get_163_32.doStart(context, out);
            _jettag_c_get_163_32.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_162_1.handleBodyContent(out);
        }
        _jettag_c_if_162_1.doEnd();
        RuntimeTagElement _jettag_c_if_165_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_165_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_165_1.setRuntimeParent(null);
        _jettag_c_if_165_1.setTagInfo(_td_c_if_165_1);
        _jettag_c_if_165_1.doStart(context, out);
        while (_jettag_c_if_165_1.okToProcessBody()) {
            out.write("       messageEncodingProperty=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_166_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_33.setRuntimeParent(_jettag_c_if_165_1);
            _jettag_c_get_166_33.setTagInfo(_td_c_get_166_33);
            _jettag_c_get_166_33.doStart(context, out);
            _jettag_c_get_166_33.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_165_1.handleBodyContent(out);
        }
        _jettag_c_if_165_1.doEnd();
        // determine values based on record detection and validation 
        RuntimeTagElement _jettag_c_choose_169_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_169_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_169_1.setRuntimeParent(null);
        _jettag_c_choose_169_1.setTagInfo(_td_c_choose_169_1);
        _jettag_c_choose_169_1.doStart(context, out);
        JET2Writer _jettag_c_choose_169_1_saved_out = out;
        while (_jettag_c_choose_169_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_171_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_171_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_171_1.setRuntimeParent(_jettag_c_choose_169_1);
            _jettag_c_when_171_1.setTagInfo(_td_c_when_171_1);
            _jettag_c_when_171_1.doStart(context, out);
            JET2Writer _jettag_c_when_171_1_saved_out = out;
            while (_jettag_c_when_171_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("      recordDetection=\"fixedLength\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      recordLength= \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_174_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_174_22.setRuntimeParent(_jettag_c_when_171_1);
                _jettag_c_get_174_22.setTagInfo(_td_c_get_174_22);
                _jettag_c_get_174_22.doStart(context, out);
                _jettag_c_get_174_22.doEnd();
                out.write("\"    ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageDomainProperty=\"BLOB\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                _jettag_c_when_171_1.handleBodyContent(out);
            }
            out = _jettag_c_when_171_1_saved_out;
            _jettag_c_when_171_1.doEnd();
            RuntimeTagElement _jettag_c_when_179_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_179_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_179_1.setRuntimeParent(_jettag_c_choose_169_1);
            _jettag_c_when_179_1.setTagInfo(_td_c_when_179_1);
            _jettag_c_when_179_1.doStart(context, out);
            JET2Writer _jettag_c_when_179_1_saved_out = out;
            while (_jettag_c_when_179_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      recordDetection=\"delimited\" ");  //$NON-NLS-1$        
                out.write(NL);         
                // set delimiter if it is not null 
                RuntimeTagElement _jettag_c_if_182_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_182_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_182_1.setRuntimeParent(_jettag_c_when_179_1);
                _jettag_c_if_182_1.setTagInfo(_td_c_if_182_1);
                _jettag_c_if_182_1.doStart(context, out);
                while (_jettag_c_if_182_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_183_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_183_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_183_1.setRuntimeParent(_jettag_c_if_182_1);
                    _jettag_c_if_183_1.setTagInfo(_td_c_if_183_1);
                    _jettag_c_if_183_1.doStart(context, out);
                    while (_jettag_c_if_183_1.okToProcessBody()) {
                        out.write("      recordDelimiter=\"customDelimiter\" customDelimiter=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_184_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_184_58); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_184_58.setRuntimeParent(_jettag_c_if_183_1);
                        _jettag_c_get_184_58.setTagInfo(_td_c_get_184_58);
                        _jettag_c_get_184_58.doStart(context, out);
                        _jettag_c_get_184_58.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_183_1.handleBodyContent(out);
                    }
                    _jettag_c_if_183_1.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    _jettag_c_if_182_1.handleBodyContent(out);
                }
                _jettag_c_if_182_1.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageDomainProperty=\"BLOB\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                _jettag_c_when_179_1.handleBodyContent(out);
            }
            out = _jettag_c_when_179_1_saved_out;
            _jettag_c_when_179_1.doEnd();
            RuntimeTagElement _jettag_c_when_189_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_189_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_189_1.setRuntimeParent(_jettag_c_choose_169_1);
            _jettag_c_when_189_1.setTagInfo(_td_c_when_189_1);
            _jettag_c_when_189_1.doStart(context, out);
            JET2Writer _jettag_c_when_189_1_saved_out = out;
            while (_jettag_c_when_189_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      recordDetection=\"delimited\"       ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageDomainProperty=\"XMLNSC\" ");  //$NON-NLS-1$        
                out.write(NL);         
                // set delimiter if it is not null 
                RuntimeTagElement _jettag_c_if_193_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_193_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_193_1.setRuntimeParent(_jettag_c_when_189_1);
                _jettag_c_if_193_1.setTagInfo(_td_c_if_193_1);
                _jettag_c_if_193_1.doStart(context, out);
                while (_jettag_c_if_193_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_194_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_194_1.setRuntimeParent(_jettag_c_if_193_1);
                    _jettag_c_if_194_1.setTagInfo(_td_c_if_194_1);
                    _jettag_c_if_194_1.doStart(context, out);
                    while (_jettag_c_if_194_1.okToProcessBody()) {
                        out.write("      recordDelimiter=\"customDelimiter\" customDelimiter=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_195_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_58); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_195_58.setRuntimeParent(_jettag_c_if_194_1);
                        _jettag_c_get_195_58.setTagInfo(_td_c_get_195_58);
                        _jettag_c_get_195_58.doStart(context, out);
                        _jettag_c_get_195_58.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_194_1.handleBodyContent(out);
                    }
                    _jettag_c_if_194_1.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    _jettag_c_if_193_1.handleBodyContent(out);
                }
                _jettag_c_if_193_1.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                _jettag_c_when_189_1.handleBodyContent(out);
            }
            out = _jettag_c_when_189_1_saved_out;
            _jettag_c_when_189_1.doEnd();
            RuntimeTagElement _jettag_c_when_199_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_199_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_199_1.setRuntimeParent(_jettag_c_choose_169_1);
            _jettag_c_when_199_1.setTagInfo(_td_c_when_199_1);
            _jettag_c_when_199_1.doStart(context, out);
            JET2Writer _jettag_c_when_199_1_saved_out = out;
            while (_jettag_c_when_199_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      recordDetection=\"parsedRecordSequence\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageDomainProperty=\"XMLNSC\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    messageSetProperty=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_203_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_203_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_203_25.setRuntimeParent(_jettag_c_when_199_1);
                _jettag_c_get_203_25.setTagInfo(_td_c_get_203_25);
                _jettag_c_get_203_25.doStart(context, out);
                _jettag_c_get_203_25.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_199_1.handleBodyContent(out);
            }
            out = _jettag_c_when_199_1_saved_out;
            _jettag_c_when_199_1.doEnd();
            RuntimeTagElement _jettag_c_when_205_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_205_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_205_1.setRuntimeParent(_jettag_c_choose_169_1);
            _jettag_c_when_205_1.setTagInfo(_td_c_when_205_1);
            _jettag_c_when_205_1.doStart(context, out);
            JET2Writer _jettag_c_when_205_1_saved_out = out;
            while (_jettag_c_when_205_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t  recordDetection=\"parsedRecordSequence\"   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      messageDomainProperty=\"MRM\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_209_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_209_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_209_27.setRuntimeParent(_jettag_c_when_205_1);
                _jettag_c_get_209_27.setTagInfo(_td_c_get_209_27);
                _jettag_c_get_209_27.doStart(context, out);
                _jettag_c_get_209_27.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tmessageFormatProperty=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_210_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_210_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_210_25.setRuntimeParent(_jettag_c_when_205_1);
                _jettag_c_get_210_25.setTagInfo(_td_c_get_210_25);
                _jettag_c_get_210_25.doStart(context, out);
                _jettag_c_get_210_25.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tmessageTypeProperty=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_211_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_211_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_211_23.setRuntimeParent(_jettag_c_when_205_1);
                _jettag_c_get_211_23.setTagInfo(_td_c_get_211_23);
                _jettag_c_get_211_23.doStart(context, out);
                _jettag_c_get_211_23.doEnd();
                out.write("\"  ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_205_1.handleBodyContent(out);
            }
            out = _jettag_c_when_205_1_saved_out;
            _jettag_c_when_205_1.doEnd();
            _jettag_c_choose_169_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_169_1_saved_out;
        _jettag_c_choose_169_1.doEnd();
        out.write(">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"File Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_217_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_217_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_217_1.setRuntimeParent(null);
        _jettag_c_if_217_1.setTagInfo(_td_c_if_217_1);
        _jettag_c_if_217_1.doStart(context, out);
        while (_jettag_c_if_217_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_218_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_218_24.setRuntimeParent(_jettag_c_if_217_1);
            _jettag_c_get_218_24.setTagInfo(_td_c_get_218_24);
            _jettag_c_get_218_24.doStart(context, out);
            _jettag_c_get_218_24.doEnd();
            RuntimeTagElement _jettag_c_get_218_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_218_62.setRuntimeParent(_jettag_c_if_217_1);
            _jettag_c_get_218_62.setTagInfo(_td_c_get_218_62);
            _jettag_c_get_218_62.doStart(context, out);
            _jettag_c_get_218_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_1\" location=\"372,124\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" location=\"250,124\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       statement=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_223_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_223_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_223_34.setRuntimeParent(_jettag_c_if_217_1);
            _jettag_c_get_223_34.setTagInfo(_td_c_get_223_34);
            _jettag_c_get_223_34.doStart(context, out);
            _jettag_c_get_223_34.doEnd();
            out.write("SaveUDPs.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Save UDP\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_217_1.handleBodyContent(out);
        }
        _jettag_c_if_217_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       targetNode=\"FCMComposite_1_100\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_232_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_232_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_232_1.setRuntimeParent(null);
        _jettag_c_choose_232_1.setTagInfo(_td_c_choose_232_1);
        _jettag_c_choose_232_1.doStart(context, out);
        JET2Writer _jettag_c_choose_232_1_saved_out = out;
        while (_jettag_c_choose_232_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_233_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_233_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_233_1.setRuntimeParent(_jettag_c_choose_232_1);
            _jettag_c_when_233_1.setTagInfo(_td_c_when_233_1);
            _jettag_c_when_233_1.doStart(context, out);
            JET2Writer _jettag_c_when_233_1_saved_out = out;
            while (_jettag_c_when_233_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_5\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_233_1.handleBodyContent(out);
            }
            out = _jettag_c_when_233_1_saved_out;
            _jettag_c_when_233_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_239_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_239_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_239_1.setRuntimeParent(_jettag_c_choose_232_1);
            _jettag_c_otherwise_239_1.setTagInfo(_td_c_otherwise_239_1);
            _jettag_c_otherwise_239_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_239_1_saved_out = out;
            while (_jettag_c_otherwise_239_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_3\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_239_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_239_1_saved_out;
            _jettag_c_otherwise_239_1.doEnd();
            out.write(NL);         
            _jettag_c_choose_232_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_232_1_saved_out;
        _jettag_c_choose_232_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_246_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_246_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_246_1.setRuntimeParent(null);
        _jettag_c_if_246_1.setTagInfo(_td_c_if_246_1);
        _jettag_c_if_246_1.doStart(context, out);
        while (_jettag_c_if_246_1.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.EOD\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_246_1.handleBodyContent(out);
        }
        _jettag_c_if_246_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_251_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_251_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_251_1.setRuntimeParent(null);
        _jettag_c_choose_251_1.setTagInfo(_td_c_choose_251_1);
        _jettag_c_choose_251_1.doStart(context, out);
        JET2Writer _jettag_c_choose_251_1_saved_out = out;
        while (_jettag_c_choose_251_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            // Specify routes 
            RuntimeTagElement _jettag_c_when_253_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_253_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_253_1.setRuntimeParent(_jettag_c_choose_251_1);
            _jettag_c_when_253_1.setTagInfo(_td_c_when_253_1);
            _jettag_c_when_253_1.doStart(context, out);
            JET2Writer _jettag_c_when_253_1_saved_out = out;
            while (_jettag_c_when_253_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("   <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_15\" sourceNode=\"FCMComposite_1_100\" sourceTerminalName=\"OutTerminal.Output200\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_256_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_256_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_256_1.setRuntimeParent(_jettag_c_when_253_1);
                _jettag_c_setVariable_256_1.setTagInfo(_td_c_setVariable_256_1);
                _jettag_c_setVariable_256_1.doStart(context, out);
                _jettag_c_setVariable_256_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_257_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_257_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_257_1.setRuntimeParent(_jettag_c_when_253_1);
                _jettag_c_iterate_257_1.setTagInfo(_td_c_iterate_257_1);
                _jettag_c_iterate_257_1.doStart(context, out);
                while (_jettag_c_iterate_257_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_258_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_258_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_258_1.setRuntimeParent(_jettag_c_iterate_257_1);
                    _jettag_c_setVariable_258_1.setTagInfo(_td_c_setVariable_258_1);
                    _jettag_c_setVariable_258_1.doStart(context, out);
                    _jettag_c_setVariable_258_1.doEnd();
                    out.write("<connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_259_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_259_69); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_259_69.setRuntimeParent(_jettag_c_iterate_257_1);
                    _jettag_c_get_259_69.setTagInfo(_td_c_get_259_69);
                    _jettag_c_get_259_69.doStart(context, out);
                    _jettag_c_get_259_69.doEnd();
                    out.write("\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("      targetNode=\"FCMComposite_1_10");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_260_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_260_36.setRuntimeParent(_jettag_c_iterate_257_1);
                    _jettag_c_get_260_36.setTagInfo(_td_c_get_260_36);
                    _jettag_c_get_260_36.doStart(context, out);
                    _jettag_c_get_260_36.doEnd();
                    out.write("\" sourceNode=\"FCMComposite_1_100\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("      sourceTerminalName=\"OutTerminal.Output");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_261_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_261_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_261_45.setRuntimeParent(_jettag_c_iterate_257_1);
                    _jettag_c_get_261_45.setTagInfo(_td_c_get_261_45);
                    _jettag_c_get_261_45.doStart(context, out);
                    _jettag_c_get_261_45.doEnd();
                    out.write("\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("      targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_257_1.handleBodyContent(out);
                }
                _jettag_c_iterate_257_1.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_253_1.handleBodyContent(out);
            }
            out = _jettag_c_when_253_1_saved_out;
            _jettag_c_when_253_1.doEnd();
            // destinationCache and no routing  - 1 node only + default for lookup
            RuntimeTagElement _jettag_c_otherwise_267_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_267_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_267_1.setRuntimeParent(_jettag_c_choose_251_1);
            _jettag_c_otherwise_267_1.setTagInfo(_td_c_otherwise_267_1);
            _jettag_c_otherwise_267_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_267_1_saved_out = out;
            while (_jettag_c_otherwise_267_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("<connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_101\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetNode=\"FCMComposite_1_101\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceNode=\"FCMComposite_1_100\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      sourceTerminalName=\"OutTerminal.Output1\" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("      targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_273_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_273_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_273_1.setRuntimeParent(_jettag_c_otherwise_267_1);
                _jettag_c_if_273_1.setTagInfo(_td_c_if_273_1);
                _jettag_c_if_273_1.doStart(context, out);
                while (_jettag_c_if_273_1.okToProcessBody()) {
                    out.write("   <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("   targetNode=\"FCMComposite_1_15\" sourceNode=\"FCMComposite_1_100\" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("   sourceTerminalName=\"OutTerminal.Output200\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_if_277_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_277_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_277_4.setRuntimeParent(_jettag_c_if_273_1);
                    _jettag_c_if_277_4.setTagInfo(_td_c_if_277_4);
                    _jettag_c_if_277_4.doStart(context, out);
                    while (_jettag_c_if_277_4.okToProcessBody()) {
                        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_53\" ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      sourceNode=\"FCMComposite_1_54\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("   ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_53\" ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("      sourceNode=\"FCMComposite_1_54\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_277_4.handleBodyContent(out);
                    }
                    _jettag_c_if_277_4.doEnd();
                    _jettag_c_if_273_1.handleBodyContent(out);
                }
                _jettag_c_if_273_1.doEnd();
                _jettag_c_otherwise_267_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_267_1_saved_out;
            _jettag_c_otherwise_267_1.doEnd();
            out.write("     ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_choose_251_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_251_1_saved_out;
        _jettag_c_choose_251_1.doEnd();
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_290_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_290_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_290_1.setRuntimeParent(null);
        _jettag_c_if_290_1.setTagInfo(_td_c_if_290_1);
        _jettag_c_if_290_1.doStart(context, out);
        while (_jettag_c_if_290_1.okToProcessBody()) {
            out.write("     <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.LoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.LoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_293_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_293_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_293_23.setRuntimeParent(_jettag_c_if_290_1);
            _jettag_c_get_293_23.setTagInfo(_td_c_get_293_23);
            _jettag_c_get_293_23.doStart(context, out);
            _jettag_c_get_293_23.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_294_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_294_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_294_21.setRuntimeParent(_jettag_c_if_290_1);
            _jettag_c_get_294_21.setTagInfo(_td_c_get_294_21);
            _jettag_c_get_294_21.doStart(context, out);
            _jettag_c_get_294_21.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_290_1.handleBodyContent(out);
        }
        _jettag_c_if_290_1.doEnd();
        RuntimeTagElement _jettag_c_if_296_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_296_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_296_1.setRuntimeParent(null);
        _jettag_c_if_296_1.setTagInfo(_td_c_if_296_1);
        _jettag_c_if_296_1.doStart(context, out);
        while (_jettag_c_if_296_1.okToProcessBody()) {
            out.write("    <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \t\tbundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_299_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_299_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_299_19.setRuntimeParent(_jettag_c_if_296_1);
            _jettag_c_get_299_19.setTagInfo(_td_c_get_299_19);
            _jettag_c_get_299_19.doStart(context, out);
            _jettag_c_get_299_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_300_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_300_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_300_19.setRuntimeParent(_jettag_c_if_296_1);
            _jettag_c_get_300_19.setTagInfo(_td_c_get_300_19);
            _jettag_c_get_300_19.doStart(context, out);
            _jettag_c_get_300_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_296_1.handleBodyContent(out);
        }
        _jettag_c_if_296_1.doEnd();
        RuntimeTagElement _jettag_c_if_303_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_303_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_303_1.setRuntimeParent(null);
        _jettag_c_if_303_1.setTagInfo(_td_c_if_303_1);
        _jettag_c_if_303_1.doStart(context, out);
        while (_jettag_c_if_303_1.okToProcessBody()) {
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_303_1.handleBodyContent(out);
        }
        _jettag_c_if_303_1.doEnd();
        out.write("\t</propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
