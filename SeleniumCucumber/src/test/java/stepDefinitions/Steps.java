package stepDefinitions;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomer;

public class Steps extends BaseClass{
	
	@Before
	public void setUp() throws IOException
	{
		logger=Logger.getLogger("nopcommerce");
		PropertyConfigurator.configure("Log4j.properties");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		String br=getProp("browser");
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",getProp("chromepath"));
			driver=new ChromeDriver();
			logger.info("launching chrome browser");
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
			logger.info("launching firfox browser");
		}
		
			
		
		
	}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		
		lp=new LoginPage(driver);
		addCust=new AddCustomer(driver);
		searcust=new SearchCustomer(driver);
		
	}

	@And("user opens URL {string}")
	public void user_opens_url(String url) {
	    logger.info("opening the url");
		driver.get(url);
		driver.manage().window().maximize();
	    
	}

	@And("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pswd) {
		logger.info("providing login details");
	    lp.setUsername(uname);
	    lp.setPassword(pswd);
	}

	@When("user click on Login")
	public void user_click_on_login() {
	    lp.clickLogin();
	    logger.info("clicked on ,login");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			System.out.println(lp.errorMessage());
			driver.close();
			logger.info("Login failed");
		
			Assert.assertTrue(false);
		}
		else {
	 Assert.assertEquals(driver.getTitle(), expectedtitle);
	 logger.info("Login passed");
		}
	}

	@When("user click on Logout link")
	public void user_click_on_logout_link() {
	    lp.clickLogout();
	    logger.info("clicked on logout");
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    logger.info("closed the browser");
	}
	
	//Add Customer
	@Then("user can view Dashboard")
	public void user_can_view_dashboard() {
		Assert.assertEquals(addCust.getTitle(),"Dashboard / nopCommerce administration");
	}

	@When("user click on Customers Menu")
	public void user_click_on_customers_menu() {
	    addCust.clickCustomeMenuLink();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	    addCust.clickCustomeMenuItem();
	}

	@When("user landed on Customers Page")
	public void user_landed_on_customers_page() {
		Assert.assertEquals(addCust.getTitle(),	"Customers / nopCommerce administration");
	}

	@When("click on Add New Button")
	public void click_on_add_new_button() {
	    addCust.addNew();
	}

	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals(addCust.getTitle(), "Add a new customer / nopCommerce administration");
	}

	@When("user enters customer info")
	public void user_enters_customer_info() throws InterruptedException {
		String email=BaseClass.randomString()+"@gmail.com";
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

	@When("click on save button")
	public void click_on_save_button() {
	    addCust.clickOnSave();
	}

	@Then("user can view confirmation message as {string}")
	public void user_can_view_confirmation_message_as(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).
	    		getText().contains("The new customer has been added successfully"));
	}

//Search By Email
	@And("user entered email in Email field")
	public void user_entered_email_in_email_field() {
	    searcust.setEmail("brenda_lindgren@nopCommerce.com");
	}
	@When("user click on Search button")
	public void user_click_on_search_button() {
	   searcust.clickSearch();
	}
	@Then("search results related to email will be displayed")
	public void search_results_related_to_email_will_be_displayed() {
	   boolean status = searcust.searchCustomerByEmail("brenda_lindgren@nopCommerce.com");
	Assert.assertTrue(status);
	}


}
