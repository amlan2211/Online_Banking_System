package com.banking.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.GenericUtility.ExcelUtilities;
import com.banking.GenericUtility.JavaUtility;
import com.banking.GenericUtility.WebdriverUtility;



public class Open_AccountPage2 
{
	@FindBy(xpath="//input[@name='name']")
	private WebElement name1;
     @FindBy(xpath = "//input[@name='mobile']")
     private WebElement mobile1 ;
     @FindBy(xpath = "//select[@name='gender']")
     private WebElement gender1;
     @FindBy(xpath = "//input[@name='email']")
     private WebElement email1;
     @FindBy(xpath = "//input[@placeholder='Landline no']")
     private WebElement Credit1;
     
     @FindBy(xpath="//input[@placeholder='Date of Birth']")
 	private WebElement DOB1;
     
      @FindBy(xpath = "//input[@placeholder='PAN Number']")
      private WebElement PAN1;
      
      @FindBy(xpath = "//input[@placeholder='Citizenship Number']")
      private WebElement citizen_no1;
      
      @FindBy(xpath = "//input[@placeholder='Home Address']")
      private WebElement HomeAddress1;
      
      @FindBy(xpath = "//input[@placeholder='Office Address']")
      private WebElement OfficeAddress1;
      
      @FindBy(xpath="//select[@name='state']")
  	private WebElement State1;
      
       @FindBy(xpath = "//select[@name='city']")
       private WebElement city1 ;
       
       @FindBy(xpath = "//input[@name='pin']")
       private WebElement Pin1;
       
       @FindBy(xpath = "//input[@name='arealoc']")
       private WebElement Area1;
       
       @FindBy(xpath = "//input[@name='nominee_name']")
       private WebElement nominee1;
       
       @FindBy(xpath = "//input[@name='nominee_ac_no']")
       private WebElement nominee_ac1;
       
       @FindBy(xpath = "//select[@name='acctype']")
       private WebElement Acc_type1;
       
       @FindBy(xpath = "//input[@type='submit']")
       private WebElement Submit_btn1;
      @FindBy(xpath = "//input[@type='submit']")
       private WebElement Submit_btn_2;
       public WebElement getSubmit_btn_2() {
		return Submit_btn_2;
	}
	public void setSubmit_btn_2(WebElement submit_btn_2) {
		Submit_btn_2 = submit_btn_2;
	}
	public Open_AccountPage2(WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
	public WebElement getName1() {
		return name1;
	}
	public WebElement getMobile1() {
		return mobile1;
	}
	public WebElement getGender1() {
		return gender1;
	}
	public WebElement getEmail1() {
		return email1;
	}
	public WebElement getCredit1() {
		return Credit1;
	}
	public WebElement getDOB1() {
		return DOB1;
	}
	public WebElement getPAN1() {
		return PAN1;
	}
	public WebElement getCitizen_no1() {
		return citizen_no1;
	}
	public WebElement getHomeAddress1() {
		return HomeAddress1;
	}
	public WebElement getOfficeAddress1() {
		return OfficeAddress1;
	}
	public WebElement getState1() {
		return State1;
	}
	public WebElement getCity1() {
		return city1;
	}
	public WebElement getPin1() {
		return Pin1;
	}
	public WebElement getArea1() {
		return Area1;
	}
	public WebElement getNominee1() {
		return nominee1;
	}
	public WebElement getNominee_ac1() {
		return nominee_ac1;
	}
	public WebElement getAcc_type1() {
		return Acc_type1;
	}
	public WebElement getSubmit_btn1() {
		return Submit_btn1;
	}
	  ExcelUtilities eutil=new ExcelUtilities ();
       public void PassValue(String name,String mobile,String gender,String email,String landlineno,String Pan,String citizen_no,String Homeaddress,String OfficeAddress,String State,String city,String pin,String Area,String nominee,String nominee_ac,String acc_type) throws Throwable
       {  
    	   JavaUtility jv=new JavaUtility();
    	 int no=jv.getRandomNo();
    	   
    	   name1.sendKeys(name);
    	   mobile1.sendKeys(mobile);
    	   gender1.sendKeys(gender);
    	   email1.sendKeys(email);
    	   Credit1.sendKeys(landlineno);
    	   DOB1.click();
    	   
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
    	   
    	//   DOB1.sendKeys(Dob);
    	  
    	//   DOB1.click();
    	   PAN1.sendKeys(Pan);
    	   citizen_no1.sendKeys(citizen_no);
    	   HomeAddress1.sendKeys(Homeaddress);
    	   OfficeAddress1.sendKeys(OfficeAddress);
    	   State1.sendKeys(State);
    	   city1.sendKeys(city);
    	   Pin1.sendKeys(pin);
    	   Area1.sendKeys(Area);
    	   nominee_ac1.sendKeys(nominee_ac);
    	   nominee1.sendKeys(nominee);
    	   Acc_type1.sendKeys(acc_type);
    	   Submit_btn1.click();
    	   Submit_btn_2.click();
    	   
    	   
    	   
    	   
       }
}
