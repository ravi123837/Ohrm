package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linktext_support {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=null;
String url="http://www.newtours.demoaut.com";
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println("the support webpage is :"+driver.getTitle());
		
		
		//<img src="/images/forms/home.gif" width="118" height="23" border="0">
		//<a href="mercuryunderconst.php">SUPPORT</a>
	}

}
