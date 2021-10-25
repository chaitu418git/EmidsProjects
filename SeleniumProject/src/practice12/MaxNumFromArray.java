package practice12;

public class MaxNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,10,5,7,11};
int max=array[0];
for(int i=0;i<array.length;i++)
{
	if(array[i]>max)
	{
		max=array[i];
	}
}
System.out.println(max);
	}

}
