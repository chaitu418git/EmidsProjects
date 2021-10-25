package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckingEnablingConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		if(driver.findElement(By.xpath("//input[@value='OneWay']")).isSelected())
		{
			if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"))
			{
			Assert.assertTrue(true);	
			System.out.println("in");
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if (driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected()) {
			if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
			{
			Assert.assertTrue(true);	
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		if (driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected()) {
			if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
			{
			Assert.assertTrue(true);	
			System.out.println("in 2nd");
			}
			else
			{
				Assert.assertTrue(false);
			}
	}
		
		driver.close();
	}
	

}
