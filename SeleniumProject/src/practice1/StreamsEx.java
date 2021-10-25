package practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx {
	int id;
	String name;
	float price;
	public StreamsEx(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StreamsEx> list=new ArrayList<StreamsEx>();
		list.add(new StreamsEx(1,"HP",24000));
		list.add(new StreamsEx(1,"DELL",64000));
		list.add(new StreamsEx(1,"ACER",34000));
		list.add(new StreamsEx(1,"MI",44000));
		float sum=0;
		for(StreamsEx products:list)
		{
			sum=sum+products.price;
//			if(products.price<45000)
//			{
//			System.out.println(products.price);
//			}
		}
		System.out.println(sum);
//System.out.println(list.);		

		list.stream().filter(s->s.price>30000).forEach(s->System.out.println(s.price));
		List<StreamsEx> filteprice = list.stream().filter(s->s.price<35000).collect(Collectors.toList());
		
		System.out.println(filteprice.stream().collect(Collectors.summingDouble(s->s.price)));
		list.stream().collect(Collectors.summingDouble(s->s.price));
		Double total = list.stream().collect(Collectors.summingDouble(s->s.price)); 
		System.out.println(total);
	}

}
