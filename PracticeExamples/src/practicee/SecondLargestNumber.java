package practicee;

public class SecondLargestNumber {

	public static int getSecondLargestNumber(int [] a, int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		
		int[] array= {1,4,5,2,3};
		
		System.out.println(getSecondLargestNumber(array, array.length));

	}

}
