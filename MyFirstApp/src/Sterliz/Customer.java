package Sterliz;
import java.io.*;
public class Customer {

	public void saveToFiloe(Payroll obj) {
		try{FileOutputStream fout=new FileOutputStream("");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(obj);
		objout.flush();
		}catch (IOException e){
			System.out.println(e);
		}
	}


public void readFromFile(){
	try{FileInputStream fin=new FileInputStream("");
	ObjectInputStream objin=new ObjectInputStream(fin);
	Payroll cust=(Payroll)objin.readObject();
	cust.showDetails();
	}catch(IOException e){
		System.out.println(e);
	}catch(ClassNotFoundException e){
		System.out.println(e);
	}
}
public static void main(String[] args){
	
	String Payroll cust=new Payroll("Jack","124 Barath nagar");
	String PayrollRecord cu=new PayrollRecord();
	cu.saveToFile(cust);
	System.out.println("Saved !");
	cu.readFile();
}
}
