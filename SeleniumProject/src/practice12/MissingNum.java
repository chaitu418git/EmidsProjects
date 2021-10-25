package practice12;

public class MissingNum {

	public static int  sumOfnumber(int n)
	{
		int sum= n*(n+1)/2;
		return sum;
	}
	public static int sumOfElements(int[] array)
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
int[] array= {1,2,4,5,6,7};
int n=array.length+1;
int misnumber=sumOfnumber(n)-sumOfElements(array);
System.out.println(misnumber);
	}

}
