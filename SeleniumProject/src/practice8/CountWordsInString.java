package practice8;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello test new";
int count=1;
for(int i=0;i<s.length()-1;i++)
{
	//count=1;
	if(s.charAt(i)==' ' & s.charAt(i+1)!=' ')
	{
		count++;
	}
}
System.out.println(count);
	}

}
