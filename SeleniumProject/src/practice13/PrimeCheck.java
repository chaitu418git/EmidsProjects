package practice13;

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
System.out.println("Enter the number to check prime");
int num=sc.nextInt();
if(isPrime(num))
{
	System.out.println("Given Num"+num+"is prime");
}
else
{
	System.out.println("Given num"+num+"is not prime");
}
	}

}
