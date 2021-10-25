package javaprograms;

import java.util.ArrayList;

public class CountofreeatednumbersFromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,3,4,5,3,3,4,6,5,1,2};
		ArrayList al=new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		int k=0;
		if(!al.contains(a[i]))
		{
			al.add(a[i]);
			k++;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			System.out.println(a[i]+""+k);
			if(k==1)
				System.out.println(a[i]);
		}
	}
		
	}

}
