package com.Datadrivenapproachframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class New_tours_login_Test extends BaseTest{

	@Test
	public void login() throws IOException {
	
		
		FileInputStream file=new FileInputStream("./src/excel/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rowcount=sheet.getLastRowNum();
	
	for(int i=1;i<rowcount;i++)
	{
	Row r=sheet.getRow(i);
	
	driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
	
	driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	
	driver.findElement(By.name("login")).click();
	
	
	
	
	 FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./screenshots"+i+".png"));
	
	
	
	
	String expected_title="FLIGHT FINDER";
	System.out.println("THE Expectedtitle after login is:"+expected_title);
	
	String actual_title=driver.getTitle();
	System.out.println("THE Expectedtitle after login is:"+actual_title);
	
	

	if(actual_title.contains(expected_title))
	{
		
		System.out.println("login successful-PASS");
		r.createCell(2).setCellValue("login successful-PASS");
	}
	
	
	else {
		System.out.println("login Failed-FAIL");
		r.createCell(2).setCellValue("login failed-FAIL");
		
	}
	
	FileOutputStream file1=new FileOutputStream("./src/excel/Book1.xlsx"+"new tours login test results.XLSX");
	
	workbook.write(file1);
	driver.navigate().back();
	driver.navigate().refresh();
	
	
	}
	
	}
	
	
	
	
	
}
