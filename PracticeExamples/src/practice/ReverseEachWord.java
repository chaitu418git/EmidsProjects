package practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String inputString="Hello World";
		String[] strArray = inputString.split(" ");
String reverseString="";
for(int i=0;i<strArray.length;i++)
{
	String word=strArray[i];
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--)
	{
		reverseWord=reverseWord+word.charAt(j);
	}
	reverseString=reverseString+reverseWord+" ";
}
System.out.println(reverseString);
	}

}
