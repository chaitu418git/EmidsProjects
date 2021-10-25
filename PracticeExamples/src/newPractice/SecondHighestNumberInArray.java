package newPractice;

public class SecondHighestNumberInArray {

	public static int getSecondLargestNumber(int []a,int total)
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
				//System.out.println(a[i]);
			}
			System.out.println(a[i]);
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		int[] array= {2,3,4,5,1};
		int total=array.length;
		System.out.println(getSecondLargestNumber(array, total));
	}

}
