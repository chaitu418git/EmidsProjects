package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashMapCountnumofWords {

	public static <E> void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence = sc.nextLine();
		String[] str = sentence.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(String word:str)
		{
			if(map.containsKey(word))
			{
				int count=map.get(word);
				System.out.println(count);
				map.put(word, count+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
//		Set<String> keys = map.keySet();
//		TreeSet<String> ts=new TreeSet<String>(keys);
//		for(String key:keys)
//		{
//			System.out.println(key+map.get(key));
//		}
		for(Map.Entry entry:map.entrySet())
		 {
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		
		}

	}


