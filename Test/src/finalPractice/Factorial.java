package finalPractice;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		int factnumber=120;
		
		int i=0;
		do {
			i++;
			factnumber=factnumber/i;
		}while(factnumber>1);
		System.out.println(i);

	}

}
