package com.msp.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Arun.Verma
 *
 */
public class PropertiesInfo {
	private static PropertiesInfo propertiesInfo=new PropertiesInfo();
	private Properties properties=null;
	
	private PropertiesInfo()
	{
		properties= new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("com/msp/resources/msptool.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static PropertiesInfo getInstance()
	{
		if(propertiesInfo==null)
		{
			propertiesInfo= new PropertiesInfo();
		}
		return propertiesInfo;
	}
	
	

	public String getPropertyValue(String propKey){
	       return this.properties.getProperty(propKey);
	   }
}
