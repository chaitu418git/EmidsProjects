package practicee;

public class DuplicateElementsfromArray {

	public static void main(String[] args) {
		int[] array= {1,3,1,4,5,4,6,7,5};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
