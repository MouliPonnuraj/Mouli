package ThreadDemo;

public class JoinThread {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try{
	   CharacterThread c1=new CharacterThread();
	   NumThread n1=new NumThread();
	   c1.start();
	   c1.join();
	   n1.start();
   }
   catch(Exception e){
	   System.out.println(e);
   }
	}

}
