package practice14;

import java.util.Scanner;

public class PrimePrint {

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
System.out.println("Enter the start number");
int startnum=sc.nextInt();
System.out.println("Enter the end number");
int endnum=sc.nextInt();
for(int i=startnum;i<=endnum;i++)
{
	if(isPrime(i))
	{
		System.out.println(i);
	}
}
	}

}
