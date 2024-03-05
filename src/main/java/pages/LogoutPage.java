package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	private  WebDriver driver;
	// 1. By Locators: OR
			private  By profile = By.xpath("//img[@id='profileimg']");
			private  By logout = By.xpath("//span[contains(text(),'Logout')]");
			
			


			// 2. Constructor of the page class:
			public LogoutPage(WebDriver driver) {
				this.driver = driver;
			}
			
			public void Logoutinpage()
			{
				
				driver.findElement(profile).click();
				driver.findElement(logout).click();
			}

}
