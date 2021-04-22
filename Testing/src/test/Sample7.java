package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hub.docker.com/search?type=image");
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Containers']"));
		String text = element.getText();
		System.out.println(text);
		if(element.isSelected())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		/*
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println(element1);
		
		
		if(element.isDisplayed() && element.isEnabled())
		{
			System.out.println("Element is already clicked");
			
		}
		else
		{
			System.out.println("Element is not clicked");
			element.click();
		}
		*/
	}

}
