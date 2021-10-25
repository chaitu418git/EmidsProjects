package practice5;

public class MinValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {5,6,7,9,1,5};
int min=array[0];
for(int i=0;i<array.length;i++)
{
	if(array[i]<min)
	{
		min=array[i];
	}
}
System.out.println(min);
	}

}
