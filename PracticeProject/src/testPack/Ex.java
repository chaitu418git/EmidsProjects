package testPack;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://classic.crmpro.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys(getUserName("admin"));
	driver.findElement(By.name("password")).sendKeys(getPassword("admin"));
	
}
public static HashMap<String, String> getCredentials()
{
	HashMap<String, String> userMap=new HashMap<String, String>();
	userMap.put("customer", "chaitu:chaitu123");
	userMap.put("admin", "admin:admin123");
	userMap.put("seller", "seller:seller123");
	userMap.put("distibutor", "distributor:distr123");
return userMap;
}
public static String getUserName(String role)
{
	String credentials=getCredentials().get(role);
	return credentials.split(":")[0];
}
public static String getPassword(String role)
{
	String credentials=getCredentials().get(role);
	return credentials.split(":")[1];
}
}
