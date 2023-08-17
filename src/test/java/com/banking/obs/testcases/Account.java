package com.banking.obs.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.banking.GenericUtility.ExcelUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver;
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
	     Properties p=new Properties();
	     p.load(fis);
	     String url=p.getProperty("url3");
	     String BROWSER = p.getProperty("browser");
	     ExcelUtilities eutil=new ExcelUtilities ();
	     
	     if(BROWSER.equalsIgnoreCase("chrome"))
	     {
	    	 WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
	     }
	     else
	     {
	    	 WebDriverManager.firefoxdriver().setup();
		     driver = new FirefoxDriver();
	     }
	     driver.get(url);
	     ExcelUtilities ex= new ExcelUtilities();
	    String jav= ex.readDataFromExcel("Sheet1", 1, 1);
	    System.out.println(jav);
	    String jav1=ex.readDataFromExcel("Sheet1", 2, 1);
	    System.out.println(jav1);
	    String jav2=ex.readDataFromExcel("Sheet1", 3, 1);
	    System.out.println(jav2);
	    String jav3=ex.readDataFromExcel("Sheet1", 4, 1);
	    System.out.println(jav3);
	    String jav4=ex.readDataFromExcel("Sheet1", 5, 1);
	    System.out.println(jav4);
	    String jav5=ex.readDataFromExcel("Sheet1", 6, 1);
	    System.out.println(jav5);
	    String jav6=ex.readDataFromExcel("Sheet1", 7, 1);
	    System.out.println(jav6);
	    String jav7=ex.readDataFromExcel("Sheet1", 8, 1);
	    System.out.println(jav7);
	    String jav8=ex.readDataFromExcel("Sheet1", 9, 1);
	    System.out.println(jav8);
	    String jav9=ex.readDataFromExcel("Sheet1", 10, 1);
	    System.out.println(jav9);
	    String jav10=ex.readDataFromExcel("Sheet1", 11, 1);
	    System.out.println(jav9);
	    String jav11=ex.readDataFromExcel("Sheet1", 12, 1);
	    System.out.println(jav9);
	    String jav9=ex.readDataFromExcel("Sheet1", 10, 1);
	    System.out.println(jav9);
		

	}

}
