package practice10;

public class COuntNumDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=64562354;
int count=0;
while(num>0)
{
	num=num/10;
	count++;
}
System.out.println(count);
	}

}
