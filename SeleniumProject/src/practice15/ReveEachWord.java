package practice15;

public class ReveEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hellow one two three";
String revSTring="";
String[] str=s.split(" ");
for(int i=0;i<str.length;i++)
{
	String word=str[i];
	String revWord="";
	for(int j=word.length()-1;j>=0;j--)
	{
		revWord=revWord+word.charAt(j);
	}
	revSTring=revSTring+revWord+" ";
}
System.out.println(revSTring);
	}

}
