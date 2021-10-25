package automation.RestAssured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class DynamicJson {
@Test(dataProvider = "BooksData")
public void addBook(String isbn, String aisle)
{
	RestAssured.baseURI="http://216.10.245.166";
	String response=given().log().all().header("Content-Type", "application/json")
	.body(Payload.addBook(isbn, aisle))
	.when().post("Library/Addbook.php")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
	JsonPath js = ReusableMethods.rawToJson(response);
	String id=js.get("ID");
	System.out.println(id);
}
@DataProvider(name = "BooksData")
public Object[][] addBookData()
{
	return new Object[][] {{"hjhhy","98743"},{"kkjjg","08975"},{"ftre","8343"}};
}
}
