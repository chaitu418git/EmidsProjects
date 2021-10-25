package practice7;

public class RepeatedCharsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="turewrfgegfyw  ergfgyrtwe  wrecwdvsgfdurwetrehfccvmnz";
char[] ch=s.toCharArray();
int k=0;
for(int i=0;i<ch.length;i++)
{
	k=1;
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j] & ch[i]!=' ')
		{
			k++;
			ch[j]='0';
		}
	}
	if(ch[i]!=' ' & ch[i]!='0')
		System.out.println(ch[i]+"--"+k);
}
	}

}
