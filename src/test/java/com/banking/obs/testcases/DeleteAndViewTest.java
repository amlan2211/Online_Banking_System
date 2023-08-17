package com.banking.obs.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.GenericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAndViewTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{ 
		//for(int i=0;i<50;i++)
	//	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileUtility f =new FileUtility();
		String Af=f.readDataFromPropetyFile("url1");
		driver.get(Af);
        String username=f.readDataFromPropetyFile("username");
		String password=f.readDataFromPropetyFile("password");
		
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		 driver.findElement(By.xpath("//input[@class='customer_id']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@name='viewdet']")).click();
		 
		 String customerid=driver.findElement(By.xpath("//tr[\"1\"]/descendant::td[3]")).getText();
		 System.out.println(customerid);
		 String accountno=driver.findElement(By.xpath("//tr[\"1\"]/descendant::td[4]")).getText();
		 System.out.println(accountno);
		 driver.findElement(By.xpath("//input[@name='home']")).click();
		 driver.findElement(By.xpath("//input[@name='del_cust']")).click();
	 driver.findElement(By.xpath("//input[@name='Cust_ac_no']")).sendKeys(accountno);
	 driver.findElement(By.xpath("//input[@name='Cust_ac_Id']")).sendKeys(customerid);
		 driver.findElement(By.xpath("//input[@name='reason']")).sendKeys("clear");
		 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='delete']")).click();
	  Thread.sleep(2000);
	  Alert a=driver.switchTo().alert();
	  a.accept();
	 driver.findElement(By.xpath("//a[.='Staff Login']")).click();
	 driver.findElement(By.xpath("//input[@name='view_cust_by_ac']")).click();
	 driver.findElement(By.xpath("//input[@name='account_no']")).sendKeys("1011951011347");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
		// driver.quit();
		//}
		 
		
		 
		
	    
		
		
		
		

	}

}
