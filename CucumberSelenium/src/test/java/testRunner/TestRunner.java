package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//to run all files-, then we have to follow below
		//features=".//Features", --If u want run all feature files
		//to run some features file , then we have to follow below
		//features={".//Features/Customers.feature",".//Features/Customers.feature"},
		features= ".//Features",
		glue="stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test-output"},
		publish = true
		
		)
public class TestRunner {

	
	
	
}
