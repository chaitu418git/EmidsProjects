package practiceTest;

public class ReverseEachWord {

	public static void main(String[] args) {
		String givenString="Hello World";
		System.out.println(givenString);
		String revString="";
		String[] strArray=givenString.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			String word=strArray[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);
	}

}
