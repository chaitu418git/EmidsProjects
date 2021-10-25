package practice3;

public class CountEvenandOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  num=1234567;
int evencount=0;
int oddcount=0;
int rem;
while(num>0)
{
	rem=num%10;
	
	if(rem%2==0)
	{
		//System.out.println(rem);
		evencount++;
	}
	else
	{
		//System.out.println(rem);
		oddcount++;
	}
	num=num/10;
}
System.out.println(evencount);
System.out.println(oddcount);

	}

}
