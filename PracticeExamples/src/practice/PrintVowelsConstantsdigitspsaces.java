package practice;

public class PrintVowelsConstantsdigitspsaces {

	public static void main(String[] args) {
		String str="tetwrrYTYGHhjaehjhio565 yuy 7";
		str.toLowerCase();
		int vowels=0,consonants=0,digits=0,spaces=0;
		String vow="";
		String con="";
		String dig="";
		
		
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if((ch=='a')|| (ch=='i') || (ch=='e') || (ch=='o') || (ch=='u'))
		{
			vow=vow+ch;
			++vowels;
			
		}
		
		else if (ch>='a' && ch<='z'){
			
			++consonants;
		}
		else if (ch>='0' && ch<='9') {
			++digits;
			
		}
		else if (ch==' ') {
			++spaces;
			
		}
		}
System.out.println("vowels count"+vowels+"and vowels are"+vow);

System.out.println("consonants count"+consonants);
System.out.println("digits count"+digits);

System.out.println("spaces count"+spaces);

	}

}
