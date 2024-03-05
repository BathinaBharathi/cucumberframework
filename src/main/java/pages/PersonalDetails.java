package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetails {
	
private  WebDriver driver;
	
	// 1. By Locators: OR
		private  By FirstName = By.xpath("//input[@id='firstname']");
		private  By LastName = By.xpath("//input[@id='lastname']");
		private  By Gender= By.xpath("//input[@name='gender'][2]");
		private  By DOB = By.xpath("//input[@id='dob']");
		private  By PanCard = By.xpath("//input[@id='pancard']");
		private  By Mobileno = By.xpath("//input[@id='mobileno']");
		private  By Email = By.xpath("//input[@id='email']");
		private  By Save = By.xpath("//button[@id='personal_details_save']");
		private  By Submitt = By.xpath("//button[@id='personal_details_submit']");
		private  By OK = By.xpath("//button[contains(text(),'OK')]");
		
		// 2. Constructor of the page class:
		public PersonalDetails(WebDriver driver) {
			this.driver = driver;
		}
		
		public void perdetails(String firstname,String lastname,String dob,String pancard,String mobileno,String email)
		{
			driver.findElement(FirstName).sendKeys(firstname);
			driver.findElement(LastName).sendKeys(lastname);
			driver.findElement(Gender).click();
			driver.findElement(DOB).sendKeys(dob);
			driver.findElement(PanCard).sendKeys(pancard);
			driver.findElement(Mobileno).sendKeys(mobileno);
			driver.findElement(Email).sendKeys(email);
			driver.findElement(Save).click();
			driver.findElement(Submitt).click();
			driver.findElement(OK).click();
		
		}
//		public void save() {
//			driver.findElement(Save).click();
//		}
//		
//		public void submit() {
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			 js.executeScript("arguments[0].click();",Submitt);
//		}
//		public void ok() {
//			driver.findElement(OK).click();
//		}
		
		
		
}

		
		
