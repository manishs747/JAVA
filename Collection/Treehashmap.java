import java.util.Map;
import java.util.TreeMap;


public class Treehashmap {
	
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> hm3=new TreeMap<Integer,String>();  
		  
		  hm3.put(100,"Amit");  
		  hm3.put(102,"Ravi");  
		  hm3.put(101,"Vijay");  
		  hm3.put(103,"Rahul");  
		  System.out.println(" TREE MAP");
		  for(Map.Entry m:hm3.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
	}

}
