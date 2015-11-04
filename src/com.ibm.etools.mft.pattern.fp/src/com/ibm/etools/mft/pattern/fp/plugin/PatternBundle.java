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

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.osgi.util.NLS;

public class PatternBundle extends NLS {
	private static final String PERIOD = "."; //$NON-NLS-1$
	private static final String UNDERSCORE = "_"; //$NON-NLS-1$
	public String getString(String key) { return null; }
	public static String getSString(String key) { return null; }
	
	public String getMessage(String key, Object[] parameters) {
		String message, baseMessageFormat;
		baseMessageFormat = getString(key);
		if (!baseMessageFormat.equals(key)) {
			message = NLS.bind(baseMessageFormat, parameters);
			return message;
		}
		return key;
	}

	/**
	 * Creates the message map for JET summary and field names.
	 * 
	 * @param messageClass
	 *            The pattern message NLS class.
	 * @param enumerations
	 *            A list of known enumeration names.
	 */
	public static Map<String, String> createMessageMap(Class<?> messageClass, String[] enumerations) {
		Map<String, String> map = new HashMap<String, String>();	
		for (Field currentField : messageClass.getFields()) {
			String fieldName = currentField.getName();
			String enumerationName = "";
			boolean isEnumeration = false;
			
			// Enumerations keep any underscore parts!
			for (String currentName : enumerations) {
				if (fieldName.endsWith(currentName) == true) {
					fieldName = fieldName.replaceAll(currentName, "");
					enumerationName = currentName;
					isEnumeration = true; break;
				}
			}
			
			try {
				Object fieldValue = currentField.get(null);

				// Replace underscores with periods for later lookup
				String keyName = fieldName.replace(UNDERSCORE, PERIOD);
				if (isEnumeration == true) {
					keyName += enumerationName;
				}
				
				map.put(keyName, fieldValue.toString());
				
			} catch (IllegalAccessException exception) { 
				// This should never happen..!
				exception.printStackTrace();
			}
		}		
		return map;
	}
}
