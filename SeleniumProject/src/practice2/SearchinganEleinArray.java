package practice2;

public class SearchinganEleinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {10,20,30,40,50};
int search_ele=50;
boolean flag=false;
for(int i=0;i<array.length;i++)
{
	if(search_ele==array[i])
	{
		System.out.println("Found the search eleement"+array[i]+"at position"+i);
		flag=true;
	}
}
if(flag==false)
{
	System.out.println("not found the search elemnt");
}
	}

}
