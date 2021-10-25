package automation.RestAssured;
import io.restassured.*;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojo.Api;
import pojo.GetCourses;
import pojo.GetCoursesInfo;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Oauth2 {
public static void main(String[] args)
{
	String url="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWg-YrfXVkxAfFinmx_xCS4gmrAGBuXSw4hmH9UEYBA4PNqJiOCUb7bLUQn1w0N9LQ&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=none#";
	String partialcode=url.split("code=")[1];
	String code=partialcode.split("&scope")[0];
	System.out.println(code);
	System.out.println(partialcode);
	//String code="4%2F0AX4XfWhuevfPicBLWk6GBWlSW52JufVzpQCZxzfU2Q08zCQsqO7yKmxJD4qJ1wR2-jhpyQ&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#";
	//code.split(regex)
	
	//get access token
	//https://www.googleapis.com/oauth2/v4/token?code=4%2F0AX4XfWhuevfPicBLWk6GBWlSW52JufVzpQCZxzfU2Q08zCQsqO7yKmxJD4qJ1wR2-jhpyQ&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&client_secret=erZOWM9g3UtwNRj340YYaK_W&redirect_uri=https://rahulshettyacademy.com/getCourse.php&grant_type=authorization_code
	//RestAssured.baseURI="";
	String response=given().urlEncodingEnabled(false)
			.queryParams("code",code)
			.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		    .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		    .queryParams("grant_type", "authorization_code")
		    .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
	.when().log().all()
	.post("https://www.googleapis.com/oauth2/v4/token").
	then().log().all().assertThat().statusCode(200).extract().response().asString();
	JsonPath jsonPath=new JsonPath(response);
	String accessToken = jsonPath.getString("access_token");
	System.out.println(accessToken);
	GetCoursesInfo gc=given().contentType("application/json").
queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
.when()
.get("https://rahulshettyacademy.com/getCourse.php").as(GetCoursesInfo.class);
System.out.println(gc);
System.out.println(gc.getLinkedIn());
System.out.println(gc.getInstructor());
System.out.println(gc.getCourses().getWebAutomation().get(1).getCourseTitle());
List<Api> apiCourses = gc.getCourses().getApi();
for(int i=0;i<apiCourses.size();i++)
{
	if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUi Webservices testing"))
		System.out.println(apiCourses.get(i).getPrice());
}


}
}