package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgGraphs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		//WebElement text = driver.findElement(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']")):
		List<WebElement> totalList = driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));
		System.out.println(totalList.size());
		//WebElement text=driver.findElement(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']"));
		
		Actions action=new Actions(driver);
		for(WebElement ele:totalList)
		{
			Thread.sleep(500);
			action.moveToElement(ele).build().perform();
			String text=driver.findElement(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']")).getText();
			
			System.out.println(text);
		}
		driver.close();
	}

}
