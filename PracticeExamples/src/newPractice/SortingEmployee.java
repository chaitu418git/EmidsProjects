package newPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingEmployee {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("chaitu", 29, 2000));
		list.add(new Employee("haitu", 25, 32000));
		list.add(new Employee("aitu", 39, 42000));
		list.add(new Employee("itu", 26, 52000));
		System.out.println(list);
		Collections.sort(list,new EmployeeAgeComparator());
		System.out.println(list);
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e.name+" "+e.age+" "+e.salary);
		}
		

	}

}
