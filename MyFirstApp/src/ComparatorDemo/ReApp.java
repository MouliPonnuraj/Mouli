package ComparatorDemo;
import java.util.*;
public class ReApp {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<Revenue>t=new TreeSet(new SortByAmount());
     t.add(new Revenue("Ninja",225000));
     t.add(new Revenue("JAWA",200000));
     t.add(new Revenue("BMW",356000));
     System.out.println(t);
	}

}
