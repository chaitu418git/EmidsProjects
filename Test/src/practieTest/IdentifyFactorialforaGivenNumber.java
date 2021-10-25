package practieTest;

public class IdentifyFactorialforaGivenNumber {

	public static void main(String[] args) {
			int factorialNumber=120;
			int i=0;
			do
			{
				i++;
				System.out.println(i);
				factorialNumber=factorialNumber/i;
			}while(factorialNumber>1);
				System.out.println(i);
		

	}

}
