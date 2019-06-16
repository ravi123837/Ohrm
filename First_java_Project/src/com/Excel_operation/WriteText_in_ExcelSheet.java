package com.Excel_operation;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteText_in_ExcelSheet {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		FileInputStream File=new FileInputStream("./excel/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		  
		
		Row r=sheet.createRow(3);
		Cell c=r.createCell(4);
		c.setCellValue("seleniumTesting");
		
		
		
		
		FileOutputStream file1=new FileOutputStream("./excel/Book1.xlsx");
		workbook.write(file1);
		
		
		
	}

}
