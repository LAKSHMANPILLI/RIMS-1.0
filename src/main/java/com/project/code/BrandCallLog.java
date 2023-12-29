
package com.project.code;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.project.baseclass.initialiazeChrome;
public class BrandCallLog extends initialiazeChrome {

	// private static final Function ExpectedCondtions = null;

	//WebdriverCommaLib exp;
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Brand Call-Log']/following-sibling::h5[@class='grey--text']/span")
	private WebElement BclOpenCasesCount;
	@FindBy(xpath="(//span[text()='Call Log:']/following-sibling::span)[1]")
	private WebElement BclCalllogCount;
	@FindBy(xpath="(//span[text()='Update Call Log:']/following-sibling::span)[1]")
	private WebElement BclUpdateCalllogCount;
	@FindBy(xpath="(//span[text()='Inspection:']/following-sibling::span)[1]")
	private WebElement BclInpsectionCount;
	@FindBy(xpath="(//span[text()='Resolution:']/following-sibling::span)[1]")
	private WebElement BclResolutionCount;
	
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement monthclick;
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement yearclick;
	//@FindBy(xpath = "(//td//button[@class!='v-btn v-size--default v-btn--flat v-btn--text v-btn--disabled theme--light'])[1]")
	@FindBy(xpath = "(//td//button[contains(@class,'v-btn v-size--default v-date-picker-table__current v-btn--')])[1]")
	private WebElement monthselect;
	@FindBy(xpath = "//li[text()='2023']")
	private WebElement yearSelect;
	@FindBy(xpath = "(//button[@class='v-btn v-btn--text v-btn--rounded theme--light'])[1]")
	private WebElement dateClick;
		
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Brand Call-Log']")
	private WebElement BrandCallLog;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement BclselectItem;
	@FindBy(xpath="//button[@type='button']/child::span[text()='Update Initiation Date']")
	private WebElement BclUpdateInitiation;
	@FindBy(xpath="(//div[@class='v-text-field__slot']/child::input[@type='text'])[2]")
	private WebElement BclEmailDate;
	//@FindBy(xpath="(//div[@class='v-select__selections']/child::input[@type='text'])[4]")
	@FindBy(xpath = "(//div[@class='v-input__icon v-input__icon--append']/i)[6]")
	private WebElement BclInitiationLocation;
	@FindBy(xpath="//div[@class='v-list-item__content']/child::div[text()='In House']")
	private WebElement BclLocationInhouse;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea")
	private WebElement BclAddRemarks;
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement BclConfirm;
	
	
	
	@FindBy(xpath="//a[@href='#update_call_log']")
	private WebElement BclUpdateCallLog;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement BclCallLogselectItem;
	@FindBy(xpath="//button[@type='button']/child::span[text()='Update Call Log']")
	private WebElement BclUpdateCallLogTag;
	@FindBy(xpath="//label[text()='Enter Call Log']/following-sibling::input")
	private WebElement BclEnterCallLog;
	//@FindBy(xpath="(//div[@class='v-select__selections']/child::input[@type='text'])[4]")
	@FindBy(xpath = "//button[@type='button']/child::span[text()='Update']")
	private WebElement BclUpdateSecond;
	
	
	
