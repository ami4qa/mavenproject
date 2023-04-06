package com.JR.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JR.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//span[contains(text(),'Ams Da')]")
	WebElement Usernamelabel;
	

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement Tasks;
	
	HomePage(){//Create constructor of homepage to intialise variables
		
		PageFactory.initElements(driver, this);
	}
		public String verifyHomeapgetitle() {
			
			return driver.getTitle();
			
		}
		public ContactsPage clickonconatactslink() {
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickondealslink() {
			dealsLink.click();
			return new DealsPage();
		}
		public TaskPage clickontasklink() {
			dealsLink.click();
			return new TaskPage();
		}
		public boolean verifyCorrectUsername() {
			return Usernamelabel.isDisplayed();
			
		}
	
	}

