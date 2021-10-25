package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	public static RequestSpecification reqspe;
	public static ResponseSpecification resspec;
	//static String uri="https://rahulshettyacademy.com";
public RequestSpecification requestSpecification() throws IOException
{
	if(reqspe==null)
	{
	PrintStream logfile = new PrintStream(new FileOutputStream("logging.txt"));
	reqspe = new RequestSpecBuilder().setBaseUri(getGlobalValues("baseUrl")).setContentType("application/json").addQueryParam("key","qaclick123")
			.addFilter(RequestLoggingFilter.logRequestTo(logfile))
			.addFilter(ResponseLoggingFilter.logResponseTo(logfile)).
			
			build();
	return reqspe;
}
return reqspe;	
}
public ResponseSpecification responseSpecifiction()
{
	 resspec=new ResponseSpecBuilder().expectStatusCode(200).build();
	 return resspec;
}
public static String getGlobalValues(String key) throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\Users\\XP.Chaitanya.Buddi\\eclipse-workspace\\RestAssuredWithCucumber\\src\\test\\java\\resources\\global.properties");
	prop.load(fis);
	return prop.getProperty(key);
	 
	
}
public static String getJsonPath(Response response, String key)
{
	String resp = response.asString();
	JsonPath js=new JsonPath(resp);
	return js.get(key).toString();
}
}
