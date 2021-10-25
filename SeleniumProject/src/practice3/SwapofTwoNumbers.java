package practice3;

public class SwapofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
//Approrach 1
/*int temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);*/

//Aproach 2
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);

	}

}
