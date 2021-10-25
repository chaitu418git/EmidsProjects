package javaprograms;

public class CC extends PC{

	String name="Child";
	public void action()
	{
		
		System.out.println("child class action");
		super.action();
	}
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CC c=new CC();
c.action();
c.getStringData();
//System.out.println(c.name);
//System.out.println(super.name);
//PC p=new CC();
//p.action();
//System.out.println(p.name);

	}

}
