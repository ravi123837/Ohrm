package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_link_text {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=null;
		 String url="http://www.newtours.demoaut.com";
		 driver=new ChromeDriver();
		 driver.get(url);
		// driver.findElement(By.linkText("REGISTER")).click();
		 driver.findElement(By.partialLinkText("REG")).click();
		 System.out.println("the title of the Registerwebpage is:"+driver.getTitle());
		 
		 
		 //<a href="mercuryregister.php">REGISTER</a>

	}

}
