package visible_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHMS_login_displaying_linkname {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/";
		
		
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
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("the total no. links are:"+links.size());
		for(int k=0;k<links.size();k++)
		{
			if(links.get(k).isDisplayed())
			         {
				String linkname=links.get(k).getText();
				System.out.println(linkname);
				
				      }
	}
	
	
	}

}
