package login_home_credentials;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.record.CurrentUserAtom;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.FileUtils;

public class login_ORHRMS_PIM_addemployee {

	public static void main(String[] args) throws IOException{
		
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		
		
		WebDriver driver=null;
		 String url="https://opensource-demo.orangehrmlive.com/";
		
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
WebElement login=driver.findElement(By.id("btnLogin"));
login.click();

 WebElement pim=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
Actions act=new Actions(driver);
act.moveToElement(pim).perform();
driver.findElement(By.id("menu_pim_addEmployee")).click();

//   <a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>

//<b>PIM</b>
//  //*[@id="menu_pim_viewPimModule"]/b

//  <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
driver.findElement(By.id("firstName")).sendKeys("ravinder");

//id=middleName
driver.findElement(By.id("middleName")).sendKeys("kummari");

//id =lastName

driver.findElement(By.id("lastName")).sendKeys("shalivahana");


//File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyfiles(employee_screenshot,new File("./screenshots/adde.png"));
//id=btnSave
	
driver.findElement(By.id("btnSave")).click();


	
	
/*String expected_url="https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/0010";
System.out.println("the excepted url of AddEmployee"+expected_url);

String Actual_url=driver.getCurrentUrl();
System.out.println("the actual url of AddEmployee is:"+Actual_url);




if(Actual_url.equalsIgnoreCase(expected_url))
{
	System.out.println("successfully navigated to AddEmployee-Pass");	
	
}
else
{
	System.out.println("not navigated to AddEmployee-Fail ");*/
	
}


	}
	

//}
