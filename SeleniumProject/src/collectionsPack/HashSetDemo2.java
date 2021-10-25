package collectionsPack;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> evenNumbers=new HashSet<Integer>();
evenNumbers.add(2);
evenNumbers.add(4);
evenNumbers.add(6);
evenNumbers.add(4);
System.out.println(evenNumbers);

HashSet<Integer> normalnumbers=new HashSet<Integer>();
normalnumbers.addAll(evenNumbers);
normalnumbers.add(10);
System.out.println(normalnumbers);
normalnumbers.removeAll(evenNumbers);
System.out.println(normalnumbers);

	}

}
