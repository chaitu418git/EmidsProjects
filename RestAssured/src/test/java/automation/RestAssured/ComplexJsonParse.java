package automation.RestAssured;

import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	public static void main(String[] args)
	{
		JsonPath js=new JsonPath(Payload.coursePrice());
		//Print No of courses returned by API
		int courseCount=js.getInt("courses.size()");
		System.out.println(courseCount);
		//Print Purchase Amount
		int purchasedAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(purchasedAmount);
		//Print Title of the first course
		String firstCourseTitle=js.getString("courses[0].title");
		System.out.println(firstCourseTitle);

//Print All course titles and their respective Prices
		for(int i=0;i<courseCount;i++)
		{
			String courseTitle=js.getString("courses.get("+i+").title");
			System.out.println(courseTitle);
			int coursePrice=js.getInt("courses.get("+i+").price");
			System.out.println(coursePrice);
		}
// Print no of copies sold by RPA Course
		for(int i=0;i<courseCount;i++)
		{
		if(js.getString("courses.get("+i+").title").equalsIgnoreCase("RPA"))
		{
			int copies=js.get("courses.get("+i+").copies");
			System.out.println(copies);
			break;
			
		}
		}
// Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
		for(int i=0;i<courseCount;i++)
		{
			sum=sum+(js.getInt("courses.get("+i+").price"))*(js.getInt("courses.get("+i+").copies"));
		}
		System.out.println(sum);
		Assert.assertEquals(sum,purchasedAmount);
	}

}
