package com.banking.obs.pratice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertverification 
{
@Test
public void hardAssert()
{ 
	String expresult="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println("--step1---");
	System.out.println("---step2---");
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	String actual=driver.getTitle();
	System.out.println(actual);
	assertTrue(actual.contains("Online"));
	System.out.println("we got the result");
	System.out.println("tc is passed");
	}
@Test
public void getData()
{ 
	String expresult="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println("--step1---");
	System.out.println("---step2---");
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in/");
	String actual=driver.getTitle();
	System.out.println(actual);
	assertEquals(expresult,actual);
	System.out.println("we got the result");
	System.out.println("tc is passed");
	
	}

}
