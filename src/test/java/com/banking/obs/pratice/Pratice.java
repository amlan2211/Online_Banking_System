package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.banking.GenericUtility.ExcelUtilities;
import com.banking.GenericUtility.IpathConstants;
import com.banking.pom.HomePage;
import com.banking.pom.Login_Page;
import com.banking.pom.Staff_LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratice {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
	     FileInputStream fis= new FileInputStream(IpathConstants.filepath);
	     Properties p=new Properties();
	     p.load(fis);
	    String url= p.getProperty("url1");
	    String username=p.getProperty("username");
	    String password=p.getProperty("password");
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
	     HomePage h=new HomePage(driver);
	     h.mouseHoveronInternetBanking(driver);
	     Staff_LoginPage st= new Staff_LoginPage(driver);
	     st.Staff_Login_input(url, username, password);
	     Login_Page l=new Login_Page(driver);
	     l.OpenAccount();

	}

}
