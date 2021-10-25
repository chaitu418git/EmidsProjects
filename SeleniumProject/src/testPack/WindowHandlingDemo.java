package testPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String pwindow=itr.next();
		String cwindow=itr.next();
		driver.switchTo().window(cwindow);
		System.out.println("switched");
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
	String text=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
	System.out.println(text);
	driver.switchTo().window(pwindow);
	driver.findElement(By.id("username")).sendKeys(text);
	}

}
