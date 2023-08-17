package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabbadi_Standing{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/standings");
		WebElement ele=driver.findElement(By.xpath("//p[.='Team']/ancestor::div[@class=\"table standings-table\"]/descendant::p[.=\"Bengaluru Bulls\"]/ancestor::div[@class='row-head']/div[@class='table-data matches-play']"));
		
		System.out.println(ele.getText());

	}

}
