package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproveAcctPage
{
	@FindBy(xpath="//input[@name='application_no']")
	private WebElement App_no;
     @FindBy(xpath = "//input[@name='search_application']")
     private WebElement Search_App_No;
     @FindBy(xpath = "//input[@name='approve_cust']")
     private WebElement App_cust;
     public ApproveAcctPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
	public WebElement getApp_no() {
		return App_no;
	}
	public WebElement getSearch_App_No() {
		return Search_App_No;
	}
	public WebElement getApp_cust() {
		return App_cust;
	}
	public void Approve_Acc(String Account) throws InterruptedException
	{
		App_no.sendKeys(Account);
		Search_App_No.click();
		App_cust.click();
	}
     

}
