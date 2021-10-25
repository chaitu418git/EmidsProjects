package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	
		
		//checking whether checkbox is selected or not and except that selected items ...selecting the unselected checkboxes
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label/input"));
		
		
		for(int i=0;i<list1.size();i++)
		{			
			
		if(!(list1.get(i).isSelected()))
		{
			list1.get(i).click();
		}
		}
		//printing all list of names
		
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
		for(int j=0;j<list2.size();j++)
		{
			System.out.println(list2.get(j).getText());
		}
		
		//printing only related to Web dev courses
		
		//driver.findElement(By.className("//span[@class='multiselect-selected-text']")).click();
//		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label"));
//		System.out.println(list.size());
//		for(int i=0;i<list.size();i++)
//		{
//			List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label/input"));
//			for(int j=0;i<list1.size();j++)
//			{
//				System.out.println(list.get(j).isSelected());
//			}
//			
////			list.get(i).click();
////			System.out.println(list.get(i).isSelected());
//
//		}
		
	}

}

//if(driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label/input")).is)
//	if(list.get(i).isSelected())
//	{
//		list.get(i).click();
//	}
