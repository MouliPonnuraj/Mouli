package Mypack;

public class MyTicket {
 String source;
 String destination;
 double price;
 MyTicket( String n,String d, double rs){
	 source=n;
	 destination=d;
	 price=rs;
	  }
 void display(){
	 System.out.println(source+""+destination);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTicket rs =new MyTicket("Coimbatore to","Chennai",345.56);
		System.out.println("source:"+rs.source);
		System.out.println("Destination:"+rs.destination);
		System.out.println("total price-"+rs.price);

	}

}
