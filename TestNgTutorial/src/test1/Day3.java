package test1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	@Test(groups = {"Smoke"})
	public void day3mngdemo()
	{
		System.out.println("day 3 mng demo");
		
	}

	@Test(dependsOnMethods = {"day3mngdemo"},dataProvider = "getData")
	public void day3evngdemo(String username, String password)
	{
		System.out.println("day 3 evnbg demo");
		System.out.println(username);
		System.out.println(password);
		
		//Assert.assertTrue(false);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstusernamne";
		data[0][1]="firstpassword";
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
