package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {
	
	public void values() throws InterruptedException {
		
		File file = new File("C:\\Users\\pradeep.s\\eclipse-workspace\\Testing\\src\\test\\input.properties");
		
		FileInputStream fis = null;
		
		try {
			 fis = new FileInputStream(file);
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		try {
			
			prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\eclipse-workspace\\Framework\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys(prop.getProperty("App.userid"));
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys(prop.getProperty("App.pwd"));
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Property obj = new Property();
		obj.values();
	}

}
