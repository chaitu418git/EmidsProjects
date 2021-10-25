package practice;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String with Spaces");
		String str=sc.nextLine();	
		String withoutSPaces=str.replaceAll("\\s", "");
		System.out.println(withoutSPaces);
		
		char[] charray=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<charray.length;i++)
		{
			if((charray[i]!=' ') && (charray[i]!='\t'))
			{
				sb.append(charray[i]);
			}
		}
		System.out.println(sb);
	}

}
