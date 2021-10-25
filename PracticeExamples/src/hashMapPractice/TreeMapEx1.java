package hashMapPractice;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		// Tree Map follows sorting order beased on keys
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("tom", 11);
		tm.put("pom", 12);
		tm.put("aom", 11);
		tm.put("zom", 14);
		tm.put("bom", 15);
		//tm.put(null, 1232);
		System.out.println(tm);
		tm.forEach((k,v)-> System.out.println(k+""+v));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.firstEntry());
		
		TreeMap<Integer,String > tm1=new TreeMap<Integer,String >();
		tm1.put(1200,"tom");
		tm1.put(3200,"pom");
		tm1.put(2200,"xom");
		tm1.put(4200,"aom");
		tm1.put(9200,"zom");
		System.out.println(tm1);
		
		Set<Integer> lessathan4k = tm1.headMap(4000).keySet();
		System.out.println(lessathan4k);
		Set<Integer> greatthan4k = tm1.tailMap(4000).keySet();
		System.out.println(greatthan4k);
		//SortedMap<Integer, String> s = tm1.headMap(e4000);
	//	System.out.println(s.get);
		
		

	}

}
