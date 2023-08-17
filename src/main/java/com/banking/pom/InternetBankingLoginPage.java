package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetBankingLoginPage 
{
	@FindBy(xpath="//input[@class='customer_id']")
	private WebElement customer_id;
     @FindBy(xpath = "//input[@class='password']")
     private WebElement Password ;
     @FindBy(xpath = "//input[@class='login-btn']")
     private WebElement login_btn;
      public InternetBankingLoginPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
	public WebElement getCustomer_id() {
		return customer_id;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getLogin_btn() {
		return login_btn;
	}
	
      

}
