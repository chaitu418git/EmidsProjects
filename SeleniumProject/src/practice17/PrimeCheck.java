package practice17;

import java.util.Scanner;

public class PrimeCheck {

	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to check whether num is prime or not");
int num=sc.nextInt();
if(isPrime(num))
{
	System.out.println("Given num"+num+"is a prime number");
}
else
{
	System.out.println("Given num"+num+"is not a prime number");
}
	}

}
