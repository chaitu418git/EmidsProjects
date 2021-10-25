package practice18;

public class CountCharsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gshgfyyrwutrwgr  yewuf   etfd sfhsgfhuetwyruvcvqe";
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	int k=1;
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			k++;
			ch[j]='0';
		}
	}
	if(ch[i]!='0' & ch[i]!=' ')
	{
		System.out.println(ch[i]+"-"+k);
	}
}
	}

}
