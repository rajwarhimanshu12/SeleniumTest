package com.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseDragDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
        
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//img[@src,'images/high_tatras_min.jpg']")))
        .moveToElement(driver.findElement(By.id("trash")))
        .release()
        .build()
        .perform();
        

	}

}

