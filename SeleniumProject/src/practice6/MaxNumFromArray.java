package practice6;

public class MaxNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {{1,5,8},{2,10,3},{7,18,21}};
int max=array[0][0];
int mincolumn=0;
for(int i=0;i<array.length;i++)
{
	for(int j=0;j<array.length;j++)
	{
		if(array[i][j]>max)
		{
			max=array[i][j];
			mincolumn=j;
		}
	}
}
System.out.println(max);
System.out.println(mincolumn);
int min=array[0][mincolumn];
int k=0;
while(k<array.length)
{
	if(array[k][mincolumn]<min)
	{
		min=array[k][mincolumn];
	}
	k++;
}
System.out.println(min);
	}

}
