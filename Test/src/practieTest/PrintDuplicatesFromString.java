package practieTest;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {
		
		String str="chaitia";
		String s2="";
		
		for(int i=0;i<str.length();i++)
		{
			Boolean found=false;
			for(int j=0;j<s2.length();j++)
			{
				s2=s2.concat(String.valueOf(str.charAt(i)));
				if(str.charAt(i)==s2.charAt(j))
				{
					found=true;
					break;
					
				}
				
			}
			if(found==true)
			{
				s2=s2.concat(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(s2);
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//			{
//				if(str.charAt(i)==str.charAt(j))
//				{
//					System.out.println(str.charAt(i));
//					s2=s2.concat(String.valueOf(str.charAt(i)));
//				}
//			}
//		}
	}

}
