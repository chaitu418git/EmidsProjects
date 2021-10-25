package practice16;

public class CountNumofCharsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="shfstywqtegwhgdwgewqtasdjsajdsahdiwq   asdhsayewtqyewqqimm   nzx";
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	int k=1;
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j] & ch[i]!=' ')
		{
			k++;
			ch[j]='0';
		}
	}
	if(k==1 & ch[i]!=' ' & ch[i]!='0')
	{
		System.out.println(ch[i]+"---"+k);
	}
}
	}

}
