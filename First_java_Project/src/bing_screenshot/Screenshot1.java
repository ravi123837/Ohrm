package bing_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 



public class Screenshot1 {

	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		WebDriver driver=null;
		String url="http://www.bing.com";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		File bing_screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(bing_screenshot,new File("./screenshots/bing.png"));
		driver.quit();
		


		
	}

}

