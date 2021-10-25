package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertsHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("test");
driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
Assert.assertEquals(alert.getText(),"Hello test, share this practice page and share your knowledge");
alert.accept();
driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
WebDriverWait wait=new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.alertIsPresent());
System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().dismiss();
		
	}

}
