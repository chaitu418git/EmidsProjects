package practice5;

public class CountNumOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="test one two ther";
int count=1;
for(int i=0;i<s.length()-1;i++)
{
	if(s.charAt(i)==' ' & s.charAt(i+1)!=' ')
	{
		count++;
	}
}
System.out.println(count);
	}

}
