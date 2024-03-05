package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	// 1. By Locators: OR
			private  By ApplyNow = By.xpath("(//button[@class='btn btn-primary agree-form'])[1]");
			private  By checkbox = By.xpath("//input[@id='myCheck']");
			private  By Agreecont = By.xpath("//button[@id='accept_agree']");
			private WebDriver driver;
			
			


			// 2. Constructor of the page class:
			public HomePage(WebDriver driver) {
				this.driver = driver;
			}
			
			//Action methods
			public void home()
			{
				
				driver.findElement(ApplyNow).click();
				driver.findElement(checkbox).click();
				driver.findElement(Agreecont).click();
			}
			

}
