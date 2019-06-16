package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Ohrms_Login_functionality_Datadriven {
	
WebDriver driver=null;
String url="https://opensource-demo.orangehrmlive.com/";
	
	
	@BeforeTest
	public void ohrmslaunch() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		String url="https://opensource-demo.orangehrmlive.com/";
		driver=new ChromeDriver();
		 driver.get(url);
		
		

	}
		@Test
		
		
		public void Ohrmslogin() throws IOException {
			
		
			FileInputStream file=new FileInputStream("./src/com/Excel/Book1.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<rowcount;i++)
		{
		Row r=sheet.getRow(i);
			
			
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			
			driver.findElement(By.id("btnLogin")).click();
			
			
			
			String expected_title="Dashboard";
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
			
			FileOutputStream file1=new FileOutputStream("./src/com/Excel/Book1.xlsx"+"new tours login test results.XLSX");
			
			workbook.write(file1);
			driver.navigate().back();
			
			}
		}
	
		
		}
