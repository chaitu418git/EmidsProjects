package practice12;

public class DuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {1,2,4,1,5,2,7,8,4};
for(int i=0;i<array.length;i++)
{
	for(int j=i+1;j<array.length;j++)
	{
		if(array[i]==array[j])
		{
			System.out.println(array[i]);
		}
	}
}
	}

}
