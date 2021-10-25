package practice2;

import java.util.Scanner;

public class CountNumofWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the STring");
		Scanner sc =new Scanner(System.in);
		String string = sc.nextLine();
		int count=1;
		for(int i=0;i<string.length();i++)
		{
			if((string.charAt(i)==' ') && (string.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("count of words are"+count);
		

	}

}
