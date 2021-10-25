package javaprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d= new Date();
System.out.println(d.toString());
System.out.println(d.getDate());
System.out.println(d.getDay());
SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
System.out.println(sdf.format(d));


	}

}
