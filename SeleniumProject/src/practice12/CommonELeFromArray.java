package practice12;

public class CommonELeFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1= {1,3,4,6};
int[] array2= {2,1,4,5,6,7};
for(int i=0;i<array1.length;i++)
{
	for(int j=0;j<array2.length;j++)
	{
		if(array1[i]==array2[j])
		{
			System.out.println(array1[i]);
		}
	}
}
	}

}
