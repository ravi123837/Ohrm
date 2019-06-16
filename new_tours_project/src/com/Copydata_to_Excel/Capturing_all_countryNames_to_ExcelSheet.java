package com.Copydata_to_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class Capturing_all_countryNames_to_ExcelSheet {

	public static void main(String[] args) throws IOException {
		
		
		
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=null;
		String url="http://www.newtours.demoaut.com";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//<a href="mercuryregister.php?osCsid=7f05c7a93b00e753e37d04ae698efe41">REGISTER</a>

	
	driver.findElement(By.linkText("REGISTER")).click();
	//name="country"
	 WebElement country=driver.findElement(By.name("country"));
	 List <WebElement>countrynames=country.findElements(By.tagName("option"));
	
	 System.out.println("the no.of countries are:"+countrynames.size());
	 
	 
	
	 for(int k=0;k<countrynames.size();k++)
	 {
		 
		 
		 String countryname=countrynames.get(k).getText();
		 System.out.println(countrynames);
		 
		 
		 FileInputStream file=new FileInputStream("./src/excel/Book2.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet=workbook.getSheet("sheet1");
		 
		 
		 for(int i=0;i<countrynames.size();i++)
		 {
			 String  countryname1=countrynames.get(i).getText();
			 System.out.println(countryname1);
			 Row r=sheet.createRow(i);
			 Cell c=r.createCell(0);
			 c.setCellValue(countryname1);
			 
			 FileOutputStream file1=new FileOutputStream("./src/excel/Book2.xlsx");
			 workbook.write(file1);
			 
		 }
		 
	 }
	 driver.quit();
	 
	
	}
	

	



	}


