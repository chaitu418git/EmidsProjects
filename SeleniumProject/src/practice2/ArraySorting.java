package practice2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {40,2,1,5,3};
System.out.println(Arrays.toString(array));
int n=array.length-1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
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


