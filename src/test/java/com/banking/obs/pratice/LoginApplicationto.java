package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApplicationto {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data1.properties");
		Properties p=new Properties();
		p.load(fis);
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		String url=p.getProperty("url");
		String user=p.getProperty("username");
		String pass=p.getProperty("password");
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("staff_id")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("staff_login-btn")).click();
		
		

	}

}
