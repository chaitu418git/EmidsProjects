package practice8;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,50,55,1,5};
for(int i=0;i<array.length-1;i++)
{
	for(int j=0;j<array.length-1;j++)
	{
		if(array[j]>array[j+1])
		{
			int temp=array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
		}
	}
}
System.out.println(Arrays.toString(array));
	}

}
