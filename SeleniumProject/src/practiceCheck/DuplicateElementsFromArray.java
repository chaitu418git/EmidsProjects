package practiceCheck;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,5,6,8,9,1,2,9,10};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
					System.out.println(arr1[i]);
			}
		}
	}

}
