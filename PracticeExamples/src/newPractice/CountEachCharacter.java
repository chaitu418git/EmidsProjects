package newPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountEachCharacter {

	public static void main(String[] args) {
		String inputString="chaitanyat";
		 char[] ch = inputString.toCharArray();
		 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		 for(char c:ch)
		 {
			 if(map.containsKey(c))
			 {
				 map.put(c, map.get(c)+1);
			 }
			 else
			 {
				 map.put(c, 1);
			 }
		 }
		 //printing
		 System.out.println("prtint thr keyset");
		 Set<Character> set = map.keySet();
		 for(Character s:set)
		 {
			 System.out.print(s+""+map.get(s));
		 }
		 System.out.println("printing thr entry set");
		 for(Map.Entry entry:map.entrySet())
		 {
			 System.out.print(entry.getKey()+""+entry.getValue());
		 }
	}

}
