package finalPractice;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String s="chaitat";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			Boolean found=false;
			for(int j=0;j<s2.length();j++) {
				if(s.charAt(i)==s2.charAt(j))
				{
					found=true;
					break;
				}
			}
			
			if(found==false)
				//System.out.println("test");
			
				s2=s2.concat(String.valueOf(s.charAt(i)));
			
		}
		System.out.println(s2);

	}

}
