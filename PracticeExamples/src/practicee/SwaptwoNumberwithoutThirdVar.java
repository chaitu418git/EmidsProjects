package practicee;

public class SwaptwoNumberwithoutThirdVar {

	public static void main(String[] args) {
		int x=5;
		int y=6;
		System.out.println("before swap"+x+""+y);
		x=x+y;//11
		y=x-y;//5
		x=x-y;//6
		System.out.println("after swap"+x+""+y);
	}

}
