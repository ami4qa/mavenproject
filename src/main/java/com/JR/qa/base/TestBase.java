package com.JR.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.JR.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public	static Properties prop;
	
	public TestBase() {
		
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("/Users/Ami/eclipse-workspace/mavenproject/src/main/java/com/JR/qa/config/config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		
		
		public static void intialization() {
	
		String browsername=prop.getProperty("browsername");
		System.out.println(browsername);
		if(browsername.equals("Chrome")) {
		 driver=new ChromeDriver();
			
System.setProperty("Webdriver.chrome.driver","C://Program Files//Google//Chrome//Application//chrome.exe");
		}
		else if(browsername.equalsIgnoreCase("edgedriver")) {
			
			 driver=new EdgeDriver();
				System.setProperty("Webdriver.edge.driver", "C://Program Files (x86)//Microsoft//Edge//Application//msedge.exe/ --profile-directory=Default");
		
		
		
		}
		else if(browsername.equalsIgnoreCase("Firefoxdriver")){
			WebDriver driver=new FirefoxDriver();
			System.setProperty("Webdriver.Gecko.driver","C://Program Files//Mozilla Firefox//firefox.exe");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		}//eoc

}//eom
