package practice1;

import java.util.HashMap;

public class UniqEleWithHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 9, 1, 4, 9, 6, 5, 9, 1,7 };
HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
for(int i=0;i<arr.length;i++)
{
hm.put(arr[i], i);
		
	}
System.out.println(hm.keySet());
	}
}
