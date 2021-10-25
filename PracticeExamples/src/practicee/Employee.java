package practicee;

import javax.smartcardio.ATR;

public class Employee {

	String name;
	int age;
	int salary;
	public Employee(String name,int age, int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  String.format("(%s,%d,%d)", name,age,salary);
	}

}
