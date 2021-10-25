package files;

public class Payload {
public static String addPlace()
{
return "{\r\n" + 
		"    \"location\":{\r\n" + 
		"\r\n" + 
		"        \"lat\":-38.338767,\r\n" + 
		"        \"lng\":33.567765\r\n" + 
		"    },\r\n" + 
		"    \"accuracy\":50,\r\n" + 
		"    \"name\":\"rahul sheety academy\",\r\n" + 
		"    \"phone_number\":\"9673467356\",\r\n" + 
		"    \"address\":\"test 123\",\r\n" + 
		"    \"types\":[\r\n" + 
		"\"shoe park\",\r\n" + 
		"\"shop\"\r\n" + 
		"    ],\r\n" + 
		"    \"website\":\"https://rahulshettyacademy.com\",\r\n" + 
		"    \"language\":\"English\"\r\n" + 
		"\r\n" + 
		"}";
}
public static String coursePrice()
{
	return "{\r\n" + 
			"\r\n" + 
			"\"dashboard\": {\r\n" + 
			"\r\n" + 
			"\"purchaseAmount\": 910,\r\n" + 
			"\r\n" + 
			"\"website\": \"rahulshettyacademy.com\"\r\n" + 
			"\r\n" + 
			"},\r\n" + 
			"\r\n" + 
			"\"courses\": [\r\n" + 
			"\r\n" + 
			"{\r\n" + 
			"\r\n" + 
			"\"title\": \"Selenium Python\",\r\n" + 
			"\r\n" + 
			"\"price\": 50,\r\n" + 
			"\r\n" + 
			"\"copies\": 6\r\n" + 
			"\r\n" + 
			"},\r\n" + 
			"\r\n" + 
			"{\r\n" + 
			"\r\n" + 
			"\"title\": \"Cypress\",\r\n" + 
			"\r\n" + 
			"\"price\": 40,\r\n" + 
			"\r\n" + 
			"\"copies\": 4\r\n" + 
			"\r\n" + 
			"},\r\n" + 
			"\r\n" + 
			"{\r\n" + 
			"\r\n" + 
			"\"title\": \"RPA\",\r\n" + 
			"\r\n" + 
			"\"price\": 45,\r\n" + 
			"\r\n" + 
			"\"copies\": 10\r\n" + 
			"\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"]\r\n" + 
			"\r\n" + 
			"}";
}
public static String addBook(String isbn, String aisle)
{
	String request="{\r\n" + 
			"    \"name\":\"Learn Appium Automation witn Java\",\r\n" + 
			"    \"isbn\":\""+isbn+"\",\r\n" + 
			"    \"aisle\":\""+aisle+"\",\r\n" + 
			"    \"author\":\"john hook\"\r\n" + 
			"}";
	return request;
}

}
