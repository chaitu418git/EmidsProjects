package practice13;

public class MaxNumfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,10,5,7,11};

		int maxnum=array[0];
		for(int i=0;i<array.length;i++)
		{
		if(array[i]>maxnum
				)
		{
			maxnum=array[i];
		}
		}
		System.out.println(maxnum);
	
	}

}
