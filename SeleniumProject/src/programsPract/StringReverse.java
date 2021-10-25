package programsPract;

public class StringReverse {

	public static void main(String[] args) {
		
String str="tester";
String revstr="";
System.out.println(str.length());
for(int i=str.length()-1;i>=0;i--)
{
	revstr=revstr+str.charAt(i);
}
System.out.println(revstr);
if(revstr.equals(str))
{
	System.out.println("plindorme");
}
else
{
	System.out.println("not plaindrome");
}
	}

}
