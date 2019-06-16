package keyboard_operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb_login_keyboard {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="https://www.facebook.com/";
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 
		 driver.findElement(By.id("email")).sendKeys("rajunice111@gmail.com");
		 
		 Actions act=new Actions(driver); 
		 
		 

	}

}
