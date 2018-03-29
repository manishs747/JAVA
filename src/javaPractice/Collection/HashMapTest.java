package javaPractice.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> h = new HashMap<String, String>();
		 h.put("a", "Patna");
		 h.put("b","Calcutta");
		 h.put("c", "Banglore");
		 h.get("c");
		 
		 
		System.out.println("key : " + getKeyFromValue(h, "patna"));
		 
		Set<String> s = h.keySet();
		for (String set : s) {
			System.out.println(set.hashCode());
		}
		Collection<String> v = h.values();
		Set<Entry<String, String>> sm = h.entrySet();
		//int hashcode = h.hashCode();
		System.out.println(s);
		 setIteration(h);
	}
	
	
	public static String getKeyFromValue(HashMap<String, String> h,String value){
		Set<Entry<String, String>> set = h.entrySet();
		for (Entry<String, String> entry : set) {
			if(value.equalsIgnoreCase(entry.getValue())){
				return entry.getKey();
			}
		}
		
		return null;
	}
	
	public static void treeHash(){
		 TreeMap<String, String> h = new TreeMap<String, String>();
		 h.put("a", "Patna");
		 h.put("b","Calcutta");
		 h.put("c", "Banglore");
		 h.get("c");
		
	}
	
	public static void setIteration(HashMap<String, String> h){
		  Set<Entry<String, String>> mapset = h.entrySet();
		  for (Entry<String, String> entry : mapset) {
			System.out.println("State:" + entry.getKey()+ "      Capital:" + entry.getValue());
		}
		
		
	}

}
