package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnAutoSuggestionDropdown {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("usa");
			//selecting united states from drop down
			List<WebElement> allvalues = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
			for(int i=0;i<allvalues.size();i++)
			{
				if(allvalues.get(i).getText().contains("United States"))
				{
					allvalues.get(i).click();
					System.out.println("clickded");
					break;
					
				}
			}
	}

}
