package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataRead.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int ro=sh.getLastRowNum();
		for(int i=0;i<=ro;i++)
		{
			String orgName=sh.getRow(i).getCell(0).getStringCellValue();
			String loc=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(orgName+"---->"+loc);
		}


	}

}
