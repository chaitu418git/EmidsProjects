package programsPract;

public class ArrayCommonNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a1= {1,4,5,2,6,8,9};
int []a2= {5,10,45,2,35,1};
for(int i=0;i<a1.length;i++)
{
	for(int j=0;j<a2.length;j++)
	{
		if(a1[i]==a2[j])
		{
			System.out.println(a1[i]);
			break;
		}
	}
}
	}

}
