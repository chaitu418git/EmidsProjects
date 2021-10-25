package practice14;

public class CountNumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5304534;
int count=0;
while(num>0)
{
	num=num/10;
	count++;
}
System.out.println(count);
	}

}
