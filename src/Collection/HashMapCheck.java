package Collection;

import java.util.HashMap;

public class HashMapCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer>  hash_map = new HashMap<String, Integer>();
		// Mapping int values to string keys 
        hash_map.put("Geeks", 10); 
        hash_map.put("4", 15); 
        hash_map.put("Geeks", 20); 
        hash_map.put("Welcomes", 25); 
        hash_map.put("You", 30); 
		
        hash_map.containsValue("Geeks");
		

	}

}
