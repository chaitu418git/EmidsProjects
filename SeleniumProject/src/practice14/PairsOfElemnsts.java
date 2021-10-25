package practice14;

public class PairsOfElemnsts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int [] array= {4,6,5,-10,8,5,20};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==num)
				{
					System.out.println(array[i]+"--"+array[j]+"--"+num);
				}
			}
		}
	}

}
