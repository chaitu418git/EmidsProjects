package practice3;

public class CountCharsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ghsguqwtyegwg dwehgsgdh  gymnzxcgytwqaqa";
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
	if(count>=1 & ch[i]!='0' & ch[i]!=' ')
	{
		System.out.println(ch[i]+"-"+count);
	}
	
}


	}

}
