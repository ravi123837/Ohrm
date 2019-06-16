package com.dateAndTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class Date_Time_firstRow_firstColoum {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		WebDriver driver=null;
	String url="https://www.timeanddate.com/worldclock/";
	driver=new ChromeDriver();
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
	driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
	
	
	String cityname=
	System.out.println(cityName);
	
	
	
	
			
	}

}
