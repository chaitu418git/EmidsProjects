package practice5;

import java.util.HashMap;

public class RepeatedWordsCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello world one test one test";
HashMap<String, Integer> hm=new HashMap<String, Integer>();
String[] word = s.split(" ");
for(String i:word)
{
	if(hm.get(i)!=null)
	{
		hm.put(i, hm.get(i)+1);
	}
	else
	{
		hm.put(i,1);
	}
}
System.out.println(hm);
for(String k:hm.keySet())
{
	if(hm.get(k)>1)
	System.out.println(k+"-"+hm.get(k));
}
	}

}
