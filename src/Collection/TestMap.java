package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    TreeMap<String, String> map=new TreeMap<String,String>();
		map.put("firstName", "manish");
		map.put("thirdName", "rajnish");
		map.put("LastName", "preeti");
		map.put("LastName", "raj");
		
		
		System.out.println(map.get("LastName"));

	}

}
