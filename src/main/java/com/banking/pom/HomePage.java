package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.GenericUtility.WebdriverUtility;

public class HomePage {
	    WebdriverUtility wb=new WebdriverUtility();
		@FindBy(xpath="//a[.='Staff Login']")
		private WebElement login_btn;
	     @FindBy(xpath = "//a[.='Open Account']")
	     private WebElement OpenAccount;
	     
	     @FindBy(xpath ="//a[.='Apply Debit Card']")
	     private WebElement ApplyDebitcard;
	     @FindBy(xpath="//div[@class='ebanking']")
	     private WebElement InternetBanking;
	     @FindBy(xpath="//a[.='Fund Transfer']")
	     private WebElement FundTranfer;
	     @FindBy(xpath="//li[.='Login ']")
	     private WebElement Login;
	     @FindBy(xpath="//li[.='Register']")
	     private WebElement Register;
	     

	     
	    public HomePage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
		public WebElement getLogin_btn() {
			return login_btn;
		}
		
		public WebElement getOpenAccount() {
			return OpenAccount;
		}
		
		public WebElement getApplyDebitcard() {
			return ApplyDebitcard;
		}
	
		public WebElement getInternetBanking() {
			return InternetBanking;
		}
		
		public WebElement getFundTranfer() {
			return FundTranfer;
		}
		public void mouseHoveronInternetBanking(WebDriver driver)
		{ 
			
			login_btn.click();
		}
		public void OpenAccountPage(WebDriver driver)
		{
			OpenAccount.click();
		}

		
		   
		{
			
		}
	    
}
