package com.SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushAlert()']")).click();
		Alert xyzalert = driver.switchTo().alert();
		System.out.print(xyzalert.getText());
		xyzalert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")).click();
		xyzalert.dismiss();
        Thread.sleep(5000);
		driver.quit();
	}

}
