package practice7;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class RepeatedNumberCountFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,4,5,7,1,4,6,5,7,8,9,12,4,5,4,3,2,31,91,2};
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<array.length;i++)
{
	int k=1;
	if(!list.contains(array[i]))
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j])
			{
				k++;
			}
		}
		System.out.println(array[i]+"--"+k);
	}
	
}
	}

}
