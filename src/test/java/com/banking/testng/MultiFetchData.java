package com.banking.testng;

import org.testng.annotations.Test;

public class MultiFetchData
{
	@Test(dataProviderClass = MultiData.class,dataProvider = "Getdata")
	
	public void getData(String src,String dst)
	{
		System.out.println("from "+src+" dst "+dst);
	}
	@Test(dataProviderClass = MultiData.class,dataProvider="SetData")
	public void setData(String src,String dst)
	{
		System.out.println("from "+src+" dst "+dst);
	}
	@Test(dataProviderClass = MultiData.class,dataProvider = "Godata")
public void godata(String src,String dst)
{
		System.out.println("from "+src+" dst "+dst);
		
}
	
}
