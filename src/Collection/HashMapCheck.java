package Collection;

import java.util.HashMap;

public class HashMapCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String>  map1 = new HashMap<String, String>();
		map1.put("123", "ma");
		
		String s1 = new String("123");
		
		HashMap<Integer,Integer>  map2 = new HashMap<Integer, Integer>();
		map2.put(2, 123);
		
		Integer i = new Integer(2);
		
		System.out.println(map2.get(i));
		
		Integer p = 123;
		String s = p.toString();
		
		System.out.println(p.hashCode());
		System.out.println(s.hashCode());
		
		

	}

}
