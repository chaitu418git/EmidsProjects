package practice5;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello World Testing";
String[] str=s.split(" ");
String revString="";
for(int i=0;i<str.length;i++)
{
	String word=str[i];
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
