package testPack;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartRealTimeEx {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//identifying all the producrs
		int j=0;
		String[] itemsNeedlist= {"Brocolli","Cucumber","Carrot"};
		List<String> finalList = Arrays.asList(itemsNeedlist);
		List<WebElement> allProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
		for(int i=0;i<allProducts.size();i++)
		{
			String[] name = allProducts.get(i).getText().split("-");
			String names = name[0].trim();
			
			if(finalList.contains(names))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==finalList.size())
					break;
			}
		/*	if(allProducts.get(i).getText().contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				break;
			}*/
		}
		
	}

}
