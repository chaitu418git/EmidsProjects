package test1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	
@Test(groups = {"Smoke"})
public void day1mngdemo()
{
	System.out.println("day 1 mng demo");
	Assert.assertTrue(false);
	//System.out.println(username);
	//System.out.println(password);
}
@BeforeTest
public void beforeTest()
{
	System.out.println("Before Test");
}
@AfterTest
public void afterTest()
{
	System.out.println("after test");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("before suite");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("After Suite");
}
@BeforeClass
public void beforeClass() {
	System.out.println("before class");
}
@AfterClass
public void afterClass()
{
	System.out.println("After class");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before Method");
}
@AfterMethod
public void AfterMethod()
{
	System.out.println("After Method");
}

@Test(enabled = false)
public void day1evngdemo()
{
	System.out.println("day 1 evnbg demo");
	//System.out.println(url);
	//Assert.assertTrue(false);
}

}
