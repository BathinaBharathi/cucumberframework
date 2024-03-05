package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@Login",
features = {"src/test/resources/features"},
glue = {"stepdefinitions", "stepDefinition"},
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"},
		//"json:Folder_Name/cucumber.json","junit:Folder_Name/cucumber.xml"},

          dryRun=false, //checks mapping b/w scenario steps and stepdefination methods
        monochrome=true,// to avaiod junk characters
        publish=false //to publish report in cucumber server


)

public class CucumberRunner {
	

}
