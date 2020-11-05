package com.test;

import org.testng.annotations.Test;

public class dataproviderinother {
	
	@Test(dataProvider="dp1", dataProviderClass=com.test.Justdataprovider.class)
	public void testing(String params)
	{
		System.out.println(params);
	}

}
