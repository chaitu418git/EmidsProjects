package practice15;

public class AlternativeElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array={23,43,54,63,73,83,92,13,56};
for(int i=0;i<array.length;i=i+2)
{
	System.out.println(array[i]);
}
System.out.println("----");
for(int i=1;i<array.length;i=i+2)
{
	System.out.println(array[i]);
}
	}

}
