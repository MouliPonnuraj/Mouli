package LamdaDemo;
import java.util.*;
import java.util.stream.*;
public class FlatmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List n=Arrays.asList("cat","Lion","Tiger","Cheetah");
      List n1 = Arrays.asList("dog","Wolf","Fox");
      List n2 =Arrays.asList("Wolf","lion","Bear");
      Stream<List<String>> a= Stream.of(n,n1,n2);
      a.flatMap((c)->c.stream()).sorted().distinct().forEach(System.out::println);
	}

}
