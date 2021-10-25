package practice2;

public class SwapofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
//logic 1
//int temp=a;
//a=b;
//b=temp;
//System.out.println("a is"+a);
//System.out.println("b is"+b);

//logic 2
a=a+b;
b=a-b;
a=a-b;
System.out.println("a is"+a);
System.out.println("b is"+b);
	}

}
