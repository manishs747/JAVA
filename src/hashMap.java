import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class hashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String>  map = new HashMap<String, String>();
		map.put("biahr", "patna");
		map.put("karnataka", "banglore");
		//System.out.println(map);
		map.put("up","lucknow");
		//System.out.println(map);
		String cap = map.get("up");
		//System.out.println("capital of up is " + cap);
		//map.remove("up");
		Set<String> key = map.keySet();
		//Iterator<String>  iter = key.iterator();
		for (String itr: key) {
			System.out.println(itr);
			
		}
		

	}

}
