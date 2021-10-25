package practice2;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingWithInbuilMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {40,2,1,5,3};
System.out.println(Arrays.toString(array));
//Approach 1
//Arrays.parallelSort(array);
//System.out.println(Arrays.toString(array));


//Approach 2
Arrays.sort(array);
System.out.println(Arrays.toString(array));

Integer[] array1= {40,2,1,5,3};

Arrays.sort(array1,Collections.reverseOrder());
System.out.println(Arrays.toString(array1));



	}

}
