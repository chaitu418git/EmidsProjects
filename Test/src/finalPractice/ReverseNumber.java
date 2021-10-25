package finalPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123456;
		int revnum=0;
		while(num>0)
		{
			revnum=(revnum*10)+(num%10);
			num=num/10;
		}
		System.out.println(revnum);

	}

}
