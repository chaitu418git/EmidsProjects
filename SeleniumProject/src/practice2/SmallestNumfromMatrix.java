package practice2;

public class SmallestNumfromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
		int min=abc[0][0];
		int mincolumn=0;
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;
				}
			}
		}
		System.out.println(min);
		System.out.println(mincolumn);
		int max=abc[0][mincolumn];
		int k=0;
		while(k<abc.length)
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
