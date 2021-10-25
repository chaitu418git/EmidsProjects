package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenKartModified {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialize();
		String[] itemsNeedlist= {"Brocolli","Cucumber","Carrot"};
		
		addItems(driver,itemsNeedlist);
		addToCartVerify(driver,itemsNeedlist);
		proceedToCheckout(driver);
		float finaltotaldiscount = validatingTotalAfterDiscount(driver);
		System.out.println(finaltotaldiscount);
		System.out.println("final disc"+finaltotaldiscount);
		Assert.assertEquals(Integer.parseInt(driver.findElement(By.xpath("//span[@class='totAmt']")).getText()), validatingTotal(driver));
		Assert.assertEquals(Double.parseDouble(driver.findElement(By.xpath("//span[@class='discountAmt']")).getText()), finaltotaldiscount);
		//Assert.assertEquals(Integer.parseInt(driver.findElement(By.xpath("//span[@class='discountAmt']")).getText()), validatingTotalAfterDiscount(driver));
		//validatingTotalAfterDiscount
		//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td[3]/b")).getText());
		//System.out.println(columns);
		//validatingTotalAfterDiscount
		//System.out.println(indexOfQuanity);
	}
	public static int getColumnIndex(WebDriver driver,String columnName)
	{
		int columns=driver.findElements(By.xpath("//table/thead/tr/td")).size();
		int indexOfQuanity = 0;
		for(int i=1;i<=columns;i++)
		{
			//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td["+i+"]/b")).getText());
			if(driver.findElement(By.xpath("//table/thead/tr/td["+i+"]/b")).getText().equalsIgnoreCase(columnName))
					{
				indexOfQuanity=i;
				break;
					}
			
	//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td/b[text()='Quantiry']")).getSize());
	}
		return indexOfQuanity;
	}
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static void addItems(WebDriver driver,String[] itemsNeedlist)
	{
		int j=0;
		//String[] itemsNeedlist= {"Brocolli","Cucumber","Carrot"};
		List<String> finalList = Arrays.asList(itemsNeedlist);
		List<WebElement> allProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
		for(int i=0;i<allProducts.size();i++)
		{
			String[] name = allProducts.get(i).getText().split("-");
			String names = name[0].trim();
			
			if(finalList.contains(names))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==finalList.size())
					break;
			}
		/*	if(allProducts.get(i).getText().contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				break;
			}*/
		}
	}
	
	public static void addToCartVerify(WebDriver driver,String[] itemsNeedlist)
	{
		List<String> finalList = Arrays.asList(itemsNeedlist);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		List<WebElement> listofProductsAdded = driver.findElements(By.xpath("//div[@class='cart-preview active']//ul[@class='cart-items']/li/div/p[@class='product-name']"));
		System.out.println(listofProductsAdded.size());
		String[] listNames = null;
		List<String> getProductsList = new ArrayList<String>() ;
		//String names = null;
	for(int i=0;i<listofProductsAdded.size();i++)
	{
		  listNames = listofProductsAdded.get(i).getText().split("-");
		  
		String names = listNames[0].trim();
		  getProductsList.add(names);
			
	}
	System.out.println(getProductsList);
	System.out.println(getProductsList.size());
	//System.out.println(listNames);
	//List<String> productsAdded = Arrays.asList(listNames[0].trim());
	Assert.assertEquals(getProductsList, finalList);
	System.out.println("succes");
	
	}
	public static void proceedToCheckout(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='promoInfo']"))));
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!");
		//System.out.println(driver.findElement(By.xpath("//b[text()='No. of Items     : ']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='totAmt']")).getText());
		//int totAmt=Integer.parseInt(driver.findElement(By.xpath("//span[@class='totAmt']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='discountPerc']")).getText());
	//	int discperc=Integer.parseInt(driver.findElement(By.xpath("//span[@class='discountPerc']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='discountAmt']")).getText());
	//int totalAfterdiscount=Integer.parseInt(driver.findElement(By.xpath("//span[@class='discountAmt']")).getText());
	//System.out.println(totalAfterdiscount);
	double totalAfterdiscoun1t=Double.parseDouble(driver.findElement(By.xpath("//span[@class='discountAmt']")).getText());
	System.out.println("one"+totalAfterdiscoun1t);
	System.out.println("calling"+validatingTotalAfterDiscount(driver));
		//Assert.assertEquals(totAmt, validatingPrice(driver));
		//Assert.assertEquals(totAmt, validatingPrice(driver));
		
		
		
		
		
		
	}
	/*public static int validatingPrice(WebDriver driver)
	{
		int rows=driver.findElements(By.xpath("//table//tbody/tr")).size();
		String sum = null;
		for(int i=1;i<=rows;i++)
		{
		sum=sum+(driver.findElements(By.xpath("//table//tbody/tr[i]/td[4]")).get(i).getText());
		}
		System.out.println(sum);
		return Integer.parseInt(sum);
		
	}*/
	public static int validatingTotal(WebDriver driver)
	{
		int rows=driver.findElements(By.xpath("//table//tbody/tr")).size();
		int  sum = 0;
		//get the qunatity index
		int quantityColumnIndex=getColumnIndex(driver, "Quantiry");
		int priceColumn=getColumnIndex(driver, "Price");
		for(int i=1;i<=rows;i++)
		{
			sum=sum+(Integer.parseInt(driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+quantityColumnIndex+"]")).getText()))*(Integer.parseInt(driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+priceColumn+"]")).getText()));
		//sum=sum+((driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+quantityColumnIndex+"]")).getText())*(driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+priceColumn+"]")).getText()));
		}
		System.out.println(sum);
		return sum;
		
	}
	public static float validatingTotalAfterDiscount(WebDriver driver)
	{
		//getting the discount perc
		String[] disc=driver.findElement(By.xpath("//span[@class='discountPerc']")).getText().split("%");
		String disconly=disc[0];
		//String[] disconly=disc[0];
		float discper=Integer.parseInt(disconly);
		System.out.println(discper);
		float totalamount=validatingTotal(driver);
		System.out.println(totalamount);
		//float i=(10/100)*224;
		//System.out.println(i);
		float discamount= (float) ((discper/100.0)*(totalamount));
		System.out.println(discamount);
		float totalafterdiscount=validatingTotal(driver)-discamount;
		System.out.println("two"+totalafterdiscount);
		return totalafterdiscount;
	}
}
