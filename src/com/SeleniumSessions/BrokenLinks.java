package com.SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.zlti.com");		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		String url = "";
		String homepage = driver.getTitle();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator itr = links.iterator();
		while(itr.hasNext()) {
		  url = ((WebElement) itr.next()).getAttribute("href");
		 System.out.println(url);
		 if(url==null||url.isEmpty()) {
			 System.out.println("missing");
			 continue;	 
		 }
		 if(!url.startsWith(homepage)) {
			 System.out.println("URL belongs to another domain, skipping it.");
             continue;
	}
		 try
		 {
			 HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
			 huc.setRequestMethod("HEAD");
			 huc.connect();
			 int responsecode= huc.getResponseCode();
			 if(responsecode >= 400){
                 System.out.println(url+" is a broken link");
             }
             else{
                 System.out.println(url+" is a valid link");
             }
                 
         } catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
		 }

}
	}
