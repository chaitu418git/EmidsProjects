package automation.RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import static io.restassured.RestAssured.*;

import files.Payload;
import files.ReusableMethods;

public class Basics {

	public static void main(String[] args)
	{
		String addResource="maps/api/place/add/json";
		String updateResource="maps/api/place/update/json";
		String getResource="maps/api/place/get/json";
		RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=	given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
		.body(Payload.addPlace())
		.when().post(addResource)
		.then().assertThat().statusCode(200).extract().response().asString();
	System.out.println(response);
	JsonPath js = ReusableMethods.rawToJson(response);
	//JsonPath js=new JsonPath(response);
	String placeid=js.getString("place_id");
	System.out.println(js.getString("place_id"));
	//Update API
	String newAddress="hellow this is new address";
	given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
	.body("{\r\n" + 
			"    \"place_id\":\""+placeid+"\",\r\n" + 
			"    \"address\":\""+newAddress+"\",\r\n" + 
			"    \"key\":\"qaclick123\"\r\n" + 
			"}")
	.when().put(updateResource)
	.then().log().all().assertThat().statusCode(200);
	
	//Get API
	String getResponse=given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeid)
	.when().get(getResource)
	.then().log().all().assertThat().statusCode(200).body("address", equalTo(newAddress)).extract().response().asString();
	JsonPath js1 = ReusableMethods.rawToJson(getResponse);
	//JsonPath js1=new JsonPath(getResponse);
	String getAddress=js1.getString("address");
	Assert.assertEquals(getAddress, newAddress);
	}
	
	
}
