package practice10;

import java.util.ArrayList;

public class RepeatedNumberCountinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 1, 1, 2, 2, 3, 4, 3, 4, 3, 4, 6, 7, 6, 9, 6, 9, 9, 1,9 };
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
	int k=1;
	if(!list.contains(a[i]))
	{
		list.add(a[i]);
		for(int j=1+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				k++;
			}
		}
		System.out.println(a[i]+"-"+k);
	}
}
	}

}
