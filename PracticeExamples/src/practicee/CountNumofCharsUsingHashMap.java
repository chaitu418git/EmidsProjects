package practicee;

import java.util.HashMap;
import java.util.Map;

public class CountNumofCharsUsingHashMap {

	public static void main(String[] args) {
		String givenString="abcdabgguha";
		char[] ch=givenString.toCharArray();
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
		//display
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}

}
