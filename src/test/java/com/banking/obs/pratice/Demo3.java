package com.banking.obs.pratice;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabbadi {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/standings");
		String[] arr= {"Jaipur Pink Panthers","Puneri Paltan","Bengaluru Bulls"};
		String as="null";
		for(int i=0;i<arr.length;i++)
		{
		as=arr[i];
		WebElement ele=driver.findElement(By.xpath("//p[.='"+as+"']//ancestor::div[@class='table-data matches-play']/following-sibling::div[@class='table-data matches-play']/p"));
		String abc= ele.getText();
	     System.out.println(abc);
		}
       
	}

}
