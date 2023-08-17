package com.banking.obs.testcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.banking.GenericUtility.IpathConstants;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.Login_Page;
import com.banking.pom.Staff_LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAccount_Test {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver;
	     FileInputStream fis= new FileInputStream(IpathConstants.filepath);
	     Properties p=new Properties();
	     p.load(fis);
	    String pi= p.getProperty("url");
	    System.out.println(pi);
	    String BROWSER = p.getProperty("browser");
		  //   ExcelUtilities eutil=new ExcelUtilities ();
		     
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
		     driver.get(pi);
		     WebdriverUtility wb=new WebdriverUtility();
		     
		     String username=p.getProperty("username");
		       String password=p.getProperty("password");
		       String acc_no="1011491011476";
		       String amount="2000";
		       Staff_LoginPage sl= new Staff_LoginPage(driver);
				  sl.Staff_Login_input(pi, username, password);
				  Login_Page l=new Login_Page(driver);
				  l.DeleteAcc();

	}

}
