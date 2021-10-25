package resources;

import java.util.ArrayList;

import pojo.AddPlace;
import pojo.LocationInfo;

public class TestDataBuild {
	public static AddPlace add_place_api_request(Integer accuracy, String name, String phone_number, String address, String website, String language) {
		AddPlace p=new AddPlace();
		p.setAccuracy(accuracy);
		p.setAddress(address);
		p.setLanguage(language);
		p.setName(name);
		p.setPhone_number(phone_number);
		p.setWebsite(website);
		ArrayList<String> list=new ArrayList<String>();
		list.add("test");
		list.add("shoe park");
		p.setTypes(list);
		LocationInfo li=new LocationInfo();
		li.setLat(3435.456);
		li.setLng(98.7634);
		p.setLocation(li);
		return p;
}
	public String deletePlacerequest(String placeid)
	{
		return "{\r\n" + 
				"    \"place_id\":\""+placeid+"\"\r\n" + 
				"    \r\n" + 
				"}";
	}
}