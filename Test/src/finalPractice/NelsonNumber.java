package finalPractice;

public class NelsonNumber {

	
	public static void printNelsonNumbers(int  num)
	{
		int num1=1000/10;
	
	
		int nelsonnumber=num+111;
		for(int i=1;i<=9;i++)
		{
			System.out.println(nelsonnumber*i);
		}
	}
	public static void main(String[] args) {
		printNelsonNumbers(1000);
//		int num=100;
//		int nelsonnumber=100+11;
//		for(int i=1;i<=9;i++)
//		{
//			System.out.println(nelsonnumber*i);
//		}
	}

}
