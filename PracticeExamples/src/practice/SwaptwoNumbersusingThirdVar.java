package practice;

public class SwaptwoNumbersusingThirdVar {

	public static void main(String[] args) {
		int x=5;
		int y=6;
		System.out.println("x"+x);
		System.out.println("y"+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x"+x);
		System.out.println("y"+y);
	}

}
