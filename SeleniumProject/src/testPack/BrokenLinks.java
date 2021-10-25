package testPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			List<WebElement> alllinks = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
			SoftAssert a=new SoftAssert();
			for(WebElement link:alllinks)
			{
				String url=link.getAttribute("href");
				HttpURLConnection connect=(HttpURLConnection) new URL(url).openConnection();
				connect.setRequestMethod("HEAD");
				connect.connect();
				int rescode=connect.getResponseCode();
				System.out.println(rescode);
				a.assertTrue(rescode<400, "the link with text"+link.getText()+"is broken with code"+rescode);
//				if(rescode>=400)
//				{
//					System.out.println("the link with text"+link.getText()+"is broken with code"+rescode);
//					a.assertTrue(false);
//				}
			}
			a.assertAll();
			
	}

}
