import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Set<NameClass>  s =  new TreeSet<NameClass>();
			NameClass n= new NameClass("Manish");
			NameClass m= new NameClass("Anjali");
			NameClass p= new NameClass("Zarine");
			
			s.add(n);
			s.add(m);
			s.add(p);
	    /* System.out.println("n:"+n);
	     System.out.println("m:"+m);
	     System.out.println("p:"+p);
	     System.out.println("set:"+ s);*/
			
		
			System.out.println("set size:"+s.size());
			for (NameClass k : s) {
				System.out.println(k.name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
	}

}
