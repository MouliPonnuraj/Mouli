package ComparatorDemo;
import java.util.*;
  public class SortByName implements Comparator<Revenue>{
	  public int compare(Revenue r1,Revenue r2){
		  return r1.revenueName.compareTo(r2.revenueName);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
