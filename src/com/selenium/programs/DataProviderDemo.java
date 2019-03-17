package com.selenium.programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	// Step#1: Implement data provider method
/*	@DataProvider(name="DP1")
	public String[][] dataProvider() {
		String[][] arr = new String[5][2];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<(arr[i].length)-1; j++) {
				arr[i][j] = "user"+(i+1);
				arr[i][j+1] = "pwd"+(i+1);
			}
		}
		return arr;
	}
*/	

	@DataProvider(name="DP1")
	public String[][] dataProvider() {
		String[][] arr = new String[5][2];
		
		arr[0][0] = "user1";
		arr[0][1] = "pwd1";
		
		arr[1][0] = "user2";
		arr[1][1] = "pwd2";
		
		arr[2][0] = "user3";
		arr[2][1] = "pwd3";

		arr[3][0] = "user4";
		arr[3][1] = "pwd4";

		arr[4][0] = "user5";
		arr[4][1] = "pwd5";

		return arr;
	}
	
	@Test(dataProvider="DP1")
	public void loginTest(String u, String p) {
		System.out.println(u+" : "+p);
	}

}
