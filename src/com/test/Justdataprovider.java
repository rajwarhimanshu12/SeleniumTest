package com.test;

import org.testng.annotations.DataProvider;

public class Justdataprovider {
	
	@DataProvider(name="dp1")
		public static Object[][] testingmenthod(){
			return new Object[][] {
				{"TEST DATA 1"},
				{"TEST DATA 2"},
				{"TEST DATA 3"}
			};
		}	

}
