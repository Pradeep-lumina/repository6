package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	WebDriver driver;
	/*
	By username = By.id("email");
	By password = By.id("pass");
	
	Register_Page(WebDriver d)
	{
		driver = d;
	}
	
	public void setUserName(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
*/
	@FindBy(how = How.ID,  using="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	Register_Page(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
}
