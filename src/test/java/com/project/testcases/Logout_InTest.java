package com.project.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
import com.project.code.Logout_In;
public class Logout_InTest extends initialiazeChrome{
	Logout_In kl;
	@BeforeMethod
	public void Logout() {
	   kl = new Logout_In();
	}
	@Test(priority = 15)
	public void logout() throws InterruptedException {
		kl.logout();
	}
     @Test(priority = 16)
	public void Logout_Test() {
		kl.logout1();
	}

}
