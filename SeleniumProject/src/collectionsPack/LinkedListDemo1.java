package collectionsPack;

import java.util.Iterator;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list=new LinkedList();
list.add(1);
list.add("test");
list.add(null);
list.add(true);
System.out.println(list);
list.add(1, "add");
System.out.println(list);
list.addFirst("first");
list.addLast("last");
System.out.println(list);
System.out.println(list.contains(1));
System.out.println(list.indexOf(true));
for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i));
}
System.out.println("--------------");
for(Object i:list)
{
	System.out.println(i);
}
System.out.println("aaaaaaaa-");
Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("lililil");
 java.util.ListIterator litr = list.listIterator();
 while(litr.hasNext())
 {
	 System.out.println(litr.next());
 }
 System.out.println("kkkkkkkkkkkk");
 while(litr.hasPrevious())
 {
	 System.out.println(litr.previous());
 }
	}

}
