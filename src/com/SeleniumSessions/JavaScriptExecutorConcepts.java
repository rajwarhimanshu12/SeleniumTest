package com.SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://freecrm.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
		// driver.findElement(By.name("email")).sendKeys("naveenK");
		// driver.findElement(By.name("password")).sendKeys("test@123");
		// driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 
		 flash(btn,driver);
		 Thread.sleep(2000);
		 drawborder(btn,driver);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("history.go(0)");

		 js.executeScript("window.scrollBy(0,1500)");
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 js.executeScript("return.document.title;").toString();
		 
		 generateAlert(driver,"this is awesome");
		 
		 jsclick(btn, driver);
	}		 
		public static void flash(WebElement element, WebDriver driver)
		{
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  String bgcolor = element.getCssValue("backgroundColor");
		  for (int i =0 ; i <100; i++)
		  { 
			changeColor("rgb(0,200,0)",element,driver); 
			changeColor(bgcolor,element,driver);
		  }
		}
		private static void changeColor(String color, WebElement element, WebDriver driver) {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].style.backgroundColor='"+ color +"'",element);
			
		}
		

      public static void drawborder(WebElement element,WebDriver driver)
      {
    	  JavascriptExecutor js = ((JavascriptExecutor)driver);
    	  js.executeScript("arguments[0].style.border='3px solid red'",element);
      }
      
      public static void generateAlert(WebDriver driver,String message)
      {
    	  JavascriptExecutor js = ((JavascriptExecutor)driver);
    	  js.executeScript("alert('"+message+"')");
      }
      
     public static void jsclick(WebElement element,WebDriver driver)
      {
    	  JavascriptExecutor js = ((JavascriptExecutor)driver);
    	  js.executeScript("argument[0].click();",element);
      }
      
      public static void scrollintoView(WebElement element,WebDriver driver)
      {
    	  JavascriptExecutor js = ((JavascriptExecutor)driver);
    	  js.executeScript("argument[0].scrollIntoView(true);",element);
      }
      
}