package finalPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String givenSTring="Test Test";
		String withoutSpaces=givenSTring.replaceAll(" ", "");
		System.out.println(withoutSpaces);

		StringBuffer sb=new StringBuffer();
	char[] ch=	givenSTring.toCharArray();
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
