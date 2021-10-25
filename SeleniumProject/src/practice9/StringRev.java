package practice9;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tester";
String revString="";
for(int i=s.length()-1;i>=0;i--)
{
	revString=revString+s.charAt(i);
}
System.out.println(revString);
	}

}
