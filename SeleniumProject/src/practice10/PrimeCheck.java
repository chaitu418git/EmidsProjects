package practice10;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=19;
if(num>1)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("given number is a prime");
	}
	else
	{
		System.out.println("given num is not prime");
	}
	
}
else
{
	System.out.println("Please eneter a number that is greater than 1");
}
	}

}
