package practicee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingAge {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("chaitu", 15, 20000));
		list.add(new Employee("ravi", 30, 4351));	
		list.add(new Employee("zavi", 301, 445635));
		list.add(new Employee("pavi", 34, 43556));	
		list.add(new Employee("aavi", 39, 43455));	
			
		System.out.println(list);
	Collections.sort(list, new AgeComparator());	
	System.out.println(list);
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		
		Employee e=(Employee) itr.next();
		System.out.println(e.name+""+e.age+""+e.salary);
		//System.out.println(itr.next());
	}
		
	}

}
