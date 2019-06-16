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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ohrms_PIM_Addemployee extends Baset_Test_Ohrms {
	
	
	
	@Test(priority=0)
	public void login() throws IOException {
		FileInputStream file=new FileInputStream("./src/com/Excel/ohrms.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
	
	int rowcount=sheet.getLastRowNum();
	

	
	Row r=sheet.getRow(3);
	
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
	}
	
	@Test(priority=1)
	public void AddEmployee() throws IOException {
		
		FileInputStream file1=new FileInputStream("./OrangeHrms.properties");
		Properties pr=new Properties();
		pr.load(file1);
		
		
		
		WebElement pim=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("ravinder");
		driver.findElement(By.id("middleName")).sendKeys("kummari");

		

		driver.findElement(By.id("lastName")).sendKeys("shalivahana");


		
		driver.findElement(By.id("btnSave")).click();


			
			
		String expected_url="https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/0010";
		System.out.println("the excepted url of AddEmployee"+expected_url);

		String Actual_url=driver.getCurrentUrl();
		System.out.println("the actual url of AddEmployee is:"+Actual_url);




		if(Actual_url.equalsIgnoreCase(expected_url))
		{
			System.out.println("successfully navigated to AddEmployee-Pass");	
			
		}
		else
		{
			System.out.println("not navigated to AddEmployee-Fail ");
			
		}
	}

}
