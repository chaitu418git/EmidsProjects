package practice17;

public class MissingNumber {

	public static int sumOfElements(int n)
	{
		return (n*(n+1)/2);
	}
	public static int sumArray(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,2,3,5,6,7};
int n=array.length+1;
	int missingnumber=sumOfElements(n)-sumArray(array);
	System.out.println(missingnumber);
	}

}
