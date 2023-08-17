package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage 
{
	@FindBy(xpath="//input[@name='Cust_ac_no']")
	private WebElement cust_ac;
     @FindBy(xpath = "//input[@name='Cust_ac_Id']")
     private WebElement cust_id;
     @FindBy(xpath = "//input[@placeholder='Reason']")
     private WebElement Reason ;
     @FindBy(xpath = "//input[@name='delete']")
     private WebElement Delete ;
     
     public DeleteCustomerPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }

	public WebElement getCust_ac() {
		return cust_ac;
	}

	public WebElement getCust_id() {
		return cust_id;
	}

	public WebElement getReason() {
		return Reason;
	}

	public WebElement getDelete() {
		return Delete;
	}
	public void DeleteAccount(String acc_no,String Custmer_id,String Reason_1)
	{
		cust_ac.sendKeys(acc_no);
		cust_id.sendKeys(Custmer_id);
		Reason.sendKeys(Reason_1);
		Delete.click();
	}
    
	
}
