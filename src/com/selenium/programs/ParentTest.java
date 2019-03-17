package com.selenium.programs;

import org.testng.annotations.BeforeMethod;

public class ParentTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method");
	}
}
