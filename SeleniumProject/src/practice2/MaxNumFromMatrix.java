package practice2;

public class MaxNumFromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
		int max=abc[0][0];
		int maxcolumn=0;
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
					maxcolumn=j;
				}
				//System.out.println(max);
			}
			//System.out.println(max);	
		}
		System.out.println(max);
		System.out.println(maxcolumn);
		int min=abc[0][maxcolumn];
		int k=0;
		while(k<abc.length)
		{
			if((abc[k][maxcolumn]<min))
			{
				min=abc[k][maxcolumn];
			}
			k++;
		}
		System.out.println(min);
	}

}
