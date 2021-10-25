package practice3;

public class MinNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,10,5,7,11};
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
