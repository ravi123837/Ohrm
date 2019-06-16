package loginhrms_pim_validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hrms_login_PIM_validation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver=new ChromeDriver();
		 driver.get(url);
		 

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();

//id="menu_pim_viewPimModule"
//WebElement pim_element=driver.findElement(By.id("menu_pim_viewPimModule"));
//id="menu_pim_addEmployee"

//WebElement addemployee=driver.findElement(By.id("menu_pim_addEmployee"));

//Actions act=new Actions(driver);
//act.moveToElement().;


	}

}
