package IntVClass;

import java.util.Set;
import java.util.TreeSet;

public class setTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet<Object> s = new TreeSet<Object>();
		
		s.add(2);
		//s.add(new String("a"));
		//String s1 = new String("hello");
		
		
		//s.add("b");
		s.add(1);
		//s.add(true);
		s.add("c");
		
		System.out.println(s);
	}

}
