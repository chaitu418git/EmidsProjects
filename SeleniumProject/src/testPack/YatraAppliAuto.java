package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YatraAppliAuto {
public static WebDriver driver;
	public static void main(String[] args) throws StaleElementReferenceException, InterruptedException{
		// TODO Auto-generated method stub
		String depDate="05/11/2021";
		String departureDate="25 August 21";
		 String[] split=departureDate.split(" ");
		 String depDay=split[0];
		 String depMonth=split[1]+"'"+" "+split[2];
		System.out.println(depMonth);
		 
		 String returnDate="15 January 2022";
		 String[] split1=returnDate.split(" ");
		 String retDay=split1[0];
		 String retMonth=split1[1]+" "+split1[2];
		 System.out.println(retMonth);
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 //System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
		  driver =new ChromeDriver(options);
		 
	
	// driver=new ChromeDriver();
	
	driver.get("https://www.yatra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	System.out.println(driver.findElement(By.xpath("//a[@title='One Way']")).getAttribute("class"));
	
	Assert.assertEquals(driver.findElement(By.xpath("//a[@title='One Way']")).getAttribute("class"), "blur_class type-active");
	System.out.println("one way is highlighted");
	driver.findElement(By.xpath("//label[@for='BE_flight_origin_city']")).click();
	System.out.println("clicked on from city");
	driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Del");
	System.out.println("enetred the text as Del");
	List<WebElement> departFromList = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li/div/p[1]"));
	for(WebElement option:departFromList)
	{
		if(option.getText().contains("Delhi"))
		{
			System.out.println(option.getText());
			option.click();
			break;
		}
	}
	System.out.println("selected delhi");
	//new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.name("flight_destination")));
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@for='BE_flight_arrival_city']")));
	
	
	driver.findElement(By.name("flight_destination")).clear();
	driver.findElement(By.name("flight_destination")).sendKeys("Hyd");
	//driver.findElement(By.xpath("//label[@for='BE_flight_arrival_city']")).clear();
	//driver.findElement(By.xpath("//label[@for='BE_flight_arrival_city']")).sendKeys("Hyd");
	//Thread.sleep(3000);
	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='required_field cityPadLeft ac_input dest_ac']")));
	//new WebDriverWait(driver, 10).until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(driver.findElement(By.name("flight_destination")))));
	System.out.println("enetred the text as Hyd");
	//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='viewport']/div/div/li/div/p[1]")));
	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='ac_cityname']")));
	List<WebElement> goingToList = driver.findElements(By.xpath("//p[@class='ac_cityname']"));
	for(WebElement option:goingToList)
	if(option.getText().contains("Hyderabad"))
	{
		System.out.println(option.getText());
		option.click();
		break;
	}
	System.out.println("selected Hyderabad");
	
	driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
	
	
//	if(driver.findElement(By.xpath("//div[@class='active-month-holder']")).getText().contains(depMonth))
//	{
//		
//	}
//	else if (condition) {
//		
//	}
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='body-right BE_flight_origin_date']")));
	String flag="False";
	while(flag=="False")
	{
		if(driver.findElements(By.xpath("//table[@class='days-head day-container-table']/tbody/tr/td[contains(@data-date,"+"'"+""+depDate+""+"'"+")]")).size()>0);	
		{
		//	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='days-head day-container-table']/tbody/tr/td[contains(@data-date,\"+\"'\"+\"\"+depDate+\"\"+\"'\"+\")]")));
			
					driver.findElement(By.xpath("//table[@class='days-head day-container-table']/tbody/tr/td[contains(@data-date,"+"'"+""+depDate+""+"'"+")]")).click();
			flag="True";
		}
	}
	
	driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	System.out.println("clckied on search flights button");
	//System.out.println("waiting for loader to disbaled");
	//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flight-loader ovf-hidden  hide']")));
	new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='flight-det table full-width clearfix']//span[@class='i-b text ellipsis']"))));
			System.out.println("now fecthing the plane names");
	List<WebElement> planesList = driver.findElements(By.xpath("//div[@class='flight-det table full-width clearfix']//span[@class='i-b text ellipsis']"));
	
	for(WebElement planes:planesList)
	{
		System.out.println(planes.getText());
	}
	//div[@class='active-month-holder']
	//div[@class='month-title']
}
//System.out.println("selected delhi");
	
	
	//driver.findElement(By.xpath("//label[@for='BE_flight_arrival_city']"));
	//System.out.println("clicked on to city");
	//driver.close();
	}


