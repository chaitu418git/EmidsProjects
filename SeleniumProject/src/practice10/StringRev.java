package practice10;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tester";
String revstr="";
for(int i=s.length()-1;i>=0;i--)
{
	revstr=revstr+s.charAt(i);
}
System.out.println(revstr);
	}

}
