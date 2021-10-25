package practicepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserResgistrationProcessAssignment {
public static WebDriver driver;
public static String email="chaitu.090418@gmail.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("clciked on SignIN");
		driver.findElement(By.name("email_create")).clear();
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("without enterting email ccliked on create acocount");
		System.out.println("verifying the validation message");
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='create-account_form']//p")).getText(), "Please enter your email address to create an account.");
		driver.findElement(By.name("email_create")).sendKeys(email);
		System.out.println("enetred the email");
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("clicked on create button");
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='account_creation']/h3")));
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Chaitu");
		System.out.println("enetred firstname");
		driver.findElement(By.name("customer_lastname")).sendKeys("test");
		System.out.println("entred last name");
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		Assert.assertEquals(driver.findElement(By.id("email")).getAttribute("value"), email);
		System.out.println("validated email");
		driver.findElement(By.id("passwd")).sendKeys("abc@1234");
		System.out.println("enetred pswd");
		Select select=new Select(driver.findElement(By.id("days")));
		select.selectByValue("7");
		System.out.println("selected day");
		Select select1=new Select(driver.findElement(By.id("months")));
		select1.selectByValue("1");
		System.out.println("selected month");
		Select select2=new Select(driver.findElement(By.id("years")));
		select2.selectByValue("1992");
		System.out.println("selected year");
driver.findElement(By.id("address1")).sendKeys("test street");
driver.findElement(By.id("city")).sendKeys("Chirala");
Select select3=new Select(driver.findElement(By.id("id_state")));
select3.selectByVisibleText("California");
driver.findElement(By.id("postcode")).sendKeys("52381");
Select select4=new Select(driver.findElement(By.id("id_country")));
select4.selectByVisibleText("United States");
driver.findElement(By.id("phone_mobile")).sendKeys("9876456980");

driver.findElement(By.id("submitAccount")).click();

	String text=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).getText();
	Assert.assertEquals(text.contains("chaitu"), "chaitu");
		
		
	}
	

}
