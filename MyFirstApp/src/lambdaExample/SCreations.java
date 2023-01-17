package lambdaExample;
import java.util.stream.*;
public class SCreations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stream.Builder<String> builder=Stream.builder();
      Stream stream=builder
    		  .add("coffee").add("Pappaya").add("Mango").add("Orange").add("Strawberry").build();
           stream.forEach(System.out::println);
	}

}
