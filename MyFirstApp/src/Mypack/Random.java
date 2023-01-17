package Mypack;
import java.io.*;
import java.io.RandomAccessFile;
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] str={"Apple","Banna","Mango","Jackfruit"};
    try{
    	RandomAccessFile re= new RandomAccessFile("C://Users//MOUPON//Documents//fruit.txt");
    	for(String ele:str){
    		re.writeUTF(ele);
    	}
    	re.seek(2);
    	String str1=re.readLine();
    	System.out.println(str1);
    }catch(Exception e){
    	System.out.println(e);
    }
}}
