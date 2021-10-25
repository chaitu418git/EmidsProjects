package practice3;

public class ReverseEachWordOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello World Testing";
String[] ch=str.split(" ");
String revString="";
for(int i=0;i<ch.length;i++)
{
	String word=ch[i];
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
