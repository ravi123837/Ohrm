package com.Datadrivenapproachframework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver=null;
	String url="http://www.newtours.demoaut.com/";
	
	
	@BeforeTest
	public void setup()
	
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe" );
		
		
		
		driver=new FirefoxDriver();
		 driver.get(url);
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 }

//@AfterTest
public void tearDown() {
	
	driver.quit();
}



}
