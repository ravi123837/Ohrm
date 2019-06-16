package com.StepDown1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRM_Multipleset_Data {

	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";

@Given("^open firefox browser and navigate to orangeHRm application$")
public void open_firefox_browser_and_navigate_to_orangeHRm_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
   
}

@When("^user enters valid\"([^\"]*)\"and\"([^\"]*)\"and click on sigin button$")
public void user_enters_valid_and_and_click_on_sigin_button(String Username , String Password) throws Throwable {
	
	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
   
}

@Then("^User should be able to successfully login to OrangeHRM application and close$")
public void User_should_be_able_to_successfully_login_to_OrangeHRM_application_and_close() throws Throwable {
    
	try {
		
		String expected_text="Welcome Admin";
		System.out.println("the expected text is:"+expected_text);
		
		String actual_text=driver.findElement(By.id("welcome")).getText();
		System.out.println("the actual text is"+actual_text);
		
		if(actual_text.contains(expected_text))
		{
			System.out.println("successfully login-PASS");
		}
	}
  catch(Exception e)
	{
	  if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
			  {
		 // File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils(Screenshot,newfile("./screenshot.png"));
		 
		 // FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./screenshots.png"));
		  
		  System.out.println("login failed_FAIL");
		 
		  driver.quit();
		  
}

	}

}}
