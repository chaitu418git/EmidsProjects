package practicee;

public class ReverseString {

	public static void main(String[] args) {
		String givenSTring="madam";
		System.out.println(givenSTring);
	String reverse="";
	for(int i=givenSTring.length()-1;i>=0;i--)
	{
		reverse=reverse+givenSTring.charAt(i);
		
		
	}
	System.out.println(reverse);

	}

}
