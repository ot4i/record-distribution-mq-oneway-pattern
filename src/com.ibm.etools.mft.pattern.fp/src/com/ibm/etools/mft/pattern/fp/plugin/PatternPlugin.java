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

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

/**
 * Class to load resources such as images from the plugin. 
 */
public class PatternPlugin extends Plugin {	
	public static final String PLUGIN_ID = "com.ibm.etools.mft.pattern.fp"; //$NON-NLS-1$
	private static PatternPlugin instance;	
	private static Logger logInstance;	
	private static Vector<Class<?>> bundles = new Vector<Class<?>>();
	private static final String PLUGIN_BUNDLE_RESOURCES_NAME = "plugin"; //$NON-NLS-1$
	private static final String GET_STRING_METHOD_NAME = "getStringStatic"; //$NON-NLS-1$	
	
	/**
	 * Loads the plugin if not already loaded.
	 * In the majority of cases, the plugin is loaded
	 * 	by the Eclipse platform due to dependencies.
	 *
	 * @return Returns the instance of the plugin.
	 */
	public static final PatternPlugin getInstance() {
		if (instance == null) {
			instance = new PatternPlugin();
		}
		return instance;
	}

	public static final void addBundle(Class<?> bundle) {
		bundles.add(bundle);
	}
	
	public PatternPlugin( ) {
		instance = this;
	}
	
	/**
	 * @return Returns the instance of this plugins logging mechanism.
	 */
	public static final Logger getLogger( ) {
		if (logInstance == null) {
			logInstance = Logger.getLogger(PLUGIN_ID);
		}
		return logInstance;
	}

	/**
	 * Returns the string from the pattern plugin's property 
	 * resource bundle or the key if it was not found.
	 */
	public final String getString(String key) {
		Enumeration<?> elements = bundles.elements();
		while (elements.hasMoreElements()) {
			Class<?> bundleClass = (Class<?>) elements.nextElement();
		    try {
		    	Method method = bundleClass.getDeclaredMethod(GET_STRING_METHOD_NAME, String.class);
		    	if (method != null) {
		    		String value = (String) method.invoke(null, new Object[] { key });
		        	if (value != null) {
		        		return value;
		        	}
		    	}
		    } catch (Throwable exception) { 
		    	exception.printStackTrace();
		    }
		}		
		return getPatternBundle(PLUGIN_BUNDLE_RESOURCES_NAME).getString(key);		
	}
	
	/**
	 * Returns the string from the pattern plugin's property resource bundle
	 * complete with parameter substitutions, or the 'key' if not found.
	 */
	public final String getMessage(JET2Context context, String key, Object[] parms) {

		// Locate values from the POV model
	    XPathContextExtender xpathContext = XPathContextExtender.getInstance(context);
	    for (int index = 0; index < parms.length; index++) {
	    	String result = xpathContext.resolveAsString(
	    		xpathContext.currentXPathContextObject(), 
	    			parms[index].toString());
	    			
	    	parms[index] = result;
	    }
	    
		String baseMessageFormat = getString(key);
		if (baseMessageFormat.equals(key) == false) {
			return NLS.bind(baseMessageFormat, parms);
		}
		return key;
	}

	/**
	 * Returns the string from the pattern plugin's property resource bundle
	 * complete with parameter substitutions, or the key if it was not found.
	 */
	public final String getMessage(String key, Object[] parms) {
		String baseMessageFormat = getString(key);
		if (baseMessageFormat.equals(key) == false) {
			return NLS.bind(baseMessageFormat, parms);
		}
		return key;
	}
	
	/**
	 * Returns the resource bundle for a particular pattern.
	 */
	private static final ResourceBundle getPatternBundle(String bundleName) {
		return getPatternBundle(bundleName, PLUGIN_ID);
	}
	
	/**
	 * Returns the resource bundle for a particular pattern in a specified plugin.
	 */
	private static final ResourceBundle getPatternBundle(String bundleName, String pluginID) {
		
		// Try to find this bundle in the plugin space		
		Bundle bundle = Platform.getBundle(pluginID);
		Bundle nlsBundle = Platform.getBundle(pluginID + ".nl1");
		
		if (bundle == null) {
			return null;
		}
		
		URL url = bundle.getEntry("/");
		try {
			url = FileLocator.resolve(url);
		} catch (IOException exception) {
			String message = exception.getLocalizedMessage();
			getLogger().log(Level.FINE, message, exception);
		}

		URL nlURL = null;
		
		// Location of the NLS which holds the translated properties file from the fragment
		if (nlsBundle != null) {
			nlURL = nlsBundle.getEntry("/");
			if (nlURL != null) {
				try {
					nlURL = FileLocator.resolve(nlURL);
				} catch (IOException exception) {
					String message = exception.getLocalizedMessage();
					getLogger().log(Level.FINE, message, exception);
				}
			}
		}
				
		try {
		
			// Load resource bundle using the above two locations
			URL[] urls = new URL[] { url };
			if (nlURL != null) {
				urls = new URL[] { url, nlURL };
			}
		
			URLClassLoader classLoader =  new URLClassLoader(urls);
			return java.util.ResourceBundle.getBundle(
				bundleName, Locale.getDefault(), classLoader);
				
		} catch (MissingResourceException exception) {
			String message = exception.getLocalizedMessage();
			getLogger().log(Level.FINE, message, exception);
		}
		return null;
	}	
}