	@FindBy(xpath="//span[text()=' Update Information ']/parent::button")
	private WebElement BclInspectionUpdate;
	@FindBy(xpath="//label[text()='Invoice Number']/following-sibling::input")
	private WebElement BclEnterInvoice;
	//@FindBy(xpath="(//span[text()='Confirm'])[2]")
	@FindBy(xpath = "//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement BclInspectionThird;
	
	@FindBy(xpath="//span[text()=' Brand Inspection ']/parent::button")
	private WebElement BclInspectionBrandInspection;
	@FindBy(xpath="//input[@required='required']")
	private WebElement BclBrandInspectionDate;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[5]")
	private WebElement BclBrandInspectionLocation;
	@FindBy(xpath = "//div[@class='v-list-item__content']/child::div[text()='In House']")
	private WebElement BclBrandLocationInhouse;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea")
	private WebElement BclBrandInspectionRemarks;
	@FindBy(xpath="//label[text()='ATTACH DOCUMENTS']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']")
	private WebElement BclBrandInspectionAttachDoc;
	//@FindBy(xpath="(//span[text()='Confirm'])[3]")
	@FindBy(xpath = "//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement BclBrandInspectionConfirm;
	
	
	@FindBy(xpath="//span[text()=' Resolution ']/parent::button")
	private WebElement BclBrandResolution;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement BclBrandInspectionSetDisposition;
	@FindBy(xpath = "//div[@class='v-list-item__content']/child::div[text()='Insurance']")
	private WebElement BclBrandSetDispoInsurance;
	@FindBy(xpath="(//label[text()='Add Remarks*']/following-sibling::textarea)[2]")
	private WebElement BclBrandResolutionRemarks;
	@FindBy(xpath="(//label[text()='ATTACH DOCUMENTS']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips'])[2]")
	private WebElement BclBrandResolutionAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement BclBrandResolutionConfirm;
	
	
	
	

	public BrandCallLog() {
		PageFactory.initElements(driver, this);
	}
	public void BCL() throws InterruptedException {
			System.out.println(BclOpenCasesCount.getText());
		Thread.sleep(500);
		 int bclOpenCasesCountText = Integer.parseInt(BclOpenCasesCount.getText());
		 int bclInformationCountText = Integer.parseInt(BclCalllogCount.getText());
		 int bclBCLTicketCountText = Integer.parseInt(BclUpdateCalllogCount.getText());
		 int bclInpsectionCountText = Integer.parseInt(BclInpsectionCount.getText());
		 int bclDecisionCountText = Integer.parseInt(BclResolutionCount.getText());
		int totalSum = bclInformationCountText+bclBCLTicketCountText+bclInpsectionCountText+bclDecisionCountText;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, bclOpenCasesCountText);
		System.out.println("Open cases count validated");
		Thread.sleep(500);
		BrandCallLog.click();
	}
	public void bclSelectTag() throws InterruptedException {
		Thread.sleep(500);
		BclselectItem.click();
		
	}
	public void bclUpdateIniation() {
		BclUpdateInitiation.click();
	}
	public void bclEmail() throws InterruptedException {
		BclEmailDate.click();
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
		
	}
	public void bclBclInitiationLocation() throws InterruptedException {
		Thread.sleep(500);
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("BclInitiationLocation")));
//		element.click();
		BclInitiationLocation.click();
	}
	public void bclInhouse() {
		
		BclLocationInhouse.click();
	}
	
	public void bclAddRemarks() throws InterruptedException {
		Thread.sleep(500);
		BclAddRemarks.click();
		Thread.sleep(300);
		BclAddRemarks.sendKeys("test");
	}
	public void bclFirstConfirm() {
		BclConfirm.click();
		Reporter.log("BCL Fisrt screen updated succussfully");
	}
	
	
	
	
	public void bclUpdateCallLog() {
		BclUpdateCallLog.click();
	}
	public void bclCallLogselectItem() throws InterruptedException {
		Thread.sleep(1000);
		BclCallLogselectItem.click();
	}
	public void bclUpdateCallLogTag() {
		BclUpdateCallLogTag.click();
	}
	public void bclEnterCallLog() throws InterruptedException {
		BclEnterCallLog.click();
		Thread.sleep(500);
		BclEnterCallLog.sendKeys("CALLLOGNO123");
	}
	public void bclUpdateSecond() {
		BclUpdateSecond.click();
		System.out.println("Call Log Number Updated succusfully");
	}
	
	
	//THIRD SCREEN
	public void bclInspectionSelectTag() throws InterruptedException {
		Thread.sleep(500);
		BclCallLogselectItem.click();
	}
	public void bclInspectionUpdate() {
		BclInspectionUpdate.click();
	}
	public void bclEnterInvoice() throws InterruptedException {
		BclEnterInvoice.click();
		Thread.sleep(500);
		BclEnterInvoice.sendKeys("Invoice12345678");
	}
	public void bclInspectionThird() {
		BclInspectionThird.click();
	}
	public void bclSelectTagBrand() throws InterruptedException {
		Thread.sleep(1000);
		BclCallLogselectItem.click();
	}
	public void bclInspectionBrandInspection() throws InterruptedException {
		Thread.sleep(500);

		BclInspectionBrandInspection.click();
	}
	public void bclBrandInspectionDate() throws InterruptedException {
		BclBrandInspectionDate.click();
		Thread.sleep(500);
		monthclick.click();
		Thread.sleep(500);
		yearclick.click();
		Thread.sleep(500);
		yearSelect.click();
		Thread.sleep(500);
		monthselect.click();
		Thread.sleep(200);
		dateClick.click();
	}
	public void bclBrandInspectionLocation() throws InterruptedException {
		Thread.sleep(500);
		BclBrandInspectionLocation.click();
	}
	public void bclBrandLocationInhouse() {
		BclBrandLocationInhouse.click();
	}
	public void bclBrandInspectionRemarks() throws InterruptedException {
		BclBrandInspectionRemarks.click();
		Thread.sleep(500);
		BclBrandInspectionRemarks.sendKeys("Remarks Added");
	}
	public void bclBrandInspectionAttachDoc() throws InterruptedException, AWTException {
		BclBrandInspectionAttachDoc.click();
		Thread.sleep(1000);
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
	public void bclBrandInspectionConfirm() throws InterruptedException, AWTException {
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//      Thread.sleep(1000);
//      j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//   // Set the new window size
//      Dimension newSize = new Dimension(1280, 768); // Set the desired width and height
//      driver.manage().window().setSize(newSize);
//
//      // Perform your actions on the webpage, such as scrolling
//
//      // Example: Scroll down by 200 pixels
//      // Note: The actual scrolling code may depend on the structure of your webpage
//      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");

   // Adjust the zoom level to 80%
      //adjustZoomLevel(0.8);

      // Perform your actions on the webpage

      // Example: Scroll down by 200 pixels
    //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
//      WebElement element = driver.findElement(By.xpath("/div[@class='v-card__title']/child::span"));
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].scrollIntoView(true);", element);
//      element.click();
//		 WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
//	        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-card__title']/child::span")));
//
//		WebElement scrollableElement = popUp.findElement(By.xpath("//label[text()='ATTACH DOCUMENTS']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']"));
//
//        // Scroll inside the pop-up
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", BclBrandInspectionConfirm);
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;");
		//Thread.sleep(2000);
//      r1 = new Robot();
//      Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
//		r1.keyPress(KeyEvent.VK_MINUS);
//		r1.keyRelease(KeyEvent.VK_CONTROL);
//		r1.keyRelease(KeyEvent.VK_MINUS);
		Thread.sleep(1000);
		BclBrandInspectionConfirm.click();
		System.out.println("Brand Inpsetion Succussfully verifyied");
	}
	//4RTH SCREEN
	public void bclResolutionSelectItem() throws InterruptedException {
		Thread.sleep(1000);
		BclCallLogselectItem.click();
	}
	public void bclBrandResolution() {
		BclBrandResolution.click();
	}
	public void bclBrandInspectionSetDisposition() throws InterruptedException {
		BclBrandInspectionSetDisposition.click();
	}
	public void bclBrandSetDispoInsurance() throws InterruptedException {
		Thread.sleep(500);
		BclBrandSetDispoInsurance.click();
	}
	public void bclBrandResolutionRemarks() throws InterruptedException {
		BclBrandResolutionRemarks.click();
		Thread.sleep(500);
		BclBrandResolutionRemarks.sendKeys("Remarks Added");
	}
	public void bclBrandResolutionAttachDoc() throws InterruptedException, AWTException {
		BclBrandResolutionAttachDoc.click();
		Thread.sleep(1000);
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
		Thread.sleep(200);
	}
	public void bclBrandResolutionConfirm() {
		BclBrandResolutionConfirm.click();
		System.out.println("Brand Resolution Succussfully verifyied");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    public void selectOption(String optionText) {
//        // Create a Select object using the WebElement
//        Select dropdown = new Select(dropdownElement);
//        // Select an option by visible text
//        dropdown.selectByVisibleText(optionText);
//    }

    // Add more methods for interacting with other elements on the page if needed
}
//HYPER LINK=//div[@class='container']/descendant::div[@class='row']


