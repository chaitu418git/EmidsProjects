package newPractice;

public class WordReverse {

	public static void main(String[] args) {
		String inputString="Hello World";
		String reverseString="";
String[] strArray=		inputString.split(" ");
for(int i=0;i<strArray.length;i++)
{
	String word=strArray[i];
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--)
	{
		reverseWord=reverseWord+word.charAt(j);
	}
	//reverseString=reverseString+reverseWord+" ";
	reverseString=reverseWord+reverseString+" ";
}
System.out.println(reverseString);

	}

}
