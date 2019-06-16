package com.Copydata_to_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Copy_data_from_Excel_to_console {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		FileInputStream file=new FileInputStream("./src/excel/Book2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			Row r=sheet.getRow(i);
		 	int cellcount=r.getLastCellNum();
			
			
			for(int j=0;j<cellcount;j++)
			{
				String data=r.getCell(j).getStringCellValue();
				System.out.println(data+" ");
				
			}
			//System.out.println();
			
		}

	}

}
