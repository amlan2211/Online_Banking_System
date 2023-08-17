package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
        WebDriver driver;
		
		
		//reading data from property file
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondataproperties.properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String BROWSER = p.getProperty("browser");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		
	//Reading data from excel file	
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		
		
		
		//String mobile1 = String.valueOf(mobile); 
		
		Random r1 = new Random();
		int z1 = r1.nextInt(2023);
		
		Random r2 = new Random();
		int z2 = r2.nextInt(20);
		
		String mobile = wb.getSheet("user details").getRow(1).getCell(2).getStringCellValue();
		
		/*
		 * Random r2 = new Random(); double z2 = r2.nextDouble();
		 * 
		 * String mobile = String.valueOf(z2);
		 */
		
		
		String name =wb.getSheet("user details").getRow(1).getCell(0).getStringCellValue()+z1;
		
		String email = wb.getSheet("user details").getRow(1).getCell(3).getStringCellValue()+z1;
		String landline = wb.getSheet("user details").getRow(1).getCell(4).getStringCellValue()+z1;
		//String landline1 = String.valueOf(landline);
		
	//	String dob = wb.getSheet("user details").getRow(1).getCell(5).getStringCellValue();
		String dob =""+z2+"/02/"+z1+"";
		
		String panno = wb.getSheet("user details").getRow(1).getCell(6).getStringCellValue()+z1;
		String citino = wb.getSheet("user details").getRow(1).getCell(7).getStringCellValue()+z1;
		String homeaddre = wb.getSheet("user details").getRow(1).getCell(8).getStringCellValue()+z1;
		String officeaddre = wb.getSheet("user details").getRow(1).getCell(9).getStringCellValue();
		String pincode = wb.getSheet("user details").getRow(1).getCell(12).getStringCellValue()+z2;
		String area = wb.getSheet("user details").getRow(1).getCell(13).getStringCellValue()+z1;
		String nomineename = wb.getSheet("user details").getRow(1).getCell(14).getStringCellValue()+z1;
		String nomineeno = wb.getSheet("user details").getRow(1).getCell(15).getStringCellValue()+z1;
		
	
		//opening browser
		
		if(BROWSER.equalsIgnoreCase("chromebrowser"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		driver.get(URL);
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		driver.findElement(By.name("name")).sendKeys(name);
		WebElement genderdropdown = driver.findElement(By.name("gender"));
		genderdropdown.click();
		Select s = new Select(genderdropdown);
		s.selectByVisibleText("Female");
		driver.findElement(By.name("mobile")).sendKeys(mobile);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("landline")).sendKeys(landline);
		
	Thread.sleep(2000);
		WebElement dateofbirth = driver.findElement(By.name("dob"));
		dateofbirth.click();
		dateofbirth.sendKeys(""+z2+"/01/"+z1+"");
		
	/*	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		*/
		
		driver.findElement(By.name("pan_no")).sendKeys(panno);
		driver.findElement(By.name("citizenship")).sendKeys(citino);
		driver.findElement(By.name("homeaddrs")).sendKeys(homeaddre);
		driver.findElement(By.name("officeaddrs")).sendKeys(officeaddre);
		
		 WebElement state = driver.findElement(By.name("state"));
		 Select s1 = new Select(state);
		 s1.selectByVisibleText("California");
		 
		WebElement city = driver.findElement(By.name("city"));
		Select s2 = new Select(city);
		s2.selectByVisibleText("Los Angeles");
		
		driver.findElement(By.name("pin")).sendKeys(pincode);
		driver.findElement(By.name("arealoc")).sendKeys(area);
		driver.findElement(By.name("nominee_name")).sendKeys(nomineename);
		driver.findElement(By.name("nominee_ac_no")).sendKeys(nomineeno);
		
		WebElement accountype = driver.findElement(By.name("acctype"));
		
		Select s3 = new Select(accountype);
		s3.selectByVisibleText("Saving");
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("cnfrm-submit")).click();
		
		Alert a = driver.switchTo().alert();
		 String popupmsg = a.getText();
		 String application ="";
		 a.accept();
		 
		 //System.out.println(popupmsg);
		 
		 for(int i= 0; i<popupmsg.length(); i++) {
			 
			 char eachC = popupmsg.charAt(i);
			 if(Character.isDigit(eachC)) {
				 application =application+eachC;
			 }}
		 
			 System.out.println("application---> "+application+"");
			 driver.findElement(By.linkText("Staff Login")).click();
			 driver.findElement(By.name("staff_id")).sendKeys(USERNAME);
			 driver.findElement(By.name("password")).sendKeys(PASSWORD);
			 driver.findElement(By.name("staff_login-btn")).click();
			 driver.findElement(By.name("apprvac")).click();
			 driver.findElement(By.name("application_no")).sendKeys(application);
			 driver.findElement(By.name("search_application")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("approve_cust")).click();
			 Thread.sleep(1000);
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.alertIsPresent());
			 
			 Alert a1 = driver.switchTo().alert();
			 String accountno = a1.getText();
			
			 // System.out.println(accountno);
			 
			 String account ="";
			 a.accept();
			 
			 
			 for(int i= 0; i<accountno.length(); i++) {
				 
				 char eachA = accountno.charAt(i);
				 if(Character.isDigit(eachA)) {
					 account =account+eachA;
				 }}
			 System.out.println("account no--> "+account+"");
			 driver.findElement(By.linkText("Home")).click();
			 driver.findElement(By.xpath("//li[text()='Apply Debit Card']")).click();
			 driver.findElement(By.name("holder_name")).sendKeys(name);
			WebElement db = driver.findElement(By.name("dob"));
			db.click();
			db.sendKeys(""+z2+"/01/"+z1+"");
			 
			 Thread.sleep(10);
				/*
				 * Robot r = new Robot(); r.keyPress(KeyEvent.VK_0); r.keyPress(KeyEvent.VK_1);
				 * r.keyPress(KeyEvent.VK_0); r.keyPress(KeyEvent.VK_1);
				 * r.keyPress(KeyEvent.VK_1); r.keyPress(KeyEvent.VK_9);
				 * r.keyPress(KeyEvent.VK_9); r.keyRelease(KeyEvent.VK_9);
				 */
			 
			 driver.findElement(By.name("pan")).sendKeys(panno);
			 driver.findElement(By.name("mob")).sendKeys(mobile);
			 Thread.sleep(1000);
			 driver.findElement(By.name("acc_no")).sendKeys(account);
			 Thread.sleep(2000);
				
				 driver.findElement(By.name("dbt_crd_submit")).click();
					
					  WebDriverWait wait1 = new WebDriverWait(driver, 20);
					  wait1.until(ExpectedConditions.alertIsPresent());
					  
					  Alert a4 = driver.switchTo().alert();
					  
					  String debitcard = a4.getText(); 
					  
					  //System.out.println(debitcard);
					  
					  String debitcardno =""; a.accept();
					  
					  
					  for(int i= 0; i<debitcard.length(); i++) {
					  
					  char eachA = debitcard.charAt(i); 
					  if(Character.isDigit(eachA)) {
						  debitcardno= debitcardno+eachA; 
						  }}
					  
					  String debitcardno1 = debitcardno.substring(0,12);
					  String pin = debitcardno.substring(12, 16);
					  System.out.println("debitcardno --->"+debitcardno1+"");
					  System.out.println("debit card pin --->"+pin+"");
	driver.findElement(By.linkText("Home")).click();
	WebElement internetbn = driver.findElement(By.partialLinkText("Internet Banking"));
	
	Actions ac = new Actions(driver);
	ac.moveToElement(internetbn);
	ac.perform();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("holder_name")).sendKeys(name);
	driver.findElement(By.name("accnum")).sendKeys(accountno);
	driver.findElement(By.name("dbtcard")).sendKeys(debitcardno1);
	driver.findElement(By.name("dbtpin")).sendKeys(pin);
	driver.findElement(By.name("mobile")).sendKeys(mobile);
	driver.findElement(By.name("pan_no")).sendKeys(panno);
	driver.findElement(By.name("dob")).sendKeys(""+z2+"/01/"+z1+"");
	driver.findElement(By.name("last_trans")).sendKeys("0");
	String pwd = "abc@123";
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.name("cnfrm_password")).sendKeys(pwd);
	driver.findElement(By.name("submit")).click();
	
					  
					  
					  
					  
	}
	

	}


