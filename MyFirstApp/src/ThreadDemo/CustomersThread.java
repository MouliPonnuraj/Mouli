package ThreadDemo;

public class CustomersThread extends Thread{
     public void run(){
    	 try{
    		 String[] cust;
    		 double dis=27.5;
    		 Thread.sleep(2000);
    		 System.out.println("Ajay");
    		 System.out.println(dis);
    		 System.out.println(getName());
    	 }catch(InterruptedException e){
    		 System.out.println(e);
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomersThread t=new CustomersThread();
       Thread t1=new Thread(t);
       Thread t2=new Thread(t1);
       t.start();
       t1.start();
	}

}
