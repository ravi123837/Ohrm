package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours_dropdown_register_country {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=null;
		String url="http://www.newtours.demoaut.com";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		
		//<a href="mercuryregister.php?osCsid=7f05c7a93b00e753e37d04ae698efe41">REGISTER</a>

	
	driver.findElement(By.linkText("REGISTER")).click();
	//name="country"
	 WebElement country=driver.findElement(By.name("country"));
	
	 
	 
	 Select selection=new Select(country);
	 selection.selectByIndex(5);
	 
	 driver.quit();
	 
	
	}
	

}
