package com.project.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
import com.project.code.WarehouseManagement;


public class WarehouseManagement_Test extends initialiazeChrome {
	WarehouseManagement dispo;
	@BeforeTest
	public void dispositonBCL() {
		dispo=new WarehouseManagement();
	}
//	public void disposition1() {
//		object = new warehousepage();
//	}

	@Test
	public void clickOnDispositionlinkTest() throws InterruptedException {
		Thread.sleep(2000);
		dispo.clickOnDidposition();
	}


}
