package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement searchfield;
	
	@FindBy(how = How.ID, using = "nav-search-submit-button")
	WebElement searchButton;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
