package practice;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmployeeTest> {

	@Override
	public int compare(EmployeeTest emp1, EmployeeTest emp2) {
		// TODO Auto-generated method stub
		return emp1.getAge() - emp2.getAge();
		
	}

}
