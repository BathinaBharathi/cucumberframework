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

public class BankLoginpage {
	public static WebDriver driver;
	
	@Given("User navigate to 3i-Bank page")
	public void user_navigate_to_3i_bank_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("http://10.30.73.56:5601/3ibank/index.html");
	   driver.manage().window().maximize();
	   
	}

	@Given("User enter the username,password and creditcard")
	public void user_enter_the_username_password_and_creditcard() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo@123");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1214");
	}

	@When("click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
	}

	@And("Verify the home page")
	public void verify_the_home_page() {
	  driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).isDisplayed();
	  System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).getText());
	  
	}
	@And("click on Apply Now buttron")
	public void click_on_apply_now_buttron() {
		
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until
        (ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary agree-form'])[1]"))).click();
	}
	@Then("PICRA page will displayed")
	public void picra_page_will_displayed() {
		driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).isDisplayed();
		  System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).getText());
		 
	}

	
	@And("click on I agree checkbox and Agree&Continue button")
	public void click_on_i_agree_checkbox_and_agree_continue_button() {
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		//I agree checkbox
		driver.findElement(By.xpath("//input[@id='myCheck']")).click();
//Agree@continue
		driver.findElement(By.xpath("//button[@id='accept_agree']")).click();
	    
	}
	@And("Fills the personal details")
	public void fills_the_personal_details() {
		//personal details form
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("demo");
		driver.findElement(By.xpath(" //input[@name='gender'][2]")).click();
		
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("07/31/1993");
		driver.findElement(By.xpath("//input[@id='pancard']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys("8374027476");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testdemo123@gmail.com");
		driver.findElement(By.xpath("//button[@id='personal_details_save']")).click();
		driver.findElement(By.xpath("//button[@id='personal_details_submit']")).click();
		driver.findElement(By.xpath(" //h6[contains(text(),'Details Submitted Successfully')] ")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Details Submitted Successfully')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).getText());
	    
	}
	@And("Fills Employment details")
	public void fills_employment_details() {
		driver.findElement(By.xpath("(//div[@id='nav-step2']/div/div/input)[1]")).sendKeys("demo");
		driver.findElement(By.xpath("//p[text()='Employers Phone']//following-sibling::input[@type='text']")).sendKeys("test");
		driver.findElement(By.xpath("//p[text()='Employement Status*']//following-sibling::input[@type='text']")).sendKeys("good");
		//dropdown
		WebElement ele=driver.findElement(By.xpath("//select[@id='quality-source']"));
		Select select1 = new Select(ele);
		select1.selectByVisibleText("Last Day Of The Month");	
		driver.findElement(By.xpath("//input[@id='quality-reportpath']")).sendKeys("01/27/2024");
		driver.findElement(By.xpath("//input[@id='quality-username']")).sendKeys("02/27/2024");
		driver.findElement(By.xpath("(//input[@id='quality-password'])[1]")).sendKeys("100");
		driver.findElement(By.xpath("(//input[@id='quality-password'])[2]")).sendKeys("100");
		driver.findElement(By.xpath("//button[@id='employee_details_save']")).click();	
		driver.findElement(By.xpath("//button[@id='employee_details_submit']")).click();	
		driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
	}
	@Then("user click on Logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//img[@id='profileimg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
	}

	



}
