package practice10;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  num=1247641931;
int evenum=0;
int oddnum=0;
while(num>0)
{
	int r=num%10;
	if(r%2==0)
	{
		evenum++;
	}
	else
	{
		oddnum++;
	}
	num=num/10;
}
System.out.println(evenum);
System.out.println(oddnum);
	}

}
