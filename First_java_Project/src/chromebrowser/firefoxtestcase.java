package chromebrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtestcase {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com");


	}

}
