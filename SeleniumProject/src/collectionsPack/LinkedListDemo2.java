package collectionsPack;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
list.add("A");
list.add("B");
list.add("C");
System.out.println(list);
LinkedList list1=new LinkedList();
list1.add("D");
list1.addAll(list);
System.out.println(list1);
//list1.removeAll(list);
//System.out.println(list1);
Collections.sort(list1);
System.out.println(list1);
Collections.sort(list1, Collections.reverseOrder());
System.out.println(list1);

	}

}
