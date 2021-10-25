package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("kjl");
		list1.add("gyt");
		list1.add("abdd");
		
		LinkedList<String> list=new LinkedList<String>();
		//insertion order is preserved
		//duplicates are allowed
		list.add("zbf");
		list.add("abdd");
		list.add("yht");
		list.add("bbgyt");
		list.add("zbf");
		System.out.println(list);
		list.addAll(list1);
		System.out.println(list);
		//list.removeAll(list1);
		list.retainAll(list1);
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
	}


