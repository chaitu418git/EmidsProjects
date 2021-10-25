package practice4;

public class MaxNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {10,20,100,150,50};
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
