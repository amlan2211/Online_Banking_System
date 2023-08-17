package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.banking.GenericUtility.IpathConstants;

public class Pratices {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		   FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
		   Workbook wb = WorkbookFactory.create(fi);
		  Sheet sh= wb.getSheet("Sheet1");
		  int count=sh.getLastRowNum();
		 
		  HashMap<String,String> map= new HashMap<String, String>();
		  for(int i=0;i<=count;i++)
		  { 
			  
			  String key=sh.getRow(i).getCell(0).getStringCellValue();
			  String value=sh.getRow(i).getCell(1).getStringCellValue();
			  map.put(key, value);
			  System.out.println(value);
			  
		  }
		  
	}

}
