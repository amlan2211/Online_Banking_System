package com.banking.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.GenericUtility.ExcelUtilities;

public class Generic_Data_Excel 
{
    @Test(dataProvider = "getData")
    public void Fetchdata(String cilent,String loc)
    {
    	System.out.println("cilent-->"+cilent+"loc"+loc);
    }
    @Test(dataProvider = "SetData")
    public void Godata(String cilent,String loc)
    {
    	System.out.println(" "+cilent+" "+loc);
    }
	
	
	@DataProvider
	public Object[][] getData() throws Throwable
	{ 
		ExcelUtilities elib= new ExcelUtilities();
		Object[][] value=elib.getDataFromExcel("Sheet2");
		return value;
		
	}
	@DataProvider
	public Object[][] SetData() throws Throwable
	{ 
		ExcelUtilities elib= new ExcelUtilities();
		Object[][] value=elib.getDataFromExcel("Sheet1");
		return value;
		
	}
}
