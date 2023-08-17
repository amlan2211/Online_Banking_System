package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCustPage
{
	@FindBy(xpath="//input[@name='account_no']")
	private WebElement Acc_no;
     @FindBy(xpath = "//input[@name='submit_view']")
     private WebElement Submit ;
     public ViewCustPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
	public WebElement getAcc_no() {
		return Acc_no;
	}
	public WebElement getSubmit() {
		return Submit;
	}
     public void Viewcustomer(int acc_no)
     {
    	 Acc_no.sendKeys("122333444");
     }

}
