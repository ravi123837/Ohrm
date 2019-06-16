package no.links_count;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_no_links_Avalable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		
		
		
		WebDriver driver=null;
 String url="http://www.newtours.demoaut.com";
 driver=new ChromeDriver();
 driver.get(url);
 List<WebElement> links=driver.findElements(By.tagName("a"));

int linkcount = links.size();
System.out.println("the total no. of links on the new tours home page are:"+linkcount);



	}

}
