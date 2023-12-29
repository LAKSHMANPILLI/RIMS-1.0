package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.project.code.Redeploy;

public class Redeploy_Test {
	Redeploy redeployObject;
	@BeforeTest
	public void Redeploy() {
		redeployObject=new Redeploy();
	}
	@Test(priority = 1)
	public void redeploy() throws InterruptedException {
		redeployObject.redeploy();
	}
	@Test(priority = 2)
	public void redeploySelectItem() throws InterruptedException {
		redeployObject.redeploySelectItem();
	}
	@Test(priority = 3)
	public void redeploySetDisposition() throws InterruptedException {
		redeployObject.redeploySetDisposition();
	}
	@Test(priority = 4)
	public void redeployDispoToInsurance() throws InterruptedException {
		Thread.sleep(500);
		redeployObject.redeployDispoToInsurance();
	}
	@Test(priority = 5)
	public void redeployAddRemarks() throws InterruptedException {
		redeployObject.redeployAddRemarks();
	}
	@Test(priority = 6)
	public void redployAttachDoc()throws InterruptedException, AWTException  {
		redeployObject.redployAttachDoc();
	}
	@Test(priority = 7)
	public void redeployConfirm() throws InterruptedException {
		redeployObject.redeployConfirm();
	}
	
	
	@Test(priority = 8)
	public void redeploySelectItemForDispatch() throws InterruptedException {
		redeployObject.redeploySelectItemForDispatch();
	}
	@Test(priority = 9)
	public void redeployMoveToDispatch() throws InterruptedException {
		redeployObject.redeployMoveToDispatch();
	}
	
	@Test(priority = 10)
	public void redeployVendorcode() throws InterruptedException, AWTException {
		redeployObject.redeployVendorcode();
	}
	@Test(priority = 11)
	public void redeployLotName() throws InterruptedException {
		redeployObject.redeployLotName();
	}
	@Test(priority = 12)
	public void redeployConfirmDispatch() {
		redeployObject.redeployConfirmDispatch();
	}
	@Test(priority = 13)
	public void redeployDispatchOkbutton() throws InterruptedException {
		redeployObject.redeployDispatchOkbutton();
	}

}
