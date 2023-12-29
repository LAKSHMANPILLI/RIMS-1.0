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

public class RTV extends initialiazeChrome{
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='RTV']/following-sibling::h5[@class='grey--text']/span")
	private WebElement RTVOpenCasesCount;
	@FindBy(xpath="(//h4[text()='RTV']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='DOA Pickup:']//following-sibling::span)[1]")
	private WebElement RTVDOAPickaup;
	@FindBy(xpath="(//h4[text()='RTV']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Pending Finalisation:']//following-sibling::span)[1]")
	private WebElement RTVPendingFinalization;
	
	
	
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement monthclick;
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement yearclick;
	@FindBy(xpath = "(//td//button[contains(@class,'v-btn v-size--default v-date-picker-table__current v-btn--')])[1]")
	private WebElement monthselect;
	@FindBy(xpath = "//li[text()='2023']")
	private WebElement yearSelect;
	@FindBy(xpath = "(//button[contains(@class,'v-btn v-date-picker-table__current v-btn--rounded v-btn--outlined theme--light accent--text')])[1]")
	private WebElement dateClick;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement cok;
		
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='RTV']")
	private WebElement RTV;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement RTVSelectItem;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement RTVSetDisposition;
	@FindBy(xpath="(//div[@class='v-list-item__content']/child::div[text()='Insurance'])[1]")
	private WebElement RTVDispoToInsurance;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea")
	private WebElement RTVAddRemarks;
	@FindBy(xpath="//label[text()='ATTACH DOCUMENTS']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']")
	private WebElement RTVAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement RTVConfirm;
	
	
	@FindBy(xpath="//span[text()='Move To Dispatch']/parent::button")
	private WebElement RTVMoveToDispatch;
	@FindBy(xpath="//div[@class='v-select__slot']/child::input[@placeholder='Search/Enter Vendor Code*']")
	private WebElement RTVVendorcode;
	@FindBy(xpath="//input[@placeholder='Lot Name*']")
	private WebElement RTVLotName;
	@FindBy(xpath="(//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary'])[2]")
	private WebElement RTVConfirmDispatch;
	@FindBy(xpath="//span[text()='OK']")
	private WebElement RTVDispatchOkbutton;
	
	//r1 = new Robot();
//	r1.delay(1000);
//	r1.keyPress(KeyEvent.VK_DOWN);
//	Thread.sleep(1000);
//	r1.keyPress(KeyEvent.VK_ENTER)
	public RTV() {
		PageFactory.initElements(driver, this);
	}
	public void rtv() throws InterruptedException {
		System.out.println(RTVOpenCasesCount.getText());
		Thread.sleep(500);
		 int rtvOpenCasesCount = Integer.parseInt(RTVOpenCasesCount.getText());
		 int rtvDOAPickaup = Integer.parseInt(RTVDOAPickaup.getText());
		 int rtvPendingFinalization = Integer.parseInt(RTVPendingFinalization.getText());
		int totalSum = rtvDOAPickaup+rtvPendingFinalization;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, rtvOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(500);

		RTV.click();
	}
	public void rtvSelectItem() throws InterruptedException {
		Thread.sleep(500);
		RTVSelectItem.click();
	}
	public void RTVSetDisposition() {
		RTVSetDisposition.click();
	}
	public void RTVDispoToInsurance() {
		RTVDispoToInsurance.click();
	}
	public void RTVAddRemarks() throws InterruptedException {
		RTVAddRemarks.click();
		Thread.sleep(500);
		RTVAddRemarks.sendKeys("RTV Remarks added");
	}
	public void RTVAttachDoc() throws InterruptedException, AWTException {
		RTVAttachDoc.click();
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
	public void RTVConfirm() throws InterruptedException {
		Thread.sleep(500);
		RTVConfirm.click();
	}
	
	
	public void rtvSelectItemForDispatch() throws InterruptedException {
		Thread.sleep(1000);
		RTVSelectItem.click();
	}
	public void RTVMoveToDispatch() throws InterruptedException {
		Thread.sleep(500);
		RTVMoveToDispatch.click();
	}
	public void RTVVendorcode() throws AWTException, InterruptedException {
		RTVVendorcode.click();
		r1 = new Robot();
		r1.delay(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_ENTER);
	}
	public void RTVLotName() throws InterruptedException {
		RTVLotName.click();
		Thread.sleep(500);
		RTVLotName.sendKeys("9876543210");
	}
	public void RTVConfirmDispatch() {
		RTVConfirmDispatch.click();
	}
	public void RTVDispatchOkbutton() {
		RTVDispatchOkbutton.click();
		System.out.println("Lot succussfully created from RTV");
	}
	

}
