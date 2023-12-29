package com.project.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazeChrome;
import com.project.code.Disposition;

public class Disposition_Test extends initialiazeChrome{
	Disposition dis;
	@BeforeTest
	public void Disposition1() {
		dis=new Disposition();
	}
	@Test(priority = 13)
	public void Disposition() throws InterruptedException {
		dis.DispositionGoback();
	}

}
