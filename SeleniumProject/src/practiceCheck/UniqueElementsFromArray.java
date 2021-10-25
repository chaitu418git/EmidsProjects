package practiceCheck;

import java.util.HashMap;

public class UniqueElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,5,6,8,9,1,2,9,10};
HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
for(int i=0;i<arr1.length;i++)
{
hm.put(arr1[i],i);
	}
System.out.println(hm.keySet());
	}
}
