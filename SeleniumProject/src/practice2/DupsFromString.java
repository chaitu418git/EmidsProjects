package practice2;

public class DupsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ghjhgytygdagf satr fgfdfgmnbqw";
char[] ch = s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	int count=1;
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j] &&ch[i]!=' ')
		{
		count++;
		ch[j]='0';
		}
	}
	if(count>1 & ch[i]!='0')
	{
	System.out.println(ch[i]+"-"+count);
	}
	//System.out.println("uniuuni");
//	if(count==1 & ch[i]!='0' & ch[i]!=' ')
//		System.out.println(ch[i]+"-"+count);
}
	}

}
