package visible_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHMS_HeaderBlock_Elementscount_displayNames {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 
		 
		 String username="Admin";
			String password="admin123";
			
			driver=new ChromeDriver();
			driver.get(url);
		
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			//driver.findElement(By.id("txtPassword")).sendKeys(password);
			WebElement Password=driver.findElement(By.id("txtPassword"));
			Password.sendKeys(password);
			
			WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();
					//driver.findElement(By.id("btnLogin")).click();
			
			
			//<input name="txtUsername" id="txtUsername" type="text">
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			
	
			
			
WebElement headerblock=driver.findElement(By.className("menu"));

//class="menu"
  List<WebElement>headerblock_links=headerblock.findElements(By.tagName("a"));
  System.out.println("the total no.of links on the Headerblock are:"+headerblock_links.size());
   
  
  
       for (int n=0;n<headerblock_links.size();n++) {
    	
    	  String headerblock_linkname =headerblock_links.get(n).getText();
       System.out.println(headerblock_linkname);
       headerblock_links.get(n).click();
       }

	}

}
