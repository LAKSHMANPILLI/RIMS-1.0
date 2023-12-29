package com.project.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
public class Logout_In extends initialiazeChrome{
	@FindBy(xpath = "//span[@class='pull-right']/child::img[@role='button']")
	private WebElement logout;	
	
	@FindBy(xpath  = "//a[text()='Logout']")
	private WebElement logoutbtn;
	public Logout_In() {
		PageFactory.initElements(driver, this);
	}
	
	public void  logout() throws InterruptedException{
		Thread.sleep(500);
		logout.click();
	}
	
	public void logout1() {
		logoutbtn.click();
	}

}
