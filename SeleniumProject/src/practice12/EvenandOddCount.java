package practice12;

public class EvenandOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=87472741;
int evecount=0;
int oddcount=0;
int rem;
while(num>0)
{
	rem=num%10;
	if(rem%2==0)
	{
		evecount++;
	}
	else
	{
		oddcount++;
	}
	num=num/10;
}
System.out.println(evecount);
System.out.println(oddcount);
	}

}
