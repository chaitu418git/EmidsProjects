package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.AddPlaceRespone;
import pojo.LocationInfo;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils{
	
	static String addResource="maps/api/place/add/json";
	RequestSpecification reqspec;
	ResponseSpecification resspec;
	TestDataBuild data=new TestDataBuild();
	Response response;
	public static String placeid;
//	AddPlaceRespone apr;
	

	@Given("AddPlace API request with {int} {string} {string} {string} {string} {string}")
	public void add_place_api_request_with(Integer accuracy, String name, String phone_number, String address, String website, String language) throws IOException {
		reqspec=given().spec(requestSpecification()).body(data.add_place_api_request(accuracy, name, phone_number, address, website, language));
	}




//	@Given("AddPlace API request")
//	public void add_place_api_request() throws IOException {
//		
//		
//		 reqspec=given().spec(requestSpecification()).body(data.add_place_api_request());
//	}
	@When("user submit {string} the {string} http request")
	
	public void user_submit_the_http_request(String resource, String method) {
		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		if(method.equalsIgnoreCase("POST"))
		{
		response = reqspec.when().post(resourceAPI.getResource()).then().spec(responseSpecifiction()).extract().response();
	}
		else if (method.equalsIgnoreCase("GET")) {
			response = reqspec.when().get(resourceAPI.getResource()).then().spec(responseSpecifiction()).extract().response();
		}	
	}

	@When("user submitw the POST request")
	public void user_submitw_the_post_request() {
	    // Write code here that turns the phrase above into concrete actions
		 response = reqspec.when().post(addResource).then().spec(responseSpecifiction()).extract().response();
	}
	@Then("user should be able to see a standard successful response with the status code of {string}")
	public void user_should_be_able_to_see_a_standard_successful_response_with_the_status_code_of(String string) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(),200);
		
		//System.out.println("placeid print"+apr.getPlace_id());
	}
	@And("verify that the response is received in less than {int} seconds")
	public void verify_that_the_response_is_received_in_less_than_seconds(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(response.getTime());
//	   if(response.getTime()<int1)
//	   {
//		   System.out.println("proper");
//	   }
	}
	
	@And("verify {string} in response body is {string}")
	public void verify_in_response_body_is(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//AddPlaceRespone apr=response.as(AddPlaceRespone.class);
		//assertEquals(apr.getStatus(), string2);
		//assertEquals(apr.getScope(), string2);
	   // System.out.println(apr.getStatus());
	   // Assert.assertEquals(apr.getStatus(),string2);
	  //  Assert.assertEquals(apr.getScope(),string2);
		//getJsonPath(response, key)
	  //  String resp=response.asString();
	 //  JsonPath js=new JsonPath(resp);
	   assertEquals(getJsonPath(response, string1),string2);
	    
	    
	}
	@Then("Verify {string} displays matches with DB reesult")
	public void verify_displays_matches_with_db_reesult(String string) {
		AddPlaceRespone apr = response.as(AddPlaceRespone.class);
		 placeid=apr.getPlace_id();
		 System.out.println("test"+placeid);
	}

	@Given("DeletePlaceAPI request with placeid")
	public void delete_place_api_request_with_placeid() throws IOException {
		reqspec=given().spec(requestSpecification()).body(data.deletePlacerequest(placeid));
	}




//	@Given("GetPlaceAPI request with placeid")
//	public void get_place_api_request_with_placeid() throws IOException {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("from another"+placeid);
//		reqspec=given().spec(requestSpecification()).body(data.deletePlacerequest(placeid));
//	}
//	@And("verify {string} in the respone maps to {string} requestParameter name")
//	public void verify_in_the_respone_maps_to_request_parameter_name(String name, String expectedName) {
//	    // Write code here that turns the phrase above into concrete actions
//	   assertEquals(getJsonPath(response, "name"), new AddPlace().getName());
//	}






}
