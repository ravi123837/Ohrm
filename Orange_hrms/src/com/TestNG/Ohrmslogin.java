package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ohrmslogin {
	
	WebDriver driver=null;
	
	
	
	@BeforeTest
	public void ohrmslaunch() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		String url="https://opensource-demo.orangehrmlive.com/";
		driver=new ChromeDriver();
		 driver.get(url);
		
		

	}
		@Test(alwaysRun=true)
		
		
		public void pim_addemployee() {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
		}
		@Test(alwaysRun=true)
		public void login() {
			WebElement pim=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
			 Actions act=new Actions(driver);
			 act.moveToElement(pim).perform();
			 driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			
		}
		
             @AfterTest
             public void quit() {
	         driver.quit();
              }
	

}

