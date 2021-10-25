package practice15;

import java.util.ArrayList;

public class CountNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,4,5,1,3,52,4,5,6,2,1,8,3,8,5};
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<array.length;i++)
{
	int k=1;
	if(!list.contains(array[i]))
			{
             list.add(array[i]);
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
