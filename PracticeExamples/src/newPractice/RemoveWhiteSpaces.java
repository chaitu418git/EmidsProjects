package newPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s="a b c d";
		
		String withoutSpaces=s.replaceAll("\\s", "");
//System.out.println(withoutSpaces);

StringBuffer sb=new StringBuffer();
char[] ch=s.toCharArray();
//for(int i=0;i<ch.length;i++)
//{
//	if((ch[i]!=' ') && (ch[i]!='\t'))
//	{
//		sb.append(ch[i]);
//	}
//}
//System.out.println(sb);

for(char c:ch)
{
	if((c!=' ') && (c!='\t'))
	{
		sb.append(c);
	}
}
System.out.println(sb);
	}
	
	
	
	

}
