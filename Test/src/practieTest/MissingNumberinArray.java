package practieTest;

public class MissingNumberinArray {
public static int sumOfNumbers(int n)
{
	return n*(n+1)/2;
}
public static int sumofArray(int a[])
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,3,4,5,6,7,8,9};
int n=a.length+1;
int x=sumOfNumbers(n);
int y=sumofArray(a);
int missingNumber=x-y;
System.out.println(missingNumber);
	}

}
