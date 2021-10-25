package practice8;

public class SwapNumbers {
	public static void main(String[] args) {

int a=10;
int b=20;
//Approach 1

//int temp=a;
//a=b;
//b=temp;
//System.out.println(a);
//System.out.println(b);

//Approach 2
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
}
}