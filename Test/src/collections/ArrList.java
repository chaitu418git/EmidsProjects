package collections;
import java.util.*;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("kjl");
		list1.add("gyt");
		list1.add("abdd");
		
		ArrayList<String> list=new ArrayList<String>();
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
