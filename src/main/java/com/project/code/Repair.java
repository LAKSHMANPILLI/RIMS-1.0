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

public class Repair extends initialiazeChrome {
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Repair']/following-sibling::h5[@class='grey--text']/span")
	private WebElement RepairOpenCasesCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Initiations:']//following-sibling::span)[1]")
	private WebElement RepairInitiationCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Quotations:']//following-sibling::span)[1]")
	private WebElement RepairQuotationsCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Approval:']//following-sibling::span)[1]")
	private WebElement RepairApprovalCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Repair:']//following-sibling::span)[1]")
	private WebElement RepairScreenCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Repair Grade:']//following-sibling::span)[1]")
	private WebElement RepairgradeCount;
	@FindBy(xpath="(//h4[text()='Repair']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Disposition:']//following-sibling::span)[1]")
	private WebElement RepairDispoCount;
	
	
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
	//(//button[contains(@class,'v-btn v-date-picker-table__current v-btn-')])
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement cok;
		
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Repair']")
	private WebElement Repair;
	@FindBy(xpath="(//tr/descendant::img[@title='Insurance Submission '])[1]")
	private WebElement RepairSelectItem;
	
	@FindBy(xpath="//label[text()='Email Date']/following-sibling::input")
	private WebElement RepairInspectionEmailDate;
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[5]")
	private WebElement RepairInspectionLoaction;
	@FindBy(xpath = "//div[@class='v-list-item__content']/child::div[text()='In House']")
	private WebElement RepairLocationInhouse;
	@FindBy(xpath="//label[text()='Add Remarks']/following-sibling::textarea[@name='remark']")
	private WebElement RepairInspectionAddRemarks;
	@FindBy(xpath="//label[text()='Documents']/following-sibling::div[text()='Attach Documents']")
	private WebElement RepairAttachDoc;
	@FindBy(xpath="//span[text()='Submit']/parent::button")
	private WebElement RepairSubmitFirst;
	
	
	

	@FindBy(xpath="//label[text()='Repair Cost']/following-sibling::input")
	private WebElement RepairEnterRepairCost;
	
	
	@FindBy(xpath="//span[text()='APPROVE']/parent::button")
	private WebElement RepairApproveThird;
	
	@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[5]")
	private WebElement RepairCompletionLoaction;
	@FindBy(xpath = "//div[@class='v-list-item__content']/child::div[text()='In House']")
	private WebElement RepairCompletionLocationInhouse;
	@FindBy(xpath="//label[text()='Repair Date']/following-sibling::input")
	private WebElement RepairCompletionDate;
	
	
	
	@FindBy(xpath="//a[@href='#pending_redeployment']")
	private WebElement RepairPendingRedeployment;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement ReapirRedploymentSetDisposition;
	@FindBy(xpath = "//div[@class='v-list-item__content']/child::div[text()='Brand Call-Log']")
	private WebElement ReapirRedploymentToBcl;
	@FindBy(xpath="(//label[text()='Add Remarks']/following-sibling::textarea)[2]")
	private WebElement ReapirRedploymentRemarks;
	@FindBy(xpath="(//label[text()='Documents']/following-sibling::div[text()='Attach Documents'])[2]")
	private WebElement ReapirRedploymentAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']/parent::button")
	private WebElement ReapirRedploymentConfirm;
	
