package finalPractice;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] array= {1,0,2,0,3,0};
		int counter=array.length-1;
		for(int i=array.length-1;i>=0;i--)
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter--;
			}
				
		}
		while(counter>=0)
		{
			array[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(array));

	}

}
