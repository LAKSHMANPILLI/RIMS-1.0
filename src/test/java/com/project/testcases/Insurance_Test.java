package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
import com.project.code.Insurance;

public class Insurance_Test extends initialiazeChrome {
	Insurance insu1;
	@BeforeTest
	
	public void dispositionInsurance() {
		insu1=new Insurance();
	}
	
	@Test(priority = 1)
	public void Insurance() throws InterruptedException {
		insu1.Insurance();
	}
	@Test(priority = 2)
	public void insuSelectItem() throws InterruptedException {
	insu1.insuSelectItem();
	}
	@Test(priority = 3)
	public void insuClaimSubmitionDate() throws InterruptedException {
		insu1.insuClaimSubmitionDate();
	}
	@Test(priority = 4)
	public void insuClaimAmount() throws InterruptedException {
		insu1.insuClaimAmount();
	}
	@Test(priority = 5)
	public void insuAddRemarks() throws InterruptedException {
		Thread.sleep(500);
		insu1.insuAddRemarks();
	}
	@Test(priority = 6)
	public void insuAttachDoc() throws AWTException, InterruptedException {
		insu1.insuAttachDoc();
	}
	@Test(priority = 7)
	public void insuConfirmFirst()throws InterruptedException  {
		insu1.insuConfirmFirst();
	}
//	@Test(priority = 8)
//	public void insuUpdateClaimRegist() throws InterruptedException {
//		insu1.insuUpdateClaimRegist();
//	}
//	
	@Test(priority = 8)
	public void insuUpdateCallSelectItem() throws InterruptedException {
		insu1.insuUpdateCallSelectItem();
	}
	@Test(priority = 9)
	public void insuUpdateClaimCallLog() {
		insu1.insuUpdateClaimCallLog();
	}
	@Test(priority = 10)
	public void insuEnterCallLog() throws InterruptedException {
		insu1.insuEnterCallLog();
	}
	@Test(priority = 11)
	public void insuConfirmSecond() throws InterruptedException {
		insu1.insuConfirmSecond();
	}
//	@Test(priority = 11)
//	public void insuSurveyorInspection() throws InterruptedException {
//	insu1.insuSurveyorInspection();
//	}
	@Test(priority = 12)
	public void insuSurveyorSelectItem() throws InterruptedException {
		insu1.insuSurveyorSelectItem();
	}
	@Test(priority = 13)
	public void insuSurveyorUpdateInfo() throws InterruptedException {
		insu1.insuSurveyorUpdateInfo();
	}
	@Test(priority = 14)
	public void insuSurveyorClaimInspectionDate() throws InterruptedException {
		Thread.sleep(500);
		insu1.insuSurveyorClaimInspectionDate();
	}
	@Test(priority = 15)
	public void InsuSurveyorAddRemarks() throws InterruptedException {
		insu1.InsuSurveyorAddRemarks();
	}
	@Test(priority = 16)
	public void insuAttachDocInspection() throws AWTException, InterruptedException {
		insu1.insuAttachDocInspection();
	}
	@Test(priority = 17)
	public void insuConfirmThird()throws InterruptedException  {
		insu1.insuConfirmThird();
	}
//	@Test(priority = 18)
//	public void insuClaimResolution() throws InterruptedException {
//		insu1.insuClaimResolution();
//	}
	
	
	@Test(priority = 18)
	public void insuClaimResolutionApprove() throws InterruptedException {
		insu1.insuClaimResolutionApprove();
	}
	@Test(priority = 19)
	public void insuClaimResolutionApprovelDate() throws InterruptedException {
		insu1.insuClaimResolutionApprovelDate();
	}
	@Test(priority = 20)
	public void insuClaimResolutionApprovedAmount() {
		insu1.insuClaimResolutionApprovedAmount();
	}
	@Test(priority = 21)
	public void insuClaimResolutionAddRemarks() throws InterruptedException {
		insu1.insuClaimResolutionAddRemarks();
	}
	
	@Test(priority = 21)
	public void insuAttachDocClaimresolution() throws InterruptedException, AWTException {
		insu1.insuAttachDocClaimresolution();
	}
	@Test(priority = 22)
	public void insuConfirmFourth() throws InterruptedException {
		insu1.insuConfirmFourth();
	}
//	@Test(priority = 24)
//	public void insuPendingLiquidation() throws InterruptedException {
//	insu1.insuPendingLiquidation();
//	}
	@Test(priority = 23)
	public void insuPendingLiquidationSelectItem() throws InterruptedException {
		insu1.insuPendingLiquidationSelectItem();
	}
	@Test(priority = 24)
	public void insuPendingLiquidSetDisposition() throws InterruptedException {
		insu1.insuPendingLiquidSetDisposition();
	}
	@Test(priority = 25)
	public void insuSetDispositionLiquidation() throws InterruptedException {
		Thread.sleep(500);
		insu1.insuSetDispositionLiquidation();
	}
	@Test(priority = 26)
	public void insuPendingLiquidationAddRemarks() throws InterruptedException {
		insu1.insuPendingLiquidationAddRemarks();
	}
	
	@Test(priority = 27)
	public void insuAttachDocPendingLiqui()throws InterruptedException, AWTException  {
		insu1.insuAttachDocPendingLiqui();
	}
	@Test(priority = 28)
	public void insuConfirm5th()throws InterruptedException  {
		insu1.insuConfirm5th();
	}
	

}
