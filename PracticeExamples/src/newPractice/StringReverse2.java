package newPractice;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the trsing");
	String str=	sc.nextLine();
	String[] strarray=str.split("");
	for(int i=strarray.length-1;i>=0;i--)
	{
		System.out.print(strarray[i]);
	}
	}

}
