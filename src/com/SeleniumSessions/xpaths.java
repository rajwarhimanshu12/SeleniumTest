package com.SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpaths {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://utconline.uk.gov.in/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		List<WebElement> linklist =  driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i = 0; i< linklist.size(); i++ ) {
			System.out.println(linklist.get(i).getText());
		}
		
		driver.findElement(By.xpath("//input[@name='btnPlanVisit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Seats')]")).click();
		//driver.findElement(By.xpath("//input[@contains(@id,'test_')])).click();
		//driver.findElement(By.xpath("//input[@starts-with(@id,'test_')])).click();
		//driver.findElement(By.xpath("//input[@ends-with(@id,'_test')])).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
