package login_home_credentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Ohrms_login_credentials {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver=new ChromeDriver();
		 driver.get(url);
		 

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.quit();

//<input name="txtUsername" id="txtUsername" type="text">
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


	}

}
