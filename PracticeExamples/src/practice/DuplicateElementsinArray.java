package practice;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,1,4,6,7,6};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if((array[i]==array[j]) && (i!=j))
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
