package CollectionDemo;
import java.util.Iterator;
import java.util.concurrent.*;

public class ConcurrentIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String ,Integer> map =new ConcurrentHashMap<>();
		map.put("Thomas k Rough", 32);
		map.put("Samuel Brown", 62);
		map.put("William R", 53);
		map.put("Mauric Wan", 13);
		map.put("Henry Shildon", 23);
		
		Iterator<ConcurrentHashMap.Entry<String,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			ConcurrentHashMap.Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}System.out.println(map);
		map.putIfAbsent("jacob",14);
		System.out.println(map);

	}

}
