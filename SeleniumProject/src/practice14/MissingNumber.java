package practice14;

public class MissingNumber {
public static int sumOfNumbers(int n)
{
	int num=n*(n+1)/2;
	return num;
}
public static int sumOfElements(int array[])
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
		int array[] = {1,2,3,5,6,7};
		int n=array.length+1;
		
int missingNumber=sumOfNumbers(n)-sumOfElements(array);
System.out.println(missingNumber);
	}

}
