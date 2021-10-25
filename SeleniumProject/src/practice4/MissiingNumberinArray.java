package practice4;

public class MissiingNumberinArray {

	public static int sum(int n)
	{
		n=n*(n+1)/2;
		return n;
	}
	public static int sumofele(int[] array)
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
int[] array= {1,2,3,4,6,7};
int n=array.length+1;
System.out.println(n);
int missingnumber=sum(n)-sumofele(array);
System.out.println(missingnumber);
	}

}
