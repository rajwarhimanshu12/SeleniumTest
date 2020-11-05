package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataproviderConcepts {
	
	
	@Test(dataProvider="dp")
	public void testmethod(String params)
	{
		System.out.println(params);
	}
	
	@DataProvider (name= "dp")
	public Object[][] testdatamethod(){
		return new Object[][]
				{
			{"first set of data"},
			{"second set of data"}
				};
		
	}
	

}
