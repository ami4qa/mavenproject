package com.JR.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.JR.qa.base.TestBase;
import com.JR.qa.pages.HomePage;
import com.JR.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		
		super();
	}
	
	   @BeforeMethod
	   public void setUp() {
		intialization();
		LoginPage loginpage=new LoginPage();
	   }
	   
	   
		@Test(priority=1)
		public void loginPageTitleTest() {
		String title=loginpage.ValidatingLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer relationship Software,not matching");

		}
		
		@Test(priority=2)
		public void crmLogoImageTest() {
		boolean flag=loginpage.validateCRMImage();
		Assert.assertTrue(flag);
		}
			@Test
		public void loginTest() {
	   homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
				
			}
		
		
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
	
	
	
	
	
	
	

}
