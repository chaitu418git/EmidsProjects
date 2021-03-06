package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PieChart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_google_charts.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='tryhow_google_pie_chart.htm']")));
	//List<WebElement> totalList = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g']/*[name()='text']"));
	List<WebElement> totalList = driver.findElements(By.xpath("//div[@id='piechart']//*[local-name()='svg']//*[name()='g']//*[name()='path']"));
	Actions action=new Actions(driver);
	for(WebElement ele:totalList)
	{
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @class='google-visualization-tooltip']")).getText();
		System.out.println(text);
	}
	driver.close();
	//*[local-name()='svg']//*[name()='g' and @class='google-visualization-tooltip']
	
	//div[@id='piechart']//*[local-name()='svg']//*[name()='g' and @class='google-visualization-tooltip']
	}

}
