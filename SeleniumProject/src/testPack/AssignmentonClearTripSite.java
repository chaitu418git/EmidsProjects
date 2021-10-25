package testPack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentonClearTripSite {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> prefs = new HashMap<String, Object>();
		// add key and value to map as follow to switch off browser notification
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver(options);

		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.id("DepartDate")).click();

		// WebDriverWait wait=new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='DepartDate']"))));
		// driver.findElement(By.xpath("//input[@placeholder='Pick a date']")).click();
		WebElement scanEle = new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Pick a date']")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Pick
		// a date']"))).click();
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-highlight ui-state-active ']"))));
		// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight
		// ui-state-active ']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select select = new Select(driver.findElement(By.name("adults")));
		select.selectByVisibleText("3");
		Select select1 = new Select(driver.findElement(By.name("childs")));
		select.selectByValue("2");
		// clicking on more option link
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("indigo");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
