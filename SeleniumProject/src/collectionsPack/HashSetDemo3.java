package collectionsPack;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> set1=new HashSet<Integer>();
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
set1.add(5);
System.out.println("set1"+set1);
//find union , intersection and difference of 2 sets
HashSet<Integer> set2=new HashSet<Integer>();
set2.add(3);
set2.add(4);
set2.add(6);
System.out.println("set2"+set2);
//union
//set1.addAll(set2);
//System.out.println("union"+set1);
//intersection
//set1.retainAll(set2);
//System.out.println("intersection"+set1);
//System.out.println(set2);
//difference
//set1.removeAll(set2);
//System.out.println("diff"+set1);
//subset
System.out.println(set1.containsAll(set2));
System.out.println(set1);
	}

}
