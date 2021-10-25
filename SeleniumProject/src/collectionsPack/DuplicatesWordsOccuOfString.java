package collectionsPack;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicatesWordsOccuOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="iam the the only one one iam new";
String[] starray=s.split(" ");
HashMap<String, Integer> hm=new HashMap<String, Integer>();
for(String j:starray)
{
	System.out.println(j);
}
for(String i:starray)
{
	if(hm.get(i)!=null)
	{
	hm.put(i,hm.get(i)+1);
	}
	else
	{
		hm.put(i, 1);
	}
	//System.out.println(i);
}
System.out.println(hm);
Iterator<String> itr = hm.keySet().iterator();
while(itr.hasNext())
{
	String temp=itr.next();
	System.out.println(temp+"-"+hm.get(temp));
}
	}

}
