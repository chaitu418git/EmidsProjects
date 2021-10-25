package practice2;

public class EqulityoftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a1= {1,2,3,14};
int[] a2= {1,2,3,4};
boolean status=true;
if(a1.length==a2.length)
{
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]!=a2[i])
		{
			status=false;
		}
	}
}
else
{
	status=false;
}
if(status==true)
{
	System.out.println("arrays are equal");
}
else
{
	System.out.println("arrays are not equal");
}
	}

}
