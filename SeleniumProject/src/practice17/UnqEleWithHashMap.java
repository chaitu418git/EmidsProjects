package practice17;

import java.util.HashMap;

public class UnqEleWithHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 9, 1, 4, 9, 6, 5, 9, 1,7 };
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		//int i=0;
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		System.out.println(map.keySet());

	}

}
