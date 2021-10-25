package practieTest;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="test new update";
		String reverseString="";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			reverseString=reverseString+revword+" ";
		}
		System.out.println(reverseString);

	}

}
