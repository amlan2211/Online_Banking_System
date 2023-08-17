package com.banking.obs.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.GenericUtility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrediCustomer {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		 driver.findElement(By.xpath("//input[@class='customer_id']")).sendKeys("210001");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@name='credit_cust_ac']")).click();
		 driver.findElement(By.xpath("//input[@name='customer_account_no']")).sendKeys("1011991011511");
		 driver.findElement(By.xpath("//input[@name='credit_amount']")).sendKeys("2000");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	/*	 Alert a2=driver.switchTo().alert();
		 a2.getText();
		 a2.accept();  
		 */
		 WebdriverUtility wb=new WebdriverUtility();
		 wb.Alertaccept(driver);
	     String ab= wb.Alerttext(driver);
	     System.out.println(ab);
	//	  Alert a=driver.switchTo().alert();
	//	  String src=a.getText();
	//	  System.out.println(src);
	//	  a.accept();
		  
		 

	}

}
