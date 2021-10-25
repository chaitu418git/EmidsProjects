package test1;

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

public class Day2 {
	
@Parameters({"URL"})	
@Test(groups = {"Smoke"})
public void day2mngdemo(String url)
{
	System.out.println("day 2 mng demo");
	System.out.println(url);
}

@Test
public void day2evngdemo()
{
	System.out.println("day 2 evnbg demo");
	
	//Assert.assertTrue(false);
}

}
