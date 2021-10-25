package practice7;

import java.util.HashMap;

public class RepWordsCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world one test one test";
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
 String[] str=s.split(" ");
	for(String word:str)
	{
		if(hm.get(word)!=null)
		{
			hm.put(word, hm.get(word)+1);
		}
		else
		{
			hm.put(word, 1);
		}
	}
	System.out.println(hm);
	}

}
