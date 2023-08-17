package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTranferPage
{  
	@FindBy(xpath="//input[@name='customer_id']")
	private WebElement Cust_id;
     @FindBy(xpath = "//input[@name='password']")
     private WebElement Password;
     
     @FindBy(xpath ="//input[@name='login-btn']")
     private WebElement Login_btn;
     public FundTranferPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
	public WebElement getCust_id() {
		return Cust_id;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin_btn() {
		return Login_btn;
	}
     
}
