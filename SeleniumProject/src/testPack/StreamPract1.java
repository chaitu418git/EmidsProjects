package testPack;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamPract1 {

	//print the count that starts with a
	@Test
	public void test1()
	{
		int count=0;
	ArrayList<String> list=new ArrayList<String>();
	list.add("abi");
	list.add("chaitu");
	list.add("arun");
	list.add("test");
	//list.
	//System.out.println(list);
	for(int i=0;i<list.size();i++)
	{
		String element=list.get(i);
		if(element.startsWith("a"))
		{
			count++;
			System.out.println(element);
			
		}
		//System.out.println(list.get(i).startsWith("a"));
	}
	System.out.println(count);
	
	}
	
	@Test
	public void test2()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("abi");
		list.add("chaitu");
		list.add("arun");
		list.add("test");
		long l = list.stream().filter(s->s.startsWith("a")).count();
	System.out.println(l);
	//list.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	list.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
	//list.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
	}

}
