package javaprograms;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1234
 *567
 *89
 *10
 */
		int k=1;
		for(int i=0;i<4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

}
