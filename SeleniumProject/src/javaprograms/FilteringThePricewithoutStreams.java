package javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringThePricewithoutStreams {
	int id;
	String name;
	float price;
	public FilteringThePricewithoutStreams(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FilteringThePricewithoutStreams> list=new ArrayList<FilteringThePricewithoutStreams>();
		list.add(new FilteringThePricewithoutStreams(1,"HP",25000));
		list.add(new FilteringThePricewithoutStreams(1,"lenevo",26000));
		list.add(new FilteringThePricewithoutStreams(1,"dell",45000));
		list.add(new FilteringThePricewithoutStreams(1,"MI",35000));
		ArrayList<Float> list1=new ArrayList<Float>();
		for(FilteringThePricewithoutStreams product:list)
		{
			if(product.price<30000)
				list1.add(product.price);
		}
		//System.out.println(list1);
		
		list.stream().filter(s->s.price<30000).forEach(s->System.out.println(s.price));
		List<Float> prodlist = list.stream().filter(s->s.price>30000).map(s->s.price).collect(Collectors.toList());
		System.out.println("-----");
		System.out.println(prodlist);
		
		Float pricing=list.stream().map(s->s.price).reduce(0.0f,Float::sum);
		System.out.println("-------");
		System.out.println(pricing);
		
		//list.stream().collect(Collectors.summingDouble(s-)
				Double prices= list.stream().collect(Collectors.summingDouble(s->s.price)); 
				System.out.println("-----------");
				System.out.println(prices);
				
			//	list.stream().filter(predicate)
				 
			System.out.println("-----");	 
	list.stream().collect(Collectors.summingDouble(s->s.price));
				 
			
		

	}

}
