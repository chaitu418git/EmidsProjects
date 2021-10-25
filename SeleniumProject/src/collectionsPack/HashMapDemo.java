package collectionsPack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> m=new HashMap<Integer,String>();
m.put(101, "X");
m.put(104, "y");
m.put(102, "a");
m.put(103, "z");
m.put(101,"value");
m.put(105, "z");
System.out.println(m);
System.out.println(m.containsKey(1061));
System.out.println(m.containsValue("sz"));
//return all keys
Set<Integer> keys = m.keySet();
System.out.println(keys);
//return all values
Collection<String> values = m.values();
System.out.println(values);
//return keys one by one
for(int i:m.keySet())
{
	System.out.println(i);
}
//return values one by one
for(String j:m.values())
{
	System.out.println(j);
}
//retuen keys and values
for(int i:m.keySet())
{
	System.out.println(i+"-"+m.get(i));
}
//Entry Methods
for(Map.Entry<Integer, String> entry:m.entrySet())
{
	System.out.println(entry.getKey()+"---"+entry.getValue());
}
//Map.Entry<Integer, String> es =  m.entrySet();
//System.out.println(es.getKey()+""+es.getValue());

//through iterator
Set<Entry<Integer, String>> s = m.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
	System.out.println(entry.getKey()+"00000"+entry.getValue());
}
	}

}
