package Iostream;
import java.io.*;
public class Istream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   FileInputStream fs= new FileInputStream("C://Users//MOUPON//Documents//New Text Document.txt");
    	   byte[] ba=new byte[fs.available()];
    	   fs.read(ba);
    	   for(byte b:ba){
    		   System.out.print((char)b);
    	   }
       }catch(IOException e){
    	   System.out.println(e);
       }
	}

}
