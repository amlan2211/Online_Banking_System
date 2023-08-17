package com.banking.obs.TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.CreditCustomerPage;
import com.banking.pom.Login_Page;


@Listeners(com.banking.GenericUtility.ListnerImpClass.class)
public class CreditCust extends BaseClass
{
     @Test()//retryAnalyzer = com.banking.GenericUtility.RetrImplClass.class)
     public void Creditcust()
     {
    	 
  	 
  	  WebdriverUtility wb =new WebdriverUtility();
	  Login_Page lp =new Login_Page(driver);
      lp.CustomeCredit();
      String acc_no="1011491011476";
      String amount="2000";
      CreditCustomerPage cust= new CreditCustomerPage(driver);
      cust.openaccount(acc_no, amount);
      Assert.fail();
	  String text=wb.Alerttext(driver);
	  System.out.println(text);
	  wb.Alertaccept(driver);
     }
}
