package com.project.code;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.baseclass.initialiazeChrome;

public class PendingDisposition extends initialiazeChrome {
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Pending Disposition']/following-sibling::h5[@class='grey--text']/span")
	private WebElement PendingDispoOpenCasesCount;
	@FindBy(xpath="(//h4[text()='Pending Disposition']/parent::td[@style='border: none;']/following::td)[1]/child::h3")
	private WebElement PendingDispoHighCount;
	@FindBy(xpath="(//h4[text()='Pending Disposition']/parent::td[@style='border: none;']/following::td)[2]/child::h3")
	private WebElement PendingDispoMediumCount;
	@FindBy(xpath="(//h4[text()='Pending Disposition']/parent::td[@style='border: none;']/following::td)[3]/child::h3")
	private WebElement PendingDispoLowCount;
	
	
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Pending Disposition']")
	private WebElement PendingDisposition;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement PendingDispoSelectItem;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement PendingDispoSetDisposition;
	@FindBy(xpath="(//div[@class='v-list-item__content']/child::div[text()='Insurance'])[1]")
	private WebElement PendingDispoToInsurance;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea")
	private WebElement PendingDispoAddRemarks;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement PendingDispoConfirm;
	
	
	public PendingDisposition() {
		PageFactory.initElements(driver, this);
	}
	public void pendingDisposition() throws InterruptedException {
		System.out.println(PendingDispoOpenCasesCount.getText());
		Thread.sleep(500);
		 int pendingDispoOpenCasesCount = Integer.parseInt(PendingDispoOpenCasesCount.getText());
		 int pendingDispoHighCount = Integer.parseInt(PendingDispoHighCount.getText());
		 int pendingDispoMediumCount = Integer.parseInt(PendingDispoMediumCount.getText());
		 int pendingDispoLowCount = Integer.parseInt(PendingDispoLowCount.getText());
		int totalSum = pendingDispoHighCount+pendingDispoMediumCount+pendingDispoLowCount;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, pendingDispoOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(500);
		PendingDisposition.click();
	}
	public void pendingDispoSelectItem() throws InterruptedException {
		Thread.sleep(500);
		PendingDispoSelectItem.click();
	}
	public void pendingDispoSetDisposition() {
		PendingDispoSetDisposition.click();
	}
	public void pendingDispoToInsurance() {
		PendingDispoToInsurance.click();
	}
	public void pendingDispoAddRemarks() throws InterruptedException {
		PendingDispoAddRemarks.click();
		Thread.sleep(500);
		PendingDispoAddRemarks.sendKeys("Pending Disposition Remarks added");
	}
	public void pendingDispoConfirm() throws InterruptedException {
		Thread.sleep(500);
		PendingDispoConfirm.click();
	}
	
	
	
	
	

}
