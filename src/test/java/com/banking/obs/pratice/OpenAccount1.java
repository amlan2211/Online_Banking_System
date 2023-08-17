package com.banking.obs.pratice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.GenericUtility.FileUtility;
import com.banking.GenericUtility.JavaUtility;
import com.banking.GenericUtility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAccount1 {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileUtility f =new FileUtility();
		String Af=f.readDataFromPropetyFile("url1");
		WebdriverUtility wb=new WebdriverUtility();
		driver.get(Af);
		driver.findElement(By.xpath("//a[.='Open Account']")).click();
		JavaUtility jb= new JavaUtility();
		int ran=jb.getRandomNo();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("amlankiranmi"+ran);
        WebElement ele=driver.findElement(By.xpath("//select[@name='gender']"));
         wb.selectByVisibleText("Male",ele);
         driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090121212");
 		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amlan");
 		driver.findElement(By.xpath("//input[@name='landline']")).sendKeys("06742340101");
 		WebElement ele2=driver.findElement(By.xpath("//input[@name='dob']"));
		ele2.click();
		ele2.sendKeys("25/02/1996");
	}

}
