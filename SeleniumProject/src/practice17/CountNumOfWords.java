package practice17;

import java.util.Scanner;

public class CountNumOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
int count = 1;
for(int i=0;i<str.length();i++)
{
	 //count=1;
	if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
	{
	count++;	
	}
}
System.out.println(count);
	}

}
