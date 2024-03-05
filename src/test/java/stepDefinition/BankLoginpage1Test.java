package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BankLoginpage1Test {
	public static WebDriver driver; 
	
	@Given("User navigate to 3i-Bank Loginpage")
	public void user_navigate_to_3i_bank_loginpage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   driver.get("http://10.30.73.56:5601/3ibank/index.html");
	   driver.manage().window().maximize();
	}

	@When("User enter the user name as {string},password as {string} , creditcardno as {string} and click on login button")
	public void user_enter_the_user_name_as_password_as_creditcardno_as_and_click_on_login_button(String string, String string2, String string3) {
		
		System.out.println("This is my login username"+string);
		System.out.println("This is my password"+string2);
		System.out.println("This is my creditcardno"+string3);
		
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys(string3);
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
		 driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).isDisplayed();
		 System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).getText());
		  
	}

	@When("Click on Apply Now button")
	public void click_on_apply_now_button() {
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until
	        (ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary agree-form'])[1]"))).click();
	}
	@Then("PICRA screen will displayed")
	public void picra_screen_will_displayed() {
		driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).isDisplayed();
		  System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).getText());
	}
	@And("Click on I agree button and Agree&Continue button")
	public void click_on_i_agree_button_and_agree_continue_button() {
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
//I agree checkbox
		driver.findElement(By.xpath("//input[@id='myCheck']")).click();
//Agree@continue
		driver.findElement(By.xpath("//button[@id='accept_agree']")).click();
	}
	@And("user enter the personal details as  {string},{string},{string},{string},{string},{string}")
	public void user_enter_the_personal_details_as(String string, String string2, String string3, String string4, String string5, String string6) {
	    
		System.out.println("This is my FirstName"+string);
		System.out.println("This is my LastName"+string2);
		System.out.println("This is my DOB"+string3);
		System.out.println("This is my PAN NO"+string4);
		System.out.println("This is my Mobileno"+string5);
		System.out.println("This is my Email"+string6);
		//personal details form
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(string2);
		driver.findElement(By.xpath(" //input[@name='gender'][2]")).click();
		//date picker
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(string3);
		driver.findElement(By.xpath("//input[@id='pancard']")).sendKeys(string4);
		driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys(string5);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string6);
	}
	@And("click on save and submitt the details")
	public void click_on_save_and_submitt_the_details() {
	    
		driver.findElement(By.xpath("//button[@id='personal_details_save']")).click();
		driver.findElement(By.xpath("//button[@id='personal_details_submit']")).click();
		driver.findElement(By.xpath(" //h6[contains(text(),'Details Submitted Successfully')] ")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Details Submitted Successfully')]")).getText());
	}
	@Then("Click on OK and next button")
	public void click_on_ok_and_next_button() {
	    
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
	}
	@Then("User navigate Employement detail page")
	public void user_navigate_employement_detail_page() {
	    
		driver.findElement(By.xpath("//a[@id='employeedetails']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//a[@id='employeedetails']")).getText());
	}
	@Then("User enter the Employement details as {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_employement_details_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
		System.out.println(" Employer"+string);
		System.out.println("Employer Phone"+string2);
		System.out.println("Employment status"+string3);
		System.out.println("How Often are you paid?"+string4);
		System.out.println("Last Pay Date"+string5);
		System.out.println("Next Pay Date"+string6);
		System.out.println("Last Take Home Pay Cheque Amount"+string7);
		System.out.println("Take Home For The Month Of May"+string8);
		//Employment Details
		driver.findElement(By.xpath("(//div[@id='nav-step2']/div/div/input)[1]")).sendKeys(string);
		driver.findElement(By.xpath("//p[text()='Employers Phone']//following-sibling::input[@type='text']")).sendKeys(string2);
		driver.findElement(By.xpath("//p[text()='Employement Status*']//following-sibling::input[@type='text']")).sendKeys(string3);
		//dropdown
		WebElement ele=driver.findElement(By.xpath("//select[@id='quality-source']"));
		Select select1 = new Select(ele);
		select1.selectByVisibleText("Last Day Of The Month");	
		driver.findElement(By.xpath("//input[@id='quality-reportpath']")).sendKeys(string5);
		driver.findElement(By.xpath("//input[@id='quality-username']")).sendKeys(string6);
		driver.findElement(By.xpath("(//input[@id='quality-password'])[1]")).sendKeys(string7);
		driver.findElement(By.xpath("(//input[@id='quality-password'])[2]")).sendKeys(string8);
		

	

	}
	@Then("click on save and submitt the Employement details")
	public void click_on_save_and_submitt_the_employement_details() {
		driver.findElement(By.xpath("//button[@id='employee_details_save']")).click();	
		driver.findElement(By.xpath("//button[@id='employee_details_submit']")).click();	
		driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();

	}
	@Then("click on log out button")
	public void click_on_log_out_button() {
		//logout
		driver.findElement(By.xpath("//img[@id='profileimg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}

}
	

	    
	



	
	    
	



