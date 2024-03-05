package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmploymentDetails;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.PersonalDetails;

public class BankLogin4Test {
	public static WebDriver driver;
	
	@DataProvider(name="credentilassupplies")
	
	
	@Given("User able to navigate Login screen")
	public void user_able_to_navigate_login_screen() {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("http://10.30.73.56:5601/3ibank/index.html");
		   driver.manage().window().maximize();
	    
	}

	@Given("User enter the inputs as username,password and creditcard")
	public void user_enter_the_inputs_as_username_password_and_creditcard() throws IOException {
	LoginPage login=new LoginPage(driver);
	login.LoginToPage("Random", "Random", "7878");
		
	}

	@When("User clcik on login button")
	public void user_clcik_on_login_button() {
	    System.out.println("Login Button Clicked");
	}

	@Then("User verify the home page")
	public void user_verify_the_home_page() {
		driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).isDisplayed();
		  System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).getText());
	   
	}
	@Then("User click on ApplyNow button")
	public void user_click_on_apply_now_button() {
	   HomePage home=new HomePage(driver);
	   home.home();
	}

	@Then("User redirect to PICRA screen")
	public void user_redirect_to_picra_screen() {
		System.out.println("PICRA Statement should be rendered");
	    
	}

	@Then("User click on agree and agree continue button")
	public void user_click_on_agree_and_agree_continue_button() {
	    System.out.println("Agree Button Clicked");
	}
	@Then("User navigate to personal detail tab")
	public void user_navigate_to_personal_detail_tab() {
		
	    
	}

	@And("User give the inputs forFirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email")
	public void user_give_the_inputs_for_first_name_last_name_date_of_birth_pan_number_mobile_number_email() {
		PersonalDetails perdetails= new PersonalDetails(driver);
		perdetails.perdetails("demo","test","07/31/1993","1234567","8374027476","testdemo123@gmail.com");
	}
	@When("User click on save and submitt the all details")
	public void user_click_on_save_and_submitt_the_all_setails() throws Exception {
		
		
	}

	@Then("User redirect to the Employment details tab")
	public void user_redirect_to_the_employment_details_tab() {
	    
	}
	@Then("User give the inputs for emp details Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay")
	public void user_give_the_inputs_for_emp_details_employer_employers_phone_employement_status_how_oftenareyoupaid_last_pay_date_next_pay_date_last_take_home_pay_cheque_amount_take_home_for_the_month_of_may() throws InterruptedException {
		EmploymentDetails ed= new EmploymentDetails (driver);
		ed.empdetails ("Testing","8374027476","Approved","LastDayOfMonth","01/27/2024","02/27/2024","100","100");
	}
	
	@Then("User should be save and sbmitt the details")
	public void user_should_be_save_and_sbmitt_the_details() {
	    
	}

	@Then("User able to click on Logout")
	public void user_able_to_click_on_logout() {
		LogoutPage Lout= new LogoutPage(driver);
		Lout.Logoutinpage();
	


}
}
