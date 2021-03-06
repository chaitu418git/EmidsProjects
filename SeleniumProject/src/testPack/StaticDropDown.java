package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Select select=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		List<WebElement> totallist = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
		System.out.println("total count"+totallist.size());
		for(WebElement list:totallist)
		{
			System.out.println(list.getText());
		}
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
        select.selectByValue("USD");
		Thread.sleep(2000);

        select.selectByVisibleText("AED");
		Thread.sleep(2000);

        
		
		
		
		
		
	}

}
