package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapRef {
	
	public String name ;
	
	  public HashMapRef(String name) {
		// TODO Auto-generated constructor stub
		  this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMapRef h = new HashMapRef("abc");
		//HashMapRef k = new HashMapRef("abc");
	
		
		Map<String,String> place = new HashMap<String, String>();
		place.put("banglore", "karnata");
		place.put("hyderbad", "telegana");
		place.put("trivandrum","kerela");
		
		System.out.println("State of banglore is "+place.get("banglore"));
		
		/*for (Map.Entry<String, String> entry : place.entrySet()) {
		   System.out.println("The capital of "+entry.getValue() +" is "+ entry.getKey());
		}*/

	}

}
