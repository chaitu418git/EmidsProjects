package practice14;

import java.util.Arrays;

public class SOrtingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,5,1,3,2};
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
