package practice;

public class CommonElementInArray {

	public static void main(String[] args) {
		int [] array1= {1,3,4,5,7,88,9};
		int [] array2= {1,30,4,9,7,88,50};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array2[j]);
				}
			}
		}
		

	}

}
