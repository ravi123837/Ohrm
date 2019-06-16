package link_testing_exception_handling_sleep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_exeption_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="https://tsrtconline.in/oprs-web/";
		 driver=new ChromeDriver();
		 driver.get(url);
	
		
WebElement headerblock=driver.findElement(By.className("menu"));	


		//class="menu"
		  List<WebElement>headerblock_links=headerblock.findElements(By.tagName("a"));
		  System.out.println("the total no.of links on the Headerblock are:"+headerblock_links.size());
		   
		  
		  
		       for (int n=0;n<headerblock_links.size();n++) {
		    	
		    	  String headerblock_linkname =headerblock_links.get(n).getText();
		       System.out.println(headerblock_linkname);
		       headerblock_links.get(n).click();
		       System.out.println(driver.getTitle());
		       System.out.println(driver.getCurrentUrl());
		      
		       
		       driver.navigate().back();
		       
		       Thread.sleep(9000);
		      headerblock=driver.findElement(By.className("menu"));
		      headerblock_links=driver.findElements(By.tagName("a"));
		      driver.quit();
	}

	}}
