package practice;

import java.util.Scanner;

public class StringRevEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
String str=sc.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
	System.out.println(rev);
	if(rev.equals(str))
	{
		System.out.println("plaindrome");
	}
	else
	{
		System.out.println("not plaindrome");
	}
	}

}
