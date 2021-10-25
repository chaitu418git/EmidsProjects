package practice12;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=742265438;
int evenum=0;
int oddnum=0;
int r;
while(num>0)
{
	r=num%10;
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
