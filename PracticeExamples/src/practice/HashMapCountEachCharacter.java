package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapCountEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String sentence=sc.nextLine();
 char[] ch = sentence.toCharArray();
 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
 for(char c:ch)
 {
	 if(map.containsKey(c))
	 {
		 int count=map.get(c);
		 map.put(c, count+1);
	 }
	 else
	 {
		 map.put(c, 1);
	 }
 }
 
 for(Map.Entry entry:map.entrySet())
 {
	 System.out.println(entry.getKey()+" "+entry.getValue());
 }
// Set<Character> keys = map.keySet();
// for(Character key:keys)
// {
//	 System.out.println(key+map.get(key));
// }
 
 
	}

}
