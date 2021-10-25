package practice15;

public class MaxNumFromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
int max=abc[0][0];
int minColumn=0;
for(int i=0;i<abc.length;i++)
{
	for(int j=0;j<abc.length;j++)
	{
		if(abc[i][j]>max)
		{
			max=abc[i][j];
			minColumn=j;
		}
	}
}
System.out.println(max);
System.out.println(minColumn);
int minvalue=abc[0][minColumn];
int k=0;
while(k<abc.length)
{
	if(abc[k][minColumn]<minvalue)
	{
		minvalue=abc[k][minColumn];
	}
	k++;
}
System.out.println(minvalue);
	}

}
