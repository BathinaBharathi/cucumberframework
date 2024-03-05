package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmploymentDetails {
	
	
			private WebDriver driver;
			// 1. By Locators: OR
		                private By EmployerTab = By.xpath("//a[@id='employeedetails']");
						private  By Employer = By.xpath("(//div[@id='nav-step2']/div/div/input)[1]");
						private  By EmployersPhone = By.xpath("//p[text()='Employers Phone']//following-sibling::input[@type='text']");
						private  By EmployementStatus= By.xpath("//p[text()='Employement Status*']//following-sibling::input[@type='text']");
						private  By HowOftenareyoupaid = By.xpath("//select[@id='quality-source']");
						private  By LastPayDate= By.xpath("//input[@id='quality-reportpath']");
						private  By NextPayDate = By.xpath("//input[@id='quality-username']");
						private  By ChequeAmount = By.xpath("(//input[@id='quality-password'])[1]");
						private  By MonthOfMay = By.xpath("(//input[@id='quality-password'])[2]");
						private  By save = By.xpath("//button[@id='employee_details_save']");
						private  By submitt=By.xpath("//button[@id='employee_details_submit']");
						private  By OK=By.xpath("//button[contains(text(),'OK')]");
			
			
			// 2. Constructor of the page class:
			public EmploymentDetails(WebDriver driver) {
				this.driver = driver;
			}
			public void empdetails(String employer,String empphone,String empstatus,String lstmnt ,String lastpaydate,String nxtpatdate,String chqamt,String mnchq) throws InterruptedException
			{
				driver.findElement(EmployerTab).click();
				Thread.sleep(5000);
				//JavascriptExecutor js= (JavascriptExecutor)driver;
			
				driver.findElement(Employer).sendKeys(employer);
				driver.findElement(EmployersPhone).sendKeys(empphone);
				driver.findElement(EmployementStatus).sendKeys(empstatus);
				driver.findElement(HowOftenareyoupaid).sendKeys(lstmnt);
				driver.findElement(LastPayDate).sendKeys(lastpaydate);
				driver.findElement(NextPayDate).sendKeys(nxtpatdate);
				driver.findElement(ChequeAmount).sendKeys(chqamt);
				driver.findElement(MonthOfMay).sendKeys(mnchq);
				driver.findElement(save ).click();
				driver.findElement(submitt ).click();
				driver.findElement(OK ).click();
			}
			
				
			}
			
				
			


