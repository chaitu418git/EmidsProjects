package finalPractice;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] array= {1,0,2,0,3,0};
		int counter=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter++;
			}
		}
		while(counter<array.length)
		{
			array[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(array));

	}

}
