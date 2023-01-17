package Iostream;
import java.io.*;
public class ProgIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	FileReader fs=new FileReader("C://Users//MOUPON//Documents//Food.txt");
	BufferedReader br=new BufferedReader(fs);
	String str;
	while((str=br.readLine())!=null){
		System.out.println(str);
	}
	br.close();
}catch(IOException e){
	System.out.println(e);
}
	}

}
