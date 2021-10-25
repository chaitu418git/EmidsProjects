package testPack;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsPractice {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		String text=driver.findElement(By.xpath("//a[@aria-label='Next']")).getAttribute("aria-disabled");
		System.out.println(text);
		do {
			
		
		List<WebElement> allvalues=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		List<String> originalList = allvalues.stream().map(s->s.getText()).collect(Collectors.toList());
		//Collections.rev
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Collections.reverse(sortedList);
		Assert.assertEquals(originalList, sortedList);
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		
		} while (driver.findElement(By.xpath("//a[@aria-label='Next']")).getAttribute("aria-disabled").contains("false"));
		}

}
