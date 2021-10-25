package javaConcepts;

public class ChildClass extends ParentClass{
int i=10;
String test="child";
public void p1()
{
	System.out.println("p1 method of child");
}
public void c1()
{
	System.out.println("c1 method of child");
}
public void c2()
{
	System.out.println("c2 method of child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildClass cc=new ChildClass();
System.out.println(cc.i);
System.out.println(cc.test);
cc.p1();
cc.c1();
cc.c2();
cc.p2();
ParentClass pc=new ParentClass();
System.out.println(pc.i);
System.out.println(pc.test);
pc.p1();
pc.p2();
//ChildClass cref=new ParentClass();
ParentClass pref=new ChildClass();
System.out.println(pref.i);
System.out.println(pref.test);
pref.p1();
pref.p2();
	}

}
