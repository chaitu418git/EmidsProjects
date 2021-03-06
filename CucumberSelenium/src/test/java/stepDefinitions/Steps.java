package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;
import pageObjects.AddCustomerPage;

public class Steps extends BaseClass{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	lp=new LoginPage(driver);
	addCust=new AddCustomerPage(driver);
	searchCustPage=new SearchCustomerPage(driver);
	}

	@And("user opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@And("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("user click on Login")
	public void user_click_on_login() {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			System.out.println(lp.errorMessage());
			Assert.assertEquals(lp.errorMessage().replaceAll("\\s",""),  "Login was unsuccessful. Please correct the errors and try again.\r\n" + 
					"No customer account found");
			driver.close();
			Assert.assertTrue(false);
		}
		else {
		Assert.assertEquals(driver.getTitle(), title);
	         }
		}
	

	@When("user click on Logour link")
	public void user_click_on_logour_link() {
	    lp.clickLogout();
	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
	//Customer Page Step Definitions
	@Then("user can view Dashboard")
	public void user_can_view_dashboard() {
Assert.assertEquals(addCust.getTitle(),"Dashboard / nopCommerce administration");
	}
	@When("user click on Customers Menu")
	public void user_click_on_customers_menu() {
	    addCust.clickCustomeMenuLink();
	}
	@And("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	   addCust.clickCustomeMenuItem();
	}
	@And("user landed on Customers Page")
	public void user_landed_on_customers_page() {
		
		Assert.assertEquals(addCust.getTitle(),	"Customers / nopCommerce administration");
	   
	}
	@And("click on Add New Button")
	public void click_on_add_new_button() {
	    addCust.addNew();
	}
	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals(addCust.getTitle(), "Add a new customer / nopCommerce administration"); 
	}
	@When("user enters customer info")
	public void user_enters_customer_info() throws InterruptedException {
	    String email=randomString()+"@gmail.com";
	    addCust.setEmail(email);
	    addCust.setPassword("test123");
	    addCust.setFirstName("chaitu");
	    addCust.setLastName("test");
	    addCust.setGender("Male");
	    addCust.setDob("8/5/2021");
	    addCust.setCompanyName("Test COmpany");
	    //Registered -Default
	    //The customer cannot be in both "guests" and "registered" custom roles
	    //Add the customer to Guests or registered customer role
	    addCust.setCustomerRole("Guests");
	    addCust.setManagerOfVendor("Vendor 2");
	    addCust.setAdminComment("commnets test");
	    
	}
	@And("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   addCust.clickOnSave();
	   Thread.sleep(2000);
	}
	@Then("user can view confirmation message as {string}")
	public void user_can_view_confirmation_message_as(String conmessage) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).
	    		getText().contains("The new customer has been added successfully"));
	}

//Search customer by emailid
	@And("user entered email in Email field")
	public void user_entered_email_in_email_field() {
	    searchCustPage.setEmail("brenda_lindgren@nopCommerce.com");
	}
	@When("user click on Search button")
	public void user_click_on_search_button() {
	    searchCustPage.clickSearch();
	    
	}
	@Then("search results related to email will be displayed")
	public void search_results_related_to_email_will_be_displayed() {
	 boolean status=  searchCustPage.searchCustomerByEmail("brenda_lindgren@nopCommerce.com"); 
	Assert.assertTrue(status);
	}

	//Search customer by FirstName
	@And("user entered firstname as {string} in FirstName field")
	public void user_entered_firstname_as_in_first_name_field(String fname) {
	   searchCustPage.setfName(fname); 
	}
	
	@Then("search results related to FirstName {string} will be displayed")
	public void search_results_related_to_first_name_will_be_displayed(String fname) {
	   boolean status=searchCustPage.searchCustomerByFname(fname);
	   Assert.assertTrue(status);

	}

	//search customer by FirstName and LastName
	@And("user entered lname as {string} in LastName field")
	public void user_entered_lname_as_in_last_name_field(String lname) {
	   searchCustPage.setLname(lname); 
	}
	@Then("search results related to FirstName {string} and lname {string} will be displayed")
	public void search_results_related_to_first_name_and_lname_will_be_displayed(String fname, String lname) {
	   boolean status= searchCustPage.searchCustomerByFnameAndLname(fname, lname);
	   Assert.assertTrue(status);
	}




}
