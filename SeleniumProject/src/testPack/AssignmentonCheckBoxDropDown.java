package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentonCheckBoxDropDown {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption2")).click();
		String grabbedText=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		Select select=new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(grabbedText);
		driver.findElement(By.name("enter-name")).sendKeys(grabbedText);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert=driver.switchTo().alert();
		if(alert.getText().contains(grabbedText))
		{
			Assert.assertTrue(true);
		}
		alert.accept();
		
	}

}
