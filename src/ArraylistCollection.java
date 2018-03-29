import java.util.*;


public class ArraylistCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		//Numberinglist(list);
		
		Vector v = new Vector<String>();
		
		numberinglist(list);
		System.out.println(list.lastIndexOf("preeti"));
		Iterator <String> iter = list.iterator();//hasnext,next
		/*while(iter.hasNext())
		{
			String val = iter.next();
			System.out.println(val);
			
		} */
		ListIterator<String> listiter = list.listIterator();
		while(listiter.hasNext())
		{
			String val = listiter.next();
			System.out.println(val);
			
			
		}
		
		for (String itr : list) {
			System.out.println(" printing in for loop  " + itr);
		}
	  for (String st : list) {
			System.out.println(st);
		}
		
		HashMap<String, String>  map = new HashMap<String, String>();
		map.put("biahr", "patna");
		map.put("karnataka", "banglore");
		System.out.println(map);
		map.put("up","lucknow");
		System.out.println(map);
		Set<String> keys =  map.keySet();
		Iterator<String> iter1 = keys.iterator();
		while (iter1.hasNext()) {
			String value = iter1.next();
			System.out.println("capitaol of " + value + " is " + map.get(value));
			
		}	

	}
	private static void numberinglist(ArrayList<String> list1){
		list1.add(new String("Manish "));
		list1.add(new String("Rajnish"));
		list1.add(new String("Preeti"));
		list1.add(new String("Rocky "));
	
		
	}

}