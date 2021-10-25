package practice1;

import javax.smartcardio.ATR;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hellow world test";
String revString="";
String[] strarr = str.split(" ");
for(int i=0;i<strarr.length;i++)
{
	String word=strarr[i];
	String revWord="";
	for(int j=word.length()-1;j>=0;j--)
	{
	revWord=revWord+word.charAt(j);	
	}
	revString=revString+revWord+" ";
}
System.out.println(revString);


	}

}
