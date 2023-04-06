import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("/Users/Ami/eclipse-workspace/mavenproject/src/main/java/com/JR/qa/config/config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("username"));
		
		String url=prop.getProperty("url");
		System.out.println(url);
		
		String browsername=prop.getProperty("browsername");
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) {
		System.setProperty("WebDriver.chrome.driver","C://Program Files//Google//Chrome//Application");
		 driver= new ChromeDriver();
		}
		else if (browsername.equals("Firefox")) {
			System.setProperty("WebDriver.gecko.driver","C://Program Files//Google//Chrome//Application");
		 driver= new FirefoxDriver();
		}
		else if(browsername.equals("Edge")) {
			System.setProperty("WebDriver.edge.driver","C://Program Files//Google//Chrome//Application");
		 driver= new EdgeDriver();
		driver.get(url);
		}
	}//eoc

}//eom
