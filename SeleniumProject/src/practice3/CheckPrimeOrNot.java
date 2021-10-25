package practice3;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check prime");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
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
		System.out.println("given num" +num+"is not primer");
	}
	else
	{
		System.out.println("given num" +num+"is  primer");
	}
}
else
{
	System.out.println("Please enter the number that is greate than 1");
}
	}

}
