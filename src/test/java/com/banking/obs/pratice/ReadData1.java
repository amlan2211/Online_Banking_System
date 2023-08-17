package com.banking.obs.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataRead.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row ro = sh.getRow(1);
		Cell cel = ro.getCell(0);
		String value = cel.getStringCellValue();
		System.out.println(value);
		//wb.close();
		sh.createRow(4).createCell(0).setCellValue("shiva");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\DataRead.xlsx");
		wb.write(fos);
	
		fos.flush();
		wb.close();

	}

}
