package practice14;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello one two test";
String revString="";
String[] str=s.split(" ");
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
