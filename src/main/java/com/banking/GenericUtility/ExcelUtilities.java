package com.banking.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
   public String readDataFromExcel(String sheetname,int rowNo,int cellno) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
	   Workbook wb=WorkbookFactory.create(fi);
	//  DataFormatter f=new DataFormatter();
//  Sheet sh=wb.getSheet(sheetname);
	//	  String value=f.formatCellValue(sh.getRow(rowNo).getCell(cellno));
	 String value= wb.getSheet(sheetname).getRow(rowNo).getCell(cellno).getStringCellValue();
	  return value;
	     
   }
   public void writeDataIntoExcel(String sheetName,int rowNo,int celNO,String data) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
	  Workbook wb= WorkbookFactory.create(fi);
	  wb.getSheet(sheetName).createRow(rowNo).createCell(celNO).setCellValue(data);
	  FileOutputStream fos= new FileOutputStream(IpathConstants.Excelpath);
	  wb.write(fos);
	  wb.close();
	  
	   
   }
   public int getLastRowno(String sheetName) throws EncryptedDocumentException, IOException
   {
	          FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
			 Workbook wb = WorkbookFactory.create(fi);
	                Sheet sh = wb.getSheet(sheetName);
	                 int count  =sh.getLastRowNum();
	                 return count;
   }
   public void getMultipleDataFromExcel(String sheetname ,int keycelno,int valueCelNo) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
	   Workbook wb = WorkbookFactory.create(fi);
	  Sheet sh= wb.getSheet(sheetname);
	  int count=sh.getLastRowNum(); 
	  HashMap<String,String> map= new HashMap<String, String>();
	  for(int i=0;i<=count;i++)
	  {
		  String key=sh.getRow(i).getCell(keycelno).getStringCellValue();
		  String value=sh.getRow(i).getCell(valueCelNo).getStringCellValue();
		  map.put(key, value);
		  
	  }
	   
	   
   }
   public Object[][] getDataFromExcel(String Sheetname) throws Throwable
   {
  	FileInputStream fis= new FileInputStream(IpathConstants.Excelpath);
  	Workbook book=WorkbookFactory.create(fis);
  	org.apache.poi.ss.usermodel.Sheet sh = book.getSheet(Sheetname);
  	int lastrow=sh.getLastRowNum()+1;
  	int lastcell=sh.getRow(0).getLastCellNum();
  	Object[][] obj=new Object[lastrow][lastcell];
  	for(int i=0;i<lastrow;i++)
  	{
  		for(int j=0;j< lastcell;j++)
  		{ 
  			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
  		}
  	}
  	return obj;
   }
	
}
