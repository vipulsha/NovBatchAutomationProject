package com.selenium.programs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo3 {
	
	@Test
	public void test3() {
		System.out.println("in TestNGDemo3.test3()");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}
}
