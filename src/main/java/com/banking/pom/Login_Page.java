package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(xpath="//input[@value='View Active Customer']")
	private WebElement Active_customer;
     @FindBy(xpath = "//input[@value='View Customer by A/c No']")
     private WebElement view_cust ;
     @FindBy(xpath = "//input[@value='Approve Pending Account']")
     private WebElement Approove;
     @FindBy(xpath = "//input[@value='Delete Customer A/c']")
     private WebElement Delete;
     @FindBy(xpath = "//input[@name='credit_cust_ac']")
     private WebElement Credit;
     @FindBy(xpath = "//input[@type='button']")
     private WebElement Home;
     @FindBy(xpath = "//a[text()='Home']")
     private WebElement HomeButton;
    
	
	
	public WebElement getHomeButton() {
		return HomeButton;
	}
	public WebElement getHome() {
		return Home;
	}
	@FindBy(xpath = "//input[@name='logout_btn']")
     private WebElement Logout;
     public WebElement getLogout() {
		return Logout;
	}
	public Login_Page(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
	public WebElement getActive_customer() 
	{
		return Active_customer;
	}
	
	public WebElement getView_cust() 
	{
		return view_cust;
	}
	
	public WebElement getApproove() 
	{
		return Approove;
	}
	
	public WebElement getDelete() 
	{
		return Delete;
	}
	 
	public WebElement getCredit() 
	{
			return Credit;
	}
	
	
	public void OpenAccount()
	{
		Approove.click();
	}
	
	public void DeleteAcc()
	{
		Delete.click();
	}
	public void Logout()
	{
		Logout.click();
	}
	public void CustomeCredit()
	{
	   Credit.click();
	}
	public void gotoHome()
	{
		Home.click();
	}
	public void goHome()
	{
		HomeButton.click();
	}
	
}
