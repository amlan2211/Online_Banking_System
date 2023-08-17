package com.banking.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{   
	@Test(dataProvider = "Getdata",invocationCount = -1)
	public void SetData(String src,String dst)
	{
		System.out.println("from "+src+" to-->"+dst+"h");
	}
	@DataProvider
	public Object[][] Getdata()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="bangalore";
		obj[0][1]="mysore";
		
		obj[1][0]="pune";
		obj[1][1]="chennai";
		
		return obj;
		
	}
	@Test(dataProvider = "Setdata",invocationCount = 2)
	public void GetData(String src,String dst)
	{
		System.out.println("from "+src+" to-->"+dst+"");
	}
	@DataProvider
	public Object[][] Setdata()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="bmtc";
		obj[0][1]="rajajinagar";
		
		obj[1][0]="yelayanka";
		obj[1][1]="ashok nagar";
		
		return obj;
		
	}

}
