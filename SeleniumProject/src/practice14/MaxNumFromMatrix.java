package practice14;

public class MaxNumFromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
		int max=abc[0][0];
		int mincolumn=0;
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
					 mincolumn = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(mincolumn);
		int min=abc[0][mincolumn];
		int k=0;
		while(k<abc.length)
		{
			if(abc[k][mincolumn]<min)
			{
				min=abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(min);
	}

}
