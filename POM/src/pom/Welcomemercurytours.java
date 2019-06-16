package pom;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Welcomemercurytours {
	//<a href="mercurysignoff.php">SIGN-OFF</a>
	
@FindBy(linkText="SIGN-ON")
WebElement signon;

public void signin() {
	signon.click();
}

//<a href="mercuryregister.php">REGISTER</a>


@FindBy(linkText="REGISTER")
WebElement register;
public void registers() {
	register.click();
}



@FindBy(linkText="SUPPORT")
WebElement support;
public void support1() {
	support.click();
}


@FindBy(linkText="CONTACT")
WebElement contact;
public void contact1() {
	contact.click();
}


@FindBy(linkText="Home")
WebElement HOME;
public void home1() {
	HOME.click();
}


@FindBy(linkText="Flights")
WebElement FLIGHTS;
public void flights1() {
	FLIGHTS.click();
}

//Hotels,Car Rentals,Cruises,Destinations,Vacations
@FindBy(linkText="Hotels")
WebElement HOTELS;
public void hotels1() {
HOTELS.click();
}


@FindBy(linkText="Car Rentals")
WebElement CARRENTALS;
public void carrentals1() {
	CARRENTALS.click();
}


@FindBy(linkText="Cruises")
WebElement CRUISES;
public void cruises1() {
	CRUISES.click();
}


@FindBy(linkText="Destinations")
WebElement DESTINATIONS;
public void destination1() {
	DESTINATIONS.click();
}


@FindBy(linkText="Vacations")
WebElement VACATIONS;
public void vacation1() {
	VACATIONS.click();
}





@FindBy(name="userName")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(name="login")
WebElement sign;

public void login(String Username,String Password)
{
//	FileInputStream file=new FileInputStream("./src/excel/Book1.xlsx");
//	XSSFWorkbook workbook=new XSSFWorkbook(file);
//	XSSFSheet sheet=workbook.getSheet("sheet1");
//	int rowcount=sheet.getLastRowNum();
//	for(int i=0;i<=rowcount;i++)
//	{
//		Row r=sheet.getRow(i);
//		
//		
//	username.sendKeys(r.getCell(0).getStringCellValue());
//	password.sendKeys(r.getCell(1).getStringCellValue());
	sign.click();
	
	
	
	
	
	
	
	
	
	
}

}
