package practice2;

import java.util.HashMap;

public class UnEleFromHashMap {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 1, 4, 9, 6, 5, 9, 1,7 };
HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
int i;
for(i=0;i<arr.length;i++)
{
map.put(arr[i], i);
}
System.out.println(map);
System.out.println(map.keySet());
System.out.println(map.values());

	}

}
