import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Hset {

	
	//uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
	//contains unique elements only.
	//it uses hashmap
	
	public static void main(String[] args) {
		
		HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 
	
	
	  TreeSet<String> all=new TreeSet<String>();  
	  all.add("Ravi");  
	  all.add("Vijay");  
	  all.add("Ravi");  
	  all.add("Ajay");  
	  
	  itr=all.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 } 
	   
	  }