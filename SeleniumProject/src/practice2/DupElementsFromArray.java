package practice2;

public class DupElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,4,6,1,8,9,2,4,6,90};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]==array1[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	}

}
