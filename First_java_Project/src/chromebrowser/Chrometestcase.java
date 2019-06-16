package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometestcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Ravinder//Desktop//selenium photon//First_java_Project//Drivers//chromedriver.exe");
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rajunice111@gmai.com");
		driver.findElement(By.id("pass")).sendKeys("+919160970660");
		
		driver.findElement(By.id("u_0_2")).click();*/
		
		
		
		
		
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		//	<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
	
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.findElement(By.linkText("Images")).click();
		
		
		
		
		
		//<a class="gb_d" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		
		//driver.findElement(By.id("email")).sendKeys("rajunice111@gmai.com");
		//driver.findElement(By.id("pass")).sendKeys("+919160970660");
		
	//	driver.findElement(By.id("u_0_2")).click();
		
		
		
		
		//<a href="https://accounts.google.com/AccountChooser?service=mail&amp;continue=https://mail.google.com/mail/" class="h-c-header__nav-li-link " target="_blank">
       // Sign in
    //  </a>
	}
	
	
	
	

}
