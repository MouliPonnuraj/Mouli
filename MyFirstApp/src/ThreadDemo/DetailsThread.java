package ThreadDemo;

public class DetailsThread  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustDetails d=new CustDetails();
		IntrestDetails i=new IntrestDetails();
		d.start();
		i.start();
	}

	
}
