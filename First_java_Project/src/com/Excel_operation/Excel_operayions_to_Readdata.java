package com.Excel_operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_operayions_to_Readdata {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		FileInputStream file= new FileInputStream("./excel/Book1.xlsx");
		
		XSSFWorkbook Workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=Workbook.getSheet("sheet1");
		
		Row r=sheet.getRow(0);
		Cell c=r.getCell(0);
		 String data=c.getStringCellValue();
		 System.out.println(data);
		
		

	}

}
