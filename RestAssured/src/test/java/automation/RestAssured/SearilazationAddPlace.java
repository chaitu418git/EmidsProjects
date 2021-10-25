package automation.RestAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import files.Payload;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.LocationInfo;

public class SearilazationAddPlace {
	static String uri="https://rahulshettyacademy.com";
	static String addResource="maps/api/place/add/json";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddPlace p=new AddPlace();
		p.setAccuracy(50);
		p.setAddress("this is test adress");
		p.setLanguage("English");
		p.setName("Chaitu");
		p.setPhone_number("9874561234");
		p.setWebsite("test.com");
		ArrayList<String> list=new ArrayList<String>();
		list.add("test");
		list.add("shoe park");
		p.setTypes(list);
		LocationInfo li=new LocationInfo();
		li.setLat(3435.456);
		li.setLng(98.7634);
		p.setLocation(li);
		RequestSpecification reqspec = new RequestSpecBuilder().setBaseUri(uri).setContentType("application/json").addQueryParam("key","qaclick123").build();
		
//RestAssured.baseURI="https://rahulshettyacademy.com";
//String response=given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
//.body(p)
//.when().post(addResource)
//.then().assertThat().statusCode(200).extract().response().asString();
//System.out.println(response);
		ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).build();
	String response=given().spec(reqspec).body(p).when().post(addResource).then().spec(resspec).extract().response().asString();
	System.out.println(response);
	
	}

}
