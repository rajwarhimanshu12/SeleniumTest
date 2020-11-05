package com.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.findElement(By.id("photo")).sendKeys("C:\\Selenium\\uploadsample.txt");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
