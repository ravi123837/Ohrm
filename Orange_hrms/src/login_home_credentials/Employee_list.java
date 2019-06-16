package login_home_credentials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Employee_list {

	public static void main(String[] args) {
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
driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

// id= menu_pim_viewEmployeeList
//<b>PIM</b>
//  //*[@id="menu_pim_viewPimModule"]/b

//id=empsearch_employee_name_empName
driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("ravinder");

//<input type="text" name="empsearch[id]" id="empsearch_id" class="">
driver.findElement(By.id("empsearch_id")).sendKeys("12345");

//id ="empsearch_employee_status"

WebElement employeestatus=driver.findElement(By.id("empsearch_employee_status"));
Select Selection=new Select(employeestatus);
Selection.selectByIndex(2);

//id="empsearch_termination"

WebElement Include=driver.findElement(By.id("empsearch_termination"));
Select Selection1=new Select(Include);
Selection1.selectByIndex(1);



//<input type="text" name="empsearch[supervisor_name]" id="empsearch_supervisor_name" class="ac_input" autocomplete="off">
	driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("Praveen");
	
	//id="empsearch_job_title"
	WebElement jobtitle=driver.findElement(By.id("empsearch_job_title"));
	Select Selection2=new Select(jobtitle);
	Selection2.selectByIndex(2);
	
	//id=empsearch_sub_unit
	
	WebElement subunit=driver.findElement(By.id("empsearch_sub_unit"));
	Select Selection3=new Select(subunit);
	Selection3.selectByIndex(3);
	
	//id="btnAdd"
	driver.findElement(By.id("btnAdd")).click();
	
		
		
		

	}

}
