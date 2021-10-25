package practicee;

public class ReverseStringPattren2 {

	public static void main(String[] args) {
		String givenString="test fg";
		
String[] strArray=givenString.split("");
for(int i=givenString.length()-1;i>=0;i--)
{
	System.out.print(strArray[i]);
}
	}

}
