package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM_LOginTest
{
	@Parameters("Browser")
	
	@Test
	 
	 
	 public void login(String browser) throws MalformedURLException
	 {
		System.out.println("the browser name is :"+browser);
		DesiredCapabilities cap=null;
		
		
		
		if(browser.equalsIgnoreCase("firefox")) {
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
	 }

		else if(browser.equalsIgnoreCase("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		RemoteWebDriver driver= new RemoteWebDriver(new URL(" http://192.168.15.112:4444/wd/hub"),cap);
		
		String url="https://opensource-demo.orangehrmlive.com/";
		 driver.get(url);
		 
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		
	 }	

}
