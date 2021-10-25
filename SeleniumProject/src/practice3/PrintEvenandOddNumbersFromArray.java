package practice3;

public class PrintEvenandOddNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
for(int i=0;i<array1.length;i++)
{
	if(array1[i]%2==0)
	{
		System.out.println(array1[i]);
	}
}

for(int i=0;i<array1.length;i++)
{
	if(array1[i]%2!=0)
	{
		System.out.println(array1[i]);
	}
}
	}

}
