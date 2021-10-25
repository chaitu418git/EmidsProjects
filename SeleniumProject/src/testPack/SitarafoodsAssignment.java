package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SitarafoodsAssignment {
	public static WebDriver driver;
	static String myIngredient="Sweet Bellam";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 //System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
		  driver =new ChromeDriver();
		driver.get("https://www.sitarafoods.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
				WebElement element=driver.findElement(By.xpath("//a[contains(text(),'SHOP BY CATEGORY')]"));
				
				action.moveToElement(element).click().build().perform();
				new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='border-none categoryDropdown dropdown-menu show']/a")));
			List<WebElement> varietiesList = driver.findElements(By.xpath("//div[@class='border-none categoryDropdown dropdown-menu show']/a"));
			
for(WebElement option:varietiesList)
{
	if(option.getText().equalsIgnoreCase("SWEET & HOT"))
	{
		option.click();
		break;
	}
}
System.out.println("selected ");
new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'SWEET & HOT')]")));
String text=driver.findElement(By.xpath("//h1[contains(text(),'SWEET & HOT')]")).getText();
Assert.assertEquals(text, "SWEET & HOT");	
System.out.println(text);
List<WebElement> allvarietiesList = driver.findElements(By.xpath("//div[@class='table-row row']/div/div/div[2]"));
	
for(int i=0;i<allvarietiesList.size();i++)
{
	if(allvarietiesList.get(i).getText().contains(myIngredient))
	{

	driver.findElements(By.xpath("//div[@class='table-row row']/div/div/div[3]/div[2]/button")).get(i).click();
	break;
	}
}
//for(WebElement varieties:allvarietiesList)
//	{
//		System.out.println(varieties.getText());
//	if(varieties.getText().contains("Sweet Bellam"))
//	{
//			 driver.findElement(By.xpath("//div[@class='table-row row']/div/div/div[3]/div[2]/button")).click();
//		break;
//		}
//	}
	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content']")));
	Select select=new Select(driver.findElement(By.name("weight")));
		select.selectByValue("4050");
	System.out.println("1 kg is selected");
	
	WebElement plus = driver.findElement(By.xpath("//div[@class='increaseDiv bgcolor-hover-teal']"));
	//String text12=driver.findElement(By.xpath("//div[@class='valueDiv']")).getAttribute("innerHTML");
	//String text1=driver.findElement(By.xpath("//div[@class='valueDiv']")).getText();
	//int quanityvalue = Integer.parseInt(text12);
	int quanityvalue;
	do {
		action.moveToElement(plus).click().build().perform();
		String text12=driver.findElement(By.xpath("//div[@class='valueDiv']")).getText();
		 quanityvalue = Integer.parseInt(text12);
	} while (quanityvalue<5);
	driver.findElement(By.id("addToCart")).click();
	System.out.println(driver.findElement(By.xpath("//h2[@class='swal2-title']")).isDisplayed());
	new WebDriverWait(driver, 15).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//h2[@class='swal2-title']"))));
	driver.findElement(By.xpath("//div[@class='margin-left-auto flex-default display-992']//button[@aria-label='cart']")).click();
	System.out.println(driver.findElement(By.xpath("//h3[@class='cartHead padding-bottom-20 under-line-black']")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("//p[@class='cartProductName']")).getText());
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='cartProductName']")).getText(), myIngredient);
	//action.moveToElement(plus).click().build().perform();
	//String text1=driver.findElement(By.xpath("//div[@class='valueDiv']")).getText();
	//String text12=driver.findElement(By.xpath("//div[@class='valueDiv']")).getAttribute("innerHTML");
	//System.out.println(text12);
  // int quanityvalue = Integer.parseInt(text12);
   //System.out.println(quanityvalue);
	
	}

}
