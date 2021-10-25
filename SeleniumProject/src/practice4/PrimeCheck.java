package practice4;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=-6;
//boolean status=true;
int count=0;
if(num>1)
{
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
		System.out.println("Given num is not prime");
	}
}
else
{
System.out.println("enter a number greater than 1");	
}
	}

}
