package stepDefinition;
import java.io.IOException;
import java.util.List;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmploymentDetails;
import pages.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.PersonalDetails;

public class BankLoginEx5 {
	public static WebDriver driver;
	
	@Given("User navigate to 3i login screen")
	public void user_navigate_to_3i_login_screen() {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("http://10.30.73.56:5601/3ibank/index.html");
		   driver.manage().window().maximize();
	    }
	


	
	@And("User should be click on login button")
	public void user_should_be_click_on_login_button() {
		System.out.println("User sucessful login");
	    
	}
	@When("User fills from given sheetname {string} and rownumber as\"{int}\"")
	public void user_fills_from_given_sheetname_and_rownumber_as(String string, Integer rowNumber) throws Exception, Exception {
		ExcelReader reader=new ExcelReader();//calling excel reader
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\1002646\\TestingPractice.xlsx","Login");
		String un=testData.get(rowNumber).get("Username");
		String pwd=testData.get(rowNumber).get("Password");
		String card=testData.get(rowNumber).get("Creditcard");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@id='card']")).sendKeys(card);
		
		LoginPage login1=new LoginPage(driver);
		login1.LoginToPage(un, pwd, card);
	}

	@Then("User should be redirect to home page")
	public void user_should_be_redirect_to_home_page() {
		System.out.println("user sucussfully redirect to home page");
	    
	}

	@And("user click on ApplyNow button in home page")
	public void user_click_on_apply_now_button_in_home_page() {
		HomePage hm=new HomePage(driver);
		hm.home();
	}
	    
	
	

	@Then("click on checkbox and agree buttonon PICRA page")
	public void click_on_checkbox_and_agree_buttonon_picra_page() {
	    
	}
	@Then("user will provide personal details from sheetname {string} and rownumber as\"{int}\"")
	public void user_will_provide_personal_details_from_sheetname_and_rownumber_as(String string, Integer rowNumber) throws Exception, Exception {
	  
		ExcelReader reader=new ExcelReader();//calling excel reader
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\1002646\\TestingPractice.xlsx","Login");
		String fn=testData.get(rowNumber).get("Firstname");
		String ln=testData.get(rowNumber).get("Lastname");
		String dob=testData.get(rowNumber).get("Dateofbirth");
		String pan=testData.get(rowNumber).get("PANnumber");
		String mbl=testData.get(rowNumber).get("Mobile Number");
		String email=testData.get(rowNumber).get("Email");
		

	PersonalDetails pd= new PersonalDetails(driver);
	pd.perdetails(fn, ln, dob, pan, mbl, email);
	}
	

	@Then("User should be click on save and submitt the details")
	public void user_should_be_click_on_save_and_submitt_the_details() {
	
	    
	}
	@Then("User give the inputes from sheetname {string}, and rownumber as\"{int}\"")
	public void user_give_the_inputes_from_sheetname_and_rownumber_as(String string, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader=new ExcelReader();//calling excel reader
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\1002646\\TestingPractice.xlsx","Login");
		String empler=testData.get(rowNumber).get("Employer");
		String empph=testData.get(rowNumber).get("EmployersPhone");
		String empst=testData.get(rowNumber).get("EmployementStatus");
		String emppaid=testData.get(rowNumber).get("HowOftenareyoupaid");
		String Lpdate=testData.get(rowNumber).get("LastPayDate");
		String NxtpDate=testData.get(rowNumber).get("NextPayDate");
		String chqamt=testData.get(rowNumber).get("LastTakeHomePayChequeAmount");
		String hmamt=testData.get(rowNumber).get("TakeHomeForTheMonthOfMay"); 
		
		EmploymentDetails empdata= new EmploymentDetails(driver);
		empdata.empdetails(empler, empph, empst,emppaid , Lpdate, NxtpDate,chqamt,hmamt);
		
	}

	@Then("User able to click on save and submitt the details")
	public void user_able_to_click_on_save_and_submitt_the_details() {
	    
	}
	@Then("click on profile and logout the button")
	public void click_on_profile_and_logout_the_button() {
		LogoutPage Lout= new LogoutPage(driver);
		Lout.Logoutinpage();
		driver.quit();
	}



	
	
	
	



}
