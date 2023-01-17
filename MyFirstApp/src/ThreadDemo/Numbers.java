package ThreadDemo;

public class Numbers extends Thread {
  public void run(){
	   try{
		  for(int i=1;i<15;i++){
			  Thread.sleep(3000);
			  System.out.println(i);
		  }
	   }catch(InterruptedException e){
		System.out.println(e);   
	   }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Numbers n=new Numbers();
      Thread t=new Thread(n);
      n.start();
	}

}
