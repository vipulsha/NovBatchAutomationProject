package com.selenium.programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPassingParameters {
	
	@Parameters({"USERNAME","PASSWORD"})
	@Test
	public void testLogin(String u, String p) {
		System.out.println(u);
		System.out.println(p);
	}

}
