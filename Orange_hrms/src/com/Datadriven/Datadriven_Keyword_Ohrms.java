package com.Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Datadriven_Keyword_Ohrms extends Baset_Test_Ohrms{

	
	
	
	@Test
	public void loginfunctionality() throws IOException {
		
		FileInputStream file=new FileInputStream("./src/com/Excel/ohrms.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
	
	int rowcount=sheet.getLastRowNum();
	
	for(int i=1;i<=rowcount;i++)
	{
	Row r=sheet.getRow(i);
	
	FileInputStream file1=new FileInputStream("./OrangeHrms.properties");
	Properties pr=new Properties();
	pr.load(file1);
		
	driver.findElement(By.id(pr.getProperty("username"))).clear();
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.id(pr.getProperty("password"))).clear();
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.id(pr.getProperty("Login"))).click();
		
		
		
		
		
		String expected_Title="Orange";
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
		}
		
		FileOutputStream file2=new FileOutputStream("./src/com/Excel/ohrms.xlsx"+"new tours login test results.XLSX");
		
		workbook.write(file2);
		driver.navigate().back();
		
		}
	}
	}

