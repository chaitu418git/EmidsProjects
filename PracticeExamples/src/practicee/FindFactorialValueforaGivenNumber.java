package practicee;

public class FindFactorialValueforaGivenNumber {

	public static void main(String[] args) {
		int factorialnum=720;
		int i=0;
		
		do
		{
			System.out.println("before "+i);
			i++;
			System.out.println("after "+i);
			
			factorialnum=factorialnum/i;
			System.out.println(factorialnum);
		}
			while(factorialnum>1);
			
				
			
			
			System.out.println(i);
		}



}
