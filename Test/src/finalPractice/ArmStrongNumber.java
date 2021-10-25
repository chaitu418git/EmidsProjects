package finalPractice;

public class ArmStrongNumber {

	public static int checkArmStrongNumber(int num)
	{
		int r=0;
		int cube=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		return cube;
	}
	public static void main(String[] args) {
		int retnumber=checkArmStrongNumber(153);
		System.out.println(retnumber);
	}

}
