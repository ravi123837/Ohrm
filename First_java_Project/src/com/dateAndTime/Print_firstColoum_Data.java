package com.dateAndTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_firstColoum_Data {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		WebDriver driver=null;
	String url="https://www.timeanddate.com/worldclock/";
	driver=new ChromeDriver();
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	
	
	
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	
	
	//String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	//String part2="]/td[1]/a";
	
	for( int i=0;i<=36;i++)
	{
		//String cityname=driver.findElement(By.xpath(part1+ i+part2)).getText();
		//System.out.println(cityname);
		driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+ i+"]/td[1]")).getText();
		
	}
	}}
	

