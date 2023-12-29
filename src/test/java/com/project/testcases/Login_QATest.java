package com.project.testcases;



import java.io.IOException;

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import com.project.baseclass.initialiazeChrome;
import com.project.code.Login_QAdev;
public class Login_QATest extends initialiazeChrome {
	
	//Excel1 e;
	Login_QAdev cc;

	
	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();
		// login = new Sign_In();
	}

	@BeforeClass
	public void signIn() throws InterruptedException {
		cc = new Login_QAdev();
   		 //Thread.sleep(2000);
	}
	
	@Test
	public void loginTest() throws InterruptedException, EventException, IOException {
		Thread.sleep(500);
	   //.loginWithValid("lakshman_central","blubirch123");
		//Thread.sleep(3000);

	    cc.loginWithValid(cc.getExcelData("login",1,0),cc.getExcelData("login", 1, 1));
	}
	/*
	@DataProvider(name="loginWithValid")
	public Object[][] loginWithValid(){
		Object[][] data=new Object[0][1];
		data[0][0]="lakshman_central";
		data[0][1]="blubirch123";
		return data;
	}*/


	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		 driver.quit();

	}
}
