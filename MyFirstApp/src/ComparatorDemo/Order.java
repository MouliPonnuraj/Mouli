package ComparatorDemo;
import java.util.*;
public class Order {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NavigableSet<Integer> ns=new TreeSet<Integer>();
     ns.add(23);
     ns.add(45);
     ns.add(11);
     ns.add(19);
     ns.add(55);
     ns.add(22);
     ns.add(10);
     ns.add(32);
     System.out.println(ns.higher(52));
     System.out.println(ns.lower(23));
     System.out.println(ns.floor(15));
     System.out.println(ns.ceiling(20));
	}

}
