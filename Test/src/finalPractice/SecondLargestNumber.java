package finalPractice;

public class SecondLargestNumber {

	public static int getSecondLarNumber(int a[], int total)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
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
		int[] a= {1,2,5,6,8,9};
		System.out.println(getSecondLarNumber(a,a.length));

	}

}
