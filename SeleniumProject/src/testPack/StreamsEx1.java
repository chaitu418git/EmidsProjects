package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsEx1 {

	@Test
	public void test()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("abi");
		list.add("chaitu");
		list.add("arun");
		list.add("test");
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			String actual=list.get(i);
			if(actual.startsWith("a"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void test1()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("abi");
		list.add("chaitu");
		list.add("arun");
		list.add("test");
		long cou = list.stream().filter(s->s.startsWith("a")).count();
		System.out.println(cou);
		
		long c=Stream.of("abi","chaitu","arun","test").filter(s->
		{
			s.startsWith("a");
			s.contains("abi");
			return true;
		}).count();
		System.out.println(c);
		
		//print the names whose lenghth is >3
		list.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		//print names ends with i with upeer case leters
		Stream.of("ani","king","abi","jack").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	 //print names starts with a with upper case and with sorted
		Stream.of("ani","king","abi","jack").filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	@Test
	public void streamCollect()
	{
		List ls=Stream.of("ani","king","abi","jack").filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer> list=Arrays.asList(1,3,4,5,1,3,5,65,5,4,6);
		//print unique numbers from this list and sort the array
		list.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
	}
}


