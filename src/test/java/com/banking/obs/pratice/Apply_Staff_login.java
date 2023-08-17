package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.banking.GenericUtility.BaseClass;
import com.banking.pom.Staff_LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apply_Staff_login  extends BaseClass
{
//
//	WebDriver driver=null;
//	
//	public Apply_Staff_login() {
//	
//		this.driver = driver;
//	}
//	
	
	public static void main(String[] args) throws Exception 
	{
		
		
		
		WebDriver driver;
		
		
		
	     
	     
	     FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
	     Properties p=new Properties();
	     p.load(fis);
	     String url=p.getProperty("url");
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
	   String username=p.getProperty("username");
	     String password=p.getProperty("password");
	    
	     Staff_LoginPage sl= new Staff_LoginPage(driver);
		  sl.Staff_Login_input(url, username, password);
	     
		

	}

}
