package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandle {
public static WebDriver driver;
//static String MonthYearValue;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
				 driver=new ChromeDriver();
				
				driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.id("datepicker")).click();
				new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-datepicker-div']")));
				
			
//			while(!(month.equals("June") && year.equals("2022")))
//			{
//				driver.findElement(By.xpath("//a[@title='Next']")).click();
//				MonthYearValue=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//				System.out.println(MonthYearValue);	
//			break;	
//			}
			
			
			selectDate("32", "June", "2022");
				
	}
	
	public static String[] getMonthYear(String MonthYearValue)
	{
		
		return MonthYearValue.split(" ");
	}
		
		
//		
//		System.out.println(MonthYearValue);	
//		String month=MonthYearValue.split(" ")[0].trim();
//		//System.out.println(month);
//		String year=MonthYearValue.split(" ")[1].trim();
//		//System.out.println(year);
	
	public static void selectDate(String exDay, String expMonth, String expYear)
	
	{
		if(expMonth.equals("February") && Integer.parseInt(exDay)>29)
		{
			System.out.println("wrong date"+exDay+"in"+expMonth);
			return;
		}
		if(Integer.parseInt(exDay)>31)
		{
			System.out.println("wrong day"+exDay);
			return;
		}
		String MonthYearValue=	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			while(!(getMonthYear(MonthYearValue)[0].equals(expMonth) && getMonthYear(MonthYearValue)[1].equals(expYear))) {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				 MonthYearValue=	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
					
				// month=MonthYearValue.split(" ")[0].trim();
				//System.out.println(month);
				// year=MonthYearValue.split(" ")[1].trim();
				
			}
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
			//Thread.sleep(5000);
			
		
		
	}

}
