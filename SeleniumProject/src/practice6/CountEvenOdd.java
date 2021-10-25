package practice6;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12345671;
int evennum=0;
int oddnum=0;
while(num>0)
{
	int rem=num%10;
	if(rem%2==0)
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
