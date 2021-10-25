package practice3;

public class EqualityofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,3,4,5};
		boolean status=true;
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]!=array2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			System.out.println("arrays lengths are not equal");
		}
		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("Arraysvare not equal");
		}

	}

}
