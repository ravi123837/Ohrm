package validate_Title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyTitleApplication {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=null;
		String url="http://bing.com";
		driver=new ChromeDriver();
		driver.get(url);
		 String bing_Title=driver.getTitle();
System.out.println("title of bing home page is :"+bing_Title);
driver.close();
	}

}
