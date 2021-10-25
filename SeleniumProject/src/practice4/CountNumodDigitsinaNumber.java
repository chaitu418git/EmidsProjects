package practice4;

public class CountNumodDigitsinaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12345679;
int count=0;
while(num>0)
{
	System.out.println(num);
	num=num/10;
	count++;
}
System.out.println(count);
	}

}
