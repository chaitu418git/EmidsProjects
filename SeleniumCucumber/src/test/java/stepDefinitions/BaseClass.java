package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomer;



public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddCustomer addCust;
	public SearchCustomer searcust;
	public static Logger logger;
	public static Properties prop;
	
	
	
	
	//created for generating random string for unoque emailid for every customer
	public static String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public static String getProp(String key) throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
}
