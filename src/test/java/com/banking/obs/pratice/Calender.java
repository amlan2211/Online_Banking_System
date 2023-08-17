package com.banking.obs.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	driver.findElement(By.xpath("//span[@class='sc-12foipm-21 lerOcM fswDownArrow']")).click();
	driver.findElement(By.xpath("//div[text()='July 2023']")).click();
	driver.findElement(By.xpath("//div[.='July 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='29']")).click();
	
		
	}

}
