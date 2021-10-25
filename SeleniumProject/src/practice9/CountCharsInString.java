package practice9;

public class CountCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ghsguqwtyegwg dwehgsgdh  gymnzxcgytwqaqa";

		char[] ch=str.toCharArray();
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
			//unique elements 
//			if(k==1 & ch[i]!='0' & ch[i]!=' ')
//			{
//				System.out.println(ch[i]+"--"+k);
//			}
			//duplicates elements
			if(k>2 & ch[i]!='0' & ch[i]!=' ')
			{
				System.out.println(ch[i]+" "+k);
			}
		}
	}

}
