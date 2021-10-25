package practieTest;

public class ReverseaNumber {

	public static void main(String[] args) {
		int num=1234;
		int revnum=0;
		while(num>0)
		{
			revnum=(revnum*10)+(num%10);
			num=num/10;
		}
		System.out.println(revnum);
	}

}
