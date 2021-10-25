package practice4;

import java.util.ArrayList;

public class RepeatedNumbersCountFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,3,5,1,6,7,8,9,2,4,5,7,8,99,2,4,5,1};
ArrayList<Integer> list=new ArrayList<Integer>();
int k=0;
for(int i=0;i<array.length;i++)
{
	if(!list.contains(array[i]))
	{
		list.add(array[i]);
		k=1;
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j])
			{
				k++;
			}
		}
		System.out.println(array[i]+"--"+k);
	}
}
	}

}
