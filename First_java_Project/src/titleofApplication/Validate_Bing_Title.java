package titleofApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Bing_Title {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	WebDriver driver=null;
	 String url="http://bing.com";
	 driver=new ChromeDriver();
	 driver.get(url);
	String expected_Title="bing";
	System.out.println("the expected Title of bing is:"+expected_Title);
	 String actual_Title=driver.getTitle();
	 System.out.println("the actual Title of bing is:"+actual_Title);
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println("title matched -pass");
		}
			else
			{
				System.out.println("title not matched -fail");
		
			
			
		}
		
	}

}
