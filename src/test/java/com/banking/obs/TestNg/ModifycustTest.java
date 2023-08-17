package com.banking.obs.TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.CreditCustomerPage;
import com.banking.pom.Login_Page;

public class ModifycustTest extends BaseClass
{
@Test
public void modifycust()
{

	 WebDriver driver=null;
	 WebdriverUtility wb =new WebdriverUtility();
	Login_Page lp =new Login_Page(driver);
	lp.getCredit();
	   String acc_no="1011491011476";
      String amount="2000";
      CreditCustomerPage cust= new CreditCustomerPage(driver);
		  cust.openaccount(acc_no, amount);
		  String text=wb.Alerttext(driver);
		  System.out.println(text);
		  wb.Alertaccept(driver);
}}
