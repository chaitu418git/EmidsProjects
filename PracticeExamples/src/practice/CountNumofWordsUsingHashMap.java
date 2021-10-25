package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class CountNumofWordsUsingHashMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String for counting");
		String sentence=sc.nextLine();
		String[] str=sentence.split(" ");
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		for(String word:str)
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
		
		//to display the result
		TreeSet<String> set=new TreeSet<String>(map.keySet());
		for(String key:set)
		{
			System.out.println(key+map.get(key));
		}
		
//		for(Map.Entry entry:map.entrySet())
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
	}

}
