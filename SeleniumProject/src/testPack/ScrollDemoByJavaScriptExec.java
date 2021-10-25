package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDemoByJavaScriptExec {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.scrollBy(0,500)");
			//Thread.sleep(3000);
		//	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
			
			//sum off all elemets
			
			List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
			int sum=-0;
			//int count=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]")).size();
			for(int i=0;i<allelements.size();i++)
			{
				sum=sum+Integer.parseInt(allelements.get(i).getText());
			}
			System.out.println(sum);
			
			
			driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
			//driver.findElement(By.cssSelector(".totalAmount")).getText();
			
			//System.out.println();
		//System.out.println(totaltext);
			
	}

}
