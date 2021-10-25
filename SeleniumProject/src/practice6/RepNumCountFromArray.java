package practice6;

import java.util.ArrayList;

public class RepNumCountFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,4,5,7,1,4,6,5,7,8,9,12,4,5,4,3,2,31,91,2};
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<array.length;i++)
{
	int count=1;
	if(!list.contains(array[i]))
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j])
			{
				count++;
			}
		}
	}
	System.out.println(array[i]+"-"+count);

}
	}

}
