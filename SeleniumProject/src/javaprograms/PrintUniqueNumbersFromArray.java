package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintUniqueNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,2,3,4,5,4,6,5,1,2};
HashSet s= new HashSet();
for(int i=0;i<a.length;i++)
{
	s.add(a[i]);
}
System.out.println(s);

//ArrayList al=new ArrayList();
//for(int i=0;i<a.length;i++)
//{
//	if(!al.contains(a[i]))
//	{
//		al.add(a[i]);
//		System.out.println(a[i]);
//	}
//}

ArrayList ab=new ArrayList();
for(int i=0;i<a.length;i++)
{
	int k=0;
	if(ab.contains(a[i]))
	{
		k++;
//		ab.add(a[i]);
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i]==a[j]) {
//				k++;
//			}
//			System.out.println(a[i]+""+k);
//		}
		
	}
	System.out.println(ab.get(i)+""+k);
}

	}
}
