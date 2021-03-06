package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Features/"},
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty","html:test-output"},//output in the console window
		tags = "@sanity",
		monochrome = true
		
		
		)

public class TestRunner {

}
