package com.banking.obs.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample9 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele= driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		String price=ele.getText();
		System.out.println(price);
		List<WebElement> names=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-price-whole']"));
		for(int i=0;i<names.size();i++)
		{
			String text=prices.get(i).getText();
			String myprice=text.replace(",", "");
			Integer actualprice=Integer.valueOf(myprice);
			if(actualprice<=70000)
			{
				System.out.println(names.get(i).getText()+""+prices.get(i).getText());
			}
		}

	}

}
