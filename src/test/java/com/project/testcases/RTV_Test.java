package com.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
import com.project.code.RTV;

public class RTV_Test extends initialiazeChrome {
	RTV rtv;
	@BeforeTest
	public void RTV1() {
		rtv=new RTV();
	}
	@Test(priority = 1)
	public void RTV() throws InterruptedException {
		rtv.rtv();
	}
	@Test(priority = 2)
	public void rtvSelectItem() throws InterruptedException {
		rtv.rtvSelectItem();
	}
	@Test(priority = 3)
	public void RTVSetDisposition() throws InterruptedException {
		rtv.RTVSetDisposition();
	}
	@Test(priority = 4)
	public void RTVDispoToInsurance() throws InterruptedException {
		Thread.sleep(500);
		rtv.RTVDispoToInsurance();
	}
	@Test(priority = 5)
	public void RTVAddRemarks() throws InterruptedException {
		rtv.RTVAddRemarks();
	}
	@Test(priority = 6)
	public void RTVAttachDoc()throws InterruptedException, AWTException  {
		rtv.RTVAttachDoc();
	}
	@Test(priority = 7)
	public void RTVConfirm() throws InterruptedException {
		rtv.RTVConfirm();
	}
	
	
	@Test(priority = 8)
	public void rtvSelectItemForDispatch() throws InterruptedException {
		rtv.rtvSelectItemForDispatch();
	}
	@Test(priority = 9)
	public void RTVMoveToDispatch() throws InterruptedException {
		rtv.RTVMoveToDispatch();
	}
	
	@Test(priority = 10)
	public void RTVVendorcode() throws InterruptedException, AWTException {
		rtv.RTVVendorcode();
	}
	@Test(priority = 11)
	public void RTVLotName() throws InterruptedException {
		rtv.RTVLotName();
	}
	@Test(priority = 12)
	public void RTVConfirmDispatch() {
		rtv.RTVConfirmDispatch();
	}
	@Test(priority = 13)
	public void RTVDispatchOkbutton() throws InterruptedException {
		rtv.RTVDispatchOkbutton();
	}
}
