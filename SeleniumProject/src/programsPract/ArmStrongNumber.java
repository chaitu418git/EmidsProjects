package programsPract;

public class ArmStrongNumber {
public static int checkArmStrongNumber(int num)
{
	int cube=0;
	while(num>0)
	{
		int r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
	return cube;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkArmStrongNumber(153));
	}

}
