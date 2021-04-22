package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample6 {
	
	@Test
	public void method() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hub.docker.com/search?type=image");
		
		Thread.sleep(2000);
		
		boolean element = driver.findElement(By.xpath("//button[@value='image']")).isSelected();
		System.out.println(element);
		
	}

}
