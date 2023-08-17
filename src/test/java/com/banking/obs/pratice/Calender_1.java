package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_1 {

	public static void main(String[] args) {
	 String MonthandDate="September 2023";
	 int date=25;
	 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-21 lerOcM fswDownArrow']")).click();
		driver.findElement(By.xpath("//span[text()='Departure'")).click();
		String actualdate="//div[text()='"+MonthandDate+"']/ancestor::div[@class='DayPicker-Month']/descentdant::p[text()='"+date+"']";
		String nextArrow="//span[@aria-label='Next Month']";
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath(actualdate)).click();
				break;
			}
			catch (Exception e) 
			{
				//driver.findElements(By.xpath(nextArrow)).click();
			}
		}

	}

}
