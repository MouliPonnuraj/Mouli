package lambdaExample;
import java.util.*;
import java.util.stream.*;

public class StreamC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             List<Integer>n=new ArrayList();
             n.add(11);
             n.add(12);
             n.add(19);
             n.add(23);
             n.add(45);
             n.add(56);
             n.add(79);
             Stream<Integer>Stream=n.stream();
             System.out.println(stream.anyMatch((a,b)->a.compareTo(b)).get());
	}

}
