package com.selenium.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority=0)
	public void testLogin() {
		System.out.println("in testLogin()");
		Assert.fail();
	}
	
	@Test(priority=1)
	public void testCreateEmail() {
		System.out.println("in testCreateEmail()");
	}
	
	@Test(priority=2)
	public void deleteEmail() {
		System.out.println("in deleteEmail()");
	}
}
