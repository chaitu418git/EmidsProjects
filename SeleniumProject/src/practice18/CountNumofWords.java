package practice18;

import java.util.Scanner;

public class CountNumofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to count");
String text=sc.nextLine();
int count=1;
for(int i=0;i<text.length();i++)
{
	if((text.charAt(i)==' ') && (text.charAt(i+1)!=' '))
	{
		count++;
	}
}
System.out.println(count);
	}

}
