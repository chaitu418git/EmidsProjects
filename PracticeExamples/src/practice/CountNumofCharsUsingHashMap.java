package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumofCharsUsingHashMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the string");
		String str=sc.nextLine();
	char[] ch = str.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(char character:ch)
	{
		if(map.containsKey(character))
		{
			map.put(character, map.get(character)+1);
		}
		else
		{
			map.put(character, 1);
		}
	}
	//to display the data
	for(Map.Entry entry:map.entrySet())
	{
		System.out.println(entry.getKey()+""+entry.getValue());
	}

	}

}
