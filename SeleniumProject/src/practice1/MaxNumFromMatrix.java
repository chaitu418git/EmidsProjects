package practice1;

public class MaxNumFromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
		int max=abc[0][0];
		int maxColumn=0;
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
					maxColumn=j;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxColumn);
		
		//now print min value from that column
		int min=abc[0][maxColumn];
		int k=0;
		while(k<abc.length)
		{
			if(abc[k][maxColumn]<min)
			{
				min=abc[k][maxColumn];
			}
			k++;
		}
		System.out.println(min);
				
	}

}
