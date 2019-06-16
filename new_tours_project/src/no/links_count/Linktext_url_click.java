package no.links_count;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_url_click {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chroem.driver", "./Drivers/chromedriver.exe");
		
		
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		
	}

}
