package practiceCheck;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check armstrong");
int num=sc.nextInt();
int givennum=num;
int r;
int cube=0;
while(num>0)
{
	r=num%10;
	num=num/10;
	cube=cube+(r*r*r);
}
System.out.println(cube);
System.out.println(givennum);
if(givennum==cube)
	System.out.println("given number is armstring number");
else
	System.out.println("given num is not armstring number");



}
	}
