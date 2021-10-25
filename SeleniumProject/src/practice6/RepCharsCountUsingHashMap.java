package practice6;

import java.util.HashMap;

public class RepCharsCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ttwgrgwytwhewyhsaddfsghgdwqqwesahe";
HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	if(hm.get(c)!=null)
	{
		hm.put(c, hm.get(c)+1);
	}
	else
	{
		hm.put(c,1);
	}
}
System.out.println(hm);
for(Character cc:hm.keySet())
{
	System.out.println(cc+"-"+hm.get(cc));
}
	}

}
