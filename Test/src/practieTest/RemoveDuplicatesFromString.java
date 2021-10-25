package practieTest;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="chaaituati";
String s2="";
for(int i=0;i<str.length();i++)
{
	Boolean found=false;
	for(int j=0;j<s2.length();j++)
	{
		if(str.charAt(i)==s2.charAt(j))
		{
			found=true;
		break;
		}
	}
	if(found==false)
	{
		s2=s2.concat(String.valueOf(str.charAt(i)));
	}
}
System.out.println(s2);
	}

}
