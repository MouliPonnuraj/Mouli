package ThreadDemo;

public class MultiThread extends Thread {
	String name;
	String address;
	public void getdetails(){
		this.name="Mouli";
		this.address="Rv avenue";
	}
	public void run(){
		synchronized(this){
			getdetails();
			System.out.println(Thread.currentThread().getName());
			System.out.println("The person name is : "+name);
			System.out.println("the address is : "+address);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultiThread e= new  MultiThread();
		 e.start();
		 MultiThread m1=new  MultiThread();
		 m1.start();
		 MultiThread m2=new  MultiThread();
		 m2.start();
	}

}
