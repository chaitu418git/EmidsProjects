package practice;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionEx1 {

	public static void main(String[] args) {
	TreeMap<String, Integer> map=new TreeMap<String, Integer>();
	map.put("Chaitu", 2);
	map.put("Abc", 29);
	map.put("Bat", 22);
	map.put("don",14);
	map.put("Abc", 14);
	System.out.println(map);
	Set<String> set = map.keySet();
	System.out.println(set);

	}

}
