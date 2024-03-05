package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EmploymentDetails;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.PersonalDetails;

public class BankLogin6Test {
	public static WebDriver driver;
	
	
	@Given("User should able to navigate Login screen")
	public void user_should_able_to_navigate_login_screen() {
		driver=new ChromeDriver();
		   driver.get("http://10.30.73.56:5601/3ibank/index.html");
		   driver.manage().window().maximize();
	    
	}

	@And("User given the credentails for username,passwors and creditcard")
	public void user_given_the_credentails_for_username_passwors_and_creditcard() {
		LoginPage login=new LoginPage(driver);
		login.LoginToPage("Json", "Leo@123", "7878");
	    
	}

	@Then("User click on Login button in login page")
	public void user_click_on_login_button_in_login_page() {
	    System.out.println("Login is sucessful");
	}
	@Given("User should able to home page screen")
	public void user_should_able_to_home_page_screen() {
		System.out.println("User naviagte to home screen ");
	    
	}

	@Given("User click on ApplyNow button in homepage")
	public void user_click_on_apply_now_button_in_homepage() {
		HomePage hm=new HomePage(driver);
		hm.home();
	    
	}

	@Then("User navigate to PCRA page")
	public void user_navigate_to_pcra_page() {
	    
	}

	@Then("click on check box and agree button")
	public void click_on_check_box_and_agree_button() {
	    
		
		
	}
	@Given("User should able to Personal details page")
	public void user_should_able_to_personal_details_page() {
	    
	}

	@Given("User enter the inputs for FirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email")
	public void user_enter_the_inputs_for_first_name_last_name_date_of_birth_pan_number_mobile_number_email() {
		PersonalDetails pd= new PersonalDetails(driver);
		pd.perdetails("demo","test","07/31/1993","1234567","8374027476","testdemo123@gmail.com");
	    
	}

	@Then("User click on save and submitt")
	public void user_click_on_save_and_submitt() {
	   
	}

	@Then("click on OK button on personal details tab")
	public void click_on_ok_button_on_personal_details_tab() {
	    
	}
	@Given("User should able to Emplyment details page")
	public void user_should_able_to_emplyment_details_page() {
	    
	}

	@Given("User enter the inputs for Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay")
	public void user_enter_the_inputs_for_employer_employers_phone_employement_status_how_oftenareyoupaid_last_pay_date_next_pay_date_last_take_home_pay_cheque_amount_take_home_for_the_month_of_may() throws InterruptedException {
	   
		EmploymentDetails epd= new EmploymentDetails (driver);
		epd.empdetails("Testing","8374027476","Approved","LastDayOfMonth","01/27/2024","02/27/2024","100","100");
	}

	@Then("User click on save and submitt on employ tab")
	public void user_click_on_save_and_submitt_on_employ_tab() {
	    
	}

	@Then("click on OK button on employ details tab")
	public void click_on_ok_button_on_employ_details_tab() {
	    
	}
	@Given("User able to Logout")
	public void user_able_to_logout() {
	    
	}

	@And("User click on profile")
	public void user_click_on_profile() {
		LogoutPage Lout= new LogoutPage(driver);
		Lout.Logoutinpage();	
	}
	    
	

	@Then("User able logout the button")
	public void user_able_logout_the_button() {
	    
driver.quit();



	}
}
