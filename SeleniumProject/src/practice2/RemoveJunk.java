package practice2;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="%^%^%^%^%&**&*&:^??>'}}+}|>  testing te234stOIOOOIO((**";
		String s1=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
		String s2=str.replaceAll("\\s","");
		System.out.println(s2);
		
	}

}
