package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private  WebDriver driver;
	
	// 1. By Locators: OR
		private  By username = By.xpath("//input[@id='username']");
		private  By password = By.xpath("//input[@id='password']");
		private  By creditcard = By.xpath("//input[@id='card']");
		private  By Login = By.xpath("//button[@id='login_btn']");
		


		// 2. Constructor of the page class:
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		//Action Methods
		public void LoginToPage(String uname,String pwd, String creditcardno)
		{
			driver.findElement(username).sendKeys(uname);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(creditcard).sendKeys(creditcardno);
			driver.findElement(Login).click();
		}
		
		
}
