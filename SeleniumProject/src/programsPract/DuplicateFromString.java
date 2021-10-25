package programsPract;

public class DuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="yfuhzsdgfye twrfheeyuwqyrwwsdsfsdwq";
char[] s = str.toCharArray();
int count=0;
for(int i=0;i<s.length;i++)
{
	count=1;
	for(int j=i+1;j<s.length;j++)
	{
		if(s[i]==s[j] && s[i]!=' ')
		{
			count++;
			s[j]='0';
		}
	}
	if(count==1 && s[i]!='0')
	{
		System.out.println(s[i]);
	}
}
	}

}
