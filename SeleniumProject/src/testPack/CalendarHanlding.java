package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHanlding {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		//Dec 20201 23
		 String selectDate="25 December 2021";
		 String[] split=selectDate.split(" ");
		 String Day=split[0];
		 String Month=split[1]+" "+split[2];
		 System.out.println(Month);
		 
		 
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElementByXpath();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='travel_date']"))));
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		System.out.println("clicked");
		
		//Year selection
		//driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']"));
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains(Month))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		//day selection
		List<WebElement> alldays = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		for(int i=0;i<driver.findElements(By.xpath("//td[contains(@class,'day')]")).size();i++)
		{
			if(driver.findElements(By.xpath("//td[contains(@class,'day')]")).get(i).getText().contains(Day))
			{
				driver.findElements(By.xpath("//td[contains(@class,'day')]")).get(i).click();
				System.out.println("selected");
				break;
			}
		}
	}

}
