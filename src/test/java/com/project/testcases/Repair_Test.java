package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.code.Repair;

public class Repair_Test {
	Repair repairObject;
	
	@BeforeTest
	public void repair1() {
		repairObject=new Repair();
	}
	
	@Test(priority = 1)
	public void repair() throws InterruptedException {
		repairObject.repair();
	}
	@Test(priority = 2)
	public void repairSelectItem() throws InterruptedException {
		repairObject.repairSelectItem();
	}
	@Test(priority = 3)
	public void repairInspectionEmailDate() throws InterruptedException {
		repairObject.repairInspectionEmailDate();
	}
	@Test(priority = 4)
	public void repairInspectionLoaction() throws InterruptedException {
		repairObject.repairInspectionLoaction();
	}
	@Test(priority = 5)
	public void repairLocationInhouse() throws InterruptedException {
		Thread.sleep(500);
		repairObject.repairLocationInhouse();
	}
	@Test(priority = 6)
	public void RepairInspectionAddRemarks() throws InterruptedException {
		repairObject.RepairInspectionAddRemarks();
	}
	@Test(priority = 7)
	public void repairAttachDoc()throws InterruptedException, AWTException  {
		repairObject.repairAttachDoc();
	}
	@Test(priority = 8)
	public void repairSubmitFirst() throws InterruptedException {
		repairObject.repairSubmitFirst();
	}
	
	
	@Test(priority = 9)
	public void repairEstimateSelectItem() throws InterruptedException {
		repairObject.repairEstimateSelectItem();
	}
	@Test(priority = 10)
	public void repairEnterRepairCost() throws InterruptedException {
		repairObject.repairEnterRepairCost();
	}
	
	@Test(priority = 11)
	public void repairEstimateAddRemarks() throws InterruptedException {
		repairObject.repairEstimateAddRemarks();
	}
	@Test(priority = 12)
	public void repairEstimateAttachDoc() throws InterruptedException, AWTException {
		repairObject.repairEstimateAttachDoc();
	}
	@Test(priority = 13)
	public void repairSubmitSecond() {
		repairObject.repairSubmitSecond();
	}
	@Test(priority = 14)
	public void repairApprovalSelectItem() throws InterruptedException {
		repairObject.repairApprovalSelectItem();
	}
	@Test(priority = 15)
	public void repairApprovalAddRemarks() throws InterruptedException {
		Thread.sleep(500);
		repairObject.repairApprovalAddRemarks();
	}
	@Test(priority = 16)
	public void repairApprovalAttachDoc() throws InterruptedException, AWTException {
		repairObject.repairApprovalAttachDoc();
	}
	@Test(priority = 17)
	public void repairApproveThird()throws InterruptedException  {
		repairObject.repairApproveThird();
	}
	@Test(priority = 18)
	public void repairCompletionSelectItem() throws InterruptedException {
		repairObject.repairCompletionSelectItem();
	}
	
	
	@Test(priority = 19)
	public void repairCompletionLoaction() {
		repairObject.repairCompletionLoaction();
	}
	@Test(priority = 20)
	public void repairCompletionLocationInhouse() throws InterruptedException {
		repairObject.repairCompletionLocationInhouse();
	}
	@Test(priority = 21)
	public void repairCompletionDate() throws InterruptedException {
		repairObject.repairCompletionDate();
	}
	
	@Test(priority = 22)
	public void repairCompletionAddRemarks() throws InterruptedException {
		repairObject.repairCompletionAddRemarks();
	}
	@Test(priority = 23)
	public void repairCompletionAttachDoc() throws InterruptedException, AWTException {
		repairObject.repairCompletionAttachDoc();
	}
	@Test(priority = 24)
	public void repairCompletionSubmit() {
		repairObject.repairCompletionSubmit();
	}
//	@Test(priority = 25)
//	public void bclBrandInspectionConfirm() throws InterruptedException {
//		repairObject.bclBrandInspectionConfirm();
//	}
//	@Test(priority = 26)
//	public void bclResolutionSelectItem() throws InterruptedException {
//		repairObject.bclResolutionSelectItem();
//	}
//	@Test(priority = 27)
//	public void bclBrandResolution() throws InterruptedException {
//		repairObject.bclBrandResolution();
//	}
//	@Test(priority = 28)
//	public void bclBrandInspectionSetDisposition()throws InterruptedException  {
//		repairObject.bclBrandInspectionSetDisposition();
//	}
//	@Test(priority = 29)
//	public void bclBrandSetDispoInsurance() throws InterruptedException {
//		repairObject.bclBrandSetDispoInsurance();
//	}
//	
//	
//	@Test(priority = 30)
//	public void bclBrandResolutionRemarks() throws InterruptedException {
//		repairObject.bclBrandResolutionRemarks();
//	}
//	@Test(priority = 31)
//	public void bclBrandResolutionAttachDoc() throws InterruptedException, AWTException {
//		repairObject.bclBrandResolutionAttachDoc();
//	}
//	@Test(priority = 32)
//	public void bclBrandResolutionConfirm() throws InterruptedException {
//		repairObject.bclBrandResolutionConfirm();
//	}

}
