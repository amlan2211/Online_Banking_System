package com.banking.obs.pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.banking.GenericUtility.ExcelUtilities;
import com.banking.GenericUtility.JavaUtility;
import com.banking.GenericUtility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAccount {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{   
	
		
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebdriverUtility wb=new WebdriverUtility();
		JavaUtility jb= new JavaUtility();
		int ran=jb.getRandomNo();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wbi = WorkbookFactory.create(fi);
        String name =wbi.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Gender = wbi.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String Mobileno=wbi.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		String email=wbi.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		String landlineno=wbi.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
		String Dob=wbi.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		String PANnumber=wbi.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
		String citizennumber=wbi.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
		String homeaddress=wbi.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
		String officeaddress=wbi.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
	//	String city=wb.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
		String city=wbi.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
		String pincode=wbi.getSheet("Sheet1").getRow(12).getCell(1).getStringCellValue();
		String Area=wbi.getSheet("Sheet1").getRow(13).getCell(1).getStringCellValue();
		String NomineeName=wbi.getSheet("Sheet1").getRow(14).getCell(1).getStringCellValue();
		String NomineeAccno=wbi.getSheet("Sheet1").getRow(15).getCell(1).getStringCellValue();
		String type=wbi.getSheet("Sheet1").getRow(16).getCell(1).getStringCellValue();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.findElement(By.xpath("//a[.='Open Account']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name+ran);
		WebElement ele=driver.findElement(By.xpath("//select[@name='gender']"));
		wb.selectByVisibleText("Male", ele);
	//	Select s=new Select(ele);
	//	s.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(Mobileno);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='landline']")).sendKeys(landlineno);
		
		driver.findElement(By.xpath("//input[@name='pan_no']")).sendKeys(PANnumber);
		driver.findElement(By.xpath("//input[@name='citizenship']")).sendKeys(Dob);
		driver.findElement(By.xpath("//input[@name='homeaddrs']")).sendKeys(homeaddress);
		driver.findElement(By.xpath("//input[@name='arealoc']")).sendKeys(Area);
		driver.findElement(By.xpath("//input[@name='officeaddrs']")).sendKeys(officeaddress);
		WebElement ele1=driver.findElement(By.xpath("//select[@name='state']"));
		wb.selectByVisibleText("Texas", ele1);
//		Select s1=new Select(ele1);
//		s1.selectByVisibleText("Texas");
		WebElement ele3=driver.findElement(By.xpath("//select[@name='city']"));
		wb.selectByVisibleText("Los Angeles", ele3);
		//Select s2=new Select(ele3);
	//	s2.selectByVisibleText("");
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='nominee_name']")).sendKeys("ajay");
		driver.findElement(By.xpath("//input[@name='nominee_ac_no']")).sendKeys("123456");
		WebElement ele4=driver.findElement(By.xpath("//select[@name='acctype']"));
		//Select s4=new Select(ele4);
	//	s4.selectByVisibleText("Saving");
		wb.selectByVisibleText("Saving", ele4);
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
		int i=Integer.parseInt(alpha);
		System.out.println(i);
		
		
		 
		 driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		 driver.findElement(By.xpath("//input[@class='customer_id']")).sendKeys("210001");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@value='Approve Pending Account']")).click();
		 driver.findElement(By.xpath("//input[@name='application_no']")).sendKeys(alpha);
	     driver.findElement(By.xpath("//input[@value='Search']")).click();
		 driver.findElement(By.xpath("//input[@value='Approve']")).click();
		 
	  WebDriverWait wait=new WebDriverWait(driver, 1);
	  wait.until(ExpectedConditions.alertIsPresent());
	  driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
	     driver.findElement(By.xpath("//a[.='Apply Debit Card']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Account Holder Name']")).sendKeys("amlankiranmi");
	WebElement ele5= driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		ele5.click();
			ele5.sendKeys("25/02/1996");
			driver.findElement(By.xpath("//input[@placeholder='PAN']")).sendKeys("ABC");
			driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("9090121212");
			driver.findElement(By.xpath("//input[@name='acc_no']")).sendKeys("1011531011585");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wb.Alertaccept(driver);
		String ab= wb.Alerttext(driver);
	//		 Alert a3=driver.switchTo().alert();
	//		 String accno1=a3.getText();
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
			
		
		 Alert a2=driver.switchTo().alert();
		 String accno=a2.getText();
		 String abb=accno;
		  a2.accept();
		String account="";
		  
		 for(int j=0;j<abb.length();j++)
	
		
		 {
			 char chi=abb.charAt(j);
			 if(Character.isDigit(chi))
			 {
				 account=account+chi;
			 }
		 }
		 String aqq=account;
		 System.out.println(aqq);
		/* 
		
	
		driver.findElement(By.xpath("//a[.='Home']")).click();
		 driver.findElement(By.xpath("//a[.='Apply Debit Card']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Account Holder Name']")).sendKeys("amlanki");
		WebElement ele5= driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		ele5.click();
		ele5.sendKeys("25/02/1996");
		driver.findElement(By.xpath("//input[@placeholder='PAN']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("9090121212");
		driver.findElement(By.xpath("//input[@name='acc_no']")).sendKeys(aqq);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Alert a3=driver.switchTo().alert();
		 String accno1=a3.getText();
		 String abb1=accno1;
		 a3.accept();
		String account1="";
		  
		 for(int k=0;k<abb1.length();k++)
	
		
		 {
			 char chi2=abb1.charAt(k);
			 if(Character.isDigit(chi2))
			 {
				 account1=account+chi2;
			 }
		 }
		 String aqq1=account1;
		 System.out.println(aqq1);
		
			 */ 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data1.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("url");
		String user=p.getProperty("username");
		String pass=p.getProperty("password");
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("staff_id")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("staff_login-btn")).click();*/

	}

}
