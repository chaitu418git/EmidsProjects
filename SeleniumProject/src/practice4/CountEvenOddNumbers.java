package practice4;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12345967;
int evencount=0;
int oddcount=0;
int rem;
while(num>0)
{
	rem=num%10;
	if(rem%2==0)
	{
		evencount++;
	}
	else
	{
		oddcount++;
	}
	num=num/10;
}
System.out.println(evencount);
System.out.println(oddcount);
	}

}
