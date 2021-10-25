package testPack;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVgGraphs2 {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=covid+cases+in+india&sxsrf=AOaemvKdJkbE4uTMn4aIh5h1MbMVOv6HEQ%3A1632758369167&source=hp&ei=YepRYafTB4ua4-EPjMqQyA8&iflsig=ALs-wAMAAAAAYVH4cQDCGrlBoP-oMSy1i0WT0QBbxrXk&oq=covid+ca&gs_lcp=Cgdnd3Mtd2l6EAMYADIFCAAQgAQyBQgAEIAEMgUIABCABDIICAAQgAQQyQMyBQgAEJIDMgUIABCSAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BAgjECc6CAgAEIAEEIsDOg4ILhCABBCLAxCoAxCbAzoLCAAQgAQQyQMQiwM6CAgAEJIDEIsDUP8GWMwfYMEsaABwAHgAgAF3iAH8BpIBAzAuOJgBAKABAbgBAg&sclient=gws-wiz");
	driver.manage().window().maximize();
	
	List<WebElement> totalList = driver.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']"));
	Actions action=new Actions(driver);
	for(WebElement ele:totalList)
	{
		action.moveToElement(ele).build().perform();
		String text=driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
		if(text.contains(DateSender.sendDate()))
		{
			System.out.println(text);
		}
		//String text=driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
		
		//System.out.println(text);
	}
	
	}
}
