package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCustomerPage
{
	@FindBy(xpath="//input[@name='customer_account_no']")
	private WebElement Cust_ac_no;
     @FindBy(xpath = "//input[@name='credit_amount']")
     private WebElement Amount_1;
     @FindBy(xpath = "//input[@name='credit_btn']")
     private WebElement Amount_btn;
     public CreditCustomerPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
	public WebElement getCust_ac_no() {
		return Cust_ac_no;
	}
	
	
	public WebElement getAmount_1() {
		return Amount_1;
	}
	
	public WebElement getAmount_btn() {
		return Amount_btn;
	}
	
	public void openaccount(String accno,String ammount)
	{
		Cust_ac_no.sendKeys(accno);
		Amount_1.sendKeys(ammount);
		Amount_btn.click();
		
	}
     

}
