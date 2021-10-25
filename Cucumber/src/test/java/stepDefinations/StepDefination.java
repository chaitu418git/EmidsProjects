package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination{
	@Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("user is on landing page");
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        System.out.println("user enters username and pswd");
    }
    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(string+""+string2);
        //throw new io.cucumber.java.PendingException();
    }



    @And("^clicks on Login button$")
    public void clicks_on_login_button() throws Throwable {
        System.out.println("user clicked on login button");
    }

    @Then("^user should login into the application$")
    public void user_should_login_into_the_application() throws Throwable {
        System.out.println("user logins to the application");
    }
   

    @And("^Home Page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
        System.out.println("home page is displayed");
    }
    
    @And("Home Page should not be displayed")
    public void home_page_should_not_be_displayed() {
    	System.out.println("home page should not be displayed");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

}