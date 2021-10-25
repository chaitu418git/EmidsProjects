package practice;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * This program demonstrates how to sort list collections in Java.
 * @author www.codejava.net
 *
 */
public class JavaListSortingExamples {

	public static void main(String[] args) {
		System.out.println("===== SORTING A LIST OF STRINGS =====");
		
		List<String> listStrings = Arrays.asList("Orange", "Grape", "Apple", "Lemon", "Banana");
		
		System.out.println("Before sorting: " + listStrings);
		
		Collections.sort(listStrings);
		
		System.out.println("After sorting: " + listStrings);
		
		
		System.out.println("\n===== SORTING A LIST OF CHARACTERS =====");
		
		List<Character> listCharacters = Arrays.asList('F', 'C', 'A', 'B', 'Z', 'E', 'K', 'P');
		
		System.out.println("Before sorting: " + listCharacters);
		
		Collections.sort(listCharacters);
		
		System.out.println("After sorting: " + listCharacters);
		

		System.out.println("\n===== SORTING A LIST OF INTEGERS =====");
		
		List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
		
		System.out.println("Before sorting: " + listIntegers);
		
		Collections.sort(listIntegers);
		
		System.out.println("After sorting: " + listIntegers);
		
		
		System.out.println("\n===== SORTING A LIST OF DATES =====");
		List<Date> listDates = new ArrayList<Date>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			listDates.add(dateFormatter.parse("2013-09-30"));
			listDates.add(dateFormatter.parse("2013-07-06"));
			listDates.add(dateFormatter.parse("2013-11-28"));
		} catch (ParseException ex) {
			System.err.print(ex);
		}
		
		System.out.println("Before sorting: " + listDates);
		
		Collections.sort(listDates);
		
		System.out.println("After sorting: " + listDates);
		

		System.out.println("\n===== REVERSING ORDER =====");
		
		System.out.println("Before sorting: " + listIntegers);
		
		Collections.sort(listIntegers);
		
		System.out.println("After sorting: " + listIntegers);		
		
		Collections.reverse(listIntegers);
		
		System.out.println("After reversing: " + listIntegers);
		
		
		
		System.out.println("\n===== SORTING A LIST OF CUSTOM TYPES =====");
		
		List<Employee> listEmployees = new ArrayList<Employee>();
		
		listEmployees.add(new Employee("Tom", 45, 80000));
		listEmployees.add(new Employee("Sam", 56, 75000));
		listEmployees.add(new Employee("Alex", 30, 120000));
		listEmployees.add(new Employee("Peter", 25, 60000));
		
		System.out.println("Before sorting: " + listEmployees);
		
		Collections.sort(listEmployees);
		
		System.out.println("After sorting: " + listEmployees);
		
		System.out.println("\n===== SORTING A LIST USING A COMPARATOR =====");
		
		Collections.sort(listEmployees, new EmployeeAgeComparator());
		
		System.out.println("After sorting: " + listEmployees);
		
	}
}