package practice;

public class ArrayEx1 {

	public static void main(String[] args) {
		//String[] s= {"1","2","3","4","5"};
		
		int[] input= {1,2,3,4,5,6,7,8,9,10};
		int lessThanCount=0;
		int greateThanCount=0;
		int lesstahnfive[]= new int[5];
		int greaterthanfive[]= new int[5];
		int finalArray[]=new int[10];
		int finalCount=0;
		for(int i=input.length-1;i>=0;i--)
		{
			if(input[i]>5)
			{
				greaterthanfive[greateThanCount]=input[i];
				greateThanCount++;
				
			}
			else
			{
				lesstahnfive[lessThanCount]=input[i];
				lessThanCount++;
			}
		}
//		System.out.println(lesstahnfive.);
//		System.out.println(greaterthanfive);
	for(int i=0;i<lesstahnfive.length;i++)
	{
		finalArray[finalCount]=lesstahnfive[i];
	}
	for(int j=0;j<greaterthanfive.length;j++)
	{
		finalArray[finalCount]=greaterthanfive[j];
	}
for(int i=0;i<finalArray.length;i++)
{
	System.out.println(finalArray[i]);
}
	}

}
