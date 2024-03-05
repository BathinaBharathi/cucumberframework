package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginTest {
	public static WebDriver driver;
	@Given("User navigate to 3i-Bank")
	public void user_navigate_to_3i_bank() {
		driver= new ChromeDriver();
		driver.get("http://10.30.73.56:5601/3ibank/index.html");
		
	    
	}

	@Given("User enter the name asusername,password and creditcard")
	public void user_enter_the_name_asusername_password_and_creditcard() {
	    
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
	    
	}


}
