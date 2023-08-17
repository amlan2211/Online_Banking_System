package com.banking.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.GenericUtility.IpathConstants;

public class DataFetchFromExcel 
{
	@Test(dataProvider = "getDataFromExcel")
	public void fetchdata(String cilent,String loc )
	{
		System.out.println("cielnt"+cilent+"loc"+loc);
	}
@DataProvider
 public Object[][] getDataFromExcel() throws Throwable
 {
	FileInputStream fis= new FileInputStream(IpathConstants.Excelpath);
	Workbook book=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet2");
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
