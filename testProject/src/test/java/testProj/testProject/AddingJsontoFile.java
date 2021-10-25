package testProj.testProject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class AddingJsontoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
JSONObject json=new JSONObject();
json.put("empid", "123");
json.put("firstname", "bpdate");
json.put("lstname", "aew");
json.put("country","India");
System.out.println(json);

FileWriter fw=new FileWriter("json\\test.json",false);
fw.write(json.toJSONString());
fw.close();
System.out.println("file has been created");
	}

}
