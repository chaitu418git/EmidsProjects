package practice17;

import java.util.HashMap;

public class HashMapRepWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world one test one test";
HashMap<String, Integer> hm=new HashMap<String, Integer>();
String[] str=s.split(" ");
for(String i:str)
{
	if(hm.get(i)!=null)
	{
		hm.put(i, hm.get(i)+1);
	}
	else
	{
		hm.put(i, 1);
	}
}
for(String s1:hm.keySet())
{
System.out.println(s1+"-"+hm.get(s1));	
}
	}

}
