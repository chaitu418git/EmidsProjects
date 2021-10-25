package practicee;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import practice.HashMapCountEachCharacter;

public class CountNumofWordsinHashMap {

	public static void main(String[] args) {
		

		String inputSTring="This is this is test java test";
		String[] strArray=inputSTring.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:strArray)
		
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word,1);
			}
		}
		
		//display purpose
		
		System.out.println("printng thr keyset");
		Set<String> set = map.keySet();
		for(String s:set)
		{
			System.out.println(s+""+map.get(s));
		}
		System.out.println("printit thr entryset");
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+""+entry.getValue());
		}

	}

}
