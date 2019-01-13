package com.google.gmail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.Employee;

public class ExceptionDemo {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("in finalize");
	}
	
	public static int test2() {
		
		ExceptionDemo d = new ExceptionDemo();
		int a = 10/0;
		
		try {
			//
			//
			///
			//
			System.exit(0);
		} catch (Exception e) {
			
		} finally {
			 System.out.println("In finally");
		}
		return 1;		
	}

	public static void test() {
		File f = new File("C:\\Vipul\\test.txt");
		Circle c = null;
		
/*		try {
			c.test();
		} catch (Exception e) {
			c.test();
		}
*/		
		
//		catch without try is not allowed
		/*{
			int c1 = 10;
		} catch(Exception e1) {
			
		}*/
		
//		try without catch
		/*try {
			System.out.println("");
		} finally {
			
		}*/
		
//		
		
		try {
			
/*			Circle c = null;
			
			try {
				c.test();
			} catch (Exception e) {
				c.test();
			}
*/			
/*			FileReader reader = new FileReader(f);
			Thread.sleep(1000);
			int[] arr = new int[2];
			arr[3] = 10;
*/		} catch (NullPointerException e) {
			e.getMessage();
		} /*catch (FileNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
		}*/ catch (Exception e) { // Generic catch block
			// 
		} finally {
			System.out.println("In finally...releasing resources");
		}
		
		System.out.println("after try catch");
	}
	
	
	public static void main(String[] args) {
/*		test();
		int a = 10;
		int b = 0 ;
		try {
			b = 10/0;
			System.out.println("in try");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(b);*/
		
		int v = test2();
		System.out.println(v);
		
	}
}
