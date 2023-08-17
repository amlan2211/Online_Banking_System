package com.banking.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.GenericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staff_LoginPage
{
	
	
	@FindBy(xpath="//input[@name='staff_id']")
	private WebElement username1;
     @FindBy(xpath = "//input[@type='password']")
     private WebElement password1 ;
     @FindBy(xpath = "//input[@class='login-btn']")
     private WebElement Submit_btn;
     public Staff_LoginPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() 
	{
		return username1;
	}
	
	public WebElement getPassword() 
	{
		return password1;
	}

	public WebElement getSubmit_btn() 
	{
		return Submit_btn;
	}
	public   void Staff_Login_input(String url,String username,String password) throws Exception
	{  
		username1.sendKeys(username);
		
		password1.sendKeys(password);
		Submit_btn.click();
		}
	
     
	   
}
