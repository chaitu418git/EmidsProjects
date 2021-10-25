package practice5;

public class StringReve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tester";
String revstring="";
for(int i=s.length()-1;i>=0;i--)
{
	revstring=revstring+s.charAt(i);
}
System.out.println(revstring);
	}

}
