package practice17;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,5,1,3,2};
for(int i=0;i<array.length-1;i++)
{
	for(int j=0;j<array.length-1;j++)
	{
		//int min=array[j];
		if(array[j]<array[j+1])
		{
			int temp=array[j+1];
			array[j+1]=array[j];
			array[j]=temp;
			
		}
	}
}
System.out.println(Arrays.toString(array));
	}

}
