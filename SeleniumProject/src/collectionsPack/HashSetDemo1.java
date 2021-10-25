package collectionsPack;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("test");
hs.add(1);
hs.add(null);
hs.add(12.5);
hs.add(null);
System.out.println(hs.contains(null));
System.out.println(hs);
for(Object i:hs)
{
	System.out.println(i);
}
Iterator itr=hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
