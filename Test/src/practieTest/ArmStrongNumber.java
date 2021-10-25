package practieTest;

public class ArmStrongNumber {

	public static int checkArmstrongNumber(int num)
	{
		
		int r=0;
		int cube=0;
		while(num>0)
		{
	 r=(num%10);
	num=num/10;
	 cube=cube+(r*r*r);
	}
		return cube;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkArmstrongNumber(153));
	}


}