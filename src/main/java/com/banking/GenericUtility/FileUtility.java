package com.banking.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
    public String readDataFromPropetyFile(String key) throws IOException
    {
    	FileInputStream fis=new FileInputStream(IpathConstants.filepath);
    	Properties poj=new Properties();
    	poj.load(fis);
    	String value=poj.getProperty(key);
    	return value;
    	
    }
}
