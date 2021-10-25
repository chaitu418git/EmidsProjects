package javaprograms;

public class MethodOverriding {
public void map()
{
	System.out.println("method without args");
}
public void map(String a,int b)
{
	System.out.println("methid with string args");
}
public void map(int a, String b)
{
	System.out.println("methid with int args");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverriding mo=new MethodOverriding();
mo.map();
mo.map(4, "b");
mo.map("b", 5);

	}

}
