package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GenericMap {
	
   public static void main(String[] args) {
	
	   HashMap<String, Object>  data = new HashMap<String, Object>();
	   data.put("order", "your [order] is place");
	   data.put("help_after ", "Help for order [order]");
	   data.put("ask_confirmation", true);
	   Map<String,String> replaceMap = new HashMap<String, String>();
	   replaceMap.put("[order]", "123456");
	   
	   //replaceMapStringPlaceHolderFromMap(data,replaceMap);
	    "manish".replace("a", null);
	   System.out.println(data);
}

private static void replaceMapStringPlaceHolderFromMap(Map<String, Object> data,Map<String,String> replaceMap) {
	for (Entry<String, Object> entry : data.entrySet()) {
          if(entry.getValue() instanceof String){
        	  data.put(entry.getKey(),replaceStringWithMapStrings(replaceMap,entry.getValue().toString()));
        	  System.out.println(entry.getValue());
		   }
	   }
}

private static String replaceStringWithMapStrings(Map<String, String> replaceMap, String value) {
	for (Entry<String, String> entry : replaceMap.entrySet()) {
		value = value.replace(entry.getKey(),entry.getValue());
	}
	return value;
}

}
