package hashMapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Tommy", 21);
		map.put("peter", 11);
		map.put("john", 31);
		//Printing the values
		System.out.println(map);
		
		//Printing through Map.Entry
		System.out.println("printing through map enrtry");
		for(Map.Entry entry : map.entrySet())
		{
		System.out.println(entry.getKey()+""+entry.getValue());	
		}
			//printing through iterator
		
		System.out.println("prtintung through ierator");
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String, Integer> shows = it.next();
		System.out.println(shows.getKey()+""+shows.getValue());
		}
		
		//pritnting through keyset
		System.out.println("prting thr set");
		Set<String> set = map.keySet();
		for(String s:set)
		System.out.println(s+" "+map.get(s));
		//prtiing thro foreac
//		map.forEach(shows -> {
//			System.out.println(shows);
//		});
		System.out.println("pritning through forEach");
		map.forEach((k,v)->System.out.println(k+""+v));
		
		
		
		HashMap<Integer, Employee> empMap=new HashMap<Integer, Employee>();
		Employee e1=new Employee("chaitu", 29, 12000);
		Employee e2=new Employee("aitu", 25, 10000);
		Employee e3=new Employee("dhaitu", 30, 13000);
		empMap.put(1,e1 );
		empMap.put(2, e2);
		empMap.put(3,e3 );
		System.out.println(empMap);
		for(Map.Entry<Integer, Employee> entry:empMap.entrySet())
		{
			System.out.println("Employee Info "+entry.getKey());
			
			Employee e = entry.getValue();
			System.out.println(e.name+""+e.age+""+e.salary);
			
			
		}
	}
	
	//printing employee
	

}
