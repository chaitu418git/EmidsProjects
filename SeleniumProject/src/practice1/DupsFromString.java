package practice1;


public class DupsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ghjhgytygdagf satr fgfdfgmnbqw";
char[] strarr=s.toCharArray();
int count=0;
for(int i=0;i<strarr.length;i++)
{
	count=1;
	for(int j=i+1;j<strarr.length;j++)
	{
		if(strarr[i]==strarr[j] && strarr[i]!=' ')
		{
			count++;
		strarr[j]='0';
		}
		
	}
	if(count>1 && strarr[i]!='0')
		System.out.println(strarr[i]);
	if(count==1 && strarr[i]!=' ' && strarr[i]!='0')
		System.out.println(strarr[i]);
		
}
	}

}
