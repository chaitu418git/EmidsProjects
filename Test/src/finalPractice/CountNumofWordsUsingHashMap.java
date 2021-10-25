package finalPractice;

import java.util.HashMap;
import java.util.Map;

public class CountNumofWordsUsingHashMap {

	public static void main(String[] args) {
		String s="This is testing is This test new test";
		String[] strArray=s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:strArray)
		{
			if(map.containsKey(word))
					{
				map.put(word, map.get(word)+1);
					}
			else
			{
				map.put(word, 1);
			}
		}
		//for display
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}

}
