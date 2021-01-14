package com.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(System.currentTimeMillis());
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
		System.out.println(System.currentTimeMillis());
		
		WebElement Element = driver.findElement(By.linkText("Gradle"));
		Element.click();
		WebElement Element1 = driver.findElement(By.linkText("abcd"));
		
		System.out.println();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		
		driver.quit();
		
	}

}
