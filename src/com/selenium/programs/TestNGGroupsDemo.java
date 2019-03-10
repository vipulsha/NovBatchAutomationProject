package com.selenium.programs;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {

	@Test(groups= {"SMOKE","REGRESSION"})
	public void testLogin() {
		System.out.println("In Login");
	}
	
	@Test(groups="REGRESSION")
	public void testSendingEmail() {
		System.out.println("In testSendingEmail");
	}
	
	
	
}
