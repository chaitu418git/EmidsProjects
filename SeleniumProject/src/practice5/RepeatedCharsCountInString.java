package practice5;

public class RepeatedCharsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="qwertyqwertyqwer t  ykjkjdfdfasiasmnbq";
char[] ch=s.toCharArray();
//for(int i=0;i<ch.length;i++)
//{
//	int count=1;
//	for(int j=i+1;j<ch.length;j++)
//	{
//		if(ch[i]==ch[j] & ch[i]!=' ')
//		{
//			count++;
//			ch[j]='0';
//		}
//	}
//	if(ch[i]!=' ' & ch[i]!='0')
//	System.out.println(ch[i]+"-"+count);
//}
for(int i=0;i<s.length()-1;i++)
{
	int count=1;
	for(int j=i+1;j<s.length()-1;j++)
	{
		if(s.charAt(i)==s.charAt(j) & s.charAt(i)!=' ')
		{
			count++;
			//char s=s.charAt(j);
		}
	}
}
	}

}
