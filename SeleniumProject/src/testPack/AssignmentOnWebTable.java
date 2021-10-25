package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWebTable {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	int columns=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
	System.out.println("columnc count"+columns);
	int rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println("rows count"+rows);
	//2nd row content
	System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]")).getText());
	}

}
