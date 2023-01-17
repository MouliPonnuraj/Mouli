package CollectionDemo;
import java.util.concurrent.*;
import java.util.function.*;
public class KeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConcurrentHashMap<String,String> n=new ConcurrentHashMap<>();
    n.put("E001","Peter");
    n.put("E002","Sam");
    n.put("E003","Edgar");
    n.put("E004","Mathew");
    n.put("E005","Simond");
    n.put("E006","William");
    n.put("E007","Harry");
    String result =n.searchEntries(2,(k)->{
    	String key=k.getKey();
    	if(key.equals("E005")){
    		return k.getValue();
    	}
    	else{
    		return null;
    	}
    });
    System.out.println(result);
    n.forEach(1,(k,v)->System.out.println(k+" "+v));
    String o=n.reduce(2,(k,v)-> "(Employee key:"+k+" - Employee Name:"+v+"}",(a,b)->a+" , "+b);
	System.out.println(o);
	}

}
