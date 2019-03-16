package com.selenium.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExpectingExceptionDemo {

	@Test(expectedExceptions=ArithmeticException.class)
	public void test() {
		int a = 0;
		int b = 1/a;
	}
	
}
