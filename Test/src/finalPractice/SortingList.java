package finalPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortingList{

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Employee("chaitu", 29, 3000));
		list.add(new Employee("chaitu", 28, 3000));
		list.add(new Employee("chaitu", 21, 3000));
		System.out.println(list);
		Collections.sort(list, new AgeComparator());
		System.out.println(list);

	}

}
