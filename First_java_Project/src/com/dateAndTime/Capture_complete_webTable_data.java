package com.dateAndTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_complete_webTable_data {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock/";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		
		 //  /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		
		List<WebElement>row= driver.findElements(By.tagName("tr"));
		
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement>coloumns=row.get(i).findElements(By.tagName("td"));
			
			
			for(int j=0;j<coloumns.size();j++)
			{
				String data=coloumns.get(j).getText();
				System.out.println(data+"  ");
				
			}
			System.out.println();
		}
		
		
	}

}
