package practice12;

public class ReverSeEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="test one two three";
String[] str=s.split(" ");
String revstr="";
for(int i=0;i<str.length;i++)
{
	String word=str[i];
	String revword="";
	for(int j=word.length()-1;j>=0;j--)
	{
		revword=revword+word.charAt(j);
	}
	revstr=revstr+revword+" ";
}
System.out.println(revstr);
	}

}
