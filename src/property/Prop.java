package property;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class Prop {
	public static void main(String[] args) {
		Properties p=System.getProperties();  
		 Set<Entry<Object, Object>> set = p.entrySet();
		for ( Entry<Object, Object> entry : set) {
			
			System.out.println(entry.getKey()+" = "+entry.getValue()); 
			
		}
		
		
		
		
	}

}
