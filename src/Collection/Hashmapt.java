package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmapt a = new Hashmapt();
		System.out.println(a.hashCode());
		System.out.println(a);
		
		
		
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("firstName", "manish");
		map.put("thirdName", "rajnish");
		map.put("LastName", "preeti");
		map.put(null, "abc");
		
		System.out.println(map.get("LastName1"));
		
		
		
		
		
		
	/*	Map<String, String> newMap = new HashMap<String,String>();
		for (String key : map.keySet())
		{
			//map.put(key.toLowerCase(), map.get(key));
			map.remove(key);
		   // System.out.println(entry.getKey() + "/" + entry.getValue());
		} */
		
	/*	Map<String, String> newMap = new HashMap<String,String>();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
		    String key = it.next();
		    newMap.put(key.toLowerCase(), map.get(key));
		      //  it.remove();
		}
		 map.clear();*/
		
	/*	Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry<String,String> entry = iter.next();
		    if("firstName".equalsIgnoreCase(entry.getValue())){
		        iter.remove();
		    }
		}  */
		
		//System.out.println(map);
	}
	
	
}


