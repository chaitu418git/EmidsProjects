package streamsexamples;

import java.util.stream.Stream;

//import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.Limit;

public class StreamsIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream.iterate(1, s->s+1).limit(5).forEach(s->System.out.println(s));
System.out.println("---------");
Stream.iterate(1, s->s+1).filter(s->s%5==0).limit(5).forEach(s->System.out.println(s));
	
System.out.println("---------------");
	System.out.println(1%5==0);
	System.out.println(2%5==0);
	System.out.println(3%5==0);
	System.out.println(4%5==0);
	System.out.println(5%5==0);
	
	
	}

}
