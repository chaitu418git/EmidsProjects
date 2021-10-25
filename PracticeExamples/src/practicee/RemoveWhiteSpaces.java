package practicee;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String inputString="test test hello hu";
		
		System.out.println("with replaceALL");
		String witnoutSpaces=inputString.replaceAll(" ","");
		System.out.println(inputString);
		System.out.println(witnoutSpaces);
		
		System.out.println("without replace function");
		StringBuffer sb=new StringBuffer();
		char[] ch=inputString.toCharArray();
		for(char c:ch)
		{
			if((c !=' ') && (c !='\t'))
			{
				sb.append(c);
				
			}
		}
		System.out.println(sb);

	}

}
