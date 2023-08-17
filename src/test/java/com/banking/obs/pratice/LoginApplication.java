package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApplication {

	public static void main(String[] args) throws IOException 
	{ 
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\DataRead.xlsx");
		WebDriver driver=null;
		Properties p=new Properties();
		p.load(fis);
		//String BROWSER=p.getProperty("browser");
		String u=p.getProperty("url");
		String user=p.getProperty("username");
		String pwd=p.getProperty("password");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		if(BROWSER.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//					
//		}
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
		driver.manage().window().maximize();
		driver.get(u);
		driver.findElement(By.name("staff_id")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("staff_login-btn")).click();
		

	}

}
