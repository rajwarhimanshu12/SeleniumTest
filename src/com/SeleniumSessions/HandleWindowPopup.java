package com.SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("http://www.popuptest.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		
		 driver.findElement(By.xpath("//a[contains(text(),'Come & Go Test')]")).click();
		 
		 Set<String> handler = driver.getWindowHandles();
		 Iterator<String> it = handler.iterator();
		 String  Parent_Window=it.next();
		 System.out.println("Parent Window"+Parent_Window);
		 String  Child_Window=it.next();
		 System.out.println("Child Window"+Child_Window);
		 
		 driver.switchTo().window(Parent_Window);
		 driver.close();
		 
		Thread.sleep(5000);
		driver.quit();
		

	}

}
