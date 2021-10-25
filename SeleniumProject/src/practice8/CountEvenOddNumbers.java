package practice8;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234567891;
int evennum=0;
int oddnum=0;
int r;
while(num>0)
{
	r=num%10;
	if(r%2==0)
	{
		evennum++;
	}
	else
	{
		oddnum++;
	}
	num=num/10;
}
System.out.println(evennum);
System.out.println(oddnum);
	}

}
