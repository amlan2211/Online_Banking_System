package com.banking.obs.pratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Pratics_Annotation 
{
	@BeforeSuite
	public void congig_BS()
	{
		System.out.println("conncet to db before suite");
	}
	@BeforeClass
	public void congig_BC()
	{
		System.out.println("open the database before class");
	}
	@BeforeMethod
	public void config_BM()
	{
		System.out.println("--login to appln before method");
	}
	@Test
	public void ConnecttoApp()
	{
		System.out.println("open the application  1 ");
	}
	@Test
	public void AconnectApp()
	{
		System.out.println("open the application 2");
	}
	@AfterMethod
	public void openAPP()
	{
	System.out.println("logout of the application after method");
	}
	@AfterClass
	public void config_AC()
	{
		System.out.println("close the database after class");
	}
	@AfterSuite
	public void config_AS()
	{
		System.out.println("After suite AFter ");
	}
	

}
