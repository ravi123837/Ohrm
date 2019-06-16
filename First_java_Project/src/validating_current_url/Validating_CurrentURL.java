package validating_current_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_CurrentURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		 String url="http://facebook.com";
		 driver=new ChromeDriver();
		 driver.get(url);
		
 /*System.out.println("the title of the facebook home page is:"+driver.getTitle());

 
 if(driver.getTitle().contains(url))
 {
	 System.out.println("title matched -pass");
	 
 }
 else 
 {
	 System.out.println("title not matched -Fail");
 }
String expected_url="facebook.com";
System.out.println("the expected url of facebook home page is:"+expected_url);

String actual_url=driver.getCurrentUrl();
System.out.println("the actual url of facebook home page is:"+actual_url);

if(actual_url.contains(expected_url))
{
	System.out.println("successfully navigated to facebook home page-Pass");
}
else
{
	System.out.println("not navigated to fb home page-fail");
	
}

driver.quit();*/




		
		
	}

}
