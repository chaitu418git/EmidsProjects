package test1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test(groups = {"Smoke"})
	public void day4mngdemo()
	{
		System.out.println("day 4 mng demo");
		
	}
@Parameters({"Car"})
	@Test
	public void day4evngdemo(String car)
	{
		System.out.println("day 4 evnbg demo");
		System.out.println(car);
		//Assert.assertTrue(false);
	}
}
