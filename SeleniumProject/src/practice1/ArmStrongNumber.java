package practice1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  num=14;
int cube=0;
int r;
while(num>0)
{
	r=num%10;
	num=num/10;
	cube=cube+(r*r*r);
}
System.out.println(cube);
	}

}
