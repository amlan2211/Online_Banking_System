package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabbadi {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/standings");
		WebElement ele=driver.findElement(By.xpath("//p[.='Jaipur Pink Panthers']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']//p[@class='count']| //p[.='Jaipur Pink Panthers']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']//p[@class='count']/../following-sibling::div[@class='table-data matches-won']//p[@class='count'][1]"));
		String text=ele.getText();
		System.out.println(text);
	   
       
        

	}

}
