package javaprograms;

public class Pyramidex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print("j"+j);
			}
			System.out.println("");
		}
	}

}
