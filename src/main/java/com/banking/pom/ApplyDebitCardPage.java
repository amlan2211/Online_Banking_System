package com.banking.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyDebitCardPage
{
	@FindBy(xpath="//input[@placeholder='Account Holder Name']")
	private WebElement Account_holdername;
     @FindBy(xpath = "//input[@placeholder='Date of Birth']")
     private WebElement DOB ;
     @FindBy(xpath = "//input[@placeholder='PAN']")
     private WebElement PAN;
     @FindBy(xpath = "//input[@placeholder='Registered Mobile (10 Digit)']")
     private WebElement Register_Mobile;
     @FindBy(xpath = "//input[@placeholder='Account No']")
     private WebElement AccountNo;
     @FindBy(xpath = "//input[@name='dbt_crd_submit']")
     private WebElement Submit;
      public WebElement getSubmit() {
		return Submit;
	}
	public void setSubmit(WebElement submit) {
		Submit = submit;
	}
	public ApplyDebitCardPage(WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
     }
	public WebElement getAccount_holdername() {
		return Account_holdername;
	}
	
	public WebElement getDOB() {
		return DOB;
	}
	
	public WebElement getPAN() {
		return PAN;
	}
	
	public WebElement getRegister_Mobile() {
		return Register_Mobile;
	}
	
	public WebElement getAccountNo() {
		return AccountNo;
	}
	public void applydebit(String name,String Pan,String mobileno,String accountno ) throws AWTException
	{
		Account_holdername.sendKeys(name);
		DOB.click();
		 Robot r=new Robot();
  	   r.keyPress(KeyEvent.VK_1);
  	   r.keyRelease(KeyEvent.VK_1);
  	   r.keyPress(KeyEvent.VK_1);
  	   r.keyRelease(KeyEvent.VK_1);
  	   r.keyPress(KeyEvent.VK_1);
  	   r.keyRelease(KeyEvent.VK_1);
  	   r.keyPress(KeyEvent.VK_1);
  	   r.keyRelease(KeyEvent.VK_1);
  	   r.keyPress(KeyEvent.VK_1);
  	   r.keyRelease(KeyEvent.VK_1);
  	   r.keyPress(KeyEvent.VK_9);
  	   r.keyRelease(KeyEvent.VK_9);
  	   r.keyPress(KeyEvent.VK_9);
  	   r.keyRelease(KeyEvent.VK_9);
  	   r.keyPress(KeyEvent.VK_9);
  	   r.keyRelease(KeyEvent.VK_9);
  	   PAN.sendKeys(Pan);
  	   Register_Mobile.sendKeys(mobileno);
  	   AccountNo.sendKeys(accountno);
  	   Submit.click();
  	   
	}
	
     

}
