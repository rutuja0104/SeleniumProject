package com.saucedemo.generics;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfile 
{
	public static String getData(String keyname) 
	{
		Properties p=new Properties();
		try {
			p.load(new FileInputStream(Utility.property_path));
		} 
		catch (Exception e) {
		
		}
		return p.getProperty(keyname);
		
	}

}
