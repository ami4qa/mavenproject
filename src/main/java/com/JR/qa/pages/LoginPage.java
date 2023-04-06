package com.JR.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JR.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//we have to define object repository/Page factory
	//@FindBy annotation we have to use-different webelement
	
	
	@FindBy(name="username")//this is eual to driver.findelement(By.name)
	WebElement username;

	
	@FindBy(name="passowrd")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[conatins(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[conatins(@class,'img-responsive']")
	WebElement crmlogo;

	//How to initialize element with page factory-we have one method pagefactory.initelement

		public LoginPage() {//we are defining constructor
		
		PageFactory.initElements(driver, this);//all above variables are intilize with driver
		
		}
		//Actions
		
		
		public String ValidatingLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateCRMImage() {
			return crmlogo.isDisplayed();
		}
		public HomePage login(String un,String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new HomePage();
		}
		}
		
	
	