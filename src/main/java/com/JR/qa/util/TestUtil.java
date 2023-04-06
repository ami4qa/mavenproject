package com.JR.qa.util;

import com.JR.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	public void switchtoFrame() {
		
		driver.switchTo().frame("mainpanel");
	}
	
	
}
