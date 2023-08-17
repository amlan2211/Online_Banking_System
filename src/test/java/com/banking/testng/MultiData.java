package com.banking.testng;

import org.testng.annotations.DataProvider;

public class MultiData 
{

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
	@DataProvider
	public Object[][] SetData()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="bbsr";
		obj[0][1]="kolkata";
		
		obj[1][0]="pune";
		obj[1][1]="bengaluru";
		
		return obj;
		
	}
	@DataProvider
	public Object[][] Godata()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="bbsr";
		obj[0][1]="puri";
		
		obj[1][0]="sambalpur";
		obj[1][1]="ranchi";
		
		return obj;
		
	}
	
	
	
}
