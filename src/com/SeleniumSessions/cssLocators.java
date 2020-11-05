package com.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://wordpress.com/start/user?ref=create-lp");
		
		WebElement emailaddress = driver.findElement(By.cssSelector("input#email"));
		emailaddress.sendKeys("Checking css");
		
		WebElement username = driver.findElement(By.cssSelector("input[id=username][name=username]"));
		username.sendKeys("Checking css");
		
		WebElement username1 = driver.findElement(By.cssSelector("input[id*='username'][name=username]"));
		username1.sendKeys("Checking css");
		
		WebElement username2 = driver.findElement(By.cssSelector("input[id^='username'][name=username]"));
		username2.sendKeys("Checking css");
		
		WebElement username3 = driver.findElement(By.cssSelector("input[id$='username'][name=username]"));
		username3.sendKeys("Checking css");
		
		WebElement password = driver.findElement(By.cssSelector("input.form-text-input signup-form__input"));
		password.sendKeys("Checking css");
		

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		Thread.sleep(100);
		
		driver.quit();
	}

}
