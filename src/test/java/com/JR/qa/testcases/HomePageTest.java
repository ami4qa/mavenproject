package com.JR.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.JR.qa.base.TestBase;
import com.JR.qa.pages.HomePage;
import com.JR.qa.pages.LoginPage;
import com.JR.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
		
		@BeforeMethod
		   public void setUp() {
			intialization();
			testUtil=new TestUtil();
			loginpage =new LoginPage();
			homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
		   }
		
		@Test(priority=1)
		public void verifyHomePageTitletest() {
			
			String title=homePage.verifyHomeapgetitle();
			Assert.assertEquals(title, "COGMENTO","Title not match");
		}
		
		@Test
		public void verifyUserNameTest() {
			
		
			
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}
	
}
