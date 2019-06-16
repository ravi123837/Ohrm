package com.Radiobuttons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Basetest1 {
	
	WebDriver driver=null;
	String url="http://www.echoecho.com/htmlforms10.htm ";
	
	
	@BeforeTest
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		
		
		
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
