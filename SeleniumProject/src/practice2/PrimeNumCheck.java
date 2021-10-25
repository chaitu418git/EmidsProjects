package practice2;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6;
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
	if(count>2)
	{
		System.out.println("given number "+num+"is not a prime number");
	}
	else
	{
		System.out.println("given number "+num+"is  a prime number");
	}
}
else
{
	System.out.println("not applicable to check whether it is prime or not");
}
	}

}
