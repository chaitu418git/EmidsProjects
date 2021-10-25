package javaprograms;

public class SmallestNumfromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
int min=abc[0][0];
int mincolumn=0;
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		if(abc[i][j]<min)
		{
			min=abc[i][j];
		mincolumn=j;
		}
		
	}
}
System.out.println("smallest numn"+min);
System.out.println(mincolumn);
int max=abc[0][mincolumn];
int k=0;
while(k<3)
{
	if(abc[k][mincolumn]>max)
	{
		max=abc[k][mincolumn];
	}
	k++;
}
System.out.println(max);
	}

}
