package practice12;

import java.util.Scanner;

public class PrimeCheckk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
System.out.println(Math.sqrt(num));
if(isPrime(num))
{
	System.out.println("Given num is a prime num");
}
else
{
	System.out.println("Gicven num is not a prime num");
}
	}
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

}
