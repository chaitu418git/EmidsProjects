package streamsexamples;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stremsreduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(2);
list.add(4);
list.add(1);
list.add(5);


Integer price=list.stream().reduce(0, Integer::sum);
System.out.println(price);

Integer price1=list.stream().collect(Collectors.summingInt(s->s));
System.out.println(price1);
Integer max = list.stream().max((p1,p2)->p1>p2?1:-1).get();
System.out.println(max);


	}

}
