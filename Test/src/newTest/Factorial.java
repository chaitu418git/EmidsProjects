package newTest;

public class Factorial {
	
	public static void  getFactorialValues(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void getFactorialvalueForAGivenNumber(int num)
	{
		int factnum=num;
		int i=0;
		do {
			i++;
			//for(int i=)
			factnum=factnum/i;
			
		}while(factnum>1);
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFactorialValues(5);
		getFactorialvalueForAGivenNumber(120);
	}

}
