package practice11;

public class EvenandOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=87472741;
int evencount=0;
int oddcount=0;
while(num>0)
{
	num=num/10;
	if(num%2==0)
	{
		evencount++;
	}
	else {
		oddcount++;
	}
	//num=num/10;
}
System.out.println(evencount);
System.out.println(oddcount);
	}

}
