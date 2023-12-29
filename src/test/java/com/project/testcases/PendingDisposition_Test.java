package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.code.PendingDisposition;

public class PendingDisposition_Test {
	
	PendingDisposition pendingDispoObject;
	@BeforeTest
	public void pendingDipsosition1() {
		pendingDispoObject=new PendingDisposition();
	}
	
	
	@Test(priority = 1)
	public void pendingDisposition() throws InterruptedException {
		pendingDispoObject.pendingDisposition();
	}
	@Test(priority = 2)
	public void pendingDispoSelectItem() throws InterruptedException {
		pendingDispoObject.pendingDispoSelectItem();
	}
	@Test(priority = 3)
	public void pendingDispoSetDisposition() throws InterruptedException {
		pendingDispoObject.pendingDispoSetDisposition();
	}
	@Test(priority = 4)
	public void pendingDispoToInsurance() throws InterruptedException {
		Thread.sleep(500);
		pendingDispoObject.pendingDispoToInsurance();
	}
	@Test(priority = 5)
	public void pendingDispoAddRemarks() throws InterruptedException {
		pendingDispoObject.pendingDispoAddRemarks();
	}
	@Test(priority = 6)
	public void pendingDispoConfirm()throws InterruptedException  {
		pendingDispoObject.pendingDispoConfirm();
	}
	
}
