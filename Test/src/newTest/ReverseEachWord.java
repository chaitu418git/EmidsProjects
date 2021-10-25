package newTest;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="test new update";
	String revString="";
		String[] splitString=str.split(" ");
	for(int i=0;i<splitString.length;i++)
	{
		String word=splitString[i];
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
