package test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Page {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Register_Page RGPage = new Register_Page(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.get("https://www.facebook.com/");
		
		Logger logger = Logger.getLogger("Login_Page");
		//DOMConfigurator.configure("");
		PropertyConfigurator.configure("log4j.properties");
		
		RGPage.setUserName("Testing");
		logger.info("User Name Entered Successfully");
		RGPage.setPassword("Password");
		logger.info("Password Entered Successfully");
		
				
		
	}

}
