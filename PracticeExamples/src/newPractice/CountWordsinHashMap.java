package newPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordsinHashMap {

	public static void main(String[] args) {
		String inputString="This is testing is testing java selenium java";
String[] strArray=inputString.split(" ");
HashMap<String, Integer> map=new HashMap<String,Integer>();
for(String str:strArray)
{
	if(map.containsKey(str))
	{
		map.put(str, map.get(str)+1);
	}
	else
	{
		map.put(str, 1);
	}
}

//printing through keyset
Set<String> set = map.keySet();
for(String s:set)
{
	System.out.println(s+""+map.get(s));
}
//printing map.entry
System.out.println("------");
for(Map.Entry entry:map.entrySet())
{
	System.out.println(entry.getKey()+""+entry.getValue());
}

	}

}
