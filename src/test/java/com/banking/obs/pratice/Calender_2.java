package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_2 {

	public static void main(String[] args) throws InterruptedException 
	{   
		String MonthandYear="January 2024";
		int date =29;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().refresh();
		//Thread.sleep(5000);
	 driver.findElement(By.xpath("//span[text()='Departure']")).click();
	  String actualdate="//div[text()='"+MonthandYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
	  String nextArrow="//span[@aria-label='Next Month']";
	  for(;;)
		  try
	  {
			  driver.findElement(By.xpath(actualdate)).click();
			  break;
	  }
	  catch (Exception e) {
		driver.findElement(By.xpath(nextArrow)).click();
	}
	     
   
	}

}
