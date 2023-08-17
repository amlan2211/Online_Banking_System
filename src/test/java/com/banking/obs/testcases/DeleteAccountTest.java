package com.banking.obs.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAccountTest {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Open Account']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("amlankiranmi");
		WebElement ele=driver.findElement(By.xpath("//select[@name='gender']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090121212");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amlan");
		driver.findElement(By.xpath("//input[@name='landline']")).sendKeys("06742340101");
		WebElement ele2=driver.findElement(By.xpath("//input[@name='dob']"));
		ele2.click();
		ele2.sendKeys("25/02/1996");
		driver.findElement(By.xpath("//input[@name='pan_no']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='citizenship']")).sendKeys("123121456");
		driver.findElement(By.xpath("//input[@name='homeaddrs']")).sendKeys("odisha11");
		driver.findElement(By.xpath("//input[@name='arealoc']")).sendKeys("urb1an");
		driver.findElement(By.xpath("//input[@name='officeaddrs']")).sendKeys("ca1lifornia");
		WebElement ele1=driver.findElement(By.xpath("//select[@name='state']"));
		Select s1=new Select(ele1);
		s1.selectByVisibleText("Texas");
		WebElement ele3=driver.findElement(By.xpath("//select[@name='city']"));
		Select s2=new Select(ele3);
		s2.selectByVisibleText("Los Angeles");
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='nominee_name']")).sendKeys("ajay");
		driver.findElement(By.xpath("//input[@name='nominee_ac_no']")).sendKeys("123456");
		WebElement ele4=driver.findElement(By.xpath("//select[@name='acctype']"));
		Select s4=new Select(ele4);
		s4.selectByVisibleText("Saving");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a=driver.switchTo().alert();
		 String abc = a.getText();
		 String cbd=abc;
		 String digit="";
		 a.accept();
		 
		for(int i=0;i<cbd.length();i++)
		{
			char ch=cbd.charAt(i);
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
			
			
		}
		String alpha=digit;
		System.out.println(alpha);
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		 driver.findElement(By.xpath("//input[@class='customer_id']")).sendKeys("210001");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@value='Approve Pending Account']")).click();
		 driver.findElement(By.xpath("//input[@name='application_no']")).sendKeys(alpha);
	     driver.findElement(By.xpath("//input[@value='Search']")).click();
		 driver.findElement(By.xpath("//input[@value='Approve']")).click();
		 Thread.sleep(2000);
//		  WebDriverWait wait=new WebDriverWait(driver, 1);
//	   wait.until(ExpectedConditions.alertIsPresent());
		 Alert a1=driver.switchTo().alert();
		String abb= a1.getText();
		 String dig="";
		 a.accept();
		 
		for(int j=1;j<cbd.length();j++) 		
		{
			char ch=abb.charAt(j);
			if(Character.isDigit(ch))
			{
				dig=dig+ch;
			}
			
			
		}
		System.out.println(dig);
		
		

	}

}
