import java.util.LinkedHashMap;
import java.util.Map.Entry;

import ClassLoading.main;


public class linkedhashma {
	
	public static void main(String[] args) {
  LinkedHashMap<Integer,String> hm22=new LinkedHashMap<Integer,String>();  
		  
		  hm22.put(100,"Amit");  
		  hm22.put(102,"Vijay");  
		  hm22.put(101,"Rahul");  
		  System.out.println("  Linked Values");
		  for(Entry m:hm22.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
	}

}
