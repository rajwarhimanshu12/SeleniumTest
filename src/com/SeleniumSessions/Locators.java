package com.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DAVID");
	    driver.findElement(By.name("lastname")).sendKeys("WARNER");
	    driver.findElement(By.id("sex-0")).click();
	    driver.findElement(By.cssSelector("#sex-02")).click();
	    driver.findElement(By.partialLinkText("http://toolsqa.com/automation-practice-table/")).click();
	//    driver.findElement(By.className(className);
	//    driver.findElement(By.linkText(linkText);
	//    driver.findElement(By.tagName(tagName);
		driver.quit();
	}

}
