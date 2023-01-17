package ThreadDemo;
import java.util.*;
public class IntrestDetails extends Thread {
   public void sIntrest(){
	   float Sin=(200*5/5);
	   System.out.println("Intrest is:"+Sin); 
	   
   }
   public void run(){
	   sIntrest();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
