package practice2;

public class StringWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello World";
String revString="";
String[] s = str.split(" ");
for(int i=0;i<s.length;i++)
{
	String revWord="";
String word=s[i];
for(int j=word.length()-1;j>=0;j--)
{
	revWord=revWord+word.charAt(j);
}
revString=revString+revWord+" ";
	}
System.out.println(revString);
	}
}
