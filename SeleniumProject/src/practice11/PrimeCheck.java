package practice11;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=7;

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
			System.out.println("Given num is prime");
		}
		else
		{
			System.out.println("givcen numis not prime");
		}
	
	
}
else
{
	System.out.println("Enter the number greater than 1 to check the num is prime or not");
}

	}
}
