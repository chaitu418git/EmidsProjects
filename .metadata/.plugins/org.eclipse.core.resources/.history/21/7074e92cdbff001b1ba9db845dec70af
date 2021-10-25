package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("before suit");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforestest()
	{
		System.out.println("before test method");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after mthod");
	}
@Test(groups = {"Smoke"},dataProvider = "getData")
public void day1mngdemo(String username, String password)
{
	System.out.println("day 1 mng demo");
	System.out.println(username);
	System.out.println(password);
}
@Parameters("URL")
@Test
public void day1evngdemo(String url)
{
	System.out.println("day 1 evnbg demo");
	System.out.println(url);
	Assert.assertTrue(false);
}
@AfterTest
public void aftertest()
{
	System.out.println("after test method");
}
@DataProvider
public Object[][] getData()
{
	Object[][] obj=new Object[3][2];
  obj[0][0]="firstusername";
  obj[0][1]="firstpassword";
  obj[1][0]="secondusername";
  obj[1][1]="secondpassword";
  obj[2][0]="thirdusername";
  obj[2][1]="thirdpassword";
  return obj;
}
}
