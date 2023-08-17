package com.banking.obs.pratice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlines {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		List<WebElement> listlinks = driver.findElements(By.xpath("//a"));
		System.out.println(listlinks.size());
		ArrayList<String> links =new ArrayList<String>();
		for(int i=0;i<listlinks.size();i++)
		{
			String eachlink=listlinks.get(i).getAttribute("href");
			URL url =null;
			int statuscode=0;
			try
			{
				url= new URL(eachlink) ;
				HttpURLConnection  HttpURLConnection =(HttpURLConnection) url.openConnection();
				statuscode =HttpURLConnection.getResponseCode();
				if(statuscode>=400)
				{
					links.add(eachlink+"---->"+statuscode);
				}
			}
			catch(Exception e)
			{
				links.add(eachlink+"---->"+statuscode);
			}
			
			
		}
		System.out.println(links);
		System.out.println();
	

	}

}
