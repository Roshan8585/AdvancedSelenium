package com.crm.ReadDataFromExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import DwsBaseClass20.DwsBaseClass;

public class ReadDataUtility {
	public static String ReadPropertyData(String key) throws IOException{
		Properties prop = new Properties() ;
		File file = new File("C:\\Users\\Roshan\\eclipse-workspace\\AdvancedSelenium\\src\\test\\resources\\DwsBaseClass20\\DwsBaseClass20Resource.properties");
		FileInputStream fis = new FileInputStream(file) ;
		prop.load(fis);
		String urlMethod = prop.getProperty(key) ;
		return urlMethod ;
	}
}
	
