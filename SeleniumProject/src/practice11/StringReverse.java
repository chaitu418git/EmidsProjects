package practice11;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tester";
String revSTring="";
for(int i=s.length()-1;i>=0;i--)
{
	revSTring=revSTring+s.charAt(i);
}
System.out.println(revSTring);
	}

}
