package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class BankLoginTest3 {
	
	public static WebDriver driver;
	FileInputStream fs;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	Cell cell;
	Row row;
	
	
	@Given("User navigate to 3i-Bank Login screen")
	public void user_navigate_to_3i_bank_login_screen() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   driver.get("http://10.30.73.56:5601/3ibank/index.html");
	   driver.manage().window().maximize();
	}
	

@Given("User enter the username,password for the creditcard")
public void user_enter_the_username_password_for_the_creditcard() throws IOException {
    
  //Path of the excel file
  		 fs = new FileInputStream("C:\\Users\\1002646\\Testing.xlsx");
  		//Creating a workbook
		 workbook = new XSSFWorkbook(fs); 
			 sheet = workbook.getSheet("Testdata1");
//			 row = sheet.getRow(1);
//			 cell = row.getCell(0);
//			System.out.println(cell.getStringCellValue());
			String username=sheet.getRow(1).getCell(0).getStringCellValue();
			String password=sheet.getRow(1).getCell(1).getStringCellValue();
		    String creditcard=sheet.getRow(1).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		    driver.findElement(By.xpath("//input[@id='card']")).sendKeys(creditcard);
}

	@When("User enter the login button")
	public void user_enter_the_login_button() {
	   
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
	}

	@Then("Home page will displayed")
	public void home_page_will_displayed() {
		driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).isDisplayed();
		  System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'3i Bank')]")).getText());	
		  }
	@Then("User click on Apply Now button in home page")
	public void user_click_on_apply_now_button_in_home_page() {
		
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until
        (ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary agree-form'])[1]"))).click();
	}
	@Then("User should be navigate to PICRA screen")
	public void user_should_be_navigate_to_picra_screen() {
	driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).isDisplayed();
	 System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Personal Information Consents')]")).getText());
	}
	@Then("User click on I agree and Agree&Continue button in PICRA screen")
	public void user_click_on_i_agree_and_agree_continue_button_in_picra_screen() {
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
//I agree checkbox
		driver.findElement(By.xpath("//input[@id='myCheck']")).click();
//Agree@continue
		driver.findElement(By.xpath("//button[@id='accept_agree']")).click();
	}
	@Then("User navigtes to Personal details tab")
	public void user_navigtes_to_personal_details_tab() {
		driver.findElement(By.id("personaldetails")).isDisplayed();
		System.out.println(driver.findElement(By.id("personaldetails")).getText());
	}
	@Then("User give the inputs as FirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email")
	public void user_give_the_inputs_as_first_name_last_name_date_of_birth_pan_number_mobile_number_email() {
		//personal details tab
		String FirstName=sheet.getRow(1).getCell(3).getStringCellValue();
		String LastName=sheet.getRow(1).getCell(4).getStringCellValue();
	    String DateOfBirth=sheet.getRow(1).getCell(5).getStringCellValue();
	    String PANNumber=sheet.getRow(1).getCell(6).getStringCellValue();
	    String MobileNumber=sheet.getRow(1).getCell(7).getStringCellValue();
	    String Email=sheet.getRow(1).getCell(8).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FirstName);
	    driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
	    driver.findElement(By.xpath(" //input[@name='gender'][2]")).click();
	    driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(DateOfBirth);
	    driver.findElement(By.xpath("//input[@id='pancard']")).sendKeys(PANNumber);
	    driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys(MobileNumber);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
	   	
	   	 
	} 
	@Then("User click on save and submitt the personal details")
	public void user_click_on_save_and_submitt_the_personal_details() {
		driver.findElement(By.xpath("//button[@id='personal_details_save']")).click();
		driver.findElement(By.xpath("//button[@id='personal_details_submit']")).click();
		driver.findElement(By.xpath(" //h6[contains(text(),'Details Submitted Successfully')] ")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Details Submitted Successfully')]")).getText());
	}
	@Then("Click on OK in approved screen and click on next button")
	public void click_on_ok_in_approved_screen_and_click_on_next_button() {
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).getText());
	}
	@Then("User navigate to Employement details tab")
	public void user_navigate_to_employement_details_tab() {
		driver.findElement(By.id("employeedetails")).isDisplayed();
		System.out.println(driver.findElement(By.id("employeedetails")).getText());
	}
	@Then("User gives the input as in Employment details Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay")
	public void user_gives_the_input_as_in_employment_details_employer_employers_phone_employement_status_how_oftenareyoupaid_last_pay_date_next_pay_date_last_take_home_pay_cheque_amount_take_home_for_the_month_of_may() {
		
		String Employer=sheet.getRow(1).getCell(9).getStringCellValue();
		String EmployersPhone=sheet.getRow(1).getCell(10).getStringCellValue();
	    String EmployementStatus=sheet.getRow(1).getCell(11).getStringCellValue();
	    
	    String LastPayDate=sheet.getRow(1).getCell(13).getStringCellValue();
	    String NextPayDate=sheet.getRow(1).getCell(14).getStringCellValue();
	    String LastTakeHomePayChequeAmount=sheet.getRow(1).getCell(15).getStringCellValue();
	    String TakeHomeForTheMonthOfMay=sheet.getRow(1).getCell(16).getStringCellValue();
	    
	    
	    driver.findElement(By.xpath("(//div[@id='nav-step2']/div/div/input)[1]")).sendKeys(Employer);
	    driver.findElement(By.xpath("//p[text()='Employers Phone']//following-sibling::input[@type='text']")).sendKeys(EmployersPhone);
	    
	    driver.findElement(By.xpath("//p[text()='Employement Status*']//following-sibling::input[@type='text']")).sendKeys(EmployementStatus);
	  //dropdown
	    WebElement ele=driver.findElement(By.xpath("//select[@id='quality-source']"));
	    Select select1 = new Select(ele);
	    select1.selectByVisibleText("Last Day Of The Month");
	    driver.findElement(By.xpath("//input[@id='quality-reportpath']")).sendKeys(LastPayDate);
	    driver.findElement(By.xpath("//input[@id='quality-username']")).sendKeys(NextPayDate);
	    driver.findElement(By.xpath("(//input[@id='quality-password'])[1]")).sendKeys(LastTakeHomePayChequeAmount);
	    driver.findElement(By.xpath("(//input[@id='quality-password'])[2]")).sendKeys(TakeHomeForTheMonthOfMay);
	}
	@Then("User click on save and submitt Em[ployment details")
	public void user_click_on_save_and_submitt_em_ployment_details() {
		driver.findElement(By.xpath("//button[@id='employee_details_save']")).click();	
		driver.findElement(By.xpath("//button[@id='employee_details_submit']")).click();	
		driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
	}
	@And("User able to click on logout")
	public void user_able_to_click_on_logout() {
		//logout
		driver.findElement(By.xpath("//img[@id='profileimg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}






	
	



}
