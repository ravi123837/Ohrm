package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes_newtours {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		
		WebDriver driver=null;
		String url="http://my.monsterindia.com/sponsered-popup.html";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));

		String expected_registerelement=register.getAttribute("href");
		System.out.println("the expected url is "+expected_registerelement);
		register.click();
		
		
		String actual_registerurl=driver.getCurrentUrl();
		System.out.println("the expected Actual url is:"+actual_registerurl);
		
		
		
		if(actual_registerurl.equals(expected_registerelement))
			
		{
			
			System.out.println();
		}
		
		
		
	}

}
