package hashMapPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		//In Linked Hash Map insertion order is preserved
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		lhm.put("tom", 123);
		lhm.put("pom", 1023);
		lhm.put("aom", 1323);
		lhm.put("zom", 23);
		System.out.println(lhm);
		

	}

}
