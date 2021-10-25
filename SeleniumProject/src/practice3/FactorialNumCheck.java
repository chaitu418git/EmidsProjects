package practice3;

public class FactorialNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//code to print which factorial value is a given number
		int num=120;
		int i=0;
		do {
			i++;
			num=num/i;
			//i++;
		} while (num>1);
		System.out.println(i);
	}

}
