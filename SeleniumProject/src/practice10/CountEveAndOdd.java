package practice10;

public class CountEveAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=743276411;
int evecount=0;
int oddcount=0;
while(num>0)
{
	int r=num%10;
	if(r%2==0)
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
