package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericSelectDropdown {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
//		Select s=new Select(driver.findElement(By.id("Form_submitForm_Industry")));
//		s.selectByVisibleText("Automotive");
//		Select s1=new Select(driver.findElement(By.id("Form_submitForm_Country")));
//		s1.selectByValue("Albania");
		
//		doselectbyvisibletext(country, "Albania");
//		doselectbyvalue(industry, "Automotive");
		selectDropdownvalue(country, DropDown.visibletext.toString(), "Albania");
		selectDropdownvalue(industry, DropDown.Index.toString(), "3");
		
	}
	public static void selectDropdownvalue(By locator, String type, String value)
	{
		Select s=new Select(getElement(locator));
		switch (type) {
		case "visibletext":		
		s.selectByVisibleText(value);
		break;
		case "index":
		s.selectByIndex(Integer.parseInt(value));
        break;
		case "value":
			s.selectByValue(value);
		default:
			System.out.println("please eneter proper type");
			break;
		}
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doselectbyvisibletext(By locator,String value)
	{
		Select s=new Select(getElement(locator));
		s.selectByVisibleText(value);
		
	}
	
	public static void doselectbyvalue(By locator,String value)
	{
		Select s=new Select(getElement(locator));
		s.selectByValue(value);
	}
	
	public static void doselectbyindex(By locator,String value)
	{
		Select s=new Select(getElement(locator));
		s.selectByIndex(Integer.parseInt(value));
		
	}

}
