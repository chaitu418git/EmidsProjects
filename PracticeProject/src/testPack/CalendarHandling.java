package testPack;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandling {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		new WebDriverWait(driver, 10)
		
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datePickerContainer']")));
		
		
//		List<WebElement> monthYearValues=driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
//		Iterator<WebElement> itr=monthYearValues.iterator();
//		
//			String monthyearval=itr.next().getText();
//		String month=monthyearval.split(" ")[0];
//		String year=monthyearval.split(" ")[1];
		
	
	String flag="False";
	while(flag=="False")
	{
		if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 07 2021')]")).size()>0)
		{
			driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 07 2021')]")).click();
			flag="True";
		}
		else
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
	}
		
	}

}
