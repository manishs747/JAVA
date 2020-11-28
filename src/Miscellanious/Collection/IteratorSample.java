package Miscellanious.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.Set;

public class IteratorSample {
	
	
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	
	
      List<String> list = new ArrayList<String>();
		list.add("d");
		list.add("e");
		list.add("b");
		list.add("f");
		
		
		LinkedList<String> arrlist = new LinkedList<String>();
		arrlist.addFirst("ss");
		//Iterator<String> i = list.iterator();
		
		/*System.out.println(list);
		iterateList(list);
		System.out.println(list);*/
		
		//iterateHash();
		//iterateKeySetHash();
		//listIterator(list);
		
		display(list);
		
		//hashSet();
	}
	
	public static void display(Collection<String> col){
		System.out.println("List Order");
		Iterator<String> itr = col.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		
	}
	
	
	
	public static void hashSet(){
		  HashSet<Integer> s = new HashSet<Integer>();
		  for (int i = 0; i < 5; i++) {
			  s.add(i*3);
		}
		 
	
		//iterateSet(s);
		  
	}
	
	public static void iterateSet(Set<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			 Integer obj = it.next();
			System.out.println(obj);
		
		}
	}
	
	public static void iterateList(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
			if (obj.equals("e")) {
				it.remove();

			}
		}
	}
	
	
	public static void listIterator(List<String> list) {
		ListIterator<String> litr = list.listIterator();
		
		  System.out.println("Elements in forward directiton");
	        while(litr.hasNext()){
	            System.out.println(litr.next());
	        }
	        System.out.println("Elements in backward directiton");
	        while(litr.hasPrevious()){
	            System.out.println(litr.previous());
	        }
	}
	
	public static void iterateHash() {
	HashMap<String, String> hash = new HashMap<String, String>();
	 hash.put("bihar", "patna");
	 hash.put("karnataka", "banglore");
	 hash.put("jharkhand", "ranchi");
	 
	  Set<Entry<String, String>> stockSet = hash.entrySet();
	  
	  Iterator<Entry<String, String>> i = stockSet.iterator();
	  while(i.hasNext()){
          Entry<String, String> m=i.next();
          String key = m.getKey();
          String value=m.getValue();
          System.out.println("Key :"+key+"  value :"+value);

      }
	}
	
	public static void iterateKeySetHash() {
		HashMap<String, String> hash = new HashMap<String, String>();
		 hash.put("bihar", "patna");
		 hash.put("karnataka", "banglore");
		 hash.put("jharkhand", "ranchi");
		 
		 Set<String> stockSet = hash.keySet();
		  
		   Iterator<String> i = stockSet.iterator();
		  while(i.hasNext()){
	        
	          String key = i.next();
	          String value=hash.get(key);
	          System.out.println("Key :"+key+"  value :"+value);

	      }
		}
	 

}
