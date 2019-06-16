package login_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_username_password {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.className("userName")).sendKeys("ravi");
		driver.findElement(By.className("password")).sendKeys("sashi");
		driver.findElement(By.name("login")).click();

		//<input type="text" name="userName" size="10">
	//<input type="password" name="password" size="10">
	//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=3113bbd6c575a4410590cac94d0e9349" width="58" height="17" alt="Sign-In" border="0">
	
	}
	

}
