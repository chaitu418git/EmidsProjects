package practice14;

import java.util.Scanner;

public class PrimeCheck {
public static boolean isPrime(int n)
{
	if(n<=1)
	{
		return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num to check the prime or not");
	int num=sc.nextInt();
	if(isPrime(num))
	{
		System.out.println("Given num is a prime number");
	}
	else
	{
		System.out.println("Given num is not a prime number");
	}
	}

}
