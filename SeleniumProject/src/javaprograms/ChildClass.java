package javaprograms;

public class ChildClass extends ParentClass{
int a=20;
	public void action()
	{
		System.out.println("cc action");
	}
	public void gear() {
		System.out.println("cc gear");
	}
	public void specific()
	{
		System.out.println("cc specific");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc=new ChildClass();
		pc.action();
		pc.gear();
		pc.vehicle();
		System.out.println(pc.a);
	
		ChildClass cc=new ChildClass();
		cc.action();
		cc.gear();
		cc.specific();
		System.out.println(cc.a);
			ParentClass pc1=new ParentClass();
		pc1.action();
		pc1.gear();
		pc1.vehicle();
		//pc1.
		//ChildClass cc1=new ParentClass();
	}

}
