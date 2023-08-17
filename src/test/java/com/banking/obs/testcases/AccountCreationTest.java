package com.banking.obs.testcases;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.banking.GenericUtility.ExcelUtilities;
import com.banking.GenericUtility.IpathConstants;
import com.banking.GenericUtility.JavaUtility;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.ApplyDebitCardPage;
import com.banking.pom.ApproveAcctPage;
import com.banking.pom.HomePage;
import com.banking.pom.InternetBankingRegisterPage;
import com.banking.pom.Login_Page;
import com.banking.pom.Open_AccountPage2;
import com.banking.pom.Staff_LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountCreationTest {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver;
	     FileInputStream fis= new FileInputStream(IpathConstants.filepath);
	     Properties p=new Properties();
	     p.load(fis);
	     String url=p.getProperty("url2");
	     String url1=p.getProperty("url");
	     String url3=p.getProperty("url8");
	     String url5=p.getProperty("url1");
	     
	     String BROWSER = p.getProperty("browser");
	     ExcelUtilities eutil=new ExcelUtilities ();
	     
	     if(BROWSER.equalsIgnoreCase("chrome"))
	     {
	    	 WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
	     }
	     else
	     {
	    	 WebDriverManager.edgedriver().setup();
		     driver = new EdgeDriver();
	     }
	     driver.get(url);
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     JavaUtility jv=new JavaUtility();
    	 int no=jv.getRandomNo();
	     
	     
	     String name= eutil.readDataFromExcel("Sheet1", 1, 1);
	     System.out.println(name);
			String Gender = eutil.readDataFromExcel("Sheet1", 2, 1);
			String mobileno=eutil.readDataFromExcel("Sheet1", 3, 1);
			String email=eutil.readDataFromExcel("Sheet1", 4, 1);
			String landlineno=eutil.readDataFromExcel("Sheet1", 5, 1);
		//    String Dob=eutil.readDataFromExcel("Sheet1", 6, 1);
			//System.out.println(Dob);
			String PANnumber=eutil.readDataFromExcel("Sheet1", 7, 1);
			String citizennumber=eutil.readDataFromExcel("Sheet1", 8, 1);
			String homeaddress=eutil.readDataFromExcel("Sheet1", 9, 1);
			String officeaddress=eutil.readDataFromExcel("Sheet1", 10, 1);
	    	String city=eutil.readDataFromExcel("Sheet1", 11, 1);
			String pincode=eutil.readDataFromExcel("Sheet1", 12, 1);
			String Area=eutil.readDataFromExcel("Sheet1", 13, 1);
			String nominee=eutil.readDataFromExcel("Sheet1", 14, 1);
			String NomineeAccno=eutil.readDataFromExcel("Sheet1", 15, 1);
			String type=eutil.readDataFromExcel("Sheet1", 16, 1);
			String state=eutil.readDataFromExcel("Sheet1", 17, 1);
			String password1=eutil.readDataFromExcel("Sheet1", 18, 1);
			System.out.println(password1);
			String conpassword=eutil.readDataFromExcel("Sheet1", 19, 1);
			
			
			Open_AccountPage2 acc=new Open_AccountPage2(driver);
			acc.PassValue(name+no,mobileno, Gender, email, landlineno, PANnumber, citizennumber,homeaddress,officeaddress,state,city,pincode,Area,nominee, NomineeAccno, type);
			WebdriverUtility wb=new WebdriverUtility();
			
			String alt=wb.Alerttext(driver);
			String abc=alt;
			String digit="";
			for(int i=0;i<abc.length();i++)
			{
				char ch=abc.charAt(i);
				if(Character.isDigit(ch))
				{
					digit=digit+ch;
				}
				
				
			}
			String alpha=digit;
			System.out.println(alpha);
			wb.Alertaccept(driver);
		    driver.get(url1);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       String username=p.getProperty("username");
            String password=p.getProperty("password");
	    
	     Staff_LoginPage sl= new Staff_LoginPage(driver);
		  sl.Staff_Login_input(url, username, password);
		  Login_Page l=new Login_Page(driver);
		  l.OpenAccount();
		  ApproveAcctPage A1=new ApproveAcctPage(driver);
		  A1.Approve_Acc(alpha);
		  String xyz=wb.Alerttext(driver);
			String adc=xyz;
			String digit1="";
			for(int i=0;i<adc.length();i++)
			{
				char ch=adc.charAt(i);
				if(Character.isDigit(ch))
				{
					digit1=digit1+ch;
				}
				
				
			}
			
			String beta=digit1;
			System.out.println(beta);
			wb.Alertaccept(driver);
			driver.get(url1);
			String ur2=p.getProperty("url3");
			driver.get(ur2);
			ApplyDebitCardPage ap =new ApplyDebitCardPage(driver);
			ap.applydebit(name+no, PANnumber, mobileno,beta);
			String bgc=wb.Alerttext(driver);
			System.out.println(bgc);
		
			String digit2="";
			for(int i=0;i<bgc.length();i++)
			{
				char ch=bgc.charAt(i);
				if(Character.isDigit(ch))
				{
					digit2=digit2+ch;
				}
				
				
			}
			
		   System.out.println(digit2);
		String aqq1=digit2;
		 System.out.println(aqq1);
		 
		 String  Debit_cardno=aqq1.substring(0, aqq1.length()-4);
		 System.out.println(Debit_cardno+"Debit card no");
		 String Debit_cardPin=aqq1.substring(Debit_cardno.length(),aqq1.length());
		 System.out.println(Debit_cardPin+"Debit card pin ");
		
		wb.Alertaccept(driver);
		driver.get(url3);
		InternetBankingRegisterPage it=new InternetBankingRegisterPage(driver);
		String tran="0";
		String password2="amlan123@";
		
		it.InternetBanking(name+no, beta, Debit_cardno, Debit_cardPin, mobileno, PANnumber,tran,password2,password2);
		String mac =wb.Alerttext(driver);
		System.out.println(mac);
	
		String cust_id="";
		for(int i=0;i<mac.length();i++)
		{
			char ch=mac.charAt(i);
			if(Character.isDigit(ch))
			{
				cust_id=cust_id+ch;
			}
			
			
		}
		
	   System.out.println(cust_id);
	   wb.Alertaccept(driver);
	  driver.get(url5);
	  HomePage h=new HomePage(driver);
	   h.mouseHoveronInternetBanking(driver);

		  
		  

	}

}
