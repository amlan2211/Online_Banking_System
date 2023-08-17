package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.banking.GenericUtility.FileUtility;
import com.banking.GenericUtility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplyDebitCard {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     FileUtility f =new FileUtility();
			String Af=f.readDataFromPropetyFile("url1");
	     driver.get(Af);
	     driver.findElement(By.xpath("//a[.='Apply Debit Card']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Account Holder Name']")).sendKeys("amlankiranm");
	WebElement ele5= driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		ele5.click();
			ele5.sendKeys("25/02/1996");
			driver.findElement(By.xpath("//input[@placeholder='PAN']")).sendKeys("ABC");
			driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("9090121212");
			driver.findElement(By.xpath("//input[@name='acc_no']")).sendKeys("1011151011896");
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    WebdriverUtility wb=new WebdriverUtility();
		    wb.Alertaccept(driver);
		    String ab= wb.Alerttext(driver);
		    System.out.println(ab+"account no");
		   
		    
		//	 Alert a3=driver.switchTo().alert();
		//	 String accno1=a3.getText();
			 String abb1=ab;
		//	 a3.accept();
			String account1="";
			  
			 for(int k=0;k<abb1.length();k++)
		
			
			 {
				 char chi2=abb1.charAt(k);
				 if(Character.isDigit(chi2))
				 {
					 account1=account1+chi2;
				 }
			 }
			 String aqq1=account1;
			 System.out.println(aqq1);
			 
			 String  aqq2=aqq1.substring(0, aqq1.length());
			 System.out.println(aqq2);
			 String aqq3=aqq1.substring(aqq2.length(),aqq1.length());
			 System.out.println(aqq3);
			 
		/*	 driver.findElement(By.xpath("//a[.='Home']")).click();
			 Actions a=new Actions(driver);
			WebElement ele6= driver.findElement(By.xpath("(//a[@id='ebanking'])[3]"));
			a.moveToElement(ele6).perform();
			 driver.findElement(By.xpath("//a[.='Register']")).click();
			 driver.findElement(By.xpath("//input[@name='holder_name']")).sendKeys("amlankira");
			 driver.findElement(By.xpath("//input[@name='accnum']")).sendKeys("1011861011943");
			 driver.findElement(By.xpath("//input[@name='dbtcard']")).sendKeys(aqq2);
			 driver.findElement(By.xpath("(//input[@name='dbtpin'])")).sendKeys(aqq3);
			 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090121212");
			 driver.findElement(By.xpath("//input[@name='pan_no']")).sendKeys("ABC");
			 WebElement ele7=driver.findElement(By.xpath("//input[@name='dob']"));
			 ele7.click();
			 ele7.sendKeys("25/02/1996");
			 driver.findElement(By.xpath("//input[@name='last_trans']")).sendKeys("0");
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amlan123");
			 driver.findElement(By.xpath("(//input[@name='cnfrm_password'])")).sendKeys("amlan123");
			 driver.findElement(By.xpath("//input[@name='submit']")).click();*/
			 
			 
			 
			 
			
			 
			 
	}

}
