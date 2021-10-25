package practice3;

public class CountNumOfDigitsInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1224569;
int count=0;
while(num>0)
{
	num=num/10;
	count++;
}
System.out.println(count);
	}

}
