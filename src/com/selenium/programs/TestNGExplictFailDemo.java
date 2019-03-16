package com.selenium.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExplictFailDemo {

	@Test
	public void test() {
		int a = 0;
		try {
			int b = 1/a;
		} catch (Exception e) {
			// add code for logging this exception
			// mark your test as failed.
			Assert.fail(e.getMessage());
		}
		
		System.out.println("after exception");
	}
	
}
