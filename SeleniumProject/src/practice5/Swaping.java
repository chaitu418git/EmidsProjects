package practice5;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
//Aprroach 1
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
