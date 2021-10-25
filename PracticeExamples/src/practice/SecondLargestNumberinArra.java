package practice;

import java.util.Scanner;

public class SecondLargestNumberinArra {
	public static int getSecondLargestNumber(int[] array, int total)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[total-2];
	}

	public static void main(String[] args) {
		int[] array= {4,5,1,2};
System.out.println(getSecondLargestNumber(array, array.length));
	}

}
