package practice12;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter start number");
int startnum=sc.nextInt();
System.out.println("Enter End Number");
int endnum=sc.nextInt();
for(int i=startnum;i<=endnum;i++)
{
	if(isPrime(i))
	{
		System.out.println(i);
	}
}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0){
				return false;
			}
			
		}
		return true;
	}

}
