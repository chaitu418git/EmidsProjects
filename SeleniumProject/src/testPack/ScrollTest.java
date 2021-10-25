package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
			int sum=-0;
			//int count=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]")).size();
			for(int i=0;i<allelements.size();i++)
			{
				sum=sum+Integer.parseInt(allelements.get(i).getText());
			}
			System.out.println(sum);
			driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
			Assert.assertEquals(sum, Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim()));
		System.out.println("success");
			//driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	}

}
