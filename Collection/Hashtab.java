import java.util.Hashtable;
import java.util.Map;


public class Hashtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		 System.out.println( hm.put(100,"Rahul"));  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
