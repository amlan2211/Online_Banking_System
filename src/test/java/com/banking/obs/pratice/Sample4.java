package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
        String name =wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Gender = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String Mobileno=wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		String email=wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		String landlineno=wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
		String Dob=wb.getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
		String PANnumber=wb.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
		String citizennumber=wb.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
		String homeaddress=wb.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
		String officeaddress=wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
	//	String city=wb.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
		String city=wb.getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
		String pincode=wb.getSheet("Sheet1").getRow(12).getCell(1).getStringCellValue();
		String Area=wb.getSheet("Sheet1").getRow(13).getCell(1).getStringCellValue();
		String NomineeName=wb.getSheet("Sheet1").getRow(14).getCell(1).getStringCellValue();
		String NomineeAccno=wb.getSheet("Sheet1").getRow(15).getCell(1).getStringCellValue();
		String type=wb.getSheet("Sheet1").getRow(16).getCell(1).getStringCellValue();
		String
		
		
		System.out.println(name);
		System.out.println(Gender);
		System.out.println(Mobileno);
		System.out.println(email);
		System.out.println(landlineno);
		System.out.println(Dob);
		System.out.println(PANnumber);
		System.out.println(citizennumber);
		System.out.println(homeaddress);
		System.out.println(officeaddress);
		System.out.println(Area);
		System.out.println(city);
		System.out.println(pincode);
		System.out.println(NomineeName);
		System.out.println(NomineeAccno);
		System.out.println(type);
		


	}

}
