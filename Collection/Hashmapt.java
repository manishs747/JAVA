import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Hashmapt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<String,String>();
		map.put("2", "manish")
		map.put("3", "rajnish")
		map.put("1", "preeti")
		
		System.out.println(map);
		
	}
	
	
	public static void  mapmethod(){

		  HashMap<Integer,String> map=new HashMap<Integer,String>();
		  
		  map.put(101,"Manish");  
		  System.out.println(map.put(101,"brunu"));  
		  map.put(102,"tunnu");  
		  /*for(Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } */ 
		  Set<Integer> keys = map.keySet();
		  
		  Set<Entry<Integer, String>> list = map.entrySet();
		  
		//loop a Map
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			}
	}
	
	public static void getTreeMap(){

		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		  
		  hm.put(101,"Manish");  
		  hm.put(100,"brunu");  
		  hm.put(102,"tunnu"); 
		
		
		
	}
	

}
