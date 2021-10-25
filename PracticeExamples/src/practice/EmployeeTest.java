package practice;

public class EmployeeTest {
private String name;
private int age;
private double salary;

public EmployeeTest(String name, int age, double salary)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
}

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setAge(int age)
{
	this.age=age;
}
public int getAge()
{
	return age;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
public double getSalary()
{
	return salary;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%s,%d,%f)", name,age,salary);
	}
}
