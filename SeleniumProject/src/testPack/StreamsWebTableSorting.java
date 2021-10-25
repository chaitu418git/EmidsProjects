package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsWebTableSorting {
	public static WebDriver driver;

	@Test(enabled = false)
	public void sortWebtableTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//clicking on column
driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
//getting all values into list

List<WebElement> allvalues=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
	//getting the text of each column and storing into the list
List<String> originallist=allvalues.stream().map(s->s.getText()).collect(Collectors.toList());
//sorting the original list for coparison
List<String> sortedList=originallist.stream().sorted().collect(Collectors.toList());
Assert.assertEquals(originallist, sortedList);
System.out.println("proper");

//get the price of beans
List<String> price = allvalues.stream().filter(s->s.getText().contains("Beans")).
                    map(s->getVegPrice(s)).collect(Collectors.toList());
price.forEach(s->System.out.println(s));

	
	}

	public String getVegPrice(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// TODO Auto-generated method stub
		return pricevalue;
	}
	@Test(enabled = false)
	public void findPrice()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		//List<WebElement> allvalues=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		//get price of Rice
		List<String> price;
		do {
			List<WebElement> allvalues=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			
			price=allvalues.stream().filter(s->s.getText().contains("Rice")).
					map(s->getVegPrice(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (price.size()<1);
	}
	@Test
	public void search()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		//getting all values
		List<WebElement> allvalues=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		List<WebElement> searchedList = allvalues.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	        Assert.assertEquals(allvalues.size(), searchedList.size());
	}
}
