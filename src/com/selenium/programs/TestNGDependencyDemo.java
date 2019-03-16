package com.selenium.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(enabled=false)
	public void testLogin() {
		System.out.println("in testLogin()");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="testLogin", alwaysRun=true, ignoreMissingDependencies=true)
	public void testCreateEmail() {
		System.out.println("in testCreateEmail()");
	}
	
/*	@Test(dependsOnMethods= {"testLogin","testCreateEmail"}, alwaysRun=true)
	public void deleteEmail() {
		System.out.println("in deleteEmail()");
	}
*/	

/*	@Test(groups="REGRESSION")
	public void testLogin() {
		System.out.println("in testLogin()");
	}
	
	@Test(groups="REGRESSION", dependsOnMethods="testLogin")
	public void testCreateEmail() {
		System.out.println("in testCreateEmail()");
	}
	
	@Test(groups= {"SMOKE"}, dependsOnGroups="REGRESSION")
	public void deleteEmail() {
		System.out.println("in deleteEmail()");
	}
*/
	
}
