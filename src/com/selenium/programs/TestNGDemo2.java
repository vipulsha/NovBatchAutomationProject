package com.selenium.programs;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test
	public void test() {
		System.out.println("in TestNGDemo2.test()");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}
}
