package practice13;

import java.util.Scanner;

public class PrimePrint {
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
System.out.println("Enter start number");
int startnum=sc.nextInt();
System.out.println("ENter End Number");
int endnumber=sc.nextInt();
for(int i=startnum;i<=endnumber;i++)
{
	if(isPrime(i))
	{
		System.out.println(i);
	}
}
	}

}
