package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountCreation {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver;
		 
	      FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
	     Properties p=new Properties();
	     p.load(fis);
	     String url=p.getProperty("url2");
	     String BROWSER = p.getProperty("browser");
	     
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
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     FileInputStream fis1=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	     Workbook book=WorkbookFactory.create(fis1);
	     String name =book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	     

	}

}
