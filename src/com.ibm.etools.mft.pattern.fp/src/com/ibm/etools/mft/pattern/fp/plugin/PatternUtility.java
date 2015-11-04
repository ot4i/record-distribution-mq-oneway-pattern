/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.fp.plugin;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;

/**
 * Utility code for JET templates - the Java classes are added to the JET class path
 * automatically and so can be called directly using the fully qualified class name:
 * <code>a.b.c..formatFile(context ... );</code>. Note that in JET templates there
 * are always certain variables available - for example the JET2 <code>context</code>.
 */
public class PatternUtility {
	private static final int EXPECTED_PATH_ELEMENTS = 3;
	
	/**
	 * Gets the folder name for the pattern configuration.
	 * 
	 * @param context
	 *            <code>JET2Context</code>.
	 * @param variable
	 *            Where to put the resulting value.
	 */
    public static void getPatternConfigurationFolderName(JET2Context context, String variable) {
		String folderName = com.ibm.etools.patterns.PatternMessages.PatternInstanceProject_folderName;
		context.setVariable(variable, folderName);
    }

	/**
	 * Configures the category attributes including the package and path.
	 * 
	 * @param context
	 *            <code>JET2Context</code>.
	 * @param select
	 *            The model value that needs checking.
	 * @param variable
	 *            Where to put the resulting value.
	 */
    public static void checkMessageSetIsValidOrEmpty(JET2Context context, String select, String variable) {
		XPathContextExtender extender = XPathContextExtender.getInstance(context);
	    Object currentContext = extender.currentXPathContextObject();
	    Object element = extender.resolveSingle(currentContext, select);
	    String messageSetName = extender.getContent(element);

	    boolean isValidMessageSetName = false;
	    if (messageSetName.length() == 0) {
			isValidMessageSetName = true;
	    }

	    // If value present then do full check
	    if (messageSetName.length() > 0) {
	    	if (messageSetName.charAt(0) == '/') {
    			String[] elements = messageSetName.split("/");
    			if (elements.length == EXPECTED_PATH_ELEMENTS) {
    				if (elements[0].length() == 0) {
        				if (elements[1].length() > 0) {
            				if (elements[2].length() > 0) {
            					isValidMessageSetName = true;
            				}
        				}    					
    				}
    			}
	    	}
	    }
	    
		context.setVariable(variable, isValidMessageSetName);
    }
    
    /**
     * Transform broker schema to schema folder name
     * 
     * @param context
	 *            <code>JET2Context</code>.
	 * @param brokerSchema
	 *            The broker schema.
	 * @param variable
	 *            Where to put the resulting value.
	 */
    public static void getBrokerSchemaFolderName(JET2Context context, String select, String variable) {
    	XPathContextExtender extender = XPathContextExtender.getInstance(context);
	    Object currentContext = extender.currentXPathContextObject();
	    Object element = extender.resolveSingle(currentContext, select);
    	String brokerSchema = extender.getContent(element);
    	if (brokerSchema != null) {
    		brokerSchema = brokerSchema.replace(".", "/");
    	}
    	context.setVariable(variable, brokerSchema);
    }
}
