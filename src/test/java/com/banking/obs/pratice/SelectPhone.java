package com.banking.obs.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectPhone {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String[] arr={"Samsung","Redmi","realme","OnePlus","Nokia","Tecno","iQOO"};
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String as=null;
		
		
		for(int i=0;i<arr.length;i++)
		{
			 as=arr[i];
			System.out.println(as);
			WebElement ele=driver.findElement(By.xpath("//div[@id='brandsRefinements']//ul[@data-csa-c-slot-id='nav-ref']//span[.='"+as+"']"));
			ele.click();
			
			 
		}
		
		
		
		
	  
		

}
}
