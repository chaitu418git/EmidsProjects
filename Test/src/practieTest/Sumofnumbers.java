package practieTest;

public class Sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  num=1234;
int sum=0;
int sumcheck;
while(num>0)
{
	sumcheck=num%10;
	sum=sum+sumcheck;
	num=num/10;
}
System.out.println(sum);
	}

}
