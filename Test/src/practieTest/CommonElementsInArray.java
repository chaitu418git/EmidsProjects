package practieTest;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] i1= {1,2,3,4,5};
int[] i2= {9,8,2,7,1,4};
for(int i=0;i<i1.length;i++)
{
	for(int j=0;j<i2.length;j++)
	{
		if(i1[i]==i2[j])
		{
			System.out.println(i1[i]);
		}
	}
}
	}

}
