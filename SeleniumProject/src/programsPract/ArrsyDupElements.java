package programsPract;

public class ArrsyDupElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a1= {1,4,5,1,6,8,7,6,0};
for(int i=0;i<a1.length;i++)
{
	for(int j=i+1;j<a1.length;j++)
	{
		if(a1[i]==a1[j])
		{
			System.out.println(a1[i]);
		}
	}
}
	}

}
