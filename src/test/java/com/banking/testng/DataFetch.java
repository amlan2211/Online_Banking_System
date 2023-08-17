package com.banking.testng;

import org.testng.annotations.Test;

public class DataFetch 
{
	@Test(dataProviderClass = Dataset.class,dataProvider = "Getdata")
	
		public void getData(String src,String dst)
		{
			System.out.println("from"+src+"dst"+dst);
		}
	

}
