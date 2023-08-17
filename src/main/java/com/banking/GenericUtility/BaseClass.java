package com.banking.GenericUtility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.eclipse.sisu.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.banking.pom.HomePage;
import com.banking.pom.Login_Page;
import com.banking.pom.Staff_LoginPage;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{   
	public DataBaseUtility dLib= new DataBaseUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtilities eLib= new ExcelUtilities();
	public JavaUtility jLib=new JavaUtility();
	public WebdriverUtility WLib=new WebdriverUtility();
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(alwaysRun = true)
	
	public void congig_BS() throws Throwable
	{    
		dLib.connectToDB();
		System.out.println("CONNECT TO BROWSER");
	}
	
	@org.testng.annotations.Parameters("BROSWER")
	@BeforeClass(alwaysRun = true)
	public void congig_BC() throws Throwable
	{ 
		String BROSWER=fLib.readDataFromPropetyFile("browser");
		if(BROSWER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		
		
		}
		
		
		System.out.println("launch the broswer");
		
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void config_BM() throws Throwable
	{
	 String USERNAME=fLib.readDataFromPropetyFile("username");
	 String PASSWORD=fLib.readDataFromPropetyFile("password");
	 String URL=fLib.readDataFromPropetyFile("url");
	 driver.get(URL);
	 sdriver=driver;
	 WLib.maximize(driver);
	 HomePage hm=new HomePage(driver);
	 hm.mouseHoveronInternetBanking(driver);
	 WLib.waitforPageLoad(driver);
	 Staff_LoginPage sf= new Staff_LoginPage(driver);
	 sf.Staff_Login_input(URL, USERNAME, PASSWORD); 
	}
	
	@AfterMethod(alwaysRun = true)
	public void Config_AM()
	{
		/*
		 * Login_Page lp=new Login_Page(driver); lp.Logout();
		 * System.out.println("--logout of the application--"); }
		 * 
		 * @AfterClass(alwaysRun = true) public void config_AC() { driver.quit();
		 * System.out.println("--close the broswer--");
		 */
	}
	
	
	@AfterSuite(alwaysRun = true)
	public void config_AS() throws Throwable
	{   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dLib.closeDB();
	}
}
