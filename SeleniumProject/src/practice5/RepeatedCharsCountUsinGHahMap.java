package practice5;

import java.util.HashMap;

public class RepeatedCharsCountUsinGHahMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ttwgrgwytwhewyhsaddfsghgdwqqwesahe";
//char c=s.charAt(i);
HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		System.out.println(hm.get(c));
		if(hm.get(c)!=null)
		{
			hm.put(c, hm.get(c)+1);
		}
		else
		{
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	for( Character k:hm.keySet())
	{
		System.out.println(k+"-"+hm.get(k));
	}
	}

}
