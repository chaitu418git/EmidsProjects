package finalPractice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String inputString="hello java";
		String reverseString="";
		String[] strArray=inputString.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			String word=strArray[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			reverseString=reverseString+revWord+" ";
		}
System.out.println(reverseString);
	}

}
