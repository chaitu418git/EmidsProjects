package newPractice;

public class Factorial {
	
	public static int number(int factorial) {
        int i = 0;
        do {
        	System.out.println("before"+i);
            i++;
            System.out.println("after"+i);
            factorial = factorial / i;
        } while (factorial > 1);
        return i;
	}

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
System.out.println(fact);

System.out.println(number(fact));



	}

}
