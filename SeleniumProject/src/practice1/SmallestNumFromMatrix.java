package practice1;

public class SmallestNumFromMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{5,6,4},{8,10,6},{9,0,1}};
		int min=abc[0][0];
		int mincolumn=0;
		System.out.println(abc.length);
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
			//System.out.println(min);
		}
		System.out.println(min);
		System.out.println(mincolumn);
		//now print max from that column
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
