package practice17;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=7248032;
int evencount=0;
int oddcount=0;
int r;
while(num>0)
{
	r=num%10;
	if(r%2==0)
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
