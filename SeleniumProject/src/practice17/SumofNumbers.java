package practice17;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123451;
int sum=0;
while(num>0)
{
	sum=sum+num%10;
	num=num/10;
}
System.out.println(sum);
	}

}
