package practieTest;

public class DuplicateElementsinArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] i1= {1,3,2,4,5,61,1,3,5,10,1};


for(int i=0;i<i1.length;i++)
{
	for(int j=i+1;j<i1.length;j++)
	{
		if(i1[i]==i1[j])
		{
			System.out.println(i1[i]);
		}
	}
}
	}

}