	public Repair() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void repair() throws InterruptedException {
		
		System.out.println(RepairOpenCasesCount.getText());
		Thread.sleep(500);
		 int repairOpenCasesCount = Integer.parseInt(RepairOpenCasesCount.getText());
		 int repairInitiationCount = Integer.parseInt(RepairInitiationCount.getText());
		 int repairQuotationsCount = Integer.parseInt(RepairQuotationsCount.getText());
		 int repairApprovalCount = Integer.parseInt(RepairApprovalCount.getText());
		 int repairScreenCount = Integer.parseInt(RepairScreenCount.getText());
		 int repairgradeCount = Integer.parseInt(RepairgradeCount.getText());
		 int repairDispoCount = Integer.parseInt(RepairDispoCount.getText());
		int totalSum =repairInitiationCount+repairQuotationsCount+repairApprovalCount+repairScreenCount+repairgradeCount+repairDispoCount;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, repairOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(500);
		Repair.click();
	}
	public void repairSelectItem()throws InterruptedException {
		Thread.sleep(1000);
		RepairSelectItem.click();
	}
	public void repairInspectionEmailDate() throws InterruptedException {
		RepairInspectionEmailDate.click();
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
	public void repairInspectionLoaction() throws InterruptedException {
		Thread.sleep(500);
		RepairInspectionLoaction.click();
	}
	public void repairLocationInhouse() throws InterruptedException {
		RepairLocationInhouse.click();
	}
	public void RepairInspectionAddRemarks() throws InterruptedException {
		RepairInspectionAddRemarks.click();
		Thread.sleep(500);
		RepairInspectionAddRemarks.sendKeys("InspectionRemarks Adeed");
	}
	
	
	public void repairAttachDoc() throws AWTException, InterruptedException {
		RepairAttachDoc.click();
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
	public void repairSubmitFirst() throws InterruptedException {
		RepairSubmitFirst.click();
		Thread.sleep(200);
		System.out.println("Repair Details succussfully updated");
	}
	
	
	//SECOND SCREEN
	public void repairEstimateSelectItem() throws InterruptedException {
		Thread.sleep(500);
		RepairSelectItem.click();
	}
	public void repairEnterRepairCost() throws InterruptedException {
		RepairEnterRepairCost.click();
		Thread.sleep(500);
		RepairEnterRepairCost.sendKeys("1000");
	}
	public void repairEstimateAddRemarks() throws InterruptedException {
		RepairInspectionAddRemarks.click();
		Thread.sleep(500);
		RepairInspectionAddRemarks.sendKeys("Repair Estimate AddRemarks");
	}
	public void repairEstimateAttachDoc() throws InterruptedException, AWTException {
		RepairAttachDoc.click();
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
	public void repairSubmitSecond() {
		RepairSubmitFirst.click();
		System.out.println("Repair Quotation Details updated succussfully");
	}
	
	//THIRD SCREEN
		public void repairApprovalSelectItem() throws InterruptedException {
			Thread.sleep(1000);
			RepairSelectItem.click();
		}
		public void repairApprovalAddRemarks() throws InterruptedException {
			RepairInspectionAddRemarks.click();
			Thread.sleep(500);
			RepairInspectionAddRemarks.sendKeys("repair  Approval AddRemarks");
		}
		public void repairApprovalAttachDoc() throws InterruptedException, AWTException {
			RepairAttachDoc.click();
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
		public void repairApproveThird() {
			RepairApproveThird.click();
		}
		
		//4RTH SCREEN
		public void repairCompletionSelectItem() throws InterruptedException {
			Thread.sleep(1000);
			RepairSelectItem.click();
		}
		public void repairCompletionLoaction() {
			RepairCompletionLoaction.click();
		}
		public void repairCompletionLocationInhouse() throws InterruptedException {
			RepairCompletionLocationInhouse.click();
		}
		public void repairCompletionDate() throws InterruptedException {
			Thread.sleep(500);
			RepairCompletionDate.click();
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
		public void repairCompletionAddRemarks() throws InterruptedException {
			RepairInspectionAddRemarks.click();
			Thread.sleep(500);
			RepairInspectionAddRemarks.sendKeys("Remarks Added");
		}
		public void repairCompletionAttachDoc() throws InterruptedException, AWTException {
			RepairAttachDoc.click();
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
		public void repairCompletionSubmit() {
			RepairSubmitFirst.click();
			System.out.println("Repair completion Details Succussfully verifyied");
		}

		
		
	

}
