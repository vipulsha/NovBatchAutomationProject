package com.selenium.programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class TestNGDemo extends ParentTest {
	
	// Annotation
	@Test
	public void testMethod2() {
//		someUtility();
		System.out.println("in testMethod2");
	}
	
	@Test
	public void testMethod1() {
//		someUtility();
		System.out.println("in testMethod1");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}
	
	public void someUtility() {
		System.out.println("in utility");
	}
}
