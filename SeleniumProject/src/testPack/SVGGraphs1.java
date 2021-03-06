package testPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphs1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=covid+cases+in+india&sxsrf=AOaemvKdJkbE4uTMn4aIh5h1MbMVOv6HEQ%3A1632758369167&source=hp&ei=YepRYafTB4ua4-EPjMqQyA8&iflsig=ALs-wAMAAAAAYVH4cQDCGrlBoP-oMSy1i0WT0QBbxrXk&oq=covid+ca&gs_lcp=Cgdnd3Mtd2l6EAMYADIFCAAQgAQyBQgAEIAEMgUIABCABDIICAAQgAQQyQMyBQgAEJIDMgUIABCSAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BAgjECc6CAgAEIAEEIsDOg4ILhCABBCLAxCoAxCbAzoLCAAQgAQQyQMQiwM6CAgAEJIDEIsDUP8GWMwfYMEsaABwAHgAgAF3iAH8BpIBAzAuOJgBAKABAbgBAg&sclient=gws-wiz");
	driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[2]"));
		System.out.println(ele.getLocation().getX());
	int getTopLeftY=((ele.getSize().getHeight())/2)-ele.getSize().getHeight();
	int getTopLeftX=((ele.getSize().getWidth())/2)-ele.getSize().getWidth();
	System.out.println(getTopLeftY);
	System.out.println(getTopLeftX);
	
	Actions action=new Actions(driver);
	
	String start_date="23-03-2020";
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date d1=sdf.parse(start_date);
	Date d2=new Date();
	long timediffdays=TimeUnit.MILLISECONDS.toDays(d2.getTime()-d1.getTime());
	System.out.println(timediffdays);
	for(int i=0;i<timediffdays;i++)
	{
		action.moveToElement(ele, ele.getLocation().getX()+i,0).build().perform();
		String text=driver.findElement(By.xpath("//table[@class='swWWne']/tbody")).getText();
		System.out.println(text);
	}
	driver.close();
	}

}
