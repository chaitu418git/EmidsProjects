package practice;

import java.util.Scanner;

public class PalindromeReverse {

	public static void main(String[] args) {
		//Scanner sc=new Scanner();
		String originialstring="madam";
		System.out.println(originialstring.length());
		String reversestring="";
		for(int i=originialstring.length()-1;i>=0;i--)
		{
			reversestring=reversestring+originialstring.charAt(i);
		}
		System.out.println(reversestring);
		if(reversestring.equals(originialstring))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}

	}

}
