package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <EmployeeTest>list=new ArrayList<EmployeeTest>();
	list.add(new EmployeeTest("tommy", 20, 10000));
	list.add(new EmployeeTest("abc", 30, 20000));
	list.add(new EmployeeTest("jack", 50, 10000));
	list.add(new EmployeeTest("jick", 10, 10000));
	System.out.println(list);
	Collections.sort(list, new AgeComparator());
	System.out.println(list);
	}

}
