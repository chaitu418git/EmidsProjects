package practice4;

public class StringCharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="gfdgyyweghduwuewusghs  gtqtisdhd   shgeywtyewghyruyrnbvcqwsder";
char[] ch=str.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
	count=1;
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j] & ch[i]!=' ')
		{
			count++;
			ch[j]='0';
		}
	}
	//all chars count
//	if(ch[i]!='0' & ch[i]!=' ')
//	{
//		System.out.println(ch[i]+"--"+count);
//	}
//	//duplicates chars count
//	System.out.println("duplicatess");
//	if(count>1 & ch[i]!='0' & ch[i]!=' ')
//	{
//		System.out.println(ch[i]+"--"+count);
//
//	}
	//unique elements and count
	//System.out.println("unique elemsnts");
	if(count==1 & ch[i]!='0' & ch[i]!=' ')
	{
		System.out.println(ch[i]+"--"+count);

	}
	
}

	}

}
