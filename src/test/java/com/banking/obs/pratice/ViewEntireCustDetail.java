package com.banking.obs.pratice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.GenericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewEntireCustDetail {

	public static void main(String[] args) throws IOException, InterruptedException
  { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileUtility fs= new FileUtility();
		String pss=fs.readDataFromPropetyFile("url1");
		String password=fs.readDataFromPropetyFile("password");
		String username=fs.readDataFromPropetyFile("username");
		driver.get(pss);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		 driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@name='viewdet']")).click();
		String abd= driver.findElement(By.xpath("//div[@class='active_customers_container']")).getText();
		System.out.println(abd);
		
		
	}

}
