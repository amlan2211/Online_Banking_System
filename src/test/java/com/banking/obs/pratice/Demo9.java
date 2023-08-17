package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo9 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://www.kayak.co.in/");
		driver.findElement(By.xpath("//input[@aria-label='Flight destination input']")).sendKeys("delhi");
       WebElement ele= driver.findElement(By.xpath("//span[.='New Delhi, National Capital Territory of India, India']"));
       Actions act=new Actions(driver);
       act.contextClick(ele).perform();
       driver.findElement(By.xpath("//span[@aria-label='Friday August 25th'][1]")).click();
       driver.findElement(By.xpath("//span[@aria-label='Friday September 1st'][1]")).click();
       driver.findElement(By.xpath("//button[@role='button'and @aria-label='Search']")).click();
       
       WebElement ele1=driver.findElement(By.xpath("//div[@role='button'and @class='nrc6-content-section'][1]"));
       String abc=ele1.getText();
       System.out.println(abc);
      // Actions act1=new Actions(driver);
     //  act1.contextClick(ele1).perform();
       
	}

}
