package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngbasic {

		
		@BeforeClass
		public void beforeclass() {
			System.out.println("BEFORE CLASS");
		}
		
		@Test
		public void test() {
			System.out.println("TEST");
		}

	

}
