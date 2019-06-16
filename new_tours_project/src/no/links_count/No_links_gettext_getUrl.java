package no.links_count;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_links_gettext_getUrl {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver =null;
		 String url="http://www.newtours.demoaut.com";
		 driver=new ChromeDriver();
		driver.get(url);
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
	int 	linkscount=links.size();
	System.out.println("the total no. of links in new tours home page is:"+linkscount);
	
	 
	for(int i=0;i<linkscount;i++)
	{
		String linkname=links.get(i).getText();
		System.out.println("the name of the link is:"+linkname);
		links.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		driver.quit();

	}
		
		
	}

}
