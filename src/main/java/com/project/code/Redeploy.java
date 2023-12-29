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

public class Redeploy extends initialiazeChrome {
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Redeploy']/following-sibling::h5[@class='grey--text']/span")
	private WebElement RedeployOpenCasesCount;
	@FindBy(xpath="(//h4[text()='Redeploy']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Dispatch:']//following-sibling::span)[1]")
	private WebElement RedeployDispatchCount;
	
	
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Redeploy']")
	private WebElement Redeploy;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement RedeploySelectItem;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement RedeploySetDisposition;
	@FindBy(xpath="(//div[@class='v-list-item__content']/child::div[text()='Insurance'])[1]")
	private WebElement RedeployDispoToInsurance;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea")
	private WebElement RedeployAddRemarks;
	@FindBy(xpath="//label[text()='ATTACH DOCUMENT']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']")
	private WebElement RedployAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement RedeployConfirm;
	
	
	@FindBy(xpath="//span[text()='MOve To Dispatch']/parent::button")
	private WebElement RedeployMoveToDispatch;
	@FindBy(xpath="//div[@class='v-select__slot']/child::input[@placeholder='Search/Enter Vendor Code*']")
	private WebElement RedeployVendorcode;
	@FindBy(xpath="//input[@placeholder='Lot Name*']")
	private WebElement RedeployLotName;
	@FindBy(xpath="//span[text()='CREATE']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement RedeployConfirmDispatch;
	@FindBy(xpath="//span[text()='OK']")
	private WebElement RedeployDispatchOkbutton;
	
	public Redeploy() {
		PageFactory.initElements(driver, this);
	}
	public void redeploy() throws InterruptedException {
		System.out.println(RedeployOpenCasesCount.getText());
		Thread.sleep(500);
		 int redeployOpenCasesCount = Integer.parseInt(RedeployOpenCasesCount.getText());
		 int rtvDOAPickaup = Integer.parseInt(RedeployDispatchCount.getText());
		int totalSum = rtvDOAPickaup;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, redeployOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(500);
		Redeploy.click();
	}
	public void redeploySelectItem() throws InterruptedException {
		Thread.sleep(500);
		RedeploySelectItem.click();
	}
	public void redeploySetDisposition() {
		RedeploySetDisposition.click();
	}
	public void redeployDispoToInsurance() {
		RedeployDispoToInsurance.click();
	}
	public void redeployAddRemarks() throws InterruptedException {
		RedeployAddRemarks.click();
		Thread.sleep(500);
		RedeployAddRemarks.sendKeys("RTV Remarks added");
	}
	public void redployAttachDoc() throws InterruptedException, AWTException {
		RedployAttachDoc.click();
		Thread.sleep(500);
		r1 = new Robot();
		r1.delay(500);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);

	}
	public void redeployConfirm() throws InterruptedException {
		Thread.sleep(500);
		RedeployConfirm.click();
	}
	
	
	public void redeploySelectItemForDispatch() throws InterruptedException {
		Thread.sleep(1000);
		RedeploySelectItem.click();
	}
	public void redeployMoveToDispatch() throws InterruptedException {
		Thread.sleep(500);
		RedeployMoveToDispatch.click();
	}
	public void redeployVendorcode() throws AWTException, InterruptedException {
		RedeployVendorcode.click();
		r1 = new Robot();
		r1.delay(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
	}
	public void redeployLotName() throws InterruptedException {
		RedeployLotName.click();
		Thread.sleep(500);
		RedeployLotName.sendKeys("812345678");
	}
	public void redeployConfirmDispatch() {
		RedeployConfirmDispatch.click();
	}
	public void redeployDispatchOkbutton() {
		RedeployDispatchOkbutton.click();
		System.out.println("Lot succussfully created from Redeploy");
	}
	
	

}
