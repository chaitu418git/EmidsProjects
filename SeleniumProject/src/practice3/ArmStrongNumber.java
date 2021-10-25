package practice3;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int cube=0;
int rem;
while(num>0)
{
	rem=(num%10);
	num=num/10;
	cube=cube+(rem*rem*rem);
}
System.out.println(cube);
	}

}
