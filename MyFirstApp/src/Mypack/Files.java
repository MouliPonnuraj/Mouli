package Mypack;

import java.io.*;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
     File f=new File("C://Users//MOUPON//Documents//f.txt");
     System.out.println("Name of the file"+f.getName());
     System.out.println("Path of the file"+f.getPath());
     if(f.exists()){
    	 System.out.println("Exists");
     }
     else
     {
    	 if(f.createNewFile())
    	 {
    		 System.out.println("File is created");
    	 }
    	 else
    	 {
    		 System.out.println("File not created");
    	 }
     }
	}
	catch(Exception e){
		System.out.println(e);
	}
	}}


