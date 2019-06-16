package com.Datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class Baset_Test_Ohrms
{
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	
	@BeforeTest
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		driver=new ChromeDriver();
		 driver.get(url);
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 }

//@AfterTest
public void tearDown() {
	
	driver.quit();
}



}
