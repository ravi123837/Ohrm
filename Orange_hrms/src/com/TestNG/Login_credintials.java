package com.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_credintials {
	
	@Test(priority=0)
	public void applicationlaunch(){
		System.out.println("gmail application launch");
	}
	
@Test(priority=1)
public void login() {
	System.out.println("login functionality Testing");
}

@Test(priority=2)
public void composemail() {
	System.out.println("composemail functionality testing");
}

@Test(priority=3)
public void draft() {
	System.out.println("draft functionality testing");
}

}

