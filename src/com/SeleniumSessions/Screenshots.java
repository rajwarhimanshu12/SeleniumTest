package com.SeleniumSessions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshots {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
    //    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    //    FileUtils.copyFile(src, new File("/SeleniumTest/src/com/SeleniumSessions/google.png"));
        

	}

}
