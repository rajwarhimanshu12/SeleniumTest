package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramertization {
	@Parameters({"pm"})
	@Test
	public void sample(String params) {
		System.out.println(params);
}

}
