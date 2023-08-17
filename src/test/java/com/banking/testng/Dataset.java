package com.banking.testng;

import org.testng.annotations.DataProvider;

public class Dataset 
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
}
