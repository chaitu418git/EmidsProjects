package practice4;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="tester";
String revstring="";
for(int i=str.length()-1;i>=0;i--)
{
	revstring=revstring+str.charAt(i);
}
System.out.println(revstring);
	}

}
