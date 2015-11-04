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
package com.ibm.etools.mft.pattern.fp.edit;

import com.ibm.etools.mft.patterns.model.edit.POVEditorAdapterMsetName;
import com.ibm.etools.mft.patterns.properties.MRMessageFormatPropertyEditor;
import com.ibm.etools.msg.msgmodel.utilities.MRParserExtensions;
import com.ibm.etools.patterns.model.edit.IPOVEditorAdapter;

public class MessageSetFormatPropertyEditor extends MRMessageFormatPropertyEditor {
	private final static String ENABLE_VALUE_TEXTDATA = "textData";
	private final static String ENABLE_VALUE_BINARYDATA = "binaryData";
	private final static String ENABLE_VALUE_XML = "XML";
	private final static String DOMAIN_WTX = "WTX";
	private final static String DOMAIN_IDOC = "IDOC";
	private final static String DOMAIN_MRM = "MRM";
	private final static String DOMAIN_XMLNSC = "XMLNSC";

	/** {@inheritDoc} */
	public void notifyChanged(IPOVEditorAdapter adapter) {
		if (adapter == null) return;

		if (adapter.isEnable() == true) {
			Object value = adapter.getValue();
			if (adapter instanceof POVEditorAdapterMsetName) {		
				if ((value == null) || (((String) value).length() == 0)) {
					setMessageSetID(null);
				} else {
					String projectMessageSet = value.toString();
					if (projectMessageSet != null) {
						if (projectMessageSet.trim().length() > 0) {
							if (projectMessageSet.charAt(0) == '/') {
								int index = projectMessageSet.indexOf("/", 1);
								if (index >= 0) {
									setMessageSetID(projectMessageSet.substring(index + 1));
								} else {
									setMessageSetID((String) value);
								}
							} else {
								setMessageSetID((String) value);
							}
						}
					}				
				}
				
				// Only enable if already enabled
				if (isEnabled()) {
					enable(true);
				}
			} else if (value != null) {

				String domainValue = null, stringValue = value.toString();
				if (stringValue.equals(ENABLE_VALUE_TEXTDATA) || stringValue.equals(ENABLE_VALUE_BINARYDATA)) {
					domainValue = DOMAIN_MRM;
				} else if (stringValue.equals(ENABLE_VALUE_XML)) {
					domainValue = DOMAIN_XMLNSC;
				}
				
				// Editable mode if domain is MRM, IDOC, or user entered
				if (domainValue.equals(DOMAIN_MRM) || 
					domainValue.equals(DOMAIN_IDOC) || 
					domainValue.equals(DOMAIN_WTX)) {
						enable(true);
				} else { 
				
					MRParserExtensions extensions = MRParserExtensions.getInstance();
					
					// Disable if the value is one of the values and not either MRM, IDOC or WTX
					if (extensions.getMRDomains().contains(domainValue)) {
						if (!domainValue.equals(DOMAIN_MRM) || 
							!domainValue.equals(DOMAIN_IDOC) || 
							!domainValue.equals(DOMAIN_WTX)) {
								enable(false);
						}
					}
				}
			}
		} else {
			enable(false);
		}
	}
}
