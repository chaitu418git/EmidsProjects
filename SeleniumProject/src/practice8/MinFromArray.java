package practice8;

public class MinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,50,80,5,100};
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
