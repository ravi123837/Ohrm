package select_deselect_values;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster_value_select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
		
		WebDriver driver=null;
		String url="http://my.monsterindia.com/sponsered-popup.html";
		driver=new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.className("border_gray"));

	}

}
