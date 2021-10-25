package hashMapPractice;

public class Employee { 
	 String name;
	 int age;
	 int salary;
public Employee(String name, int age, int salary)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
}
@Override
public String toString() {
	return String.format("(%s,%d,%d)",name,age,salary);
	
}
}
