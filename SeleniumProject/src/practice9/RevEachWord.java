package practice9;

public class RevEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello world test";
String revString="";
String[] strarray=s.split(" ");
for(int i=0;i<strarray.length;i++)
{
	String word=strarray[i];
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
