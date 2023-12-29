package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.project.code.Replacement;

public class Replacement_Test {
	Replacement replaceObject;
	@BeforeTest
	public void replacement1() {
		replaceObject=new Replacement();
	}
	@Test(priority = 1)
	public void replacement() throws InterruptedException {
		replaceObject.replacement();
	}
	@Test(priority = 2)
	public void replaceClickArrow() throws InterruptedException {
		replaceObject.replaceClickArrow();
	}
	@Test(priority = 3)
	public void replaceDate() throws InterruptedException {
		replaceObject.replaceDate();
	}
	@Test(priority = 4)
	public void replaceCreateItemID() throws InterruptedException {
		Thread.sleep(500);
		replaceObject.replaceCreateItemID();
	}
	@Test(priority = 5)
	public void replaceCloseButton() throws InterruptedException {
		replaceObject.replaceCloseButton();
	}
	@Test(priority = 6)
	public void replaceSerial()throws InterruptedException, AWTException  {
		replaceObject.replaceSerial();
	}
	@Test(priority = 7)
	public void replaceAddRemarks() throws InterruptedException {
		replaceObject.replaceAddRemarks();
	}
	
	
	@Test(priority = 8)
	public void replaceAttachDoc() throws InterruptedException, AWTException {
		replaceObject.replaceAttachDoc();
	}
	@Test(priority = 9)
	public void replaceSubmitFirst() throws InterruptedException {
		replaceObject.replaceSubmitFirst();
	}
	
	@Test(priority = 10)
	public void replaceRedeploySelectItem() throws InterruptedException {
		replaceObject.replaceRedeploySelectItem();
	}
	@Test(priority = 11)
	public void replaceRedeploySetDisposition() throws InterruptedException {
		replaceObject.replaceRedeploySetDisposition();
	}
	@Test(priority = 12)
	public void replaceRedeploySetDispositionBcl() throws InterruptedException {
		replaceObject.replaceRedeploySetDispositionBcl();
	}
	@Test(priority = 13)
	public void replaceRedeployAddRemarks() throws InterruptedException {
		replaceObject.replaceRedeployAddRemarks();
	}
	@Test(priority = 14)
	public void replaceRedeployAttachDoc() throws InterruptedException, AWTException {
		replaceObject.replaceRedeployAttachDoc();
	}
	@Test(priority = 15)
	public void replaceRedeployConfirm() throws InterruptedException {
		replaceObject.replaceRedeployConfirm();
	}

}
