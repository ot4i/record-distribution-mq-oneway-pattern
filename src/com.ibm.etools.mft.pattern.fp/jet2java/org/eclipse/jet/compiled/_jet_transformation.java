package org.eclipse.jet.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map pathToTemplateOrdinalMap = new HashMap(20);
    static {
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/dump.jet", //$NON-NLS-1$
                new Integer(0));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/main.jet", //$NON-NLS-1$
                new Integer(1));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(2));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(3));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(4));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(5));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/RecordDistributor.esql.jet", //$NON-NLS-1$
                new Integer(6));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/RecordDistributor.msgflow.jet", //$NON-NLS-1$
                new Integer(7));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/RecordProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(8));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/destinationCache/declarecache.esql.jet", //$NON-NLS-1$
                new Integer(9));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/destinationCache/destination_cache.subflow.jet", //$NON-NLS-1$
                new Integer(10));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/destinationCache/destination_cache_1k.esql.jet", //$NON-NLS-1$
                new Integer(11));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/destinationCache/destination_cache_2k.esql.jet", //$NON-NLS-1$
                new Integer(12));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(13));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/routeDefault/route_default.subflow.jet", //$NON-NLS-1$
                new Integer(14));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/routeRoute/route.esql.jet", //$NON-NLS-1$
                new Integer(15));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/routeRoute/route.subflow.jet", //$NON-NLS-1$
                new Integer(16));
        pathToTemplateOrdinalMap.put("fp/rd/mq/templates/root/summary.jet", //$NON-NLS-1$
                new Integer(17));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                new Integer(18));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                new Integer(19));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = (Integer)pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // fp/rd/mq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump();
            case 1: // fp/rd/mq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_0();
            case 2: // fp/rd/mq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql();
            case 3: // fp/rd/mq/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow();
            case 4: // fp/rd/mq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql();
            case 5: // fp/rd/mq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow();
            case 6: // fp/rd/mq/templates/root/RecordDistributor.esql.jet
                return new org.eclipse.jet.compiled._jet_RecordDistributoresql();
            case 7: // fp/rd/mq/templates/root/RecordDistributor.msgflow.jet
                return new org.eclipse.jet.compiled._jet_RecordDistributormsgflow();
            case 8: // fp/rd/mq/templates/root/RecordProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_RecordProcessorsubflow();
            case 9: // fp/rd/mq/templates/root/destinationCache/declarecache.esql.jet
                return new org.eclipse.jet.compiled._jet_declarecacheesql();
            case 10: // fp/rd/mq/templates/root/destinationCache/destination_cache.subflow.jet
                return new org.eclipse.jet.compiled._jet_destination_cachesubflow();
            case 11: // fp/rd/mq/templates/root/destinationCache/destination_cache_1k.esql.jet
                return new org.eclipse.jet.compiled._jet_destination_cache_1kesql();
            case 12: // fp/rd/mq/templates/root/destinationCache/destination_cache_2k.esql.jet
                return new org.eclipse.jet.compiled._jet_destination_cache_2kesql();
            case 13: // fp/rd/mq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project();
            case 14: // fp/rd/mq/templates/root/routeDefault/route_default.subflow.jet
                return new org.eclipse.jet.compiled._jet_route_defaultsubflow();
            case 15: // fp/rd/mq/templates/root/routeRoute/route.esql.jet
                return new org.eclipse.jet.compiled._jet_routeesql();
            case 16: // fp/rd/mq/templates/root/routeRoute/route.subflow.jet
                return new org.eclipse.jet.compiled._jet_routesubflow();
            case 17: // fp/rd/mq/templates/root/summary.jet
                return new org.eclipse.jet.compiled._jet_summary();
            case 18: // templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump_0();
            case 19: // templates/main.jet
                return new org.eclipse.jet.compiled._jet_main();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
