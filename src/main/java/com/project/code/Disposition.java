package com.project.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.initialiazeChrome;

public class Disposition extends initialiazeChrome {
	
	
	@FindBy(xpath="//span[text()='Disposition']")
	private WebElement DispositionGoback;
	
	
	public Disposition() {
		PageFactory.initElements(driver, this);
	}
	public void DispositionGoback() throws InterruptedException {
		Thread.sleep(1000);
		DispositionGoback.click();
	}


}
