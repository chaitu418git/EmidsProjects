package practieTest;

public class PrimeCheck {

	public static boolean isPrime(int num)
	{
		if(num<1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
		 if (num%i==0) {
			return false;
		}
			
				
	}
		return true;
	}
	public static void printPrime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrime(11));
printPrime(11);
	}

}
