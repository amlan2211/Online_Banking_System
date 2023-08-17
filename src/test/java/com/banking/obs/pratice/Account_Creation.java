package com.banking.obs.pratice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.banking.GenericUtility.BaseClass;
import com.banking.pom.HomePage;
import com.banking.pom.Login_Page;
import com.banking.pom.Open_AccountPage2;

public class Account_Creation extends BaseClass
{
    @Test
    
    public void open_account() throws Throwable
    {
    	Login_Page lg=new Login_Page(driver);
    	lg.goHome();
     HomePage hp =new HomePage(driver);
     hp.OpenAccountPage(driver);
   
    FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook wbi = WorkbookFactory.create(fi);
       String name =wbi.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Gender = wbi.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String Mobileno=wbi.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	    String email=wbi.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
	  	String landlineno=wbi.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
	   String Dob=wbi.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		String PANnumber=wbi.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
		String citizennumber=wbi.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
		String homeaddress=wbi.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
	  	String officeaddress=wbi.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
       String city=wbi.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
		String pincode=wbi.getSheet("Sheet1").getRow(12).getCell(1).getStringCellValue();
		String Area=wbi.getSheet("Sheet1").getRow(13).getCell(1).getStringCellValue();
	String NomineeName=wbi.getSheet("Sheet1").getRow(14).getCell(1).getStringCellValue();
	String NomineeAccno=wbi.getSheet("Sheet1").getRow(15).getCell(1).getStringCellValue();
	String type=wbi.getSheet("Sheet1").getRow(16).getCell(1).getStringCellValue();
		 Open_AccountPage2 op =new Open_AccountPage2(driver);
    op.PassValue(name, Gender, Mobileno, email,landlineno, Dob, PANnumber, citizennumber, homeaddress, officeaddress, city, pincode,Area, NomineeName, NomineeAccno, type);
   
    
     
   
    }
}
