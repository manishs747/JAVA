package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();  
		map.put(101,"Amit");  
		map.put(102,"Vijay");  
		map.put(100,"Rahul"); 
	
		 displayHashMap("DISPALYING HASH MAP",map);  
		 displayLinkedHashMap("DISPALYING LINKED MAP",map); 
		 displayTreeHashMap("DISPLAYING TREE HAS MAP",map);
		 
		 bookSorting();    

	}

	/**
	 * 
	 */
	private static void bookSorting() {
		Map<Book,Integer> bmap=new TreeMap<Book,Integer>();    
		    //Creating Books    
		Book b1=new Book(101,"scince");    
		Book b2=new Book(102,"algo");    
		Book b3=new Book(103,"computer");    
		    //Adding Books to map   
		    bmap.put(b2,2);  
		    bmap.put(b1,1);  
		    bmap.put(b3,3); 

		    //Traversing map  
		    for(Map.Entry<Book,Integer> book:bmap.entrySet()){    
		    	Book b =book.getKey();  
		    	int key =book.getValue();   
		        System.out.println(b);   
		    }
	}

	/**
	 * It maintains no order.
	 * It may have one null key and multiple null values
	 */
	private static void displayHashMap(String msg, Map<Integer,String> input) {
		 System.out.println(msg);
		 Map<Integer,String> map = new HashMap<Integer,String>(); 
		  map.putAll(input);
		  dispplayMap(map);
	}
	
	
	/**
	 * It is same as HashMap instead maintains insertion order.
	 * It may have one null key and multiple null values
	 */
	private static void displayLinkedHashMap(String msg,Map<Integer,String> input) {
		System.out.println(msg);
		  Map<Integer,String> map=new LinkedHashMap<Integer,String>(); 
		  map.putAll(input);
		  dispplayMap(map); 
	}
	
	/**
	 * It cannot have null key but can have multiple null values.
     * It is same as HashMap instead maintains ascending order.
	 */
	private static void displayTreeHashMap(String msg,Map<Integer,String> input) {
		System.out.println(msg);
		  Map<Integer,String> map = new TreeMap<Integer,String>();  
		  map.putAll(input);
		  dispplayMap(map); 
	}
	
	private static void dispplayMap(Map<Integer,String> map) {
		System.out.println(map);
	/*	Iterator<Map.Entry<Integer,String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry<Integer,String> entry = iter.next();
		    System.out.print(entry.getKey()+"=>"+entry.getValue()+" "); 
		} 
		System.out.println();*/
	}
	
	

}
