package practice12;

import java.util.Arrays;

public class SeperateZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,0,0,2,4,0,5,0,6};
int counter=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
	a[counter]=a[i];
    
	counter++;
	}
}
while(counter<a.length)
{
	a[counter]=0;
	counter++;
}
System.out.println(Arrays.toString(a));
	}

}
