package Mypack;

public class discount {
	void dis(int offer,int price){
	int finaldiscount=price-price*offer/100;
	System.out.println(finaldiscount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discount obj= new discount();
		obj.dis(150,2000);
		

	}

}
