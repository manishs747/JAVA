package javaPractice.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javaPractice.A;
import javaPractice.B;

public class GenircTestOfObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//testArrayList();
		testMap();

	}

	
	
	public static void testMap(){
		    HashMap<String, Object> e = new HashMap<String, Object>();
	       Object a=new A();
	       Object b = new B();
	       e.put("a", a);
	       e.put("b", b);
	       
	       Set<Entry<String, Object>> set = e.entrySet();
	       for (Entry<String, Object> entry : set) {
			System.out.println(entry.getValue());
		}
	       
	}
	
	public static void testArrayList(){
		   ArrayList<Integer> e = new ArrayList<Integer>();
	        //e.add("man");
	        e.add(1);
	        System.out.println(e);
	}
}
