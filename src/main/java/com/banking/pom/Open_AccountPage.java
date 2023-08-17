package com.banking.pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.GenericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Open_AccountPage extends BaseClass
{
	@Test
	public void getTitle() throws IOException
	{
		String org="Online Banking System";
		System.out.println("--stepno1---");
		System.out.println("--stepno2--");
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		fLib.readDataFromPropetyFile("url");
		
		driver.get(fLib.readDataFromPropetyFile("url"));
		String actual=driver.getTitle();
		System.out.println(actual);
	//	assertEquals(org, actual, "it is matching");
		assertTrue(actual.contains("Online"));
		
	}
		
		
	}
       




