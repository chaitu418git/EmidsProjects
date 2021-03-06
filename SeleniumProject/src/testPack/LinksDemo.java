package testPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElements(By.tagName("a"));
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		WebElement columndriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(click);
		
		}
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
	}

}
