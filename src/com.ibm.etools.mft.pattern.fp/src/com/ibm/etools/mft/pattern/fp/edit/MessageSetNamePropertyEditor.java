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

import com.ibm.etools.mft.patterns.properties.MRMessageSetNamePropertyEditor;
import com.ibm.etools.patterns.model.edit.IPOVEditorAdapter;

public class MessageSetNamePropertyEditor extends MRMessageSetNamePropertyEditor {
	private final static String ENABLE_VALUE_TEXTDATA = "textData";
	private final static String ENABLE_VALUE_BINARYDATA = "binaryData";
	private final static String ENABLE_VALUE_XML = "XML";
	private final static String ENABLE_VALUE_PARSED = "parsed";

	/** {@inheritDoc} */
	public void notifyChanged(IPOVEditorAdapter editor) {
		if (editor != null) {
			if (editor.isEnable() == true) {	
				Object value = editor.getValue();
				if (value != null) {
					String stringValue = (String) value;
					if (stringValue.equals(ENABLE_VALUE_TEXTDATA) ||
						stringValue.equals(ENABLE_VALUE_BINARYDATA) ||
						stringValue.equals(ENABLE_VALUE_PARSED) ||
						stringValue.equals(ENABLE_VALUE_XML)) {
							enable(true);
					} else {
						enable(false);
					}
				}
			} else {
				enable(false);
			}
		}
	}
}
