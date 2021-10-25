package practice8;

public class Primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=8;
int count=0;
if(num>1)
{
	
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("given numis prime");
	}
	else
	{
		System.out.println("given num is not prime");
	}
}
else
{
	System.out.println("please eneter the number that is greater than 1");
}
	}

}
