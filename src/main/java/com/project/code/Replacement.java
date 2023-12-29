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

public class Replacement extends initialiazeChrome{
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Replacement']/following-sibling::h5[@class='grey--text']/span")
	private WebElement ReplaceOpenCasesCount;
	@FindBy(xpath="(//h4[text()='Replacement']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Replacement:']//following-sibling::span)[1]")
	private WebElement ReplacescreenCount;
	@FindBy(xpath="(//h4[text()='Replacement']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Disposition:']//following-sibling::span)[1]")
	private WebElement ReplaceDispositionCount;
	
	
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
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Replacement']")
	private WebElement Replace;
	@FindBy(xpath="(//tr/descendant::img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACcAAAAcCAYAAADiHqZbAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAFSSURBVHgB7Ze/S8NAFMe/dwptFgm4RFAaEHR01sk4F0QEHXVSwcH4Yxb6ByidraAdRQQHV2kWda2jghjRoShC3YqQnPfq7JK8kEPygeTltg/v3nu5E9DYfssu9+CLWGwpARv5ESBStc6xF9BC0MtZD551cGEIsVIL70fepXQ2WqswSIwQECcUpVBiHoYhdGmNbN5UpEKuNfYn6jtyJQymkEvK/5ebmcimp1LLjQ2XcbEzhfrKJLhJLff62cP++ROWpx12wUEw0Lh+w5A1gL2q21/7zQdwwCJHHFy99COnIGu3it9zBBtscpSx3WoFZ3cdtm1lkVubG2UXI1hGSW1pnF2MSN0QNEoWD+9x+9gFNyzbmoUYUfz4k1LIJUXqmZ5NNackQvSlMycCmEf40fDasmTFTZ29NgxCX6q3Kcqw7nVLlvL096l+QuRLgFjO0m2fFj9gCWMLIXQQ1wAAAABJRU5ErkJggg=='])[1]")
	private WebElement ReplaceClickArrow;
	
	@FindBy(xpath="//label[text()='Replacement Date*']/following-sibling::input")
	private WebElement ReplaceDate;
	@FindBy(xpath="//span[text()='Create Item Id']")
	private WebElement ReplaceCreateItemID;
	@FindBy(xpath = "//span[text()='CLOSE']/parent::button")
	private WebElement ReplaceCloseButton;
	
	@FindBy(xpath = "//label[text()='Serial Number 1*']/following-sibling::input")
	private WebElement ReplaceSerial;
	@FindBy(xpath="//label[text()='Add Remarks']/following-sibling::textarea[@name='remark']")
	private WebElement ReplaceAddRemarks;
	@FindBy(xpath="//label[text()='Documents']/following-sibling::div[text()='Attach Documents']")
	private WebElement ReplaceAttachDoc;
	@FindBy(xpath="//span[text()='SUBMIT']/parent::button")
	private WebElement ReplaceSubmitFirst;
	
	
	
	
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement ReplaceRedeploySelectItem;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@type='text']")
	private WebElement ReplaceRedeploySetDisposition;
	@FindBy(xpath="//div[@class='v-list-item__content']/child::div[text()='Brand Call-Log']")
	private WebElement ReplaceRedeploySetDispositionBcl;
	//@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-radiobox-blank theme--light']/following-sibling::input[@role='radio'])[1]")
	//private WebElement InsuInPolicyRadio;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea[@name='input-7-4']")
	private WebElement ReplaceRedeployAddRemarks;
	@FindBy(xpath="(//label[text()='Documents']/following-sibling::div[text()='Attach Documents'])[2]")
	private WebElement ReplaceRedeployAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement ReplaceRedeployConfirm;
	
	
	
	
	
	
	
	
	
	public Replacement() {
		PageFactory.initElements(driver, this);
	}
	public void replacement() throws InterruptedException {
		System.out.println(ReplaceOpenCasesCount.getText());
		Thread.sleep(500);
		 int replaceOpenCasesCount = Integer.parseInt(ReplaceOpenCasesCount.getText());
		 int replacescreenCount = Integer.parseInt(ReplacescreenCount.getText());
		 int replaceDispositionCount = Integer.parseInt(ReplaceDispositionCount.getText());
		int totalSum = replacescreenCount+replaceDispositionCount;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, replaceOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(500);

		Replace.click();
	}
	public void replaceClickArrow() throws InterruptedException {
		Thread.sleep(500);
		ReplaceClickArrow.click();
	}
	public void replaceDate() throws InterruptedException {
		ReplaceDate.click();
		Thread.sleep(500);
		monthclick.click();
		Thread.sleep(500);
		yearclick.click();
		Thread.sleep(500);
		yearSelect.click();
		Thread.sleep(500);
		monthselect.click();
		Thread.sleep(500);
		dateClick.click();
		Thread.sleep(500);
		cok.click();
		
	}
	public void replaceCreateItemID() {
		ReplaceCreateItemID.click();
	}
	public void replaceCloseButton() {
		ReplaceCloseButton.click();
	}
	public void replaceSerial() throws InterruptedException {
		ReplaceSerial.click();
		Thread.sleep(300);
		ReplaceSerial.sendKeys("SERIALNO. 1");
	}
	
	
	public void replaceAddRemarks() throws InterruptedException {
		ReplaceAddRemarks.click();
		Thread.sleep(500);
		ReplaceAddRemarks.sendKeys("Replace Remarks added");
	}
	public void replaceAttachDoc() throws InterruptedException, AWTException {
		ReplaceAttachDoc.click();
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
	public void replaceSubmitFirst() throws InterruptedException {
		Thread.sleep(500);
		ReplaceSubmitFirst.click();
		System.out.println("Tag id replaced succussfully");
	}
	
	
	public void replaceRedeploySelectItem() throws InterruptedException {
		Thread.sleep(1000);
		ReplaceRedeploySelectItem.click();
	}
	public void replaceRedeploySetDisposition() throws InterruptedException {
		
		ReplaceRedeploySetDisposition.click();
	}
	public void replaceRedeploySetDispositionBcl() throws InterruptedException {
		Thread.sleep(500);
		ReplaceRedeploySetDispositionBcl.click();
	}
	public void replaceRedeployAddRemarks() throws InterruptedException {
		ReplaceRedeployAddRemarks.click();
		Thread.sleep(500);
		ReplaceRedeployAddRemarks.sendKeys("9876543210");
	}
	public void replaceRedeployAttachDoc() throws InterruptedException, AWTException {
		ReplaceRedeployAttachDoc.click();
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
	public void replaceRedeployConfirm() {
		ReplaceRedeployConfirm.click();
		System.out.println("Pending Redeployement set disposition verifyied");
	}

}
