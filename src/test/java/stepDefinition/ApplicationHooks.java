//package stepDefinition;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//
//public class ApplicationHooks {
//	
//	private DriverFactory driverFactory;
//	private WebDriver driver;
//
//	@Before(order = 1)
//	public void launchBrowser() {
//		driverFactory = new DriverFactory();
//		driver = driverFactory.init_driver("chrome");
//		driver.get("http://10.30.73.56:5601/3ibank/index.html");
//		
//	}
//
//	@After(order = 0)
//	public void quitBrowser() {
//		driver.quit();
//	}
//
//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
//	}
//
//
//}
