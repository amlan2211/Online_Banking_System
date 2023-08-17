package com.banking.obs.pratice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.GenericUtility.WebdriverUtility;
import com.banking.pom.CreditCustomerPage;
import com.banking.pom.DeleteCustomerPage;
import com.banking.pom.Login_Page;
@Listeners(com.banking.GenericUtility.ListnerImpClass.class)
public class DeleteCust_Test extends BaseClass {
	@Test
	public void Delete()
	{
		WebdriverUtility wb =new WebdriverUtility();
		  Login_Page lp =new Login_Page(driver);
	      lp.DeleteAcc();
	      String acc_no="1011491011476";
	       String customer_id="1011476";
	       String Reason="doormant";
	       
	      DeleteCustomerPage ds= new DeleteCustomerPage(driver);
	      ds.DeleteAccount(acc_no, customer_id, Reason);
	      
		  String text=wb.Alerttext(driver);
		  System.out.println(text);
		  wb.Alertaccept(driver);
	}

}
