package practice;

import java.util.Scanner;

public class StringReverseEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	String string = sc.nextLine();
	String[] s = string.split("");
	for(int i=string.length()-1;i>=0;i--)
	{
		System.out.print(s[i]);
	}
		
	}

}
