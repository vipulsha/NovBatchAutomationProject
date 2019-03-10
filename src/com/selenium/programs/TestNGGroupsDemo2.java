package com.selenium.programs;

import org.testng.annotations.Test;

public class TestNGGroupsDemo2 {

	@Test(groups= {"SMOKE","REGRESSION"})
	public void testLogOut() {
		System.out.println("In Logout");
	}
}
