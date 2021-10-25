package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		strict = true,
		features = "src/test/java/features/placeValidation.feature",
		plugin = "json:target/jsonReports/cucumber-report.json",
		glue = "stepDefinations",tags="@DeletePlace")

public class TestRunner {

}