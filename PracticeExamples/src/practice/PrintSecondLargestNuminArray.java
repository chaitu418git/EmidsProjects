package practice;

public class PrintSecondLargestNuminArray {

	public static int getSecondLargestNumber(int[] array, int total)
	{
		int temp = 0;
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if (array[i] > array[j])   
            {  
                 temp = array[i];  
                array[i] = array[j];  
                array[j] = temp;  
            }  
		}
		System.out.println(array[i]);
		System.out.println(array[i]);
	}
	System.out.println(array);
	return array[total-1];
	}
	
	
	public static void main(String[] args) {
		int[] array= {1,4,2,3};
		System.out.println(getSecondLargestNumber(array,array.length));

	}

}
