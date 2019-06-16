package com.Datadrivenapproachframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Keyword extends BaseTest {
	
	
	
	@Test
	public void loginNewtours() throws IOException {
		

		FileInputStream file1=new FileInputStream("./src/excel/Book1.xlsxnew tours login test results.XLSX");
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			Row r=sheet.getRow(i);
			
			
			FileInputStream file=new FileInputStream("./newtours.properties");
			Properties pr=new Properties();
			pr.load(file);
			
			
			driver.findElement(By.name(pr.getProperty("Username"))).clear();
			driver.findElement(By.name(pr.getProperty("Username"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Password"))).clear();
			driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
			
			driver.findElement(By.name(pr.getProperty("signin"))).click();
			
			
			String expected_Title="Find";
			System.out.println("the expected title aftr successfull login is "+expected_Title);
			String actial_title=driver.getTitle();
			System.out.println("the actual title after login is :"+actial_title);
			
			
			
			if(actial_title.contains(expected_Title))
			{
				System.out.println("login successful-PASS");
				r.createCell(4).setCellValue("login successful-PASS");
				
			}
			
			else
			{
				System.out.println("login failed-FAIL");
				r.createCell(4).setCellValue("loginfail");
				
				FileOutputStream file2=new FileOutputStream("./src/excel/Book1.xlsxnew tours login test results.XLSX");
				workbook.write(file2);
				
			}
			
			driver.navigate().back();
			
			
			
				
			

}
}}