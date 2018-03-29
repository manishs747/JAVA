import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class test {
 
	public static void main(String[] args) {
    /*    int numOfWord = 2;
		ArrayList<String> list = new ArrayList<String>();
		list.add("manish");
		list.add("rajnish");
		list.add("preeti");
		list.add("manish");
		list.add("preeti");
		list.add("rocky");
		list.add("bruno");
	  // System.out.println(multipleWildList(numOfWord, list));
		
		int value = 2;
		value=square(value);
		//System.out.println("value is " + value);
		Set<String> set = new TreeSet<String>();
		set.add("manish");
		set.add("rajnish");
		set.add("preeti");
		System.out.println(set);*/
		
		System.out.println(EMConstants.January);
		
		
		
		String s="hello";
		s.equalsIgnoreCase("hello");
	}
	public static int square(int val){
		return val*val;
	}

	private static ArrayList<String> multipleWildList(int numOfWord, ArrayList<String> list) {
		ArrayList<String>  multipleSearchResult = new ArrayList<String>();
		for (String itr : list) {
			if(numOfWord == Collections.frequency(list,itr))
			{
				if(!multipleSearchResult.contains(itr))
				{
					multipleSearchResult.add(itr);
				}
				
				
			}
			
		}
		
		return multipleSearchResult;
	}
 
}