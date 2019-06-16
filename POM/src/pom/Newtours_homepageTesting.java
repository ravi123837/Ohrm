package pom;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Newtours_homepageTesting extends BaseTest{
	
	@Test(priority=1)
	public void homepage() {
		Welcomemercurytours wmt=PageFactory.initElements(driver, Welcomemercurytours.class);
		
		wmt.signin();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.registers();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		
		wmt.support1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
	}
		@Test(priority=2)
		public void leftcredentials() {
			
		Welcomemercurytours wmt=PageFactory.initElements(driver, Welcomemercurytours.class);
		
		wmt. home1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		
		wmt.  flights1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.  hotels1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt. carrentals1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt. cruises1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt. destination1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt. vacation1();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		}
		
		@Test(priority=3)
		public void login() throws IOException {
			
		Welcomemercurytours wmt=PageFactory.initElements(driver, Welcomemercurytours.class);
		
		
		
		wmt.login("mercury","mercury");
		
		
		
		
	}

		}
