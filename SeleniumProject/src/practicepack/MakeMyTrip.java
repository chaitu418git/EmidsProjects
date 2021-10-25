package practicepack;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeMyTrip {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException , StaleElementReferenceException
	{
		String departureDate="25 December 2021";
		 String[] split=departureDate.split(" ");
		 String depDay=split[0];
		 String depMonth=split[1]+" "+split[2];
		System.out.println(depMonth);
		 
		 String returnDate="15 January 2022";
		 String[] split1=returnDate.split(" ");
		 String retDay=split1[0];
		 String retMonth=split1[1]+" "+split1[2];
		 System.out.println(retMonth);
		 
		 
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//System.out.println(driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).isSelected());
	//System.out.println(driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).isEnabled());
	//System.out.println(driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).isEnabled());
	System.out.println(driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).getAttribute("class"));
	//checking oneway is selected or not
		Assert.assertEquals(driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).getAttribute("class"),"selected");
	System.out.println("verified the one way");
	Actions action=new Actions(driver);
	//verifying login pop up is displayed or not
	if(driver.findElements(By.xpath("//p[text()='Login/Signup for Best Prices']")).size()>0)
	{
		action.moveToElement(driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']/p"))).click().build().perform();
	System.out.println("login pop up is found and clickedd on it");
	}
//	if(driver.findElement(By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']")).isDisplayed())
//{
		//action.moveToElement(driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']/p"))).click().build().perform();
		WebElement fromcity=driver.findElement(By.xpath("//label[@for='fromCity']"));
		action.moveToElement(fromcity).build().perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fromcity)).click();
		System.out.println("clciked on fromcity");
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='From']")))).sendKeys("del");
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("del");
		System.out.println("enetered the from city");
//getting the auto suggestion and selecting delhi
	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='calc60']/p[1]")));
			List<WebElement> fromlist = driver.findElements(By.xpath("//div[@class='calc60']/p[1]"));
	//fromlist.stream().map(s->s.getText()).forEach(s->System.out.println(s));
	//fromlist.stream().filter(s->s.getText().contains("Delhi")).forEach(s->s.click());
	// alllist.stream().filter(element -> element.getAttribute("value").matches("Female")).forEach(element ->element.click());
//	 for(int i=0;i<fromlist.size();i++)
//{
//	if(fromlist.get(i).getText().contains("Delhi"))
//	{
//		fromlist.get(i).click();
//		break;
//	}
//}
	 for(WebElement option:fromlist)
		{
			if(option.getText().contains("Delhi"))
			{
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
	 System.out.println("selected the from city");
	
	//alllist.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s.getText()));
//enetring the value in to city
	 
	// WebElement tocity=driver.findElement(By.xpath("//label[@for='toCity']"));
	// WebElement tocity=driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']"));
	// action.moveToElement(tocity).build().perform();
	//	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(tocity)).click();
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='To']")))).sendKeys("Bang");
		System.out.println("entered the text bang");
		List<WebElement> toList = driver.findElements(By.xpath("//div[@class='calc60']/p[1]"));
		//System.out.println(toList.);
//		 for(int j=0;j<toList.size();j++)
//		 {
//		 	if(toList.get(j).getText().contains("Bangkok"))
//		 	{
//		 		System.out.println(toList.get(j).getText());
//		 		//new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
//		 		toList.get(j).sendKeys(Keys.DOWN,Keys.ENTER);
//		 		toList.get(j).click();
//		 		
//		 		break;
//		 	}
//		 }
		 for(WebElement option:toList)
			{
				if(option.getText().contains("Bangkok"))
				{
					System.out.println(option.getText());
					option.click();
					break;
				}
			}
		//toList.stream().filter(s->s.getText().contains("Bangalore")).forEach(s->s.click());
		System.out.println("selectted the bangkok");
	
		//code for calnedar to select depart date
//		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='datePickerContainer']"))));
//		List<WebElement> months;
//		do {
//			 months = driver.findElements(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div"));
//			for(int i=0;i<months.size();i++)
//			{
//				if(!months.get(i).getText().contains(depMonth))
//				{
//					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//				}
//			}
//		} while (((WebElement) months).getText().contains(depMonth));
	//	List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div"));
	//	for(in)
	//	while(!driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div")).getText().contains(Month))
	//	{
	//		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//}
		

	}
}

