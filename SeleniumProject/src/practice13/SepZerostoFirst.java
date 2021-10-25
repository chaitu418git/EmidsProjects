package practice13;

import java.util.Arrays;

public class SepZerostoFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,10,0,2,4,0,5,0,6};
int counter=a.length-1;
for(int i=a.length-1;i>=0;i--)
{
	if(a[i]!=0)
	{
		a[counter]=a[i];
		counter--;
	}
}
while(counter>=0)
{
	a[counter]=0;
	counter--;
}
System.out.println(Arrays.toString(a));
	}

}
