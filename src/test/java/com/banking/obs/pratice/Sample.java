package com.banking.obs.pratice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException, SQLException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
	    driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("online banking system");
		driver.findElement(By.name("createdBy")).sendKeys("vijayalakshmi");
		Thread.sleep(2000);
		 WebElement dropdown = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		Select sel=new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByVisibleText("On Gogin");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		com.mysql.cj.jdbc.Driver driver1 = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver1);
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%", "root");
		Statement state = con.createStatement();
		String query="select * from project";
		ResultSet result = state.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actual=result.getString(4);
			if(actual.equalsIgnoreCase(actual))
			{
				flag=true;
				break;
			}
			
		}
		if(flag=true)
		{
			System.out.println("project created successfull");
		}
		
		
		

	}

}
