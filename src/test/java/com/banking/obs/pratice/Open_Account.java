package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Account {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
	     Properties p =new Properties();
	     p.load(fis);

	}

}
