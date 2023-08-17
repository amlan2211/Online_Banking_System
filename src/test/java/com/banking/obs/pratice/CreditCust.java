package com.banking.obs.pratice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.CreditCustomerPage;
import com.banking.pom.Login_Page;

public class CreditCust extends BaseClass
{
     @Test
     public void Creditcust()
     {
    	 
  	 
  	  WebdriverUtility wb =new WebdriverUtility();
	  Login_Page lp =new Login_Page(driver);
      lp.CustomeCredit();
      String acc_no="1011491011476";
      String amount="2000";
      CreditCustomerPage cust= new CreditCustomerPage(driver);
      cust.openaccount(acc_no, amount);
	  String text=wb.Alerttext(driver);
	  System.out.println(text);
	  wb.Alertaccept(driver);
     }
}
